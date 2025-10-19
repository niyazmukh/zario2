package androidx.work.impl.diagnostics;

import A2.C0020u;
import J0.t;
import J0.v;
import K0.m;
import K0.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\impl\diagnostics\DiagnosticsReceiver.smali */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4866a = t.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        t tVarD = t.d();
        String str = f4866a;
        tVarD.a(str, "Requesting diagnostics");
        try {
            r rVarB = r.b(context);
            v vVarE = new C0020u(DiagnosticsWorker.class).e();
            rVarB.getClass();
            List listSingletonList = Collections.singletonList(vVarE);
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new m(rVarB, null, 2, listSingletonList).x0();
        } catch (IllegalStateException e5) {
            t.d().c(str, "WorkManager is not initialized", e5);
        }
    }
}
