package X1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\f.smali */
public final class f extends e {

    /* renamed from: a, reason: collision with root package name */
    public final float f3721a;

    public f(float f2) {
        this.f3721a = f2 - 0.001f;
    }

    @Override // X1.e
    public final void h(float f2, float f3, float f5, w wVar) {
        double d5 = this.f3721a;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d5) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d5, 2.0d) - Math.pow(fSqrt, 2.0d));
        wVar.d(f3 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d5) - d5))) + fSqrt2, 270.0f, 0.0f);
        wVar.c(f3, (float) (-((Math.sqrt(2.0d) * d5) - d5)));
        wVar.c(f3 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d5) - d5))) + fSqrt2);
    }
}
