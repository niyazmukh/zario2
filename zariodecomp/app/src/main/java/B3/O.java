package B3;

import com.google.protobuf.AbstractC0388a;
import java.util.ArrayList;
import java.util.List;
import z3.AbstractC1098w;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\O.smali */
public final class O extends AbstractC1098w {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1098w f497a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f498b;

    /* renamed from: c, reason: collision with root package name */
    public List f499c = new ArrayList();

    public O(AbstractC1098w abstractC1098w) {
        this.f497a = abstractC1098w;
    }

    @Override // z3.AbstractC1098w
    public final void g(z3.k0 k0Var, z3.a0 a0Var) {
        q(new J(this, k0Var, a0Var, 1));
    }

    @Override // z3.AbstractC1098w
    public final void h(z3.a0 a0Var) {
        if (this.f498b) {
            this.f497a.h(a0Var);
        } else {
            q(new I(3, this, a0Var));
        }
    }

    @Override // z3.AbstractC1098w
    public final void i(AbstractC0388a abstractC0388a) {
        if (this.f498b) {
            this.f497a.i(abstractC0388a);
        } else {
            q(new I(4, this, abstractC0388a));
        }
    }

    @Override // z3.AbstractC1098w
    public final void j() {
        if (this.f498b) {
            this.f497a.j();
        } else {
            q(new N(this, 0));
        }
    }

    public final void q(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f498b) {
                    runnable.run();
                } else {
                    this.f499c.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
