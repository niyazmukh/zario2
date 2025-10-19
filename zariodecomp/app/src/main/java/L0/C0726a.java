package l0;

import androidx.lifecycle.G;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0241v;
import g1.C0575d;
import m0.RunnableC0738a;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l0.1\a.smali */
public final class C0726a extends G {

    /* renamed from: l, reason: collision with root package name */
    public final C0575d f8746l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0241v f8747m;

    /* renamed from: n, reason: collision with root package name */
    public C0727b f8748n;

    public C0726a(C0575d c0575d) {
        this.f8746l = c0575d;
        if (c0575d.f7579a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        c0575d.f7579a = this;
    }

    @Override // androidx.lifecycle.D
    public final void f() {
        C0575d c0575d = this.f8746l;
        c0575d.f7580b = true;
        c0575d.f7582d = false;
        c0575d.f7581c = false;
        c0575d.i.drainPermits();
        c0575d.a();
        c0575d.f7585g = new RunnableC0738a(c0575d);
        c0575d.b();
    }

    @Override // androidx.lifecycle.D
    public final void g() {
        this.f8746l.f7580b = false;
    }

    @Override // androidx.lifecycle.D
    public final void i(H h) {
        super.i(h);
        this.f8747m = null;
        this.f8748n = null;
    }

    public final void k() {
        InterfaceC0241v interfaceC0241v = this.f8747m;
        C0727b c0727b = this.f8748n;
        if (interfaceC0241v == null || c0727b == null) {
            return;
        }
        super.i(c0727b);
        d(interfaceC0241v, c0727b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        p1.b.g(this.f8746l, sb);
        sb.append("}}");
        return sb.toString();
    }
}
