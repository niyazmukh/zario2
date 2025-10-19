package D;

import android.graphics.Path;
import android.util.Log;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D\f.smali */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public char f1269a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f1270b;

    public static void a(Path path, float f2, float f3, float f5, float f6, float f7, float f8, float f9, boolean z4, boolean z5) {
        double d5;
        double d6;
        double radians = Math.toRadians(f9);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d7 = f2;
        double d8 = f3;
        double d9 = (d8 * dSin) + (d7 * dCos);
        double d10 = d7;
        double d11 = f7;
        double d12 = d9 / d11;
        double d13 = f8;
        double d14 = ((d8 * dCos) + ((-f2) * dSin)) / d13;
        double d15 = d8;
        double d16 = f6;
        double d17 = ((d16 * dSin) + (f5 * dCos)) / d11;
        double d18 = ((d16 * dCos) + ((-f5) * dSin)) / d13;
        double d19 = d12 - d17;
        double d20 = d14 - d18;
        double d21 = (d12 + d17) / 2.0d;
        double d22 = (d14 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float fSqrt = (float) (Math.sqrt(d23) / 1.99999d);
            a(path, f2, f3, f5, f6, f7 * fSqrt, f8 * fSqrt, f9, z4, z5);
            return;
        }
        double dSqrt = Math.sqrt(d24);
        double d25 = d19 * dSqrt;
        double d26 = dSqrt * d20;
        if (z4 == z5) {
            d5 = d21 - d26;
            d6 = d22 + d25;
        } else {
            d5 = d21 + d26;
            d6 = d22 - d25;
        }
        double dAtan2 = Math.atan2(d14 - d6, d12 - d5);
        double dAtan22 = Math.atan2(d18 - d6, d17 - d5) - dAtan2;
        if (z5 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d27 = d5 * d11;
        double d28 = d6 * d13;
        double d29 = (d27 * dCos) - (d28 * dSin);
        double d30 = (d28 * dCos) + (d27 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d11;
        double d32 = d31 * dCos2;
        double d33 = d13 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d13 * dCos2;
        double d37 = (dCos3 * d36) + (dSin3 * d35);
        double d38 = d36;
        double d39 = dAtan22 / iCeil;
        int i = 0;
        while (i < iCeil) {
            double d40 = dAtan2 + d39;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            double d41 = d39;
            double d42 = (((d11 * dCos2) * dCos4) + d29) - (d33 * dSin4);
            double d43 = d38;
            double d44 = d29;
            double d45 = (d43 * dSin4) + (d11 * dSin2 * dCos4) + d30;
            double d46 = (d32 * dSin4) - (d33 * dCos4);
            double d47 = (dCos4 * d43) + (dSin4 * d35);
            double d48 = d40 - dAtan2;
            double dTan = Math.tan(d48 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d48)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d34 * dSqrt2) + d10), (float) ((d37 * dSqrt2) + d15), (float) (d42 - (dSqrt2 * d46)), (float) (d45 - (dSqrt2 * d47)), (float) d42, (float) d45);
            i++;
            dAtan2 = d40;
            d35 = d35;
            dCos2 = dCos2;
            iCeil = iCeil;
            d37 = d47;
            d11 = d11;
            d34 = d46;
            d10 = d42;
            d15 = d45;
            d29 = d44;
            d39 = d41;
            d38 = d43;
        }
    }

    public static void b(f[] fVarArr, Path path) {
        int i;
        int i5;
        float[] fArr;
        char c5;
        int i6;
        float f2;
        float f3;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        f[] fVarArr2 = fVarArr;
        int i7 = 6;
        float[] fArr2 = new float[6];
        char c6 = 'm';
        int i8 = 0;
        char c7 = 'm';
        int i9 = 0;
        while (i9 < fVarArr2.length) {
            f fVar = fVarArr2[i9];
            char c8 = fVar.f1269a;
            float[] fArr3 = fVar.f1270b;
            float f17 = fArr2[i8];
            float f18 = fArr2[1];
            float f19 = fArr2[2];
            float f20 = fArr2[3];
            float f21 = fArr2[4];
            float f22 = fArr2[5];
            switch (c8) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i7;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f21, f22);
                    f17 = f21;
                    f19 = f17;
                    f18 = f22;
                    f20 = f18;
                default:
                    i = 2;
                    break;
            }
            float f23 = f21;
            float f24 = f22;
            float f25 = f17;
            float f26 = f18;
            int i10 = i8;
            while (i10 < fArr3.length) {
                if (c8 != 'A') {
                    if (c8 != 'C') {
                        if (c8 == 'H') {
                            i5 = i10;
                            fArr = fArr3;
                            c5 = c8;
                            i6 = i9;
                            path.lineTo(fArr[i5], f26);
                            f25 = fArr[i5];
                        } else if (c8 == 'Q') {
                            i5 = i10;
                            fArr = fArr3;
                            c5 = c8;
                            i6 = i9;
                            int i11 = i5 + 1;
                            int i12 = i5 + 2;
                            int i13 = i5 + 3;
                            path.quadTo(fArr[i5], fArr[i11], fArr[i12], fArr[i13]);
                            f2 = fArr[i5];
                            f3 = fArr[i11];
                            f25 = fArr[i12];
                            f26 = fArr[i13];
                        } else if (c8 == 'V') {
                            i5 = i10;
                            fArr = fArr3;
                            c5 = c8;
                            i6 = i9;
                            path.lineTo(f25, fArr[i5]);
                            f26 = fArr[i5];
                        } else if (c8 != 'a') {
                            if (c8 != 'c') {
                                if (c8 == 'h') {
                                    i5 = i10;
                                    path.rLineTo(fArr3[i5], 0.0f);
                                    f25 += fArr3[i5];
                                } else if (c8 == 'q') {
                                    i5 = i10;
                                    float f27 = f26;
                                    float f28 = f25;
                                    int i14 = i5 + 1;
                                    int i15 = i5 + 2;
                                    int i16 = i5 + 3;
                                    path.rQuadTo(fArr3[i5], fArr3[i14], fArr3[i15], fArr3[i16]);
                                    float f29 = f28 + fArr3[i5];
                                    float f30 = fArr3[i14] + f27;
                                    float f31 = f28 + fArr3[i15];
                                    f26 = f27 + fArr3[i16];
                                    f20 = f30;
                                    f19 = f29;
                                    fArr = fArr3;
                                    c5 = c8;
                                    i6 = i9;
                                    f25 = f31;
                                } else if (c8 == 'v') {
                                    i5 = i10;
                                    path.rLineTo(0.0f, fArr3[i5]);
                                    f26 += fArr3[i5];
                                } else if (c8 == 'L') {
                                    i5 = i10;
                                    int i17 = i5 + 1;
                                    path.lineTo(fArr3[i5], fArr3[i17]);
                                    f25 = fArr3[i5];
                                    f26 = fArr3[i17];
                                } else if (c8 == 'M') {
                                    i5 = i10;
                                    f25 = fArr3[i5];
                                    f26 = fArr3[i5 + 1];
                                    if (i5 > 0) {
                                        path.lineTo(f25, f26);
                                    } else {
                                        path.moveTo(f25, f26);
                                        f24 = f26;
                                        f23 = f25;
                                    }
                                } else if (c8 == 'S') {
                                    i5 = i10;
                                    float f32 = f26;
                                    float f33 = f25;
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        f11 = (f32 * 2.0f) - f20;
                                        f12 = (f33 * 2.0f) - f19;
                                    } else {
                                        f12 = f33;
                                        f11 = f32;
                                    }
                                    int i18 = i5 + 1;
                                    int i19 = i5 + 2;
                                    int i20 = i5 + 3;
                                    path.cubicTo(f12, f11, fArr3[i5], fArr3[i18], fArr3[i19], fArr3[i20]);
                                    float f34 = fArr3[i5];
                                    float f35 = fArr3[i18];
                                    f25 = fArr3[i19];
                                    f26 = fArr3[i20];
                                    f20 = f35;
                                    f19 = f34;
                                } else if (c8 == 'T') {
                                    i5 = i10;
                                    float f36 = f26;
                                    float f37 = f25;
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f6 = (f37 * 2.0f) - f19;
                                        f7 = (f36 * 2.0f) - f20;
                                    } else {
                                        f6 = f37;
                                        f7 = f36;
                                    }
                                    int i21 = i5 + 1;
                                    path.quadTo(f6, f7, fArr3[i5], fArr3[i21]);
                                    f8 = fArr3[i5];
                                    f10 = fArr3[i21];
                                    f20 = f7;
                                    f19 = f6;
                                    fArr = fArr3;
                                    c5 = c8;
                                    i6 = i9;
                                    f25 = f8;
                                    f26 = f10;
                                } else if (c8 == 'l') {
                                    i5 = i10;
                                    int i22 = i5 + 1;
                                    path.rLineTo(fArr3[i5], fArr3[i22]);
                                    f25 += fArr3[i5];
                                    f26 += fArr3[i22];
                                } else if (c8 == c6) {
                                    i5 = i10;
                                    float f38 = fArr3[i5];
                                    f25 += f38;
                                    float f39 = fArr3[i5 + 1];
                                    f26 += f39;
                                    if (i5 > 0) {
                                        path.rLineTo(f38, f39);
                                    } else {
                                        path.rMoveTo(f38, f39);
                                        f24 = f26;
                                        f23 = f25;
                                    }
                                } else if (c8 == 's') {
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        f13 = f26 - f20;
                                        f14 = f25 - f19;
                                    } else {
                                        f14 = 0.0f;
                                        f13 = 0.0f;
                                    }
                                    int i23 = i10 + 1;
                                    int i24 = i10 + 2;
                                    int i25 = i10 + 3;
                                    i5 = i10;
                                    f5 = f26;
                                    float f40 = f25;
                                    path.rCubicTo(f14, f13, fArr3[i10], fArr3[i23], fArr3[i24], fArr3[i25]);
                                    f6 = f40 + fArr3[i5];
                                    f7 = f5 + fArr3[i23];
                                    f8 = f40 + fArr3[i24];
                                    f9 = fArr3[i25];
                                } else if (c8 != 't') {
                                    i5 = i10;
                                } else {
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f15 = f25 - f19;
                                        f16 = f26 - f20;
                                    } else {
                                        f16 = 0.0f;
                                        f15 = 0.0f;
                                    }
                                    int i26 = i10 + 1;
                                    path.rQuadTo(f15, f16, fArr3[i10], fArr3[i26]);
                                    float f41 = f15 + f25;
                                    float f42 = f16 + f26;
                                    f25 += fArr3[i10];
                                    f26 += fArr3[i26];
                                    f20 = f42;
                                    i5 = i10;
                                    fArr = fArr3;
                                    c5 = c8;
                                    i6 = i9;
                                    f19 = f41;
                                }
                                fArr = fArr3;
                                c5 = c8;
                                i6 = i9;
                            } else {
                                i5 = i10;
                                f5 = f26;
                                float f43 = f25;
                                int i27 = i5 + 2;
                                int i28 = i5 + 3;
                                int i29 = i5 + 4;
                                int i30 = i5 + 5;
                                path.rCubicTo(fArr3[i5], fArr3[i5 + 1], fArr3[i27], fArr3[i28], fArr3[i29], fArr3[i30]);
                                f6 = f43 + fArr3[i27];
                                f7 = f5 + fArr3[i28];
                                f8 = f43 + fArr3[i29];
                                f9 = fArr3[i30];
                            }
                            f10 = f9 + f5;
                            f20 = f7;
                            f19 = f6;
                            fArr = fArr3;
                            c5 = c8;
                            i6 = i9;
                            f25 = f8;
                            f26 = f10;
                        } else {
                            i5 = i10;
                            float f44 = f26;
                            float f45 = f25;
                            int i31 = i5 + 5;
                            int i32 = i5 + 6;
                            fArr = fArr3;
                            c5 = c8;
                            i6 = i9;
                            a(path, f45, f44, fArr3[i31] + f45, fArr3[i32] + f44, fArr3[i5], fArr3[i5 + 1], fArr3[i5 + 2], fArr3[i5 + 3] != 0.0f, fArr3[i5 + 4] != 0.0f);
                            f25 = f45 + fArr[i31];
                            f26 = f44 + fArr[i32];
                        }
                        i10 = i5 + i;
                        c7 = c5;
                        c8 = c7;
                        fArr3 = fArr;
                        i9 = i6;
                        c6 = 'm';
                        i8 = 0;
                    } else {
                        i5 = i10;
                        fArr = fArr3;
                        c5 = c8;
                        i6 = i9;
                        int i33 = i5 + 2;
                        int i34 = i5 + 3;
                        int i35 = i5 + 4;
                        int i36 = i5 + 5;
                        path.cubicTo(fArr[i5], fArr[i5 + 1], fArr[i33], fArr[i34], fArr[i35], fArr[i36]);
                        f25 = fArr[i35];
                        f26 = fArr[i36];
                        f2 = fArr[i33];
                        f3 = fArr[i34];
                    }
                    f19 = f2;
                    f20 = f3;
                    i10 = i5 + i;
                    c7 = c5;
                    c8 = c7;
                    fArr3 = fArr;
                    i9 = i6;
                    c6 = 'm';
                    i8 = 0;
                } else {
                    i5 = i10;
                    fArr = fArr3;
                    c5 = c8;
                    i6 = i9;
                    int i37 = i5 + 5;
                    int i38 = i5 + 6;
                    a(path, f25, f26, fArr[i37], fArr[i38], fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3] != 0.0f, fArr[i5 + 4] != 0.0f);
                    f25 = fArr[i37];
                    f26 = fArr[i38];
                }
                f20 = f26;
                f19 = f25;
                i10 = i5 + i;
                c7 = c5;
                c8 = c7;
                fArr3 = fArr;
                i9 = i6;
                c6 = 'm';
                i8 = 0;
            }
            int i39 = i9;
            int i40 = i8;
            fArr2[i40] = f25;
            fArr2[1] = f26;
            fArr2[2] = f19;
            fArr2[3] = f20;
            fArr2[4] = f23;
            fArr2[5] = f24;
            i9 = i39 + 1;
            i7 = 6;
            c6 = 'm';
            i8 = i40;
            c7 = fVarArr[i39].f1269a;
            fVarArr2 = fVarArr;
        }
    }
}
