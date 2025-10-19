package r3;

import S2.u;
import android.content.Context;
import androidx.lifecycle.a0;
import androidx.lifecycle.f0;
import d3.C0446b;
import f4.E;
import i4.C;
import i4.I;
import i4.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r3.1\m.smali */
public final class m extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final U2.l f9658a;

    /* renamed from: b, reason: collision with root package name */
    public final C0446b f9659b;

    /* renamed from: c, reason: collision with root package name */
    public final I f9660c;

    /* renamed from: d, reason: collision with root package name */
    public final x f9661d;

    /* renamed from: e, reason: collision with root package name */
    public long f9662e;

    /* renamed from: f, reason: collision with root package name */
    public long f9663f;

    public m(Context context, u evaluationRepository, U2.l usageStatsRepository, C0446b permissionsManager) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(evaluationRepository, "evaluationRepository");
        kotlin.jvm.internal.i.e(usageStatsRepository, "usageStatsRepository");
        kotlin.jvm.internal.i.e(permissionsManager, "permissionsManager");
        this.f9658a = usageStatsRepository;
        this.f9659b = permissionsManager;
        I iB = C.b(i.f9654a);
        this.f9660c = iB;
        this.f9661d = new x(iB);
        this.f9662e = 1800000L;
    }

    public final void b() {
        if (this.f9659b.b().f6798a) {
            c();
            return;
        }
        j jVar = j.f9655a;
        I i = this.f9660c;
        i.getClass();
        i.M(null, jVar);
    }

    public final void c() {
        boolean z4 = this.f9659b.b().f6798a;
        I i = this.f9660c;
        if (!z4) {
            j jVar = j.f9655a;
            i.getClass();
            i.M(null, jVar);
        } else {
            i iVar = i.f9654a;
            i.getClass();
            i.M(null, iVar);
            E.t(a0.h(this), null, null, new l(this, null), 3);
        }
    }
}
