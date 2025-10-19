package X1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\r.smali */
public final class r extends v {

    /* renamed from: c, reason: collision with root package name */
    public final t f3797c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3798d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3799e;

    public r(t tVar, float f2, float f3) {
        this.f3797c = tVar;
        this.f3798d = f2;
        this.f3799e = f3;
    }

    @Override // X1.v
    public final void a(Matrix matrix, W1.a aVar, int i, Canvas canvas) {
        t tVar = this.f3797c;
        float f2 = tVar.f3807c;
        float f3 = this.f3799e;
        float f5 = tVar.f3806b;
        float f6 = this.f3798d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f3, f5 - f6), 0.0f);
        Matrix matrix2 = this.f3810a;
        matrix2.set(matrix);
        matrix2.preTranslate(f6, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = W1.a.i;
        iArr[0] = aVar.f3700f;
        iArr[1] = aVar.f3699e;
        iArr[2] = aVar.f3698d;
        Paint paint = aVar.f3697c;
        float f7 = rectF.left;
        paint.setShader(new LinearGradient(f7, rectF.top, f7, rectF.bottom, iArr, W1.a.f3692j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        t tVar = this.f3797c;
        return (float) Math.toDegrees(Math.atan((tVar.f3807c - this.f3799e) / (tVar.f3806b - this.f3798d)));
    }
}
