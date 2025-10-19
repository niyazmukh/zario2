package y2;

import A2.C0006f;
import A2.C0009i;
import A2.e0;
import B3.C0063m1;
import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\t.smali */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final w2.r f11135a;

    /* renamed from: b, reason: collision with root package name */
    public final C2.j f11136b = new C2.j(1);

    /* renamed from: c, reason: collision with root package name */
    public S0.f f11137c;

    /* renamed from: d, reason: collision with root package name */
    public A2.r f11138d;

    /* renamed from: e, reason: collision with root package name */
    public X2.o f11139e;

    /* renamed from: f, reason: collision with root package name */
    public C0063m1 f11140f;

    /* renamed from: g, reason: collision with root package name */
    public C3.x f11141g;
    public C0006f h;
    public e0 i;

    public t(w2.r rVar) {
        this.f11135a = rVar;
    }

    public e0 a(C0009i c0009i) {
        return null;
    }

    public C0006f b(C0009i c0009i) {
        return null;
    }

    public S0.f c(C0009i c0009i) {
        w2.v vVar = this.f11135a.f10961e;
        A2.B b5 = new A2.B();
        b5.f77g = new C0009i(b5);
        return b5;
    }

    public final A2.r d() {
        A2.r rVar = this.f11138d;
        AbstractC0183a.O(rVar, "localStore not initialized yet", new Object[0]);
        return rVar;
    }

    public final X2.o e() {
        X2.o oVar = this.f11139e;
        AbstractC0183a.O(oVar, "syncEngine not initialized yet", new Object[0]);
        return oVar;
    }
}
