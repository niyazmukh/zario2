#!/usr/bin/env python3
"""
Forensic Analysis of Android UsageEvents Patterns
==================================================

This script extracts ALL UsageEvents from the device and performs
rigorous pattern analysis to determine the TRUE semantics of events.

Analysis Goals:
1. Does ACTIVITY_STOPPED always precede MOVE_TO_BACKGROUND?
2. Does ACTIVITY_STOPPED ever happen WITHOUT MOVE_TO_BACKGROUND?
3. What is the temporal relationship between these events?
4. How do these patterns correlate with Android's aggregated screen time?
"""

import subprocess
import re
from datetime import datetime, timedelta
from collections import defaultdict, Counter
from dataclasses import dataclass
from typing import List, Dict, Tuple, Optional

# Event type constants (from UsageEvents.Event)
EVENT_TYPES = {
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

@dataclass
class Event:
    timestamp_ms: int
    package: str
    event_type: int
    event_name: str
    class_name: Optional[str] = None
    
    @property
    def time_str(self):
        return datetime.fromtimestamp(self.timestamp_ms / 1000).strftime("%Y-%m-%d %H:%M:%S.%f")[:-3]
    
    def __repr__(self):
        return f"{self.time_str} | {self.package:40s} | {self.event_name:35s}"

@dataclass
class EventPattern:
    """Represents a pattern of events (e.g., STOPPED → BACKGROUND)"""
    event1_type: int
    event2_type: int
    package: str
    time_gap_ms: int
    event1: Event
    event2: Event

def run_adb(command: str) -> str:
    """Execute ADB command and return output"""
    result = subprocess.run(
        f"adb shell {command}",
        shell=True,
        capture_output=True,
        text=True,
        timeout=60
    )
    if result.returncode != 0:
        print(f"ADB Error: {result.stderr}")
        return ""
    return result.stdout

def get_today_range() -> Tuple[int, int]:
    """Get today's date range in milliseconds"""
    now = datetime.now()
    today_start = datetime(now.year, now.month, now.day, 0, 0, 0)
    today_start_ms = int(today_start.timestamp() * 1000)
    now_ms = int(now.timestamp() * 1000)
    return today_start_ms, now_ms

def extract_all_events() -> List[Event]:
    """Extract ALL UsageEvents from device for today"""
    print("=" * 80)
    print("EXTRACTING ALL USAGEEVENTS FROM DEVICE")
    print("=" * 80)
    
    start_ms, end_ms = get_today_range()
    print(f"Time range: {datetime.fromtimestamp(start_ms/1000)} to {datetime.fromtimestamp(end_ms/1000)}")
    
    # Build comprehensive event type filter
    event_types = [1, 2, 5, 7, 8, 11, 15, 16, 17, 18, 19, 20, 23, 26, 27]
    event_filter = ",".join(map(str, event_types))
    
    # Construct UsageStats query command
    cmd = f'dumpsys usagestats query-events {start_ms} {end_ms} "{event_filter}"'
    print(f"\nExecuting: {cmd}\n")
    
    output = run_adb(cmd)
    
    # Parse events
    events = []
    for line in output.split('\n'):
        line = line.strip()
        if not line or line.startswith('Event'):
            continue
        
        # Parse format: time=1760704859123 type=1 package=com.twitter.android class=com.twitter.android.MainActivity
        time_match = re.search(r'time=(\d+)', line)
        type_match = re.search(r'type=(\d+)', line)
        pkg_match = re.search(r'package=([\w.]+)', line)
        class_match = re.search(r'class=([\w.$]+)', line)
        
        if time_match and type_match and pkg_match:
            timestamp = int(time_match.group(1))
            event_type = int(type_match.group(1))
            package = pkg_match.group(1)
            class_name = class_match.group(1) if class_match else None
            
            events.append(Event(
                timestamp_ms=timestamp,
                package=package,
                event_type=event_type,
                event_name=EVENT_TYPES.get(event_type, f"UNKNOWN_{event_type}"),
                class_name=class_name
            ))
    
    events.sort(key=lambda e: e.timestamp_ms)
    print(f"✓ Extracted {len(events)} events\n")
    return events

def analyze_event_sequences(events: List[Event]) -> Dict[str, any]:
    """Analyze temporal patterns between event types"""
    print("=" * 80)
    print("ANALYZING EVENT SEQUENCE PATTERNS")
    print("=" * 80)
    
    patterns = []
    
    # Group events by package
    by_package = defaultdict(list)
    for event in events:
        by_package[event.package].append(event)
    
    # For each package, look for ACTIVITY_STOPPED (23) followed by other events
    for package, pkg_events in by_package.items():
        for i, event in enumerate(pkg_events):
            if event.event_type == 23:  # ACTIVITY_STOPPED
                # Look ahead for next event from same package within 5 seconds
                for j in range(i + 1, len(pkg_events)):
                    next_event = pkg_events[j]
                    time_gap = next_event.timestamp_ms - event.timestamp_ms
                    
                    if time_gap > 5000:  # More than 5 seconds
                        break
                    
                    # Found a paired event
                    patterns.append(EventPattern(
                        event1_type=23,
                        event2_type=next_event.event_type,
                        package=package,
                        time_gap_ms=time_gap,
                        event1=event,
                        event2=next_event
                    ))
                    break  # Only consider immediate next event
    
    # Analyze patterns
    print(f"\n📊 Found {len(patterns)} ACTIVITY_STOPPED patterns\n")
    
    # Pattern frequency
    pattern_counts = Counter((p.event2_type, EVENT_TYPES.get(p.event2_type, "UNKNOWN")) for p in patterns)
    
    print("ACTIVITY_STOPPED followed by:")
    print("-" * 60)
    for (event_type, event_name), count in pattern_counts.most_common():
        percentage = (count / len(patterns) * 100) if patterns else 0
        avg_gap = sum(p.time_gap_ms for p in patterns if p.event2_type == event_type) / count
        print(f"  {event_name:35s} : {count:3d} times ({percentage:5.1f}%) - avg gap: {avg_gap:6.0f}ms")
    
    # Check for ACTIVITY_STOPPED WITHOUT MOVE_TO_BACKGROUND
    stopped_events = [e for e in events if e.event_type == 23]
    stopped_without_background = []
    
    for stopped in stopped_events:
        # Look for MOVE_TO_BACKGROUND within ±10 seconds for same package
        has_background = False
        for event in events:
            if (event.package == stopped.package and 
                event.event_type == 2 and  # MOVE_TO_BACKGROUND
                abs(event.timestamp_ms - stopped.timestamp_ms) <= 10000):
                has_background = True
                break
        
        if not has_background:
            stopped_without_background.append(stopped)
    
    print(f"\n🔍 ACTIVITY_STOPPED events WITHOUT nearby MOVE_TO_BACKGROUND: {len(stopped_without_background)}/{len(stopped_events)}")
    
    return {
        'patterns': patterns,
        'pattern_counts': pattern_counts,
        'stopped_without_background': stopped_without_background,
        'stopped_events': stopped_events
    }

def get_aggregated_screen_time() -> Dict[str, float]:
    """Get Android's aggregated screen time for today"""
    print("\n" + "=" * 80)
    print("EXTRACTING ANDROID AGGREGATED SCREEN TIME")
    print("=" * 80)
    
    start_ms, end_ms = get_today_range()
    
    # Query UsageStats (aggregated data)
    cmd = f'dumpsys usagestats query-stats daily {start_ms} {end_ms}'
    output = run_adb(cmd)
    
    # Parse format: package=com.twitter.android totalTimeInForeground=12345
    screen_time = {}
    current_package = None
    
    for line in output.split('\n'):
        line = line.strip()
        
        pkg_match = re.search(r'package=([\w.]+)', line)
        if pkg_match:
            current_package = pkg_match.group(1)
        
        time_match = re.search(r'totalTimeInForeground=(\d+)', line)
        if time_match and current_package:
            time_ms = int(time_match.group(1))
            if time_ms > 0:
                screen_time[current_package] = time_ms / 60000.0  # Convert to minutes
    
    print(f"✓ Retrieved screen time for {len(screen_time)} apps\n")
    
    # Show top 15 apps
    print("Top 15 apps by screen time (Android aggregated):")
    print("-" * 60)
    for package, minutes in sorted(screen_time.items(), key=lambda x: x[1], reverse=True)[:15]:
        print(f"  {package:45s} : {minutes:6.2f} min")
    
    return screen_time

def reconstruct_screen_time_from_events(events: List[Event]) -> Dict[str, float]:
    """Reconstruct screen time using different logic assumptions"""
    print("\n" + "=" * 80)
    print("RECONSTRUCTING SCREEN TIME FROM RAW EVENTS")
    print("=" * 80)
    
    # Method 1: Use only MOVE_TO_FOREGROUND/BACKGROUND
    print("\n🔬 Method 1: MOVE_TO_FOREGROUND → MOVE_TO_BACKGROUND")
    print("-" * 60)
    
    sessions_method1 = []
    by_package = defaultdict(list)
    for event in events:
        by_package[event.package].append(event)
    
    for package, pkg_events in by_package.items():
        session_start = None
        for event in pkg_events:
            if event.event_type == 1:  # MOVE_TO_FOREGROUND
                session_start = event.timestamp_ms
            elif event.event_type == 2 and session_start:  # MOVE_TO_BACKGROUND
                duration = event.timestamp_ms - session_start
                if duration > 0:
                    sessions_method1.append((package, duration))
                session_start = None
    
    time_method1 = defaultdict(float)
    for package, duration in sessions_method1:
        time_method1[package] += duration / 60000.0
    
    # Method 2: Use MOVE_TO_FOREGROUND → (MOVE_TO_BACKGROUND OR ACTIVITY_STOPPED)
    print("\n🔬 Method 2: MOVE_TO_FOREGROUND → (MOVE_TO_BACKGROUND OR ACTIVITY_STOPPED)")
    print("-" * 60)
    
    sessions_method2 = []
    for package, pkg_events in by_package.items():
        session_start = None
        for event in pkg_events:
            if event.event_type == 1:  # MOVE_TO_FOREGROUND
                session_start = event.timestamp_ms
            elif event.event_type in [2, 23] and session_start:  # MOVE_TO_BACKGROUND or ACTIVITY_STOPPED
                duration = event.timestamp_ms - session_start
                if duration > 0:
                    sessions_method2.append((package, duration))
                session_start = None
    
    time_method2 = defaultdict(float)
    for package, duration in sessions_method2:
        time_method2[package] += duration / 60000.0
    
    # Method 3: Close on SCREEN_NON_INTERACTIVE
    print("\n🔬 Method 3: MOVE_TO_FOREGROUND → MOVE_TO_BACKGROUND, close all on SCREEN_OFF")
    print("-" * 60)
    
    sessions_method3 = []
    open_sessions = {}  # package -> start_time
    
    for event in events:
        if event.event_type == 1:  # MOVE_TO_FOREGROUND
            open_sessions[event.package] = event.timestamp_ms
        elif event.event_type == 2:  # MOVE_TO_BACKGROUND
            if event.package in open_sessions:
                duration = event.timestamp_ms - open_sessions[event.package]
                if duration > 0:
                    sessions_method3.append((event.package, duration))
                del open_sessions[event.package]
        elif event.event_type == 16:  # SCREEN_NON_INTERACTIVE
            # Close all open sessions
            for package, start_time in open_sessions.items():
                duration = event.timestamp_ms - start_time
                if duration > 0:
                    sessions_method3.append((package, duration))
            open_sessions.clear()
    
    time_method3 = defaultdict(float)
    for package, duration in sessions_method3:
        time_method3[package] += duration / 60000.0
    
    return {
        'method1': time_method1,
        'method2': time_method2,
        'method3': time_method3
    }

def compare_with_android_truth(reconstructed: Dict, android_truth: Dict[str, float]):
    """Compare reconstructed times with Android's aggregated data"""
    print("\n" + "=" * 80)
    print("COMPARISON: RECONSTRUCTED vs ANDROID TRUTH")
    print("=" * 80)
    
    # Get common packages (apps with significant usage)
    common_packages = set(android_truth.keys())
    
    for method_name, method_data in reconstructed.items():
        print(f"\n📊 {method_name.upper()}")
        print("-" * 80)
        
        errors = []
        
        for package in sorted(common_packages, key=lambda p: android_truth.get(p, 0), reverse=True)[:15]:
            android_min = android_truth.get(package, 0)
            reconstructed_min = method_data.get(package, 0)
            error = reconstructed_min - android_min
            error_pct = (error / android_min * 100) if android_min > 0 else 0
            
            errors.append(abs(error_pct))
            
            status = "✓" if abs(error_pct) < 5 else "⚠" if abs(error_pct) < 10 else "✗"
            
            print(f"{status} {package:40s} | Android: {android_min:6.2f} | Recon: {reconstructed_min:6.2f} | Error: {error:+6.2f} ({error_pct:+6.1f}%)")
        
        avg_error = sum(errors) / len(errors) if errors else 0
        print(f"\n  Average absolute error: {avg_error:.2f}%")

def detailed_case_study(events: List[Event], package: str):
    """Deep dive into a specific app's event timeline"""
    print("\n" + "=" * 80)
    print(f"DETAILED CASE STUDY: {package}")
    print("=" * 80)
    
    pkg_events = [e for e in events if e.package == package]
    
    if not pkg_events:
        print(f"No events found for {package}")
        return
    
    print(f"\nTotal events: {len(pkg_events)}\n")
    print("Complete Event Timeline:")
    print("-" * 80)
    
    for i, event in enumerate(pkg_events):
        # Calculate gap from previous event
        if i > 0:
            gap_ms = event.timestamp_ms - pkg_events[i-1].timestamp_ms
            gap_sec = gap_ms / 1000.0
            if gap_sec > 60:
                print(f"    ... {gap_sec/60:.1f} minute gap ...")
        
        print(f"{event}")
    
    # Analyze ACTIVITY_STOPPED patterns for this app
    stopped_events = [e for e in pkg_events if e.event_type == 23]
    print(f"\n🔍 ACTIVITY_STOPPED events: {len(stopped_events)}")
    
    for stopped in stopped_events:
        print(f"\n  {stopped.time_str}")
        # Find nearest MOVE_TO_BACKGROUND
        nearest_bg = None
        min_gap = float('inf')
        
        for event in pkg_events:
            if event.event_type == 2:  # MOVE_TO_BACKGROUND
                gap = abs(event.timestamp_ms - stopped.timestamp_ms)
                if gap < min_gap:
                    min_gap = gap
                    nearest_bg = event
        
        if nearest_bg:
            time_diff = nearest_bg.timestamp_ms - stopped.timestamp_ms
            if abs(time_diff) < 1000:
                print(f"    → MOVE_TO_BACKGROUND at {nearest_bg.time_str} ({time_diff:+d}ms) ✓ PAIRED")
            else:
                print(f"    → Nearest MOVE_TO_BACKGROUND at {nearest_bg.time_str} ({time_diff/1000:+.1f}s) ⚠ UNPAIRED")
        else:
            print(f"    → NO MOVE_TO_BACKGROUND found ✗ ORPHANED")

def main():
    print("\n" + "=" * 80)
    print("FORENSIC ANALYSIS OF ANDROID USAGEEVENTS")
    print("High-IQ Pattern Recognition & Semantic Verification")
    print("=" * 80)
    print(f"Date: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    print("=" * 80)
    
    # Step 1: Extract all events
    events = extract_all_events()
    
    if not events:
        print("✗ No events extracted. Check device connection.")
        return
    
    # Step 2: Analyze event patterns
    pattern_analysis = analyze_event_sequences(events)
    
    # Step 3: Get Android's ground truth
    android_truth = get_aggregated_screen_time()
    
    # Step 4: Reconstruct using different methods
    reconstructed = reconstruct_screen_time_from_events(events)
    
    # Step 5: Compare
    compare_with_android_truth(reconstructed, android_truth)
    
    # Step 6: Case studies
    # Find top apps
    top_apps = sorted(android_truth.items(), key=lambda x: x[1], reverse=True)[:3]
    
    for package, _ in top_apps:
        detailed_case_study(events, package)
    
    # Step 7: Print orphaned ACTIVITY_STOPPED events
    if pattern_analysis['stopped_without_background']:
        print("\n" + "=" * 80)
        print("🚨 ORPHANED ACTIVITY_STOPPED EVENTS (No nearby MOVE_TO_BACKGROUND)")
        print("=" * 80)
        
        for event in pattern_analysis['stopped_without_background'][:20]:
            print(f"{event}")
            # Check what happened after
            idx = events.index(event)
            if idx + 1 < len(events):
                next_event = events[idx + 1]
                gap = (next_event.timestamp_ms - event.timestamp_ms) / 1000.0
                print(f"  → Next event: {next_event.event_name} for {next_event.package} after {gap:.1f}s")
    
    print("\n" + "=" * 80)
    print("ANALYSIS COMPLETE")
    print("=" * 80)

if __name__ == "__main__":
    main()
