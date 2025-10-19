package F0;

import M.D;
import M.S;
import N2.AbstractC0156x;
import N2.n0;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import j0.C0623a;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\c.smali */
public final class c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Class cls, String str, int i) {
        super(cls, str);
        this.f1583a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f1583a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            case 6:
                WeakHashMap weakHashMap = S.f2363a;
                return D.a((View) obj);
            case 7:
                return Float.valueOf(((S1.h) obj).i);
            case 8:
                return Float.valueOf(((S1.h) obj).f2974j);
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return Float.valueOf(((S1.m) obj).b());
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return Float.valueOf(((S1.r) obj).i);
            default:
                return Float.valueOf(((S1.t) obj).f3021j);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f1583a) {
            case 0:
                f fVar = (f) obj;
                PointF pointF = (PointF) obj2;
                fVar.getClass();
                fVar.f1586a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                fVar.f1587b = iRound;
                int i = fVar.f1591f + 1;
                fVar.f1591f = i;
                if (i == fVar.f1592g) {
                    int i5 = fVar.f1586a;
                    int i6 = fVar.f1588c;
                    int i7 = fVar.f1589d;
                    c cVar = t.f1646a;
                    fVar.f1590e.setLeftTopRightBottom(i5, iRound, i6, i7);
                    fVar.f1591f = 0;
                    fVar.f1592g = 0;
                    break;
                }
                break;
            case 1:
                f fVar2 = (f) obj;
                PointF pointF2 = (PointF) obj2;
                fVar2.getClass();
                fVar2.f1588c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                fVar2.f1589d = iRound2;
                int i8 = fVar2.f1592g + 1;
                fVar2.f1592g = i8;
                if (fVar2.f1591f == i8) {
                    int i9 = fVar2.f1586a;
                    int i10 = fVar2.f1587b;
                    int i11 = fVar2.f1588c;
                    c cVar2 = t.f1646a;
                    fVar2.f1590e.setLeftTopRightBottom(i9, i10, i11, iRound2);
                    fVar2.f1591f = 0;
                    fVar2.f1592g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int left = view.getLeft();
                int top = view.getTop();
                int iRound3 = Math.round(pointF3.x);
                int iRound4 = Math.round(pointF3.y);
                c cVar3 = t.f1646a;
                view.setLeftTopRightBottom(left, top, iRound3, iRound4);
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                int iRound5 = Math.round(pointF4.x);
                int iRound6 = Math.round(pointF4.y);
                int right = view2.getRight();
                int bottom = view2.getBottom();
                c cVar4 = t.f1646a;
                view2.setLeftTopRightBottom(iRound5, iRound6, right, bottom);
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound7 = Math.round(pointF5.x);
                int iRound8 = Math.round(pointF5.y);
                int width = view3.getWidth() + iRound7;
                int height = view3.getHeight() + iRound8;
                c cVar5 = t.f1646a;
                view3.setLeftTopRightBottom(iRound7, iRound8, width, height);
                break;
            case 5:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                break;
            case 6:
                WeakHashMap weakHashMap = S.f2363a;
                D.c((View) obj, (Rect) obj2);
                break;
            case 7:
                S1.h hVar = (S1.h) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                hVar.i = fFloatValue;
                int i12 = (int) (5400.0f * fFloatValue);
                float f2 = fFloatValue * 1520.0f;
                float[] fArr = (float[]) hVar.f2999b;
                fArr[0] = (-20.0f) + f2;
                fArr[1] = f2;
                int i13 = 0;
                while (true) {
                    C0623a c0623a = hVar.f2972f;
                    if (i13 >= 4) {
                        float f3 = fArr[0];
                        float f5 = fArr[1];
                        float f6 = ((f5 - f3) * hVar.f2974j) + f3;
                        fArr[0] = f6;
                        fArr[0] = f6 / 360.0f;
                        fArr[1] = f5 / 360.0f;
                        int i14 = 0;
                        while (true) {
                            if (i14 < 4) {
                                float f7 = (i12 - S1.h.f2967n[i14]) / 333;
                                if (f7 < 0.0f || f7 > 1.0f) {
                                    i14++;
                                } else {
                                    int i15 = i14 + hVar.h;
                                    S1.i iVar = hVar.f2973g;
                                    int[] iArr = iVar.f2955c;
                                    int length = i15 % iArr.length;
                                    int length2 = (1 + length) % iArr.length;
                                    int iK = AbstractC0156x.k(iArr[length], ((S1.p) hVar.f2998a).f2995n);
                                    int iK2 = AbstractC0156x.k(iVar.f2955c[length2], ((S1.p) hVar.f2998a).f2995n);
                                    float interpolation = c0623a.getInterpolation(f7);
                                    Integer numValueOf = Integer.valueOf(iK);
                                    Integer numValueOf2 = Integer.valueOf(iK2);
                                    int iIntValue = numValueOf.intValue();
                                    float f8 = ((iIntValue >> 24) & 255) / 255.0f;
                                    int iIntValue2 = numValueOf2.intValue();
                                    float f9 = ((iIntValue2 >> 24) & 255) / 255.0f;
                                    float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                                    float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                                    float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                                    float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                                    float fPow5 = ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * interpolation) + fPow2;
                                    float fPow6 = ((((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3) * interpolation) + fPow3;
                                    float fPow7 = ((float) Math.pow(((fPow4 - fPow) * interpolation) + fPow, 0.45454545454545453d)) * 255.0f;
                                    ((int[]) hVar.f3000c)[0] = Integer.valueOf((Math.round(fPow7) << 16) | (Math.round((((f9 - f8) * interpolation) + f8) * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f)).intValue();
                                }
                            }
                        }
                        ((S1.p) hVar.f2998a).invalidateSelf();
                        break;
                    } else {
                        float f10 = 667;
                        fArr[1] = (c0623a.getInterpolation((i12 - S1.h.f2965l[i13]) / f10) * 250.0f) + fArr[1];
                        fArr[0] = (c0623a.getInterpolation((i12 - S1.h.f2966m[i13]) / f10) * 250.0f) + fArr[0];
                        i13++;
                    }
                }
                break;
            case 8:
                ((S1.h) obj).f2974j = ((Float) obj2).floatValue();
                break;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                S1.m mVar = (S1.m) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (mVar.f2993l != fFloatValue2) {
                    mVar.f2993l = fFloatValue2;
                    mVar.invalidateSelf();
                    break;
                }
                break;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                S1.r rVar = (S1.r) obj;
                rVar.i = ((Float) obj2).floatValue();
                float[] fArr2 = (float[]) rVar.f2999b;
                fArr2[0] = 0.0f;
                float f11 = ((int) (r13 * 333.0f)) / 667;
                C0623a c0623a2 = rVar.f3009e;
                float interpolation2 = c0623a2.getInterpolation(f11);
                fArr2[2] = interpolation2;
                fArr2[1] = interpolation2;
                float interpolation3 = c0623a2.getInterpolation(f11 + 0.49925038f);
                fArr2[4] = interpolation3;
                fArr2[3] = interpolation3;
                fArr2[5] = 1.0f;
                if (rVar.h && interpolation3 < 1.0f) {
                    int[] iArr2 = (int[]) rVar.f3000c;
                    iArr2[2] = iArr2[1];
                    iArr2[1] = iArr2[0];
                    iArr2[0] = AbstractC0156x.k(rVar.f3010f.f2955c[rVar.f3011g], ((S1.p) rVar.f2998a).f2995n);
                    rVar.h = false;
                }
                ((S1.p) rVar.f2998a).invalidateSelf();
                break;
            default:
                S1.t tVar = (S1.t) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                tVar.f3021j = fFloatValue3;
                int i16 = (int) (fFloatValue3 * 1800.0f);
                for (int i17 = 0; i17 < 4; i17++) {
                    ((float[]) tVar.f2999b)[i17] = Math.max(0.0f, Math.min(1.0f, tVar.f3019f[i17].getInterpolation((i16 - S1.t.f3015m[i17]) / S1.t.f3014l[i17])));
                }
                if (tVar.i) {
                    Arrays.fill((int[]) tVar.f3000c, AbstractC0156x.k(tVar.f3020g.f2955c[tVar.h], ((S1.p) tVar.f2998a).f2995n));
                    tVar.i = false;
                }
                ((S1.p) tVar.f2998a).invalidateSelf();
                break;
        }
    }
}
