package W;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\m0.smali */
public final class m0 implements O3.g {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f3646a;

    /* renamed from: b, reason: collision with root package name */
    public final O f3647b;

    public m0(m0 m0Var, O instance) {
        kotlin.jvm.internal.i.e(instance, "instance");
        this.f3646a = m0Var;
        this.f3647b = instance;
    }

    public final void a(O o5) {
        if (this.f3647b == o5) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        m0 m0Var = this.f3646a;
        if (m0Var != null) {
            m0Var.a(o5);
        }
    }

    @Override // O3.i
    public final Object fold(Object obj, X3.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // O3.i
    public final O3.g get(O3.h hVar) {
        return S0.f.C(this, hVar);
    }

    @Override // O3.g
    public final O3.h getKey() {
        return l0.f3636a;
    }

    @Override // O3.i
    public final O3.i minusKey(O3.h hVar) {
        return S0.f.R(this, hVar);
    }

    @Override // O3.i
    public final O3.i plus(O3.i iVar) {
        return S0.f.U(this, iVar);
    }
}
