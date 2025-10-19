package b3;

import A2.C0020u;
import J0.C0111e;
import android.content.Context;
import com.niyaz.zario.firebase.RemoteSyncWorker;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: b3.V, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\V.smali */
public final class C0297V {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5192a;

    public C0297V(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f5192a = context;
    }

    public final void a() {
        C0111e c0111e = new C0111e(2, false, false, false, false, -1L, -1L, L3.j.z0(new LinkedHashSet()));
        C0020u c0020u = new C0020u(RemoteSyncWorker.class);
        ((S0.q) c0020u.f252d).f2902j = c0111e;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        c0020u.f250b = true;
        S0.q qVar = (S0.q) c0020u.f252d;
        qVar.f2904l = 1;
        long millis = timeUnit.toMillis(5L);
        String str = S0.q.f2893x;
        if (millis > 18000000) {
            J0.t.d().g(str, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            J0.t.d().g(str, "Backoff delay duration less than minimum value");
        }
        if (millis < 10000) {
            millis = 10000;
        } else if (millis > 18000000) {
            millis = 18000000;
        }
        qVar.f2905m = millis;
        J0.v vVarE = c0020u.e();
        K0.r rVarB = K0.r.b(this.f5192a);
        kotlin.jvm.internal.i.d(rVarB, "getInstance(...)");
        new K0.m(rVarB, "remote_firestore_sync", 4, Collections.singletonList(vVarE)).x0();
    }
}
