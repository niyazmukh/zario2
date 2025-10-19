package S1;

import N2.AbstractC0156x;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\f.smali */
public final class f extends n {

    /* renamed from: c, reason: collision with root package name */
    public int f2959c;

    /* renamed from: d, reason: collision with root package name */
    public float f2960d;

    /* renamed from: e, reason: collision with root package name */
    public float f2961e;

    /* renamed from: f, reason: collision with root package name */
    public float f2962f;

    public f(i iVar) {
        super(iVar);
        this.f2959c = 1;
    }

    @Override // S1.n
    public final void a(Canvas canvas, Rect rect, float f2) {
        float fWidth = rect.width() / g();
        float fHeight = rect.height() / g();
        e eVar = this.f2996a;
        float f3 = (((i) eVar).f2976g / 2.0f) + ((i) eVar).h;
        canvas.translate((f3 * fWidth) + rect.left, (f3 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f5 = -f3;
        canvas.clipRect(f5, f5, f3, f3);
        this.f2959c = ((i) eVar).i == 0 ? 1 : -1;
        this.f2960d = ((i) eVar).f2953a * f2;
        this.f2961e = ((i) eVar).f2954b * f2;
        this.f2962f = (((i) eVar).f2976g - ((i) eVar).f2953a) / 2.0f;
        if ((this.f2997b.d() && ((i) eVar).f2957e == 2) || (this.f2997b.c() && ((i) eVar).f2958f == 1)) {
            this.f2962f = (((1.0f - f2) * ((i) eVar).f2953a) / 2.0f) + this.f2962f;
        } else if ((this.f2997b.d() && ((i) eVar).f2957e == 1) || (this.f2997b.c() && ((i) eVar).f2958f == 2)) {
            this.f2962f -= ((1.0f - f2) * ((i) eVar).f2953a) / 2.0f;
        }
    }

    @Override // S1.n
    public final void b(Canvas canvas, Paint paint, float f2, float f3, int i) {
        if (f2 == f3) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f2960d);
        float f5 = this.f2959c;
        float f6 = f2 * 360.0f * f5;
        float f7 = (f3 >= f2 ? f3 - f2 : (1.0f + f3) - f2) * 360.0f * f5;
        float f8 = this.f2962f;
        float f9 = -f8;
        canvas.drawArc(new RectF(f9, f9, f8, f8), f6, f7, false, paint);
        if (this.f2961e <= 0.0f || Math.abs(f7) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        f(canvas, paint, this.f2960d, this.f2961e, f6);
        f(canvas, paint, this.f2960d, this.f2961e, f6 + f7);
    }

    @Override // S1.n
    public final void c(Canvas canvas, Paint paint) {
        int iK = AbstractC0156x.k(((i) this.f2996a).f2956d, this.f2997b.f2995n);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iK);
        paint.setStrokeWidth(this.f2960d);
        float f2 = this.f2962f;
        canvas.drawArc(new RectF(-f2, -f2, f2, f2), 0.0f, 360.0f, false, paint);
    }

    @Override // S1.n
    public final int d() {
        return g();
    }

    @Override // S1.n
    public final int e() {
        return g();
    }

    public final void f(Canvas canvas, Paint paint, float f2, float f3, float f5) {
        canvas.save();
        canvas.rotate(f5);
        float f6 = this.f2962f;
        float f7 = f2 / 2.0f;
        canvas.drawRoundRect(new RectF(f6 - f7, f3, f6 + f7, -f3), f3, f3, paint);
        canvas.restore();
    }

    public final int g() {
        e eVar = this.f2996a;
        return (((i) eVar).h * 2) + ((i) eVar).f2976g;
    }
}
