package X1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\q.smali */
public final class q extends v {

    /* renamed from: c, reason: collision with root package name */
    public final s f3796c;

    public q(s sVar) {
        this.f3796c = sVar;
    }

    @Override // X1.v
    public final void a(Matrix matrix, W1.a aVar, int i, Canvas canvas) {
        s sVar = this.f3796c;
        float f2 = sVar.f3804f;
        float f3 = sVar.f3805g;
        RectF rectF = new RectF(sVar.f3800b, sVar.f3801c, sVar.f3802d, sVar.f3803e);
        aVar.getClass();
        boolean z4 = f3 < 0.0f;
        Path path = aVar.f3701g;
        int[] iArr = W1.a.f3693k;
        if (z4) {
            iArr[0] = 0;
            iArr[1] = aVar.f3700f;
            iArr[2] = aVar.f3699e;
            iArr[3] = aVar.f3698d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f5 = -i;
            rectF.inset(f5, f5);
            iArr[0] = 0;
            iArr[1] = aVar.f3698d;
            iArr[2] = aVar.f3699e;
            iArr[3] = aVar.f3700f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f6 = 1.0f - (i / fWidth);
        float[] fArr = W1.a.f3694l;
        fArr[1] = f6;
        fArr[2] = ((1.0f - f6) / 2.0f) + f6;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f3696b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z4) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
