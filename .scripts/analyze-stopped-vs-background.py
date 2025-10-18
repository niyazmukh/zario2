#!/usr/bin/env python3
"""
Comprehensive Event Pattern Analysis - ACTIVITY_STOPPED vs MOVE_TO_BACKGROUND
==============================================================================

This script analyzes the EXACT relationship between ACTIVITY_STOPPED and
MOVE_TO_BACKGROUND events by examining all raw events from Android's UsageStatsManager.
"""

import subprocess
import re
from datetime import datetime, timedelta
from collections import defaultdict, Counter
from typing import List, Dict, Tuple, Optional

# Calculate today's range
now = datetime.now()
today_start = datetime(now.year, now.month, now.day, 0, 0, 0)
day_start_ms = int(today_start.timestamp() * 1000)
now_ms = int(now.timestamp() * 1000)

print("="*80)
print("ACTIVITY_STOPPED vs MOVE_TO_BACKGROUND: FORENSIC PATTERN ANALYSIS")
print("="*80)
print(f"Date: {now.strftime('%Y-%m-%d %H:%M:%S')}")
print(f"Analyzing events from {today_start} to {now}")
print(f"Day start MS: {day_start_ms}")
print(f"Now MS: {now_ms}")
print("="*80)

# Query events using adb
print("\n📱 Querying Android UsageStatsManager...")

cmd = f'adb shell "cmd usagestats query-events {day_start_ms} {now_ms}"'
result = subprocess.run(cmd, shell=True, capture_output=True, text=True, timeout=60)

if result.returncode != 0:
    print(f"❌ Error: {result.stderr}")
    exit(1)

output = result.stdout

# Parse events
events = []
event_pattern = re.compile(r'time=(\d+)\s+type=(\d+)\s+package=([\w.]+)(?:\s+class=([\w.$]+))?')

for line in output.split('\n'):
    match = event_pattern.search(line)
    if match:
        timestamp_ms = int(match.group(1))
        event_type = int(match.group(2))
        package = match.group(3)
        class_name = match.group(4) if match.group(4) else None
        
        events.append({
            'timestamp': timestamp_ms,
            'type': event_type,
            'package': package,
            'class': class_name,
            'time_str': datetime.fromtimestamp(timestamp_ms / 1000).strftime("%H:%M:%S.%f")[:-3]
        })

events.sort(key=lambda e: e['timestamp'])

print(f"✓ Parsed {len(events)} events\n")

# Event type names
EVENT_NAMES = {
    1: "MOVE_TO_FOREGROUND / ACTIVITY_RESUMED",
    2: "MOVE_TO_BACKGROUND / ACTIVITY_PAUSED",
    5: "CONFIGURATION_CHANGE",
    7: "USER_INTERACTION",
    8: "SHORTCUT_INVOCATION",
    11: "STANDBY_BUCKET_CHANGED",
    15: "SCREEN_INTERACTIVE",
    16: "SCREEN_NON_INTERACTIVE",
    17: "KEYGUARD_SHOWN",
    18: "KEYGUARD_HIDDEN",
    19: "FOREGROUND_SERVICE_START",
    20: "FOREGROUND_SERVICE_STOP",
    23: "ACTIVITY_STOPPED",
    26: "DEVICE_SHUTDOWN",
    27: "DEVICE_STARTUP",
}

# Print event type summary
type_counts = Counter(e['type'] for e in events)
print("📊 Event Type Distribution:")
print("-" * 60)
for event_type, count in sorted(type_counts.items(), key=lambda x: x[1], reverse=True):
    event_name = EVENT_NAMES.get(event_type, f"UNKNOWN_{event_type}")
    print(f"  {event_type:3d} | {event_name:35s} : {count:5d}")

# Find all ACTIVITY_STOPPED events
stopped_events = [e for e in events if e['type'] == 23]
print(f"\n🔍 Total ACTIVITY_STOPPED events: {len(stopped_events)}")

if len(stopped_events) == 0:
    print("\n⚠️  NO ACTIVITY_STOPPED events found!")
    print("This suggests:")
    print("  1. API level < 29 (ACTIVITY_STOPPED not available)")
    print("  2. OEM doesn't report this event")
    print("  3. No app activities stopped today")
    exit(0)

# Analyze patterns: ACTIVITY_STOPPED followed by what?
print("\n" + "=" * 80)
print("PATTERN ANALYSIS: What follows ACTIVITY_STOPPED?")
print("=" * 80)

patterns = []
for i, stopped_event in enumerate(stopped_events):
    # Find next event for same package within 10 seconds
    package = stopped_event['package']
    timestamp = stopped_event['timestamp']
    
    next_events = []
    for event in events:
        if event['package'] == package and event['timestamp'] > timestamp:
            gap_ms = event['timestamp'] - timestamp
            if gap_ms <= 10000:  # Within 10 seconds
                next_events.append({
                    'event': event,
                    'gap_ms': gap_ms
                })
            elif gap_ms > 10000:
                break  # Too far, stop searching
    
    if next_events:
        # Take the first one
        next_event = next_events[0]
        patterns.append({
            'stopped': stopped_event,
            'next': next_event['event'],
            'gap_ms': next_event['gap_ms'],
            'has_background': next_event['event']['type'] == 2
        })

print(f"\nFound {len(patterns)} ACTIVITY_STOPPED events with following events\n")

# Count patterns
pattern_counts = Counter((p['next']['type'], EVENT_NAMES.get(p['next']['type'], "UNKNOWN")) 
                         for p in patterns)

print("ACTIVITY_STOPPED followed by:")
print("-" * 80)
for (event_type, event_name), count in pattern_counts.most_common():
    percentage = (count / len(patterns) * 100) if patterns else 0
    avg_gap = sum(p['gap_ms'] for p in patterns if p['next']['type'] == event_type) / count
    print(f"  [{event_type:2d}] {event_name:40s} : {count:4d} times ({percentage:5.1f}%) - avg gap: {avg_gap:6.0f}ms")

# Critical question: Does ACTIVITY_STOPPED ALWAYS come with MOVE_TO_BACKGROUND?
stopped_with_background = sum(1 for p in patterns if p['has_background'])
stopped_without_background = len(patterns) - stopped_with_background

print(f"\n" + "="*80)
print("🎯 CRITICAL FINDING:")
print("="*80)
print(f"ACTIVITY_STOPPED with MOVE_TO_BACKGROUND:    {stopped_with_background:4d} ({stopped_with_background/len(patterns)*100:.1f}%)")
print(f"ACTIVITY_STOPPED WITHOUT MOVE_TO_BACKGROUND: {stopped_without_background:4d} ({stopped_without_background/len(patterns)*100:.1f}%)")

# Show examples of ACTIVITY_STOPPED WITHOUT MOVE_TO_BACKGROUND
orphaned_patterns = [p for p in patterns if not p['has_background']]

if orphaned_patterns:
    print(f"\n" + "="*80)
    print(f"🚨 ORPHANED ACTIVITY_STOPPED EVENTS (first 10):")
    print("="*80)
    
    for p in orphaned_patterns[:10]:
        stopped = p['stopped']
        next_evt = p['next']
        print(f"\n📍 {stopped['time_str']} | {stopped['package']}")
        print(f"   ↓ {p['gap_ms']}ms gap")
        print(f"   → {next_evt['time_str']} | Type {next_evt['type']} ({EVENT_NAMES.get(next_evt['type'], 'UNKNOWN')})")

# Now let's check the REVERSE: Does MOVE_TO_BACKGROUND always come with ACTIVITY_STOPPED?
background_events = [e for e in events if e['type'] == 2]
print(f"\n" + "="*80)
print(f"📊 Total MOVE_TO_BACKGROUND events: {len(background_events)}")
print("="*80)

# For each MOVE_TO_BACKGROUND, check if ACTIVITY_STOPPED happened nearby
background_patterns = []
for bg_event in background_events:
    package = bg_event['package']
    timestamp = bg_event['timestamp']
    
    # Look for ACTIVITY_STOPPED within ±5 seconds
    has_stopped = False
    for event in events:
        if (event['package'] == package and 
            event['type'] == 23 and
            abs(event['timestamp'] - timestamp) <= 5000):
            has_stopped = True
            break
    
    background_patterns.append({
        'bg_event': bg_event,
        'has_stopped': has_stopped
    })

bg_with_stopped = sum(1 for p in background_patterns if p['has_stopped'])
bg_without_stopped = len(background_patterns) - bg_with_stopped

print(f"\nMOVE_TO_BACKGROUND with ACTIVITY_STOPPED:    {bg_with_stopped:4d} ({bg_with_stopped/len(background_patterns)*100:.1f}%)")
print(f"MOVE_TO_BACKGROUND WITHOUT ACTIVITY_STOPPED: {bg_without_stopped:4d} ({bg_without_stopped/len(background_patterns)*100:.1f}%)")

# === CONCLUSION ===
print("\n" + "="*80)
print("📖 INTERPRETATION & CONCLUSION:")
print("="*80)

if stopped_without_background > 0:
    print(f"\n✅ YES - ACTIVITY_STOPPED can occur WITHOUT MOVE_TO_BACKGROUND")
    print(f"   Found {stopped_without_background} cases ({stopped_without_background/len(patterns)*100:.1f}%)")
    print("\n🔬 This means:")
    print("   - ACTIVITY_STOPPED fires when activity becomes invisible")
    print("   - This includes SCREEN-OFF scenarios (app still 'foreground' logically)")
    print("   - MOVE_TO_BACKGROUND fires only when another app takes foreground")
    print("\n❌ USING ACTIVITY_STOPPED as session-end is INCORRECT")
    print("   → It will END sessions during screen-off")
    print("   → Leading to UNDERCOUNT of screen time")
else:
    print(f"\n⚠️  ACTIVITY_STOPPED always paired with MOVE_TO_BACKGROUND in this dataset")
    print("   - Need more data to confirm")
    print("   - Test explicitly: open app, lock screen without switching apps")

print("\n" + "="*80)
print("✅ ANALYSIS COMPLETE")
print("="*80)
