package Q1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import l.AbstractC0712s0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q1\d.smali */
public abstract class d extends AbstractC0712s0 {

    /* renamed from: t, reason: collision with root package name */
    public Drawable f2781t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f2782u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f2783v;

    /* renamed from: w, reason: collision with root package name */
    public int f2784w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2785x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2786y;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2782u = new Rect();
        this.f2783v = new Rect();
        this.f2784w = 119;
        this.f2785x = true;
        this.f2786y = false;
        int[] iArr = A1.a.f50k;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f2784w = typedArrayObtainStyledAttributes.getInt(1, this.f2784w);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f2785x = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2781t;
        if (drawable != null) {
            if (this.f2786y) {
                this.f2786y = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z4 = this.f2785x;
                Rect rect = this.f2782u;
                if (z4) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f2784w;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f2783v;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f2781t;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2781t;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f2781t.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f2781t;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f2784w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2781t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // l.AbstractC0712s0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        this.f2786y = z4 | this.f2786y;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i5, int i6, int i7) {
        super.onSizeChanged(i, i5, i6, i7);
        this.f2786y = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f2781t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f2781t);
            }
            this.f2781t = drawable;
            this.f2786y = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f2784w == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f2784w != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2784w = i;
            if (i == 119 && this.f2781t != null) {
                this.f2781t.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2781t;
    }
}
