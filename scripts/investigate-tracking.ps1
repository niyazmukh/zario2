# Complete Investigation Script - Run all telemetry and analysis
# Usage: .\investigate-tracking.ps1 -Package "com.twitter.android"

param(
    [Parameter(Mandatory=$true)]
    [string]$Package,
    [int]$TestDurationMinutes = 5
)

$ErrorActionPreference = "Continue"

Write-Host @"
╔═══════════════════════════════════════════════════════════════╗
║         ZARIO SCREEN TIME TRACKING INVESTIGATION              ║
║                Enhanced Telemetry Analysis                    ║
╚═══════════════════════════════════════════════════════════════╝
"@ -ForegroundColor Cyan

Write-Host "`nTarget Package: $Package" -ForegroundColor Yellow
Write-Host "Test Duration: $TestDurationMinutes minutes" -ForegroundColor Yellow
Write-Host "Device: $(adb shell getprop ro.product.model)" -ForegroundColor Yellow

# Step 1: Pre-test baseline
Write-Host "`n[STEP 1] Capturing baseline system state..." -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green

# Check if app is installed
$appInstalled = adb shell pm list packages | Select-String $Package
if (!$appInstalled) {
    Write-Error "$Package is not installed on device!"
    exit 1
}
Write-Host "✓ Target app is installed" -ForegroundColor Green

# Check if Zario has permissions
Write-Host "Checking Zario permissions..."
$zarionPermissions = adb shell dumpsys package com.niyaz.zario | Select-String "PACKAGE_USAGE_STATS"
if ($zarionPermissions) {
    Write-Host "✓ Zario has PACKAGE_USAGE_STATS permission" -ForegroundColor Green
} else {
    Write-Warning "Zario may not have PACKAGE_USAGE_STATS permission!"
    Write-Host "Please grant it manually in Settings > Apps > Special app access > Usage access"
    $continue = Read-Host "Continue anyway? (y/n)"
    if ($continue -ne "y") { exit 0 }
}

# Clear logs
Write-Host "Clearing logcat..."
adb shell logcat -c
Write-Host "✓ Logs cleared" -ForegroundColor Green

# Step 2: Start background monitoring
Write-Host "`n[STEP 2] Starting background telemetry monitoring..." -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green

$monitorJob = Start-Job -ScriptBlock {
    param($pkg)
    adb shell logcat -s UsageIngestionTelemetry:* | Out-File "telemetry_log_$(Get-Date -Format 'yyyyMMdd_HHmmss').txt"
} -ArgumentList $Package

Write-Host "✓ Background monitoring started (Job ID: $($monitorJob.Id))" -ForegroundColor Green

# Step 3: User interaction phase
Write-Host "`n[STEP 3] USER INTERACTION PHASE" -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green
Write-Host @"

📱 INSTRUCTIONS:
1. Open $Package on your device
2. Use the app normally for $TestDurationMinutes minutes:
   - Scroll through feeds
   - Open posts/tweets/images
   - Watch videos (important!)
   - Click on links
   - Use in-app browser
   - Play media in full screen
3. Switch to other apps and back
4. Let screen turn off at least once

"@ -ForegroundColor Yellow

Write-Host "Press ENTER when you're ready to start the test..." -ForegroundColor Cyan
Read-Host

$startTime = Get-Date
Write-Host "Test started at: $startTime" -ForegroundColor Green
Write-Host "Test will run for $TestDurationMinutes minutes..." -ForegroundColor Yellow

# Show countdown
for ($i = $TestDurationMinutes; $i -gt 0; $i--) {
    Write-Host "`rTime remaining: $i minute(s)... " -NoNewline -ForegroundColor Yellow
    Start-Sleep -Seconds 60
}
Write-Host "`n✓ Test duration complete!" -ForegroundColor Green

# Step 4: Capture system events
Write-Host "`n[STEP 4] Capturing system UsageStats data..." -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green

$systemEventsFile = "system_events_$Package_$(Get-Date -Format 'yyyyMMdd_HHmmss').tsv"
& "$PSScriptRoot\dump-usage-events.ps1" -Package $Package -Hours 1 -OutputFile $systemEventsFile -Verbose

# Step 5: Stop monitoring and analyze
Write-Host "`n[STEP 5] Stopping monitoring and analyzing results..." -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green

Stop-Job -Job $monitorJob
$telemetryOutput = Receive-Job -Job $monitorJob
Remove-Job -Job $monitorJob

# Save telemetry to file
$telemetryFile = "telemetry_$Package_$(Get-Date -Format 'yyyyMMdd_HHmmss').txt"
$telemetryOutput | Out-File $telemetryFile

Write-Host "✓ Telemetry saved to: $telemetryFile" -ForegroundColor Green
Write-Host "✓ System events saved to: $systemEventsFile" -ForegroundColor Green

# Step 6: Extract and analyze dropped events
Write-Host "`n[STEP 6] ANALYSIS: Dropped Events" -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green

# Parse telemetry for drop information
$dropMatches = $telemetryOutput | Select-String "HIGH-VALUE APP DROPS" -Context 0,50

if ($dropMatches) {
    Write-Host "`n⚠ CRITICAL: Dropped events detected for $Package!" -ForegroundColor Red
    Write-Host $dropMatches -ForegroundColor Red
} else {
    Write-Host "✓ No high-value drops detected" -ForegroundColor Green
}

# Check task root suppressions
$taskRootDrops = $telemetryOutput | Select-String "SUPPRESSED_TASK_ROOT"
if ($taskRootDrops) {
    Write-Host "`n⚠ Task root suppressions found:" -ForegroundColor Yellow
    Write-Host $taskRootDrops -ForegroundColor Yellow
}

# Step 7: Compare with system tracking
Write-Host "`n[STEP 7] Comparing Zario vs System tracking..." -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green

if (Test-Path $systemEventsFile) {
    $systemEvents = Import-Csv $systemEventsFile -Delimiter "`t"
    
    # Count foreground events
    $foregroundEvents = $systemEvents | Where-Object { $_.EventName -match "FOREGROUND|RESUMED" }
    Write-Host "System recorded foreground events: $($foregroundEvents.Count)" -ForegroundColor White
    
    # Check for task root mismatches
    $taskRootMismatches = $systemEvents | Where-Object { 
        $_.TaskRoot -ne "" -and $_.TaskRoot -ne $Package 
    }
    
    if ($taskRootMismatches.Count -gt 0) {
        Write-Host "`n❌ ISSUE DETECTED: Task Root Mismatches" -ForegroundColor Red
        Write-Host "Found $($taskRootMismatches.Count) events where task root differs from package" -ForegroundColor Red
        
        $uniqueTaskRoots = $taskRootMismatches | Select-Object -ExpandProperty TaskRoot -Unique
        Write-Host "`nUnique Task Roots causing drops:" -ForegroundColor Red
        $uniqueTaskRoots | ForEach-Object {
            $count = ($taskRootMismatches | Where-Object { $_.TaskRoot -eq $_ }).Count
            Write-Host "  - $_ ($count events)" -ForegroundColor Yellow
        }
        
        Write-Host "`nThese events are likely being DROPPED by Zario's suppression list!" -ForegroundColor Red
    } else {
        Write-Host "✓ No task root mismatches found" -ForegroundColor Green
    }
}

# Step 8: Generate recommendations
Write-Host "`n[STEP 8] RECOMMENDATIONS" -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green

$recommendations = @()

if ($taskRootMismatches -and $taskRootMismatches.Count -gt 0) {
    $recommendations += @"
1. CRITICAL: Update suppression list strategy
   - Current approach drops valid user interactions
   - Consider hybrid filtering (check both taskRoot AND package)
   - Whitelist high-value apps like $Package
"@
}

if ($dropMatches) {
    $recommendations += @"
2. Implement fallback tracking
   - Use packageName when taskRoot is suppressed
   - Add context-aware filtering
   - Track parent-child app relationships
"@
}

$recommendations += @"
3. Add confidence scoring
   - Multi-layer event validation
   - Cross-reference multiple data sources
   - Implement event reconciliation algorithm
"@

if ($recommendations.Count -gt 0) {
    $recommendations | ForEach-Object { Write-Host $_ -ForegroundColor Yellow }
}

# Summary
Write-Host "`n╔═══════════════════════════════════════════════════════════════╗" -ForegroundColor Cyan
Write-Host "║                    INVESTIGATION COMPLETE                     ║" -ForegroundColor Cyan
Write-Host "╚═══════════════════════════════════════════════════════════════╝" -ForegroundColor Cyan

Write-Host "`nGenerated Files:" -ForegroundColor White
Write-Host "  - $telemetryFile" -ForegroundColor Gray
Write-Host "  - $systemEventsFile" -ForegroundColor Gray

Write-Host "`nNext Steps:" -ForegroundColor White
Write-Host "1. Review telemetry logs for specific drop patterns"
Write-Host "2. Implement recommended filtering strategy changes"
Write-Host "3. Re-run test to validate improvements"
Write-Host "4. Compare drop rates before/after fix"

Write-Host "`nFor detailed analysis, run:" -ForegroundColor Cyan
Write-Host "  .\compare-sessions.ps1 -Package $Package" -ForegroundColor Gray
