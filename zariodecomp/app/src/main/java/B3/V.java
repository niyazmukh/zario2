package B3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\V.smali */
public final class V implements InterfaceC0097z {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0097z f570a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f571b;

    /* renamed from: c, reason: collision with root package name */
    public List f572c = new ArrayList();

    public V(InterfaceC0097z interfaceC0097z) {
        this.f570a = interfaceC0097z;
    }

    public final void a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f571b) {
                    runnable.run();
                } else {
                    this.f572c.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B3.InterfaceC0097z
    public final void b() {
        if (this.f571b) {
            this.f570a.b();
        } else {
            a(new N(this, 1));
        }
    }

    @Override // B3.InterfaceC0097z
    public final void f(z3.a0 a0Var) {
        a(new I(12, this, a0Var));
    }

    @Override // B3.InterfaceC0097z
    public final void p(z3.k0 k0Var, EnumC0094y enumC0094y, z3.a0 a0Var) {
        a(new RunnableC0029b(this, k0Var, enumC0094y, a0Var, 1));
    }

    @Override // B3.InterfaceC0097z
    public final void s(g1.i iVar) {
        if (this.f571b) {
            this.f570a.s(iVar);
        } else {
            a(new I(11, this, iVar));
        }
    }
}
