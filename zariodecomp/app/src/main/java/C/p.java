package C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C\p.smali */
public final class p {

    /* renamed from: k, reason: collision with root package name */
    public static final p f1063k;

    /* renamed from: a, reason: collision with root package name */
    public final float f1064a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1065b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1066c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1067d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1068e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1069f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f1070g;
    public final float h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1071j;

    static {
        float[] fArr = b.f1042c;
        float fL = (float) ((b.l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f1040a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f5 = fArr[1];
        float f6 = (fArr3[1] * f5) + f3;
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6;
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f2 * fArr5[0]);
        float f11 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fL) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d5 = fExp;
        if (d5 > 1.0d) {
            fExp = 1.0f;
        } else if (d5 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * fExp) + 1.0f) - fExp, (((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp};
        float f12 = 1.0f / ((5.0f * fL) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float fCbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(fL * 5.0d))) + (f13 * fL);
        float fL2 = b.l() / fArr[1];
        double d6 = fL2;
        float fSqrt = ((float) Math.sqrt(d6)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d6, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * fCbrt) * f10) / 100.0d, 0.42d)};
        float f15 = fArr7[0];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[1];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr7[2];
        float[] fArr8 = {f16, f18, (400.0f * f19) / (f19 + 27.13f)};
        f1063k = new p(fL2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f11, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public p(float f2, float f3, float f5, float f6, float f7, float f8, float[] fArr, float f9, float f10, float f11) {
        this.f1069f = f2;
        this.f1064a = f3;
        this.f1065b = f5;
        this.f1066c = f6;
        this.f1067d = f7;
        this.f1068e = f8;
        this.f1070g = fArr;
        this.h = f9;
        this.i = f10;
        this.f1071j = f11;
    }
}
