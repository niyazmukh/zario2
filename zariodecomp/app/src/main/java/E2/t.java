package E2;

import A2.C0009i;
import A2.C0020u;
import A3.d;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import z3.C1079c;
import z3.EnumC1087k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\t.smali */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public Task f1493a = Tasks.call(F2.o.f1726c, new r(this, 0));

    /* renamed from: b, reason: collision with root package name */
    public final F2.f f1494b;

    /* renamed from: c, reason: collision with root package name */
    public C1079c f1495c;

    /* renamed from: d, reason: collision with root package name */
    public C0009i f1496d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f1497e;

    /* renamed from: f, reason: collision with root package name */
    public final C0020u f1498f;

    /* renamed from: g, reason: collision with root package name */
    public final l f1499g;

    public t(F2.f fVar, Context context, C0020u c0020u, l lVar) {
        this.f1494b = fVar;
        this.f1497e = context;
        this.f1498f = c0020u;
        this.f1499g = lVar;
    }

    public final void a(d dVar) {
        EnumC1087k enumC1087kT = dVar.f272d.t();
        p1.b.p(1, "GrpcCallProvider", "Current gRPC connectivity state: " + enumC1087kT, new Object[0]);
        if (this.f1496d != null) {
            p1.b.p(1, "GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f1496d.w();
            this.f1496d = null;
        }
        if (enumC1087kT == EnumC1087k.f11341a) {
            p1.b.p(1, "GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f1496d = this.f1494b.a(F2.e.f1701m, 15000L, new s(this, dVar, 1));
        }
        dVar.u(enumC1087kT, new s(this, dVar, 2));
    }
}
