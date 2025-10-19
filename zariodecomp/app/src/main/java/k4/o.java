package k4;

import f4.A;
import f4.C0516n;
import f4.E0;
import f4.G;
import f4.J;
import f4.P;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\o.smali */
public final class o extends A implements J {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f8402c;

    /* renamed from: d, reason: collision with root package name */
    public final A f8403d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8404e;

    public o(A a5, String str) {
        J j5 = a5 instanceof J ? (J) a5 : null;
        this.f8402c = j5 == null ? G.f7020a : j5;
        this.f8403d = a5;
        this.f8404e = str;
    }

    @Override // f4.J
    public final P a(long j5, E0 e02, O3.i iVar) {
        return this.f8402c.a(j5, e02, iVar);
    }

    @Override // f4.J
    public final void e(long j5, C0516n c0516n) {
        this.f8402c.e(j5, c0516n);
    }

    public final void k(O3.i iVar, Runnable runnable) {
        this.f8403d.k(iVar, runnable);
    }

    public final void l(O3.i iVar, Runnable runnable) {
        this.f8403d.l(iVar, runnable);
    }

    public final boolean m(O3.i iVar) {
        return this.f8403d.m(iVar);
    }

    public final String toString() {
        return this.f8404e;
    }
}
