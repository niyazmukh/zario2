package B3;

import A2.C0017q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.atomic.AtomicInteger;
import z3.AbstractC1083g;
import z3.C1079c;

/* renamed from: B3.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\n.1.smali */
public final class C0064n extends AbstractC0041f0 {

    /* renamed from: a, reason: collision with root package name */
    public final E f912a;

    /* renamed from: c, reason: collision with root package name */
    public volatile z3.k0 f914c;

    /* renamed from: d, reason: collision with root package name */
    public z3.k0 f915d;

    /* renamed from: e, reason: collision with root package name */
    public z3.k0 f916e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0066o f918g;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f913b = new AtomicInteger(-2147483647);

    /* renamed from: f, reason: collision with root package name */
    public final K2.c f917f = new K2.c(this, 3);

    public C0064n(C0066o c0066o, E e5, String str) {
        this.f918g = c0066o;
        S0.f.l(e5, "delegate");
        this.f912a = e5;
        S0.f.l(str, "authority");
    }

    public static void h(C0064n c0064n) {
        synchronized (c0064n) {
            try {
                if (c0064n.f913b.get() != 0) {
                    return;
                }
                z3.k0 k0Var = c0064n.f915d;
                z3.k0 k0Var2 = c0064n.f916e;
                c0064n.f915d = null;
                c0064n.f916e = null;
                if (k0Var != null) {
                    super.b(k0Var);
                }
                if (k0Var2 != null) {
                    super.d(k0Var2);
                }
            } finally {
            }
        }
    }

    @Override // B3.AbstractC0041f0, B3.InterfaceC0045g1
    public final void b(z3.k0 k0Var) {
        S0.f.l(k0Var, "status");
        synchronized (this) {
            try {
                if (this.f913b.get() < 0) {
                    this.f914c = k0Var;
                    this.f913b.addAndGet(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                    if (this.f913b.get() != 0) {
                        this.f915d = k0Var;
                    } else {
                        super.b(k0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B3.AbstractC0041f0, B3.InterfaceC0045g1
    public final void d(z3.k0 k0Var) {
        S0.f.l(k0Var, "status");
        synchronized (this) {
            try {
                if (this.f913b.get() < 0) {
                    this.f914c = k0Var;
                    this.f913b.addAndGet(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                } else if (this.f916e != null) {
                    return;
                }
                if (this.f913b.get() != 0) {
                    this.f916e = k0Var;
                } else {
                    super.d(k0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B3.A
    public final InterfaceC0091x f(com.google.android.gms.common.api.internal.F f2, z3.a0 a0Var, C1079c c1079c, AbstractC1083g[] abstractC1083gArr) {
        InterfaceC0091x w4;
        Task taskForException;
        E2.l lVar = c1079c.f11287c;
        if (lVar == null) {
            this.f918g.getClass();
            lVar = null;
        } else {
            this.f918g.getClass();
        }
        if (lVar == null) {
            return this.f913b.get() >= 0 ? new C0035d0(this.f914c, abstractC1083gArr) : this.f912a.f(f2, a0Var, c1079c, abstractC1083gArr);
        }
        C0063m1 c0063m1 = new C0063m1(this.f912a, f2, a0Var, c1079c, this.f917f, abstractC1083gArr);
        if (this.f913b.incrementAndGet() > 0) {
            C0064n c0064n = (C0064n) this.f917f.b;
            if (c0064n.f913b.decrementAndGet() == 0) {
                h(c0064n);
            }
            return new C0035d0(this.f914c, abstractC1083gArr);
        }
        try {
            P0 p02 = this.f918g.f925b;
            Task taskH = lVar.f1469a.h();
            synchronized (lVar.f1470b) {
                taskForException = Tasks.forException(new l2.b("AppCheck is not available"));
            }
            Tasks.whenAll((Task<?>[]) new Task[]{taskH, taskForException}).addOnCompleteListener(F2.o.f1725b, new C0017q(taskH, c0063m1, taskForException, 1));
        } catch (Throwable th) {
            c0063m1.b(z3.k0.f11351j.g("Credentials should use fail() instead of throwing exceptions").f(th));
        }
        synchronized (c0063m1.i) {
            try {
                w4 = (InterfaceC0091x) c0063m1.f908j;
                if (w4 == null) {
                    w4 = new W();
                    c0063m1.f909k = w4;
                    c0063m1.f908j = w4;
                }
            } finally {
            }
        }
        return w4;
    }

    @Override // B3.AbstractC0041f0
    public final E g() {
        return this.f912a;
    }
}
