package B3;

import z3.AbstractC1098w;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\M.smali */
public final class M extends H {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f457c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1098w f458d;

    /* renamed from: e, reason: collision with root package name */
    public final z3.k0 f459e;

    public M(U0 u02, AbstractC1098w abstractC1098w, z3.k0 k0Var) {
        super(u02.f558c, 0);
        this.f458d = abstractC1098w;
        this.f459e = k0Var;
    }

    @Override // B3.H
    public final void c() {
        switch (this.f457c) {
            case 0:
                this.f458d.g(this.f459e, new z3.a0());
                break;
            default:
                this.f458d.g(this.f459e, new z3.a0());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O0 o02, AbstractC1098w abstractC1098w, z3.k0 k0Var) {
        super(o02.f504e, 0);
        this.f458d = abstractC1098w;
        this.f459e = k0Var;
    }
}
