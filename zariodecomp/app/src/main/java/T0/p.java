package T0;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\p.smali */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3167a;

    static {
        String strF = J0.t.f("WakeLocks");
        kotlin.jvm.internal.i.d(strF, "tagWithPrefix(\"WakeLocks\")");
        f3167a = strF;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (q.f3168a) {
        }
        kotlin.jvm.internal.i.d(wakeLock, "wakeLock");
        return wakeLock;
    }
}
