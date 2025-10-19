package X1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\s.smali */
public final class s extends u {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f3800b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3801c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3802d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3803e;

    /* renamed from: f, reason: collision with root package name */
    public float f3804f;

    /* renamed from: g, reason: collision with root package name */
    public float f3805g;

    public s(float f2, float f3, float f5, float f6) {
        this.f3800b = f2;
        this.f3801c = f3;
        this.f3802d = f5;
        this.f3803e = f6;
    }

    @Override // X1.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3808a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f3800b, this.f3801c, this.f3802d, this.f3803e);
        path.arcTo(rectF, this.f3804f, this.f3805g, false);
        path.transform(matrix);
    }
}
