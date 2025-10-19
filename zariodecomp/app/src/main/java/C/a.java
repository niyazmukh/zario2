package C;

import android.graphics.Color;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1034a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1035b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1036c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1037d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1038e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1039f;

    public a(float f2, float f3, float f5, float f6, float f7, float f8) {
        this.f1034a = f2;
        this.f1035b = f3;
        this.f1036c = f5;
        this.f1037d = f6;
        this.f1038e = f7;
        this.f1039f = f8;
    }

    public static a a(int i) {
        p pVar = p.f1063k;
        float fE = b.e(Color.red(i));
        float fE2 = b.e(Color.green(i));
        float fE3 = b.e(Color.blue(i));
        float[][] fArr = b.f1043d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * fE3) + (fArr2[1] * fE2) + (fArr2[0] * fE);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * fE3) + (fArr3[1] * fE2) + (fArr3[0] * fE);
        float[] fArr4 = fArr[2];
        float f5 = (fE3 * fArr4[2]) + (fE2 * fArr4[1]) + (fE * fArr4[0]);
        float[][] fArr5 = b.f1040a;
        float[] fArr6 = fArr5[0];
        float f6 = (fArr6[2] * f5) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f7 = (fArr7[2] * f5) + (fArr7[1] * f3) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f8 = (f5 * fArr8[2]) + (f3 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = pVar.f1070g;
        float f9 = fArr9[0] * f6;
        float f10 = fArr9[1] * f7;
        float f11 = fArr9[2] * f8;
        float fAbs = Math.abs(f9);
        float f12 = pVar.h;
        float fPow = (float) Math.pow((fAbs * f12) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f10) * f12) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f11) * f12) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d5 = fSignum3;
        float f13 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d5)) / 11.0f;
        float f14 = ((float) ((fSignum + fSignum2) - (d5 * 2.0d))) / 9.0f;
        float f15 = fSignum2 * 20.0f;
        float f16 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f15)) / 20.0f;
        float f17 = (((fSignum * 40.0f) + f15) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f14, f13)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f18 = fAtan2;
        float f19 = (3.1415927f * f18) / 180.0f;
        float f20 = f17 * pVar.f1065b;
        float f21 = pVar.f1064a;
        float f22 = pVar.f1067d;
        float fPow4 = ((float) Math.pow(f20 / f21, pVar.f1071j * f22)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f23 = f21 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, pVar.f1069f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f18) < 20.14d ? 360.0f + f18 : f18) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * pVar.f1068e) * pVar.f1066c) * ((float) Math.sqrt((f14 * f14) + (f13 * f13)))) / (f16 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f24 = pVar.i * fPow5;
        Math.sqrt((r3 * f22) / f23);
        float f25 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f24 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f19;
        return new a(f18, fPow5, fPow4, f25, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    public static a b(float f2, float f3, float f5) {
        p pVar = p.f1063k;
        float f6 = pVar.f1067d;
        Math.sqrt(f2 / 100.0d);
        float f7 = pVar.f1064a + 4.0f;
        float f8 = pVar.i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(r1))) * pVar.f1067d) / f7);
        float f9 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((f8 * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f5) / 180.0f;
        return new a(f5, f3, f2, f9, fLog * ((float) Math.cos(d5)), fLog * ((float) Math.sin(d5)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(C.p r16) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.a.c(C.p):int");
    }
}
