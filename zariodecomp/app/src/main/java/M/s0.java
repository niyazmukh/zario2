package M;

import android.os.Build;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\s0.smali */
public class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f2424b;

    /* renamed from: a, reason: collision with root package name */
    public final u0 f2425a;

    static {
        f2424b = (Build.VERSION.SDK_INT >= 30 ? new l0() : new k0()).b().f2427a.a().f2427a.b().f2427a.c();
    }

    public s0(u0 u0Var) {
        this.f2425a = u0Var;
    }

    public u0 a() {
        return this.f2425a;
    }

    public u0 b() {
        return this.f2425a;
    }

    public u0 c() {
        return this.f2425a;
    }

    public void d(View view) {
    }

    public i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return n() == s0Var.n() && m() == s0Var.m() && L.b.a(j(), s0Var.j()) && L.b.a(h(), s0Var.h()) && L.b.a(e(), s0Var.e());
    }

    public D.c f(int i) {
        return D.c.f1264e;
    }

    public D.c g() {
        return j();
    }

    public D.c h() {
        return D.c.f1264e;
    }

    public int hashCode() {
        return L.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public D.c i() {
        return j();
    }

    public D.c j() {
        return D.c.f1264e;
    }

    public D.c k() {
        return j();
    }

    public u0 l(int i, int i5, int i6, int i7) {
        return f2424b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(D.c[] cVarArr) {
    }

    public void p(u0 u0Var) {
    }
}
