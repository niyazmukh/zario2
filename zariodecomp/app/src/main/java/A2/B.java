package A2;

import a.AbstractC0183a;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.C0407k;
import java.util.HashMap;
import x2.C1038d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\B.smali */
public final class B extends S0.f {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f72b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f73c;

    /* renamed from: d, reason: collision with root package name */
    public final h1.i f74d;

    /* renamed from: e, reason: collision with root package name */
    public final C f75e;

    /* renamed from: f, reason: collision with root package name */
    public final S0.l f76f;

    /* renamed from: g, reason: collision with root package name */
    public I f77g;
    public boolean h;

    public B() {
        C0407k c0407k = AbstractC0409l.f6528b;
        this.f72b = new HashMap();
        this.f74d = new h1.i(1);
        this.f75e = new C(this);
        new HashMap();
        new HashMap();
        S0.l lVar = new S0.l(1);
        lVar.f2867b = B2.g.f312a;
        this.f76f = lVar;
        this.f73c = new HashMap();
    }

    @Override // S0.f
    public final InterfaceC0001a D(C1038d c1038d) {
        HashMap map = this.f73c;
        C0025z c0025z = (C0025z) map.get(c1038d);
        if (c0025z != null) {
            return c0025z;
        }
        C0025z c0025z2 = new C0025z();
        map.put(c1038d, c0025z2);
        return c0025z2;
    }

    @Override // S0.f
    public final InterfaceC0007g E(C1038d c1038d) {
        return this.f74d;
    }

    @Override // S0.f
    public final D F(C1038d c1038d, InterfaceC0007g interfaceC0007g) {
        HashMap map = this.f72b;
        A a5 = (A) map.get(c1038d);
        if (a5 != null) {
            return a5;
        }
        A a6 = new A(this);
        map.put(c1038d, a6);
        return a6;
    }

    @Override // S0.f
    public final E G() {
        return new X1.e();
    }

    @Override // S0.f
    public final I H() {
        return this.f77g;
    }

    @Override // S0.f
    public final J I() {
        return this.f76f;
    }

    @Override // S0.f
    public final f0 K() {
        return this.f75e;
    }

    @Override // S0.f
    public final boolean N() {
        return this.h;
    }

    @Override // S0.f
    public final Object V(String str, F2.q qVar) {
        this.f77g.q();
        try {
            return qVar.get();
        } finally {
            this.f77g.o();
        }
    }

    @Override // S0.f
    public final void W(String str, Runnable runnable) {
        this.f77g.q();
        try {
            runnable.run();
        } finally {
            this.f77g.o();
        }
    }

    @Override // S0.f
    public final void b0() {
        AbstractC0183a.N(!this.h, "MemoryPersistence double-started!", new Object[0]);
        this.h = true;
    }
}
