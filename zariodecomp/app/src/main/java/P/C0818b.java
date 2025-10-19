package p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p.1\b.smali */
public final class C0818b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f9297a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f9298b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f9299c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f9300d;

    /* renamed from: e, reason: collision with root package name */
    public float f9301e;
    public ColorStateList h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f9304j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9302f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9303g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f9305k = PorterDuff.Mode.SRC_IN;

    public C0818b(ColorStateList colorStateList, float f2) {
        this.f9297a = f2;
        Paint paint = new Paint(5);
        this.f9298b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
        this.f9299c = new RectF();
        this.f9300d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f9299c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f9300d;
        rect2.set(rect);
        if (this.f9302f) {
            rect2.inset((int) Math.ceil(c.a(this.f9301e, this.f9297a, this.f9303g)), (int) Math.ceil(c.b(this.f9301e, this.f9297a, this.f9303g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4;
        Paint paint = this.f9298b;
        if (this.i == null || paint.getColorFilter() != null) {
            z4 = false;
        } else {
            paint.setColorFilter(this.i);
            z4 = true;
        }
        RectF rectF = this.f9299c;
        float f2 = this.f9297a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z4) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f9300d, this.f9297a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f9304j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f9298b;
        boolean z4 = colorForState != paint.getColor();
        if (z4) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f9304j;
        if (colorStateList2 == null || (mode = this.f9305k) == null) {
            return z4;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f9298b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9298b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f9304j = colorStateList;
        this.i = a(colorStateList, this.f9305k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f9305k = mode;
        this.i = a(this.f9304j, mode);
        invalidateSelf();
    }
}
