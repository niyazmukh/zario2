#!/usr/bin/env python3
"""
LIVE FORENSIC ANALYSIS: Past 30 minutes
Compare Zario's event processing vs Android's raw events for Twitter
"""

import subprocess
import re
from datetime import datetime, timedelta

TWITTER_PKG = "com.twitter.android"

# Calculate time window (past 30 minutes)
now = datetime.now()
thirty_min_ago = now - timedelta(minutes=30)
now_ms = int(now.timestamp() * 1000)
start_ms = int(thirty_min_ago.timestamp() * 1000)

print("="*80)
print("LIVE FORENSIC ANALYSIS - PAST 30 MINUTES")
print("="*80)
print(f"Time Window: {thirty_min_ago.strftime('%H:%M:%S')} → {now.strftime('%H:%M:%S')}")
print(f"Epoch Range: {start_ms} → {now_ms}")
print()

# ===========================================================================
# STEP 1: Get Android's aggregated stats (ground truth)
# ===========================================================================
print("STEP 1: Querying Android UsageStats (Ground Truth)")
print("-"*80)

cmd = ["adb", "shell", f"dumpsys usagestats {TWITTER_PKG} {start_ms} {now_ms}"]
result = subprocess.run(cmd, capture_output=True, text=True, timeout=10)
android_output = result.stdout

# Parse totalTimeUsed
total_time_pattern = r'totalTimeUsed="([^"]+)"'
match = re.search(total_time_pattern, android_output)

if match:
    time_str = match.group(1)
    print(f"✅ Android reports totalTimeUsed: {time_str}")
    
    # Convert to minutes
    parts = time_str.split(':')
    if len(parts) == 3:
        hours, mins, secs = int(parts[0]), int(parts[1]), int(parts[2])
        android_total_mins = hours * 60 + mins + secs / 60.0
        android_total_ms = android_total_mins * 60000
        print(f"   = {android_total_mins:.2f} minutes ({int(android_total_ms)} ms)")
    elif len(parts) == 2:
        # Format is MM:SS
        mins, secs = int(parts[0]), int(parts[1])
        android_total_mins = mins + secs / 60.0
        android_total_ms = android_total_mins * 60000
        print(f"   = {android_total_mins:.2f} minutes ({int(android_total_ms)} ms)")
    else:
        print(f"⚠️  Could not parse time string: {time_str}")
        android_total_mins = None
        android_total_ms = None
else:
    print("❌ Could not find totalTimeUsed in Android output")
    android_total_mins = None
    android_total_ms = None

print()

# ===========================================================================
# STEP 2: Get Zario's telemetry logs to see what events it ingested
# ===========================================================================
print("STEP 2: Checking Zario's Ingestion Telemetry")
print("-"*80)

# Get logs from past 30 minutes
time_filter = thirty_min_ago.strftime("%m-%d %H:%M:%S.000")
cmd = ["adb", "logcat", "-t", time_filter, "-d", "UsageIngestionTelemetry:V", "*:S"]
result = subprocess.run(cmd, capture_output=True, text=True, timeout=10)
telemetry_logs = result.stdout

# Look for Twitter mentions or social media status
twitter_mentions = 0
for line in telemetry_logs.split('\n'):
    if 'twitter' in line.lower():
        twitter_mentions += 1
        print(f"  {line.strip()}")

# Check for "No drops detected"
if "No drops detected for social media apps" in telemetry_logs:
    print("\n✅ Telemetry confirms: NO Twitter events dropped during ingestion")
else:
    print("\n⚠️  No explicit confirmation that Twitter events were ingested cleanly")

print()

# ===========================================================================
# STEP 3: Dump raw UsageStats EVENTS that Android has for this window
# ===========================================================================
print("STEP 3: Extracting Raw Android UsageStats Events")
print("-"*80)

# Try to get event-level data
cmd = ["adb", "shell", f"dumpsys usagestats {TWITTER_PKG}"]
result = subprocess.run(cmd, capture_output=True, text=True, timeout=15)
events_output = result.stdout

# Look for event timestamps in the output
event_pattern = r'time="([^"]+)".*type=(\d+)'
events_found = []

for line in events_output.split('\n'):
    if TWITTER_PKG in line or 'time=' in line:
        match = re.search(event_pattern, line)
        if match:
            time_str, event_type = match.group(1), match.group(2)
            try:
                event_time = datetime.strptime(time_str, "%Y-%m-%d %H:%M:%S")
                # Check if in our window
                if thirty_min_ago <= event_time <= now:
                    events_found.append((event_time, event_type, line.strip()))
            except:
                pass

if events_found:
    print(f"Found {len(events_found)} Twitter events in the past 30 minutes:")
    for event_time, event_type, raw_line in events_found[:20]:  # Show first 20
        type_name = {
            '1': 'ACTIVITY_RESUMED',
            '2': 'ACTIVITY_PAUSED', 
            '23': 'ACTIVITY_STOPPED',
            '24': 'ACTIVITY_DESTROYED'
        }.get(event_type, f'TYPE_{event_type}')
        print(f"  {event_time.strftime('%H:%M:%S')} - {type_name}")
else:
    print("⚠️  No Twitter events found in dumpsys output for this window")
    print("    (Android may not keep event history, only aggregated stats)")

print()

# ===========================================================================
# STEP 4: Check Zario's database for processed sessions
# ===========================================================================
print("STEP 4: Checking Zario's Processed Sessions")
print("-"*80)

# Get current day start
today = now.replace(hour=0, minute=0, second=0, microsecond=0)
day_start_ms = int(today.timestamp() * 1000)

# Query Zario database via adb
query = f"SELECT startMs, endMs, durationMs FROM usage_sessions WHERE packageName='{TWITTER_PKG}' AND dayStartMs={day_start_ms} ORDER BY startMs DESC LIMIT 20"

# Use run-as to access the database and dump as CSV
cmd = [
    "adb", "shell",
    f"run-as com.niyaz.zario sh -c 'echo \"{query};\" | cat - databases/usage_aggregation.db 2>/dev/null'"
]

# Alternative: Pull and query locally
print("Pulling Zario database...")
pull_cmd = ["adb", "exec-out", "run-as", "com.niyaz.zario", "cat", "databases/usage_aggregation.db"]
result = subprocess.run(pull_cmd, capture_output=True, timeout=10)

if result.returncode == 0 and len(result.stdout) > 1000:
    # Save to temp file
    with open("tmp/zario_live.db", "wb") as f:
        f.write(result.stdout)
    
    print("✅ Database pulled successfully")
    
    # Query it with Python sqlite3
    import sqlite3
    conn = sqlite3.connect("tmp/zario_live.db")
    cursor = conn.cursor()
    
    try:
        cursor.execute(f"""
            SELECT startMs, endMs, durationMs 
            FROM usage_sessions 
            WHERE packageName = ? AND dayStartMs = ?
            ORDER BY startMs DESC
            LIMIT 20
        """, (TWITTER_PKG, day_start_ms))
        
        sessions = cursor.fetchall()
        
        if sessions:
            print(f"\nFound {len(sessions)} Twitter sessions in Zario DB today:")
            print()
            
            zario_total_ms = 0
            recent_total_ms = 0
            
            for start_ms, end_ms, duration_ms in sessions:
                start_time = datetime.fromtimestamp(start_ms / 1000)
                end_time = datetime.fromtimestamp(end_ms / 1000)
                duration_min = duration_ms / 60000
                
                # Check if overlaps with our 30-min window
                is_in_window = (end_ms >= start_ms) and (start_ms <= now_ms)
                
                # Calculate overlap
                overlap_start = max(start_ms, start_ms)
                overlap_end = min(end_ms, now_ms)
                overlap_ms = max(0, overlap_end - overlap_start)
                
                marker = "🔴" if is_in_window else "  "
                print(f"{marker} {start_time.strftime('%H:%M:%S')} → {end_time.strftime('%H:%M:%S')} = {duration_min:.2f} min")
                
                zario_total_ms += duration_ms
                if is_in_window:
                    recent_total_ms += overlap_ms
            
            print("-"*80)
            print(f"Zario TOTAL today: {zario_total_ms/60000:.2f} minutes")
            print(f"Zario in past 30min: {recent_total_ms/60000:.2f} minutes")
            
        else:
            print("❌ No Twitter sessions found in Zario database for today")
            recent_total_ms = 0
        
        conn.close()
        
    except Exception as e:
        print(f"❌ Error querying database: {e}")
        recent_total_ms = 0
else:
    print("❌ Failed to pull database")
    recent_total_ms = 0

print()

# ===========================================================================
# STEP 5: COMPARISON & VERDICT
# ===========================================================================
print("="*80)
print("FORENSIC ANALYSIS RESULTS")
print("="*80)

if android_total_mins is not None:
    print(f"📊 Android UsageStats (ground truth): {android_total_mins:.2f} minutes")
    print(f"📊 Digital Wellbeing reports:          9.00 minutes")
    print(f"📊 Zario processed sessions:           {recent_total_ms/60000:.2f} minutes (from DB)")
    print(f"📊 User observed Zario UI:             7.00 minutes (reported)")
    print()
    
    # Calculate discrepancies
    android_vs_dwb = android_total_mins - 9.0
    android_vs_zario_db = android_total_mins - (recent_total_ms/60000)
    android_vs_zario_ui = android_total_mins - 7.0
    
    print("DISCREPANCIES:")
    print(f"  Android vs Digital Wellbeing: {android_vs_dwb:+.2f} minutes")
    print(f"  Android vs Zario DB:          {android_vs_zario_db:+.2f} minutes")
    print(f"  Android vs Zario UI:          {android_vs_zario_ui:+.2f} minutes")
    print()
    
    # Verdict
    print("VERDICT:")
    if abs(android_vs_zario_db) < 0.5:
        print("✅ Zario's database matches Android closely (< 30 sec diff)")
        print("   The 7-min UI reading might be outdated/cached")
    elif abs(android_vs_zario_db) < abs(android_vs_zario_ui):
        print("⚠️  Zario DB is closer to truth than UI")
        print("   Possible UI refresh/caching issue")
    else:
        print("❌ CONFIRMED: Zario is UNDER-COUNTING Twitter usage")
        print(f"   Missing ~{android_vs_zario_ui:.1f} minutes of tracking")
        
        if "No drops detected" in telemetry_logs:
            print("\n🔍 ROOT CAUSE ANALYSIS:")
            print("   ✓ Events ARE being ingested (telemetry confirms)")
            print("   ✗ Problem is in SESSION RECONCILIATION or AGGREGATION")
            print()
            print("   HYPOTHESIS: Reconciler is not fully extending sessions")
            print("   - Android reports sparse events (RESUMED...long gap...STOPPED)")
            print("   - Zario's 30-second continuity gap is insufficient")
            print("   - Sessions are being truncated prematurely")

print()
print("="*80)
