package androidx.work.impl.utils;

import J0.t;
import T0.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\impl\utils\ForceStopRunnable$BroadcastReceiver.smali */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4872a = t.f("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (t.d().f2064a <= 2) {
            Log.v(f4872a, "Rescheduling alarm that keeps track of force-stops.");
        }
        e.c(context);
    }
}
