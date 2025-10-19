package c3;

import V2.n;
import android.content.Context;
import android.os.PowerManager;
import android.util.Log;
import kotlin.jvm.internal.i;
import z2.C1071b;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c3.1\a.smali */
public final class C0337a implements InterfaceC0338b {
    public final void a(Context context, n plan, long j5) {
        i.e(context, "context");
        i.e(plan, "plan");
        Object systemService = context.getSystemService("power");
        i.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "Minutes::NotificationWakeLock");
        try {
            wakeLockNewWakeLock.acquire(10000L);
            Log.d("NotificationUtils", "Wakelock acquired for notification delivery");
            C1071b.h(context, plan, j5);
            Log.i("NotificationUtils", "Cycle completion notification sent immediately");
        } finally {
            if (wakeLockNewWakeLock.isHeld()) {
                wakeLockNewWakeLock.release();
                Log.d("NotificationUtils", "Wakelock released");
            }
        }
    }

    public final void b(Context context, n plan, long j5, int i) {
        i.e(context, "context");
        i.e(plan, "plan");
        Object systemService = context.getSystemService("power");
        i.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "Minutes::NotificationWakeLock");
        try {
            wakeLockNewWakeLock.acquire(10000L);
            Log.d("NotificationUtils", "Wakelock acquired for notification delivery");
            C1071b.i(context, plan, j5, i);
        } finally {
            if (wakeLockNewWakeLock.isHeld()) {
                wakeLockNewWakeLock.release();
                Log.d("NotificationUtils", "Wakelock released");
            }
        }
    }
}
