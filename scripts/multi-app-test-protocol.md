# Multi-App Testing Protocol

## Objective
Generate sufficient usage events for Chrome, YouTube, WhatsApp, and Facebook to validate if they exhibit similar taskRoot filtering issues as Twitter/Instagram.

## Test Procedure

### 1. Clear Logs and Start Fresh
```powershell
adb shell logcat -c
```

### 2. Test Chrome (5 minutes)
- Open Chrome: `adb shell am start -n com.android.chrome/com.google.android.apps.chrome.Main`
- Actions to perform:
  - Browse 3-4 different websites
  - Watch a video (will use custom tabs/media player)
  - Open multiple tabs
  - Switch between tabs
- Expected drops: Custom tabs may show `com.google.android.apps.chrome` as taskRoot

### 3. Test YouTube (5 minutes)
- Open YouTube: `adb shell am start -a android.intent.action.VIEW -d "vnd.youtube://"`
- Or use: `adb shell am start -n com.google.android.youtube/com.google.android.youtube.app.honeycomb.Shell$HomeActivity`
- Actions to perform:
  - Watch 2-3 videos (switch between them)
  - Use fullscreen mode
  - Check comments/like
- Expected drops: Media player activities may show system taskRoot

### 4. Test WhatsApp (5 minutes)
- Open WhatsApp: `adb shell am start -n com.whatsapp/com.whatsapp.HomeActivity`
- Actions to perform:
  - Send messages to 2-3 chats
  - View status
  - Open media gallery
- Expected drops: Media picker, camera may show system taskRoot

### 5. Test Facebook (5 minutes)
- Open Facebook: `adb shell am start -n com.facebook.katana/com.facebook.katana.LoginActivity`
- Actions to perform:
  - Scroll feed
  - Watch 1-2 videos
  - Open a post
  - Check notifications
- Expected drops: Video player, in-app browser may show system taskRoot

### 6. Capture Telemetry
```powershell
# Trigger Zario to ingest events
adb shell am start -n com.niyaz.zario/.MainActivity

# Wait for ingestion to complete
Start-Sleep -Seconds 5

# Capture full telemetry
adb shell logcat -d -s UsageIngestionTelemetry:* > multi_app_telemetry_full.txt

# Extract high-value drops
adb shell logcat -d -s UsageIngestionTelemetry:* | Select-String -Pattern "HIGH-VALUE APP DROPS|chrome|youtube|whatsapp|facebook" -Context 2,2 > multi_app_high_value_drops.txt

# Extract package statistics
adb shell logcat -d -s UsageIngestionTelemetry:* | Select-String -Pattern "com.android.chrome|com.google.android.youtube|com.whatsapp|com.facebook" -Context 1,1 > multi_app_package_stats.txt
```

## Analysis Checklist

After capture, verify:

1. **Chrome drops:**
   - [ ] Total events captured for `com.android.chrome`
   - [ ] Drop rate percentage
   - [ ] TaskRoot packages causing drops (look for `com.google.android.apps.chrome.*`)

2. **YouTube drops:**
   - [ ] Total events captured for `com.google.android.youtube`
   - [ ] Drop rate percentage
   - [ ] TaskRoot packages causing drops (look for media player components)

3. **WhatsApp drops:**
   - [ ] Total events captured for `com.whatsapp`
   - [ ] Drop rate percentage
   - [ ] TaskRoot packages causing drops (look for media/camera components)

4. **Facebook drops:**
   - [ ] Total events captured for `com.facebook.katana`
   - [ ] Drop rate percentage
   - [ ] TaskRoot packages causing drops (look for video/browser components)

## Expected Outcomes

If hypothesis is correct, we should see:
- Chrome: Drops when custom tabs or media player used
- YouTube: Drops when fullscreen/picture-in-picture mode active
- WhatsApp: Drops when camera, media picker, or status viewer used
- Facebook: Drops when in-app video player or browser active

## Next Steps Based on Results

- **If drops found:** Document specific taskRoot packages for each app, design whitelist solution
- **If no drops found:** Focus fix on Twitter/Instagram only, investigate why they're unique
