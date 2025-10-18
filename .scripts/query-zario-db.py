#!/usr/bin/env python3
"""Query Zario database via adb to check if it shows 55 minutes for itself"""

import subprocess
import sys

print("=" * 100)
print("💾 PULLING ZARIO DATABASE AND QUERYING")
print("=" * 100)

# Pull database using run-as
print("\n📥 Pulling database...")
result = subprocess.run(
    ['adb', 'exec-out', 'run-as', 'com.niyaz.zario', 'cat', 'databases/usage_aggregation.db'],
    capture_output=True
)

if result.returncode != 0:
    print(f"❌ Failed to pull database")
    print(result.stderr.decode())
    sys.exit(1)

# Save to temp file
db_path = 'tmp/zario_db_temp.db'
with open(db_path, 'wb') as f:
    f.write(result.stdout)

print(f"✅ Database saved to {db_path}")

# Query it
import sqlite3

try:
    conn = sqlite3.connect(db_path)
    cur = conn.cursor()
    
    # Day start for Oct 17, 2025
    day_start = 1760648400000
    
    # Check Zario's sessions
    print(f"\n🔍 Checking com.niyaz.zario in database...")
    cur.execute("""
        SELECT COUNT(*), SUM(durationMs)/60000.0 
        FROM usage_sessions 
        WHERE packageName = 'com.niyaz.zario' AND dayStartMs = ?
    """, (day_start,))
    
    zario_count, zario_minutes = cur.fetchone()
    print(f"   Sessions: {zario_count}")
    print(f"   Total minutes: {zario_minutes if zario_minutes else 0:.2f}")
    
    # Get top 15 apps
    cur.execute("""
        SELECT packageName, COUNT(*) as sessions, SUM(durationMs)/60000.0 as total_minutes 
        FROM usage_sessions 
        WHERE dayStartMs = ?
        GROUP BY packageName 
        ORDER BY total_minutes DESC
        LIMIT 15
    """, (day_start,))
    
    print(f"\n📊 Top 15 apps in database today:")
    print(f"{'Package':45s} Sessions  Minutes")
    print("-" * 70)
    
    rows = cur.fetchall()
    for row in rows:
        pkg, sessions, minutes = row
        indicator = " ← ZARIO" if pkg == "com.niyaz.zario" else ""
        print(f"{pkg:45s} {sessions:3d}      {minutes:7.2f}{indicator}")
    
    # Get total for all apps
    cur.execute("SELECT SUM(durationMs)/60000.0 FROM usage_sessions WHERE dayStartMs = ?", (day_start,))
    total = cur.fetchone()[0]
    print(f"\n📈 TOTAL screen time in database: {total:.2f} minutes")
    
    print(f"\n" + "=" * 100)
    print("🎯 ANSWER TO YOUR QUESTION:")
    print("=" * 100)
    if zario_minutes and zario_minutes > 50:
        print(f"✅ YES - Database shows {zario_minutes:.2f} minutes for com.niyaz.zario")
        print(f"   But Android events show only 4.13 minutes!")
        print(f"   Something is WRONG with how Zario tracks itself.")
    elif zario_count == 0:
        print(f"❌ NO - Database shows 0 sessions for com.niyaz.zario")
        print(f"   This is because com.niyaz.zario is in the SUPPRESSED list!")
        print(f"   The 55 minutes you see must be coming from somewhere else.")
    else:
        print(f"⚠️  Database shows {zario_minutes:.2f} minutes for com.niyaz.zario")
        print(f"   This doesn't match the 55 minutes you're seeing.")
    
    conn.close()
    
except Exception as e:
    print(f"❌ Error reading database: {e}")
    import traceback
    traceback.print_exc()

print("\n" + "=" * 100)
print("✅ Query Complete!")
print("=" * 100)
