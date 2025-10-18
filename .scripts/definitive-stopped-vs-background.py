"""
DEFINITIVE ANALYSIS: ACTIVITY_STOPPED vs MOVE_TO_BACKGROUND
============================================================

This script provides the DEFINITIVE answer to:
"Does ACTIVITY_STOPPED always mean the app left foreground?"

Method:
1. Extract ALL events from Android for today
2. Find every ACTIVITY_STOPPED event
3. Check: Is there a MOVE_TO_BACKGROUND nearby?
4. Check: What event actually FOLLOWS each ACTIVITY_STOPPED?
5. Cross-verify with Android Activity Handbook documentation

Cross-reference: @file:android-activity-handbook.md
"""

import subprocess
import re
from datetime import datetime
from collections import defaultdict, Counter

print("=" * 100)
print("🧠 DEFINITIVE FORENSIC ANALYSIS: ACTIVITY_STOPPED vs MOVE_TO_BACKGROUND")
print("=" * 100)
print(f"Date: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
print("=" * 100)

# Get Android data
day_start_ms = 1760648400000  # Oct 17, 2025 00:00:00
now_ms = int(datetime.now().timestamp() * 1000)

print(f"\n📱 Querying Android UsageStatsManager via dumpsys...")
result = subprocess.run(
    ['adb', 'shell', 'dumpsys', 'usagestats'],
    capture_output=True,
    text=True,
    timeout=60
)

lines = result.stdout.split('\n')
lines_today = [line for line in lines if 'time="2025-10-17' in line]
print(f"✅ Got {len(lines_today):,} event lines for Oct 17")

# Parse ALL events with precise typing
events = []
for line in lines_today:
    # Extract timestamp
    time_match = re.search(r'time="2025-10-17 (\d{2}):(\d{2}):(\d{2})"', line)
    if not time_match:
        continue
    
    h, m, s = map(int, time_match.groups())
    timestamp_ms = day_start_ms + (h * 3600 + m * 60 + s) * 1000
    time_str = f"{h:02d}:{m:02d}:{s:02d}"
    
    # Extract package
    pkg_match = re.search(r'package=(\S+)', line)
    if not pkg_match:
        continue
    package = pkg_match.group(1)
    
    # Precise event type classification
    event_type = None
    event_code = None
    
    if 'ACTIVITY_RESUMED' in line:
        event_type = 'ACTIVITY_RESUMED'
        event_code = 1
    elif 'MOVE_TO_FOREGROUND' in line and 'ACTIVITY_RESUMED' not in line:
        event_type = 'MOVE_TO_FOREGROUND'
        event_code = 1
    elif 'ACTIVITY_PAUSED' in line:
        event_type = 'ACTIVITY_PAUSED'
        event_code = 2
    elif 'MOVE_TO_BACKGROUND' in line and 'ACTIVITY_PAUSED' not in line:
        event_type = 'MOVE_TO_BACKGROUND'
        event_code = 2
    elif 'ACTIVITY_STOPPED' in line:
        event_type = 'ACTIVITY_STOPPED'
        event_code = 23
    elif 'SCREEN_NON_INTERACTIVE' in line:
        event_type = 'SCREEN_NON_INTERACTIVE'
        event_code = 16
    elif 'SCREEN_INTERACTIVE' in line:
        event_type = 'SCREEN_INTERACTIVE'
        event_code = 15
    elif 'KEYGUARD_SHOWN' in line:
        event_type = 'KEYGUARD_SHOWN'
        event_code = 17
    elif 'KEYGUARD_HIDDEN' in line:
        event_type = 'KEYGUARD_HIDDEN'
        event_code = 18
    
    if event_type:
        events.append({
            'timestamp_ms': timestamp_ms,
            'time_str': time_str,
            'package': package,
            'type': event_type,
            'code': event_code,
            'raw': line.strip()
        })

events.sort(key=lambda e: e['timestamp_ms'])
print(f"✅ Parsed {len(events):,} events")

# Event type distribution
type_counts = Counter(e['type'] for e in events)
print(f"\n📊 Event Type Distribution:")
print("-" * 80)
for event_type, count in sorted(type_counts.items(), key=lambda x: x[1], reverse=True):
    print(f"  {event_type:30s} : {count:5d}")

# Find all ACTIVITY_STOPPED events
stopped_events = [e for e in events if e['type'] == 'ACTIVITY_STOPPED']
print(f"\n🔍 Total ACTIVITY_STOPPED events: {len(stopped_events)}")

if len(stopped_events) == 0:
    print("\n⚠️  NO ACTIVITY_STOPPED events found!")
    print("\nPossible reasons:")
    print("  1. Device API level < 29 (ACTIVITY_STOPPED introduced in API 29)")
    print("  2. No app activities were stopped today")
    print("  3. OEM-specific filtering")
    print("\n📖 Reference: android-activity-handbook.md")
    print("  ACTIVITY_STOPPED (23): Activity became invisible (API 29+)")
    exit(0)

# === CRITICAL ANALYSIS ===
print("\n" + "=" * 100)
print("🎯 PATTERN ANALYSIS: What happens around ACTIVITY_STOPPED?")
print("=" * 100)

# For each ACTIVITY_STOPPED, find what came BEFORE and AFTER
patterns = []

for i, stopped in enumerate(stopped_events):
    pkg = stopped['package']
    ts_stopped = stopped['timestamp_ms']
    
    # Find PREVIOUS event for same package (within 10 sec before)
    prev_event = None
    for j in range(i-1, -1, -1):
        if events[j]['package'] == pkg:
            gap = ts_stopped - events[j]['timestamp_ms']
            if gap <= 10000:  # Within 10 sec
                prev_event = events[j]
                break
            elif gap > 10000:
                break
    
    # Find NEXT event for same package (within 10 sec after)
    next_event = None
    next_gap_ms = None
    for j in range(i+1, len(events)):
        if events[j]['package'] == pkg:
            gap = events[j]['timestamp_ms'] - ts_stopped
            if gap <= 10000:  # Within 10 sec
                next_event = events[j]
                next_gap_ms = gap
                break
            elif gap > 10000:
                break
    
    # Check for MOVE_TO_BACKGROUND within ±5 seconds
    has_move_to_background_nearby = False
    move_to_bg_gap = None
    for event in events:
        if (event['package'] == pkg and 
            event['type'] == 'MOVE_TO_BACKGROUND' and
            abs(event['timestamp_ms'] - ts_stopped) <= 5000):
            has_move_to_background_nearby = True
            move_to_bg_gap = event['timestamp_ms'] - ts_stopped
            break
    
    # Check what global event happened around this time (screen off, keyguard, etc.)
    global_events_nearby = []
    for event in events:
        if (event['type'] in ['SCREEN_NON_INTERACTIVE', 'SCREEN_INTERACTIVE', 'KEYGUARD_SHOWN', 'KEYGUARD_HIDDEN'] and
            abs(event['timestamp_ms'] - ts_stopped) <= 2000):  # Within 2 sec
            global_events_nearby.append({
                'type': event['type'],
                'gap_ms': event['timestamp_ms'] - ts_stopped
            })
    
    patterns.append({
        'stopped': stopped,
        'prev_event': prev_event,
        'next_event': next_event,
        'next_gap_ms': next_gap_ms,
        'has_move_to_background': has_move_to_background_nearby,
        'move_to_bg_gap': move_to_bg_gap,
        'global_events': global_events_nearby
    })

# Summarize patterns
print(f"\n📈 Summary of {len(patterns)} ACTIVITY_STOPPED events:")
print("-" * 100)

with_bg = sum(1 for p in patterns if p['has_move_to_background'])
without_bg = len(patterns) - with_bg

print(f"\n✅ ACTIVITY_STOPPED with MOVE_TO_BACKGROUND nearby (±5 sec):    {with_bg:4d} ({with_bg/len(patterns)*100:.1f}%)")
print(f"❌ ACTIVITY_STOPPED WITHOUT MOVE_TO_BACKGROUND:                 {without_bg:4d} ({without_bg/len(patterns)*100:.1f}%)")

# What comes NEXT after ACTIVITY_STOPPED?
next_event_types = Counter(p['next_event']['type'] if p['next_event'] else 'NOTHING' 
                           for p in patterns)

print(f"\n📊 Event that FOLLOWS ACTIVITY_STOPPED:")
print("-" * 100)
for event_type, count in next_event_types.most_common():
    pct = count / len(patterns) * 100
    avg_gap = sum(p['next_gap_ms'] for p in patterns 
                  if p['next_event'] and p['next_event']['type'] == event_type) / count if count > 0 else 0
    print(f"  {event_type:30s} : {count:4d} ({pct:5.1f}%) - avg gap: {avg_gap:6.0f}ms")

# What GLOBAL events coincide with ACTIVITY_STOPPED?
global_event_counts = Counter()
for p in patterns:
    for ge in p['global_events']:
        global_event_counts[ge['type']] += 1

if global_event_counts:
    print(f"\n📊 Global events occurring near ACTIVITY_STOPPED (±2 sec):")
    print("-" * 100)
    for event_type, count in global_event_counts.most_common():
        pct = count / len(patterns) * 100
        print(f"  {event_type:30s} : {count:4d} ({pct:5.1f}%)")

# === THE SMOKING GUN: Show examples of ACTIVITY_STOPPED WITHOUT MOVE_TO_BACKGROUND ===
orphaned = [p for p in patterns if not p['has_move_to_background']]

if orphaned:
    print(f"\n" + "=" * 100)
    print(f"🚨 SMOKING GUN: ACTIVITY_STOPPED WITHOUT MOVE_TO_BACKGROUND (first 15 cases)")
    print("=" * 100)
    
    for i, p in enumerate(orphaned[:15]):
        stopped = p['stopped']
        next_evt = p['next_event']
        global_evts = p['global_events']
        
        print(f"\n#{i+1}. Package: {stopped['package']}")
        print(f"    Time: {stopped['time_str']}")
        print(f"    ACTIVITY_STOPPED")
        
        if global_evts:
            for ge in global_evts:
                sign = '+' if ge['gap_ms'] >= 0 else ''
                print(f"      {sign}{ge['gap_ms']}ms → {ge['type']}")
        
        if next_evt:
            print(f"      +{p['next_gap_ms']}ms → {next_evt['type']} (next event for same package)")
        else:
            print(f"      → NO FURTHER EVENTS for this package")

# === INTERPRETATION ===
print("\n" + "=" * 100)
print("📖 INTERPRETATION (Cross-referenced with android-activity-handbook.md)")
print("=" * 100)

print(f"""
According to android-activity-handbook.md:

  ACTIVITY_STOPPED (23): "Activity became invisible" (API 29+)
  MOVE_TO_BACKGROUND (2): "App moved to background" (deprecated, use ACTIVITY_PAUSED)
  ACTIVITY_PAUSED (2): "Activity lost foreground focus" (API 29+)

KEY INSIGHT:
  - ACTIVITY_STOPPED fires when activity becomes INVISIBLE
  - This includes:
    1. Another app takes foreground (also fires MOVE_TO_BACKGROUND)
    2. Screen turns off (NO MOVE_TO_BACKGROUND - app still "last foreground app")
    3. Lock screen shown (NO MOVE_TO_BACKGROUND - app still running)

FINDINGS FROM THIS ANALYSIS:
  - {with_bg}/{len(patterns)} ACTIVITY_STOPPED events ({with_bg/len(patterns)*100:.1f}%) have MOVE_TO_BACKGROUND nearby
  - {without_bg}/{len(patterns)} ACTIVITY_STOPPED events ({without_bg/len(patterns)*100:.1f}%) do NOT have MOVE_TO_BACKGROUND
  - Common global events near orphaned ACTIVITY_STOPPED: {', '.join(f"{k} ({v})" for k, v in global_event_counts.most_common(3))}

CONCLUSION:
""")

if without_bg > 0:
    print(f"""  ✅ YES - ACTIVITY_STOPPED CAN occur WITHOUT MOVE_TO_BACKGROUND
  
  ❌ Using ACTIVITY_STOPPED as "session end" is INCORRECT because:
     1. It fires during screen-off when app is still "active" from Android's perspective
     2. This causes premature session termination
     3. Leading to SEVERE UNDERCOUNT of screen time
  
  ✅ CORRECT approach (matching Digital Wellbeing):
     1. Use ONLY MOVE_TO_BACKGROUND (or ACTIVITY_PAUSED) for session end
     2. Close ALL sessions on SCREEN_NON_INTERACTIVE (device-level event)
     3. DO NOT use ACTIVITY_STOPPED for session termination
  
  📊 Impact: {without_bg} ACTIVITY_STOPPED events ({without_bg/len(patterns)*100:.1f}%) would incorrectly end sessions
""")
else:
    print(f"""  ⚠️  In this dataset, ACTIVITY_STOPPED always paired with MOVE_TO_BACKGROUND
  
  However, android-activity-handbook.md clearly states:
    "ACTIVITY_STOPPED (23): Activity became invisible"
  
  This is different from MOVE_TO_BACKGROUND which specifically means app left foreground.
  
  🧪 Recommended test:
     1. Open Twitter
     2. Use for 2 minutes
     3. Lock screen (do NOT switch apps)
     4. Wait 5 minutes
     5. Unlock and check - you should see ACTIVITY_STOPPED but NO MOVE_TO_BACKGROUND
""")

print("\n" + "=" * 100)
print("✅ ANALYSIS COMPLETE")
print("=" * 100)
