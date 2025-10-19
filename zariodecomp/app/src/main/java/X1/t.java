package X1;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\t.smali */
public final class t extends u {

    /* renamed from: b, reason: collision with root package name */
    public float f3806b;

    /* renamed from: c, reason: collision with root package name */
    public float f3807c;

    @Override // X1.u
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3808a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f3806b, this.f3807c);
        path.transform(matrix);
    }
}
