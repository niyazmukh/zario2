#!/usr/bin/env python3
"""
Dump raw UsageStats events for Twitter on Oct 16, 2025
This script queries Android UsageStatsManager API directly
"""

import subprocess
import sys
from datetime import datetime

# Oct 16, 2025 time range
DAY_START_MS = 1760562000000  # Oct 16 00:00:00 IST
DAY_END_MS = 1760648400000    # Oct 17 00:00:00 IST
TWITTER_PACKAGE = "com.twitter.android"

def run_adb_command(cmd):
    """Execute adb shell command and return output"""
    try:
        result = subprocess.run(
            ["adb", "shell"] + cmd.split(),
            capture_output=True,
            text=True,
            timeout=30
        )
        return result.stdout
    except Exception as e:
        print(f"ERROR: {e}", file=sys.stderr)
        return None

def parse_usagestats_event_line(line):
    """
    Parse a line from dumpsys usagestats output
    Example: time="2025-10-16 12:21:54" type=ACTIVITY_RESUMED package=com.twitter.android
    """
    if "package=" not in line:
        return None
    
    parts = {}
    for token in line.split():
        if "=" in token:
            key, value = token.split("=", 1)
            parts[key] = value.strip('"')
    
    return parts

def main():
    print(f"Querying UsageStats events for {TWITTER_PACKAGE}")
    print(f"Time range: {DAY_START_MS} to {DAY_END_MS}")
    print(f"  ({datetime.fromtimestamp(DAY_START_MS/1000)} to {datetime.fromtimestamp(DAY_END_MS/1000)})")
    print()
    
    # Try to query events using cmd usagestats command
    print("Method 1: Using cmd usagestats query-events...")
    cmd = f"cmd usagestats query-events --begin {DAY_START_MS} --end {DAY_END_MS}"
    output = run_adb_command(cmd)
    
    if output:
        twitter_events = []
        for line in output.split('\n'):
            if TWITTER_PACKAGE in line:
                event = parse_usagestats_event_line(line)
                if event:
                    twitter_events.append(event)
        
        if twitter_events:
            print(f"\nFound {len(twitter_events)} Twitter events:")
            for event in twitter_events:
                print(f"  {event.get('time', 'N/A'):25s} {event.get('type', 'N/A'):25s} {event.get('package', 'N/A')}")
            
            # Save to file
            output_file = "tmp/twitter_raw_events_oct16.txt"
            with open(output_file, 'w') as f:
                for event in twitter_events:
                    f.write(f"{event}\n")
            print(f"\nSaved to {output_file}")
        else:
            print("No Twitter events found in output")
            print("\nFirst 50 lines of output:")
            print('\n'.join(output.split('\n')[:50]))
    else:
        print("Failed to get output from adb")
    
    print("\n" + "="*80)
    print("Method 2: Using adb shell am broadcast to query UsageStats...")
    # Alternative: use activity manager to query stats
    cmd = f"am broadcast -a android.intent.action.GET_USAGE_STATS --el begin {DAY_START_MS} --el end {DAY_END_MS}"
    output = run_adb_command(cmd)
    if output:
        print(output[:500])

if __name__ == "__main__":
    main()
