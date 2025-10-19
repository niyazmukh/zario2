package S1;

import N2.AbstractC0156x;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\q.smali */
public final class q extends n {

    /* renamed from: c, reason: collision with root package name */
    public float f3003c;

    /* renamed from: d, reason: collision with root package name */
    public float f3004d;

    /* renamed from: e, reason: collision with root package name */
    public float f3005e;

    /* renamed from: f, reason: collision with root package name */
    public Path f3006f;

    public q(u uVar) {
        super(uVar);
        this.f3003c = 300.0f;
    }

    @Override // S1.n
    public final void a(Canvas canvas, Rect rect, float f2) {
        this.f3003c = rect.width();
        e eVar = this.f2996a;
        float f3 = ((u) eVar).f2953a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - ((u) eVar).f2953a) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((u) eVar).i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f2997b.d() && ((u) eVar).f2957e == 1) || (this.f2997b.c() && ((u) eVar).f2958f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f2997b.d() || this.f2997b.c()) {
            canvas.translate(0.0f, ((f2 - 1.0f) * ((u) eVar).f2953a) / 2.0f);
        }
        float f5 = this.f3003c;
        canvas.clipRect((-f5) / 2.0f, (-f3) / 2.0f, f5 / 2.0f, f3 / 2.0f);
        this.f3004d = ((u) eVar).f2953a * f2;
        this.f3005e = ((u) eVar).f2954b * f2;
    }

    @Override // S1.n
    public final void b(Canvas canvas, Paint paint, float f2, float f3, int i) {
        if (f2 == f3) {
            return;
        }
        float f5 = this.f3003c;
        float f6 = (-f5) / 2.0f;
        float f7 = ((f2 * f5) + f6) - (this.f3005e * 2.0f);
        float f8 = (f3 * f5) + f6;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.save();
        canvas.clipPath(this.f3006f);
        float f9 = this.f3004d;
        RectF rectF = new RectF(f7, (-f9) / 2.0f, f8, f9 / 2.0f);
        float f10 = this.f3005e;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.restore();
    }

    @Override // S1.n
    public final void c(Canvas canvas, Paint paint) {
        int iK = AbstractC0156x.k(((u) this.f2996a).f2956d, this.f2997b.f2995n);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iK);
        Path path = new Path();
        this.f3006f = path;
        float f2 = this.f3003c;
        float f3 = this.f3004d;
        RectF rectF = new RectF((-f2) / 2.0f, (-f3) / 2.0f, f2 / 2.0f, f3 / 2.0f);
        float f5 = this.f3005e;
        path.addRoundRect(rectF, f5, f5, Path.Direction.CCW);
        canvas.drawPath(this.f3006f, paint);
    }

    @Override // S1.n
    public final int d() {
        return ((u) this.f2996a).f2953a;
    }

    @Override // S1.n
    public final int e() {
        return -1;
    }
}
