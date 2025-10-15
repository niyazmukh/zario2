# Compare Zario Sessions vs System UsageStats
# Usage: .\compare-sessions.ps1 -Package "com.twitter.android"

param(
    [Parameter(Mandatory=$true)]
    [string]$Package,
    [int]$Hours = 2
)

Write-Host "=== ZARIO SESSION COMPARISON TOOL ===" -ForegroundColor Cyan
Write-Host "Analyzing: $Package" -ForegroundColor Yellow
Write-Host "Time window: Last $Hours hours`n" -ForegroundColor Yellow

# Check device connection
$devices = adb devices | Select-String -Pattern "device$"
if ($devices.Count -eq 0) {
    Write-Error "No Android device connected."
    exit 1
}

# Calculate time window
$endTime = [DateTimeOffset]::Now.ToUnixTimeMilliseconds()
$startTime = $endTime - ($Hours * 60 * 60 * 1000)

Write-Host "Step 1: Extracting Zario tracking data from device..." -ForegroundColor Cyan

# Get Zario's tracked sessions via logcat
Write-Host "Clearing logcat and triggering Zario sync..." -ForegroundColor Gray
adb shell logcat -c

# Trigger Zario to log its sessions (assuming there's a way to do this)
# Alternative: Pull the database directly
$dbPath = "/data/data/com.niyaz.zario/databases/"
$localDb = "zario_usage.db"

# Try to pull database (requires root or debuggable app)
Write-Host "Attempting to pull Zario database..." -ForegroundColor Gray
$pullResult = adb pull "/data/data/com.niyaz.zario/databases/usage-aggregation.db" $localDb 2>&1

if ($LASTEXITCODE -eq 0) {
    Write-Host "✓ Database pulled successfully" -ForegroundColor Green
    
    # Query database using sqlite3 (if available)
    # This requires sqlite3 to be installed on the system
    $sqliteQuery = @"
SELECT 
    packageName,
    startMs,
    endMs,
    (endMs - startMs) as durationMs,
    datetime(startMs/1000, 'unixepoch', 'localtime') as startTime,
    datetime(endMs/1000, 'unixepoch', 'localtime') as endTime
FROM usage_session
WHERE packageName = '$Package'
AND startMs >= $startTime
ORDER BY startMs;
"@
    
    Write-Host "`nZARIO TRACKED SESSIONS:" -ForegroundColor Green
    Write-Host "========================" -ForegroundColor Green
    
    if (Get-Command sqlite3 -ErrorAction SilentlyContinue) {
        $zarionSessions = sqlite3 $localDb $sqliteQuery
        Write-Host $zarionSessions
    } else {
        Write-Warning "sqlite3 not found. Install it to query database directly."
        Write-Host "Database location: $localDb"
    }
} else {
    Write-Warning "Could not pull database. Trying logcat method..."
}

Write-Host "`nStep 2: Querying system UsageStats..." -ForegroundColor Cyan

# Use our dump script to get system events
$systemEventsFile = "system_events_temp.tsv"
& "$PSScriptRoot\dump-usage-events.ps1" -Package $Package -Hours $Hours -OutputFile $systemEventsFile

if (Test-Path $systemEventsFile) {
    $systemEvents = Import-Csv $systemEventsFile -Delimiter "`t"
    
    Write-Host "`nSYSTEM USAGESTATS EVENTS:" -ForegroundColor Green
    Write-Host "=========================" -ForegroundColor Green
    Write-Host "Total events: $($systemEvents.Count)"
    
    # Build sessions from system events
    $sessions = @()
    $currentSession = $null
    
    foreach ($event in $systemEvents | Sort-Object Timestamp) {
        if ($event.EventName -match "FOREGROUND|RESUMED") {
            if ($currentSession) {
                # Close previous session
                $sessions += $currentSession
            }
            $currentSession = [PSCustomObject]@{
                Start = [long]$event.Timestamp
                StartTime = $event.DateTime
                End = $null
                EndTime = $null
                Duration = $null
            }
        }
        elseif ($event.EventName -match "BACKGROUND|PAUSED|STOPPED") {
            if ($currentSession) {
                $currentSession.End = [long]$event.Timestamp
                $currentSession.EndTime = $event.DateTime
                $currentSession.Duration = [TimeSpan]::FromMilliseconds($currentSession.End - $currentSession.Start)
                $sessions += $currentSession
                $currentSession = $null
            }
        }
    }
    
    Write-Host "`nReconstructed Sessions from System Events:"
    $sessions | Format-Table -Property StartTime, EndTime, Duration -AutoSize
    
    Write-Host "`nSUMMARY:" -ForegroundColor Cyan
    Write-Host "========" -ForegroundColor Cyan
    $totalSystemTime = ($sessions | Measure-Object -Property Duration -Sum).Sum
    Write-Host "System tracked time: $totalSystemTime"
    
    # Check for dropped events
    Write-Host "`nEVENT TYPE BREAKDOWN:" -ForegroundColor Cyan
    $systemEvents | Group-Object EventName | 
        Select-Object Name, Count | 
        Sort-Object Count -Descending | 
        Format-Table -AutoSize
    
    # Look for task root mismatches
    $taskRootEvents = $systemEvents | Where-Object { $_.TaskRoot -ne "" -and $_.TaskRoot -ne $Package }
    if ($taskRootEvents.Count -gt 0) {
        Write-Host "`n⚠ TASK ROOT MISMATCHES FOUND:" -ForegroundColor Yellow
        Write-Host "These events may be dropped by Zario:" -ForegroundColor Yellow
        $taskRootEvents | Select-Object DateTime, EventName, TaskRoot | Format-Table -AutoSize
        
        Write-Host "`nUnique Task Roots:" -ForegroundColor Yellow
        $taskRootEvents | Select-Object -ExpandProperty TaskRoot -Unique | ForEach-Object {
            Write-Host "  - $_" -ForegroundColor Red
        }
    }
    
    # Cleanup
    Remove-Item $systemEventsFile -ErrorAction SilentlyContinue
}

Write-Host "`n=== ANALYSIS COMPLETE ===" -ForegroundColor Cyan
Write-Host "`nNext steps:" -ForegroundColor White
Write-Host "1. Compare session counts: Zario vs System"
Write-Host "2. Check for task root mismatches (highlighted above)"
Write-Host "3. Review Zario telemetry logs: adb logcat -s UsageIngestionTelemetry"
Write-Host "4. Look for HIGH-VALUE APP DROPS in logs"
