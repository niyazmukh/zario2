package B3;

import A2.C0009i;
import z3.AbstractC1098w;

/* renamed from: B3.t, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\t.1.smali */
public final class C0079t extends H {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z3.k0 f970c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z3.a0 f971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0009i f972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079t(C0009i c0009i, z3.k0 k0Var, z3.a0 a0Var) {
        super(((C0088w) c0009i.f206d).f1004f, 0);
        this.f972e = c0009i;
        this.f970c = k0Var;
        this.f971d = a0Var;
    }

    @Override // B3.H
    public final void c() {
        J3.b.c();
        try {
            J3.c cVar = ((C0088w) this.f972e.f206d).f1000b;
            J3.b.a();
            J3.a aVar = J3.b.f2098a;
            aVar.getClass();
            e();
            aVar.getClass();
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        z3.k0 k0Var = this.f970c;
        z3.a0 a0Var = this.f971d;
        z3.k0 k0Var2 = (z3.k0) this.f972e.f205c;
        if (k0Var2 != null) {
            a0Var = new z3.a0();
            k0Var = k0Var2;
        }
        ((C0088w) this.f972e.f206d).f1007k = true;
        try {
            C0009i c0009i = this.f972e;
            C0088w c0088w = (C0088w) c0009i.f206d;
            AbstractC1098w abstractC1098w = (AbstractC1098w) c0009i.f204b;
            c0088w.getClass();
            abstractC1098w.g(k0Var, a0Var);
            ((C0088w) this.f972e.f206d).g();
            S0.i iVar = ((C0088w) this.f972e.f206d).f1003e;
            if (k0Var.e()) {
                ((I0) iVar.f2860c).a();
            } else {
                ((I0) iVar.f2861d).a();
            }
        } catch (Throwable th) {
            ((C0088w) this.f972e.f206d).g();
            S0.i iVar2 = ((C0088w) this.f972e.f206d).f1003e;
            if (k0Var.e()) {
                ((I0) iVar2.f2860c).a();
            } else {
                ((I0) iVar2.f2861d).a();
            }
            throw th;
        }
    }
}
