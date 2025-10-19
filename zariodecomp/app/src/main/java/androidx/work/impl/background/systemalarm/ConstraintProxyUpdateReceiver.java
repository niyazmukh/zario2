package androidx.work.impl.background.systemalarm;

import B3.J;
import J0.t;
import K0.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\impl\background\systemalarm\ConstraintProxyUpdateReceiver.smali */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4856a = t.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            r.b(context).f2175d.c(new J(intent, context, goAsync()));
        } else {
            t.d().a(f4856a, AbstractC0854a.b("Ignoring unknown action ", action));
        }
    }
}
