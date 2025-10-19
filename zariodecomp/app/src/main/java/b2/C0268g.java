package b2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: b2.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\g.smali */
public final class C0268g extends X1.g {

    /* renamed from: r, reason: collision with root package name */
    public final RectF f5010r;

    public C0268g(X1.m mVar, RectF rectF) {
        super(mVar);
        this.f5010r = rectF;
    }

    @Override // X1.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0269h c0269h = new C0269h(this);
        c0269h.f5012B = this;
        c0269h.invalidateSelf();
        return c0269h;
    }

    public C0268g(C0268g c0268g) {
        super(c0268g);
        this.f5010r = c0268g.f5010r;
    }
}
