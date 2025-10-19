package j0;

import android.view.animation.Interpolator;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j0.1\b.smali */
public abstract class AbstractInterpolatorC0624b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f8036a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8037b;

    public AbstractInterpolatorC0624b(float[] fArr) {
        this.f8036a = fArr;
        this.f8037b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f8036a;
        int iMin = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f8037b;
        float f5 = (f2 - (iMin * f3)) / f3;
        float f6 = fArr[iMin];
        return ((fArr[iMin + 1] - f6) * f5) + f6;
    }
}
