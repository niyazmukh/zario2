# Live Telemetry Monitor - Watch Zario's event drops in real-time
# Usage: .\monitor-telemetry.ps1

param(
    [string]$FilterPackage = "",
    [switch]$ShowAll
)

Write-Host "=== ZARIO TELEMETRY LIVE MONITOR ===" -ForegroundColor Cyan
Write-Host "Monitoring UsageIngestionTelemetry logs..." -ForegroundColor Yellow
if ($FilterPackage) {
    Write-Host "Filtering for package: $FilterPackage" -ForegroundColor Yellow
}
Write-Host "Press Ctrl+C to stop`n" -ForegroundColor Gray

# Clear logcat
adb shell logcat -c

# Start monitoring with filters
$logcatArgs = @(
    "logcat",
    "-s",
    "UsageIngestionTelemetry:*"
)

if ($FilterPackage -and !$ShowAll) {
    # We'll filter in PowerShell since logcat doesn't support content filtering
    Write-Host "Starting filtered monitor..." -ForegroundColor Green
    adb shell logcat -s UsageIngestionTelemetry:* | ForEach-Object {
        if ($_ -match $FilterPackage -or $_ -match "===") {
            Write-Host $_
        }
    }
} else {
    Write-Host "Starting monitor..." -ForegroundColor Green
    adb shell logcat -s UsageIngestionTelemetry:*
}
