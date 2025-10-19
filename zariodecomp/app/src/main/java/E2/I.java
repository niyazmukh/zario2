package E2;

import A2.C0011k;
import A2.RunnableC0012l;
import B3.C0063m1;
import N2.AbstractC0156x;
import N2.q0;
import N2.r0;
import N2.t0;
import N2.u0;
import a.AbstractC0183a;
import com.google.protobuf.AbstractC0388a;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.B0;
import com.google.protobuf.C0407k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s2.AbstractC0869c;
import t0.C0908O;
import z3.b0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\I.smali */
public final class I extends AbstractC0101c {

    /* renamed from: u, reason: collision with root package name */
    public static final C0407k f1420u = AbstractC0409l.f6528b;

    /* renamed from: r, reason: collision with root package name */
    public final S0.l f1421r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1422s;

    /* renamed from: t, reason: collision with root package name */
    public AbstractC0409l f1423t;

    public I(q qVar, F2.f fVar, S0.l lVar, w wVar) {
        com.google.android.gms.common.api.internal.F f2 = AbstractC0156x.f2609b;
        if (f2 == null) {
            synchronized (AbstractC0156x.class) {
                try {
                    f2 = AbstractC0156x.f2609b;
                    if (f2 == null) {
                        b0 b0Var = b0.f11283c;
                        String strB = com.google.android.gms.common.api.internal.F.b("google.firestore.v1.Firestore", "Write");
                        t0 t0VarY = t0.y();
                        com.google.protobuf.v vVar = G3.c.f1874a;
                        f2 = new com.google.android.gms.common.api.internal.F(b0Var, strB, new G3.b(t0VarY), new G3.b(u0.w()), true);
                        AbstractC0156x.f2609b = f2;
                    }
                } finally {
                }
            }
        }
        super(qVar, f2, fVar, F2.e.f1696d, F2.e.f1695c, wVar);
        this.f1422s = false;
        this.f1423t = f1420u;
        this.f1421r = lVar;
    }

    @Override // E2.AbstractC0101c
    public final void e(AbstractC0388a abstractC0388a) {
        this.f1423t = ((u0) abstractC0388a).x();
        this.f1422s = true;
        C0063m1 c0063m1 = ((w) this.f1444l).f1507a;
        I i = (I) c0063m1.i;
        AbstractC0409l abstractC0409l = i.f1423t;
        A2.r rVar = (A2.r) c0063m1.f904d;
        rVar.f233a.W("Set stream token", new RunnableC0012l(1, rVar, abstractC0409l));
        Iterator it = ((ArrayDeque) c0063m1.f909k).iterator();
        while (it.hasNext()) {
            i.j(((C2.i) it.next()).f1090d);
        }
    }

    @Override // E2.AbstractC0101c
    public final void f(AbstractC0388a abstractC0388a) {
        u0 u0Var = (u0) abstractC0388a;
        this.f1423t = u0Var.x();
        this.f1443k.f1732f = 0L;
        B0 b0V = u0Var.v();
        this.f1421r.getClass();
        B2.o oVarO = S0.l.o(b0V);
        int iZ = u0Var.z();
        ArrayList arrayList = new ArrayList(iZ);
        for (int i = 0; i < iZ; i++) {
            arrayList.add(S0.l.m(u0Var.y(i), oVarO));
        }
        C0063m1 c0063m1 = ((w) this.f1444l).f1507a;
        C2.i iVar = (C2.i) ((ArrayDeque) c0063m1.f909k).poll();
        AbstractC0409l abstractC0409l = ((I) c0063m1.i).f1423t;
        boolean z4 = iVar.f1090d.size() == arrayList.size();
        List list = iVar.f1090d;
        AbstractC0183a.N(z4, "Mutations sent %d must equal results received %d", Integer.valueOf(list.size()), Integer.valueOf(arrayList.size()));
        AbstractC0869c abstractC0869cK = B2.g.f312a;
        for (int i5 = 0; i5 < list.size(); i5++) {
            abstractC0869cK = abstractC0869cK.k(((C2.h) list.get(i5)).f1084a, ((C2.k) arrayList.get(i5)).f1097a);
        }
        C2.j jVar = new C2.j(iVar, oVarO, arrayList, abstractC0409l, abstractC0869cK);
        X2.o oVarE = ((y2.t) ((C0908O) c0063m1.f903c).f9909a).e();
        oVarE.b("handleSuccessfulWrite");
        C2.i iVar2 = (C2.i) jVar.f1092b;
        oVarE.h(iVar2.f1087a, null);
        oVarE.l(iVar2.f1087a);
        A2.r rVar = (A2.r) oVarE.f3847a;
        oVarE.c((AbstractC0869c) rVar.f233a.V("Acknowledge batch", new C0011k(0, rVar, jVar)), null);
        c0063m1.c();
    }

    @Override // E2.AbstractC0101c
    public final void g() {
        this.f1422s = false;
        super.g();
    }

    @Override // E2.AbstractC0101c
    public final void h() {
        if (this.f1422s) {
            j(Collections.emptyList());
        }
    }

    public final void j(List list) {
        AbstractC0183a.N(c(), "Writing mutations requires an opened stream", new Object[0]);
        AbstractC0183a.N(this.f1422s, "Handshake must be complete before writing mutations", new Object[0]);
        r0 r0VarZ = t0.z();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q0 q0VarT = this.f1421r.t((C2.h) it.next());
            r0VarZ.d();
            t0.x((t0) r0VarZ.f6410b, q0VarT);
        }
        AbstractC0409l abstractC0409l = this.f1423t;
        r0VarZ.d();
        t0.w((t0) r0VarZ.f6410b, abstractC0409l);
        i((t0) r0VarZ.b());
    }
}
