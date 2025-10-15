# Usage Events Dumper - Query UsageStatsManager via ADB
# Usage: .\dump-usage-events.ps1 [-Package "com.twitter.android"] [-Hours 1] [-OutputFile "events.tsv"]

param(
    [string]$Package = "",
    [int]$Hours = 1,
    [string]$OutputFile = "usage_events_$(Get-Date -Format 'yyyyMMdd_HHmmss').tsv",
    [switch]$Verbose
)

# Check if device is connected
$devices = adb devices | Select-String -Pattern "device$"
if ($devices.Count -eq 0) {
    Write-Error "No Android device connected. Please connect device and enable USB debugging."
    exit 1
}

Write-Host "Connected to device: $($devices[0])" -ForegroundColor Green

# Calculate time window
$endTime = [DateTimeOffset]::Now.ToUnixTimeMilliseconds()
$startTime = $endTime - ($Hours * 60 * 60 * 1000)

Write-Host "Querying usage events from $([DateTimeOffset]::FromUnixTimeMilliseconds($startTime).LocalDateTime) to $([DateTimeOffset]::FromUnixTimeMilliseconds($endTime).LocalDateTime)" -ForegroundColor Cyan

# Build ADB command to query usage stats
# This uses the dumpsys usagestats command which provides detailed event information
$adbCommand = "dumpsys usagestats"

Write-Host "Executing: adb shell $adbCommand" -ForegroundColor Yellow

# Execute and capture output
$output = adb shell $adbCommand

# Parse the output - look for recent events
$events = @()
$currentPackage = ""
$inEventsSection = $false

foreach ($line in $output -split "`n") {
    $line = $line.Trim()
    
    # Detect events section
    if ($line -match "Recent Events:") {
        $inEventsSection = $true
        continue
    }
    
    if ($inEventsSection) {
        # Parse event lines (format varies by Android version)
        # Typical format: "time=1234567890 package=com.example.app type=1 class=..."
        if ($line -match "time=(\d+).*package=([^\s]+).*type=(\d+)") {
            $timestamp = [long]$matches[1]
            $pkg = $matches[2]
            $eventType = [int]$matches[3]
            
            # Filter by package if specified
            if ($Package -eq "" -or $pkg -eq $Package) {
                # Extract additional fields
                $taskRoot = ""
                $className = ""
                if ($line -match "taskRoot=([^\s]+)") {
                    $taskRoot = $matches[1]
                }
                if ($line -match "class=([^\s]+)") {
                    $className = $matches[1]
                }
                
                $events += [PSCustomObject]@{
                    Timestamp = $timestamp
                    DateTime = [DateTimeOffset]::FromUnixTimeMilliseconds($timestamp).LocalDateTime
                    Package = $pkg
                    EventType = $eventType
                    EventName = Get-EventTypeName $eventType
                    TaskRoot = $taskRoot
                    ClassName = $className
                }
            }
        }
    }
}

# If no events found using dumpsys, try alternative approach using shell am
if ($events.Count -eq 0) {
    Write-Warning "No events found via dumpsys. This might be due to permission restrictions."
    Write-Host "Attempting alternative method..." -ForegroundColor Yellow
    
    # Alternative: Use 'cmd usagestats' if available (Android 12+)
    $altOutput = adb shell "cmd usagestats query-events $startTime $endTime"
    
    # Parse alternative output format
    foreach ($line in $altOutput -split "`n") {
        if ($line -match "Event:.*package=([^\s]+).*time=(\d+).*type=(\d+)") {
            $pkg = $matches[1]
            $timestamp = [long]$matches[2]
            $eventType = [int]$matches[3]
            
            if ($Package -eq "" -or $pkg -eq $Package) {
                $events += [PSCustomObject]@{
                    Timestamp = $timestamp
                    DateTime = [DateTimeOffset]::FromUnixTimeMilliseconds($timestamp).LocalDateTime
                    Package = $pkg
                    EventType = $eventType
                    EventName = Get-EventTypeName $eventType
                    TaskRoot = ""
                    ClassName = ""
                }
            }
        }
    }
}

# Sort by timestamp
$events = $events | Sort-Object Timestamp

Write-Host "`nFound $($events.Count) events" -ForegroundColor Green

# Display summary
if ($events.Count -gt 0) {
    Write-Host "`n=== EVENT SUMMARY ===" -ForegroundColor Cyan
    $packageGroups = $events | Group-Object Package | Sort-Object Count -Descending
    foreach ($group in $packageGroups) {
        Write-Host "$($group.Name): $($group.Count) events" -ForegroundColor White
    }
    
    # Show event type distribution
    Write-Host "`n=== EVENT TYPE DISTRIBUTION ===" -ForegroundColor Cyan
    $typeGroups = $events | Group-Object EventName | Sort-Object Count -Descending
    foreach ($group in $typeGroups) {
        Write-Host "$($group.Name): $($group.Count) events" -ForegroundColor White
    }
}

# Export to file
if ($events.Count -gt 0) {
    $events | Export-Csv -Path $OutputFile -NoTypeInformation -Delimiter "`t"
    Write-Host "`nEvents exported to: $OutputFile" -ForegroundColor Green
    
    # Display first few events
    if ($Verbose) {
        Write-Host "`n=== FIRST 10 EVENTS ===" -ForegroundColor Cyan
        $events | Select-Object -First 10 | Format-Table -AutoSize
    }
} else {
    Write-Warning "No events captured. Check device permissions and ensure PACKAGE_USAGE_STATS is granted."
}

function Get-EventTypeName {
    param([int]$type)
    
    $eventNames = @{
        1 = "MOVE_TO_FOREGROUND"
        2 = "MOVE_TO_BACKGROUND"
        5 = "CONFIGURATION_CHANGE"
        7 = "USER_INTERACTION"
        8 = "SHORTCUT_INVOCATION"
        11 = "STANDBY_BUCKET_CHANGED"
        15 = "SCREEN_INTERACTIVE"
        16 = "SCREEN_NON_INTERACTIVE"
        17 = "KEYGUARD_SHOWN"
        18 = "KEYGUARD_HIDDEN"
        19 = "FOREGROUND_SERVICE_START"
        20 = "FOREGROUND_SERVICE_STOP"
        23 = "ACTIVITY_RESUMED"
        24 = "ACTIVITY_PAUSED"
        25 = "ACTIVITY_STOPPED"
        26 = "ACTIVITY_DESTROYED"
        27 = "DEVICE_SHUTDOWN"
        28 = "DEVICE_STARTUP"
    }
    
    if ($eventNames.ContainsKey($type)) {
        return $eventNames[$type]
    }
    return "UNKNOWN_$type"
}
