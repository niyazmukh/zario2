package B3;

import java.util.ArrayList;
import z3.AbstractC1083g;
import z3.C1091o;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\Q.smali */
public final class Q extends W {

    /* renamed from: j, reason: collision with root package name */
    public final C0099z1 f514j;

    /* renamed from: k, reason: collision with root package name */
    public final C1091o f515k = C1091o.b();

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC1083g[] f516l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f517m;

    public Q(S s4, C0099z1 c0099z1, AbstractC1083g[] abstractC1083gArr) {
        this.f517m = s4;
        this.f514j = c0099z1;
        this.f516l = abstractC1083gArr;
    }

    @Override // B3.W, B3.InterfaceC0091x
    public final void e(g1.i iVar) {
        if (Boolean.TRUE.equals(this.f514j.f1031a.f11290f)) {
            ((ArrayList) iVar.f7594b).add("wait_for_ready");
        }
        super.e(iVar);
    }

    @Override // B3.W, B3.InterfaceC0091x
    public final void h(z3.k0 k0Var) {
        super.h(k0Var);
        synchronized (this.f517m.f528b) {
            try {
                S s4 = this.f517m;
                if (s4.f533g != null) {
                    boolean zRemove = s4.i.remove(this);
                    if (!this.f517m.h() && zRemove) {
                        S s5 = this.f517m;
                        s5.f530d.b(s5.f532f);
                        S s6 = this.f517m;
                        if (s6.f534j != null) {
                            s6.f530d.b(s6.f533g);
                            this.f517m.f533g = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f517m.f530d.a();
    }

    @Override // B3.W
    public final void q(z3.k0 k0Var) {
        for (AbstractC1083g abstractC1083g : this.f516l) {
            abstractC1083g.m(k0Var);
        }
    }
}
