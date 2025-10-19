package b2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: b2.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\h.smali */
public final class C0269h extends X1.h {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f5011C = 0;

    /* renamed from: B, reason: collision with root package name */
    public C0268g f5012B;

    @Override // X1.h
    public final void f(Canvas canvas) {
        if (this.f5012B.f5010r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f5012B.f5010r);
        super.f(canvas);
        canvas.restore();
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f5012B = new C0268g(this.f5012B);
        return this;
    }

    public final void u(float f2, float f3, float f5, float f6) {
        RectF rectF = this.f5012B.f5010r;
        if (f2 == rectF.left && f3 == rectF.top && f5 == rectF.right && f6 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f5, f6);
        invalidateSelf();
    }
}
