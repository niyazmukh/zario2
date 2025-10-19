package X1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\i.smali */
public final class i extends e {

    /* renamed from: a, reason: collision with root package name */
    public final f f3760a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3761b;

    public i(f fVar, float f2) {
        this.f3760a = fVar;
        this.f3761b = f2;
    }

    @Override // X1.e
    public final boolean g() {
        return true;
    }

    @Override // X1.e
    public final void h(float f2, float f3, float f5, w wVar) {
        this.f3760a.h(f2, f3 - this.f3761b, f5, wVar);
    }
}
