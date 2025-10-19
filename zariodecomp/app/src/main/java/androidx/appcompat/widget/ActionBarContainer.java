package androidx.appcompat.widget;

import M.B;
import M.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import f.AbstractC0489a;
import java.util.WeakHashMap;
import l.C0677a;
import l.K0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\ActionBarContainer.smali */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4143a;

    /* renamed from: b, reason: collision with root package name */
    public View f4144b;

    /* renamed from: c, reason: collision with root package name */
    public View f4145c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f4146d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4147e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4148f;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4149k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4150l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4151m;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0677a c0677a = new C0677a(this);
        WeakHashMap weakHashMap = S.f2363a;
        B.q(this, c0677a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0489a.f6962a);
        boolean z4 = false;
        this.f4146d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f4147e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f4151m = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == 2131231186) {
            this.f4149k = true;
            this.f4148f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f4149k ? !(this.f4146d != null || this.f4147e != null) : this.f4148f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4146d;
        if (drawable != null && drawable.isStateful()) {
            this.f4146d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4147e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4147e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4148f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4148f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4146d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4147e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4148f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4144b = findViewById(2131230769);
        this.f4145c = findViewById(2131230777);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4143a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        boolean z5 = true;
        if (this.f4149k) {
            Drawable drawable = this.f4148f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z5 = false;
            }
        } else {
            if (this.f4146d == null) {
                z5 = false;
            } else if (this.f4144b.getVisibility() == 0) {
                this.f4146d.setBounds(this.f4144b.getLeft(), this.f4144b.getTop(), this.f4144b.getRight(), this.f4144b.getBottom());
            } else {
                View view = this.f4145c;
                if (view == null || view.getVisibility() != 0) {
                    this.f4146d.setBounds(0, 0, 0, 0);
                } else {
                    this.f4146d.setBounds(this.f4145c.getLeft(), this.f4145c.getTop(), this.f4145c.getRight(), this.f4145c.getBottom());
                }
            }
            this.f4150l = false;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        if (this.f4144b == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f4151m) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i5);
        if (this.f4144b == null) {
            return;
        }
        View.MeasureSpec.getMode(i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4146d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4146d);
        }
        this.f4146d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4144b;
            if (view != null) {
                this.f4146d.setBounds(view.getLeft(), this.f4144b.getTop(), this.f4144b.getRight(), this.f4144b.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f4149k ? !(this.f4146d != null || this.f4147e != null) : this.f4148f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4148f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4148f);
        }
        this.f4148f = drawable;
        boolean z4 = this.f4149k;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f4148f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f4146d != null || this.f4147e != null) : this.f4148f == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f4147e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4147e);
        }
        this.f4147e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4150l && this.f4147e != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f4149k ? !(this.f4146d != null || this.f4147e != null) : this.f4148f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(K0 k02) {
    }

    public void setTransitioning(boolean z4) {
        this.f4143a = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z4 = i == 0;
        Drawable drawable = this.f4146d;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f4147e;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f4148f;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4146d;
        boolean z4 = this.f4149k;
        return (drawable == drawable2 && !z4) || (drawable == this.f4147e && this.f4150l) || ((drawable == this.f4148f && z4) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
