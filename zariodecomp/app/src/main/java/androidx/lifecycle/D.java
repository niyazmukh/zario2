package androidx.lifecycle;

import B3.N;
import android.os.Looper;
import java.util.Map;
import m.C0735b;
import n.C0759d;
import n.C0761f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\D.smali */
public abstract class D {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f4576k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f4577a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C0761f f4578b = new C0761f();

    /* renamed from: c, reason: collision with root package name */
    public int f4579c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4580d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f4581e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f4582f;

    /* renamed from: g, reason: collision with root package name */
    public int f4583g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final N f4584j;

    public D() {
        Object obj = f4576k;
        this.f4582f = obj;
        this.f4584j = new N(this, 19);
        this.f4581e = obj;
        this.f4583g = -1;
    }

    public static void a(String str) {
        C0735b.q0().f8810a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(B.a.l("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(C c5) {
        if (c5.f4573b) {
            if (!c5.d()) {
                c5.a(false);
                return;
            }
            int i = c5.f4574c;
            int i5 = this.f4583g;
            if (i >= i5) {
                return;
            }
            c5.f4574c = i5;
            c5.f4572a.a(this.f4581e);
        }
    }

    public final void c(C c5) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (c5 != null) {
                b(c5);
                c5 = null;
            } else {
                C0761f c0761f = this.f4578b;
                c0761f.getClass();
                C0759d c0759d = new C0759d(c0761f);
                c0761f.f8961c.put(c0759d, Boolean.FALSE);
                while (c0759d.hasNext()) {
                    b((C) ((Map.Entry) c0759d.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(InterfaceC0241v interfaceC0241v, H h) {
        a("observe");
        if (interfaceC0241v.g().f4672d == EnumC0236o.f4658a) {
            return;
        }
        B b5 = new B(this, interfaceC0241v, h);
        C c5 = (C) this.f4578b.g(h, b5);
        if (c5 != null && !c5.c(interfaceC0241v)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c5 != null) {
            return;
        }
        interfaceC0241v.g().a(b5);
    }

    public final void e(H h) {
        a("observeForever");
        A a5 = new A(this, h);
        C c5 = (C) this.f4578b.g(h, a5);
        if (c5 instanceof B) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c5 != null) {
            return;
        }
        a5.a(true);
    }

    public void f() {
    }

    public void g() {
    }

    public void h(Object obj) {
        boolean z4;
        synchronized (this.f4577a) {
            z4 = this.f4582f == f4576k;
            this.f4582f = obj;
        }
        if (z4) {
            C0735b.q0().r0(this.f4584j);
        }
    }

    public void i(H h) {
        a("removeObserver");
        C c5 = (C) this.f4578b.h(h);
        if (c5 == null) {
            return;
        }
        c5.b();
        c5.a(false);
    }

    public void j(Object obj) {
        a("setValue");
        this.f4583g++;
        this.f4581e = obj;
        c(null);
    }
}
