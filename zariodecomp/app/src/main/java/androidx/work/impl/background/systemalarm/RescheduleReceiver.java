package androidx.work.impl.background.systemalarm;

import J0.t;
import K0.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\impl\background\systemalarm\RescheduleReceiver.smali */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4857a = t.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        t.d().a(f4857a, "Received intent " + intent);
        try {
            r rVarB = r.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            rVarB.getClass();
            synchronized (r.f2171m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = rVarB.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    rVarB.i = pendingResultGoAsync;
                    if (rVarB.h) {
                        pendingResultGoAsync.finish();
                        rVarB.i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e5) {
            t.d().c(f4857a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e5);
        }
    }
}
