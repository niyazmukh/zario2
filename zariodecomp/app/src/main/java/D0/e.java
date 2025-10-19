package D0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import j0.C0623a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D0\e.smali */
public final class e extends Drawable implements Animatable {

    /* renamed from: k, reason: collision with root package name */
    public static final LinearInterpolator f1296k = new LinearInterpolator();

    /* renamed from: l, reason: collision with root package name */
    public static final C0623a f1297l = new C0623a(1);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f1298m = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    public final d f1299a;

    /* renamed from: b, reason: collision with root package name */
    public float f1300b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f1301c;

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f1302d;

    /* renamed from: e, reason: collision with root package name */
    public float f1303e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1304f;

    public e(Context context) {
        context.getClass();
        this.f1301c = context.getResources();
        d dVar = new d();
        this.f1299a = dVar;
        dVar.i = f1298m;
        dVar.a(0);
        dVar.h = 2.5f;
        dVar.f1278b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(this, dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f1296k);
        valueAnimatorOfFloat.addListener(new c(this, dVar));
        this.f1302d = valueAnimatorOfFloat;
    }

    public static void d(float f2, d dVar) {
        if (f2 <= 0.75f) {
            dVar.f1295u = dVar.i[dVar.f1284j];
            return;
        }
        float f3 = (f2 - 0.75f) / 0.25f;
        int[] iArr = dVar.i;
        int i = dVar.f1284j;
        int i5 = iArr[i];
        int i6 = iArr[(i + 1) % iArr.length];
        dVar.f1295u = ((((i5 >> 24) & 255) + ((int) ((((i6 >> 24) & 255) - r1) * f3))) << 24) | ((((i5 >> 16) & 255) + ((int) ((((i6 >> 16) & 255) - r3) * f3))) << 16) | ((((i5 >> 8) & 255) + ((int) ((((i6 >> 8) & 255) - r4) * f3))) << 8) | ((i5 & 255) + ((int) (f3 * ((i6 & 255) - r2))));
    }

    public final void a(float f2, d dVar, boolean z4) {
        float interpolation;
        float interpolation2;
        if (this.f1304f) {
            d(f2, dVar);
            float fFloor = (float) (Math.floor(dVar.f1287m / 0.8f) + 1.0d);
            float f3 = dVar.f1285k;
            float f5 = dVar.f1286l;
            dVar.f1281e = (((f5 - 0.01f) - f3) * f2) + f3;
            dVar.f1282f = f5;
            float f6 = dVar.f1287m;
            dVar.f1283g = ((fFloor - f6) * f2) + f6;
            return;
        }
        if (f2 != 1.0f || z4) {
            float f7 = dVar.f1287m;
            C0623a c0623a = f1297l;
            if (f2 < 0.5f) {
                interpolation = dVar.f1285k;
                interpolation2 = (c0623a.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f8 = dVar.f1285k + 0.79f;
                interpolation = f8 - (((1.0f - c0623a.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f8;
            }
            float f9 = (0.20999998f * f2) + f7;
            float f10 = (f2 + this.f1303e) * 216.0f;
            dVar.f1281e = interpolation;
            dVar.f1282f = interpolation2;
            dVar.f1283g = f9;
            this.f1300b = f10;
        }
    }

    public final void b(float f2, float f3, float f5, float f6) {
        float f7 = this.f1301c.getDisplayMetrics().density;
        float f8 = f3 * f7;
        d dVar = this.f1299a;
        dVar.h = f8;
        dVar.f1278b.setStrokeWidth(f8);
        dVar.f1291q = f2 * f7;
        dVar.a(0);
        dVar.f1292r = (int) (f5 * f7);
        dVar.f1293s = (int) (f6 * f7);
    }

    public final void c(int i) {
        if (i == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1300b, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f1299a;
        RectF rectF = dVar.f1277a;
        float f2 = dVar.f1291q;
        float fMin = (dVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f1292r * dVar.f1290p) / 2.0f, dVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f3 = dVar.f1281e;
        float f5 = dVar.f1283g;
        float f6 = (f3 + f5) * 360.0f;
        float f7 = ((dVar.f1282f + f5) * 360.0f) - f6;
        Paint paint = dVar.f1278b;
        paint.setColor(dVar.f1295u);
        paint.setAlpha(dVar.f1294t);
        float f8 = dVar.h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f1280d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        canvas.drawArc(rectF, f6, f7, false, paint);
        if (dVar.f1288n) {
            Path path = dVar.f1289o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f1289o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f10 = (dVar.f1292r * dVar.f1290p) / 2.0f;
            dVar.f1289o.moveTo(0.0f, 0.0f);
            dVar.f1289o.lineTo(dVar.f1292r * dVar.f1290p, 0.0f);
            Path path3 = dVar.f1289o;
            float f11 = dVar.f1292r;
            float f12 = dVar.f1290p;
            path3.lineTo((f11 * f12) / 2.0f, dVar.f1293s * f12);
            dVar.f1289o.offset((rectF.centerX() + fMin2) - f10, (dVar.h / 2.0f) + rectF.centerY());
            dVar.f1289o.close();
            Paint paint2 = dVar.f1279c;
            paint2.setColor(dVar.f1295u);
            paint2.setAlpha(dVar.f1294t);
            canvas.save();
            canvas.rotate(f6 + f7, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f1289o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1299a.f1294t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f1302d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f1299a.f1294t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1299a.f1278b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f1302d.cancel();
        d dVar = this.f1299a;
        float f2 = dVar.f1281e;
        dVar.f1285k = f2;
        float f3 = dVar.f1282f;
        dVar.f1286l = f3;
        dVar.f1287m = dVar.f1283g;
        if (f3 != f2) {
            this.f1304f = true;
            this.f1302d.setDuration(666L);
            this.f1302d.start();
            return;
        }
        dVar.a(0);
        dVar.f1285k = 0.0f;
        dVar.f1286l = 0.0f;
        dVar.f1287m = 0.0f;
        dVar.f1281e = 0.0f;
        dVar.f1282f = 0.0f;
        dVar.f1283g = 0.0f;
        this.f1302d.setDuration(1332L);
        this.f1302d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f1302d.cancel();
        this.f1300b = 0.0f;
        d dVar = this.f1299a;
        if (dVar.f1288n) {
            dVar.f1288n = false;
        }
        dVar.a(0);
        dVar.f1285k = 0.0f;
        dVar.f1286l = 0.0f;
        dVar.f1287m = 0.0f;
        dVar.f1281e = 0.0f;
        dVar.f1282f = 0.0f;
        dVar.f1283g = 0.0f;
        invalidateSelf();
    }
}
