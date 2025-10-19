package S1;

import N2.AbstractC0156x;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import c2.AbstractC0336a;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\d.smali */
public abstract class d extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    public final e f2942a;

    /* renamed from: b, reason: collision with root package name */
    public int f2943b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2944c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2945d;

    /* renamed from: e, reason: collision with root package name */
    public a f2946e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2947f;

    /* renamed from: k, reason: collision with root package name */
    public int f2948k;

    /* renamed from: l, reason: collision with root package name */
    public final b f2949l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2950m;

    /* renamed from: n, reason: collision with root package name */
    public final c f2951n;

    /* renamed from: o, reason: collision with root package name */
    public final c f2952o;

    public d(Context context, AttributeSet attributeSet, int i, int i5) {
        super(AbstractC0336a.a(context, attributeSet, i, 2131952697), attributeSet, i);
        this.f2947f = false;
        this.f2948k = 4;
        this.f2949l = new b(this, 0);
        this.f2950m = new b(this, 1);
        this.f2951n = new c(this, 0);
        this.f2952o = new c(this, 1);
        Context context2 = getContext();
        this.f2942a = a(context2, attributeSet);
        int[] iArr = A1.a.f42a;
        Q1.k.a(context2, attributeSet, i, i5);
        Q1.k.b(context2, attributeSet, iArr, i, i5, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i5);
        typedArrayObtainStyledAttributes.getInt(5, -1);
        this.f2945d = Math.min(typedArrayObtainStyledAttributes.getInt(3, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.f2946e = new a();
        this.f2944c = true;
    }

    private n getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f3001p;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f2978p;
    }

    public abstract e a(Context context, AttributeSet attributeSet);

    public void b(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f2943b = i;
            this.f2947f = true;
            if (getIndeterminateDrawable().isVisible()) {
                a aVar = this.f2946e;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f3002q.r();
                    return;
                }
            }
            this.f2951n.a(getIndeterminateDrawable());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r2 = this;
            java.util.WeakHashMap r0 = M.S.f2363a
            boolean r0 = M.E.b(r2)
            if (r0 == 0) goto L2c
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            r0 = r2
        Lf:
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L16
            goto L2c
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L23
            int r2 = r2.getWindowVisibility()
            if (r2 != 0) goto L2c
            goto L27
        L23:
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L29
        L27:
            r2 = 1
            goto L2d
        L29:
            android.view.View r0 = (android.view.View) r0
            goto Lf
        L2c:
            r2 = 0
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.d.c():boolean");
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f2942a.f2958f;
    }

    public int[] getIndicatorColor() {
        return this.f2942a.f2955c;
    }

    public int getShowAnimationBehavior() {
        return this.f2942a.f2957e;
    }

    public int getTrackColor() {
        return this.f2942a.f2956d;
    }

    public int getTrackCornerRadius() {
        return this.f2942a.f2954b;
    }

    public int getTrackThickness() {
        return this.f2942a.f2953a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f3002q.p(this.f2951n);
        }
        k progressDrawable = getProgressDrawable();
        c cVar = this.f2952o;
        if (progressDrawable != null) {
            k progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f2991f == null) {
                progressDrawable2.f2991f = new ArrayList();
            }
            if (!progressDrawable2.f2991f.contains(cVar)) {
                progressDrawable2.f2991f.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            p indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f2991f == null) {
                indeterminateDrawable.f2991f = new ArrayList();
            }
            if (!indeterminateDrawable.f2991f.contains(cVar)) {
                indeterminateDrawable.f2991f.add(cVar);
            }
        }
        if (c()) {
            if (this.f2945d > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2950m);
        removeCallbacks(this.f2949l);
        ((m) getCurrentDrawable()).e(false, false, false);
        p indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.f2952o;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().g(cVar);
            getIndeterminateDrawable().f3002q.u();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i5) {
        try {
            n currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.e() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.d() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i5) : currentDrawingDelegate.d() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z4 = i == 0;
        if (this.f2944c) {
            ((m) getCurrentDrawable()).e(c(), false, z4);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f2944c) {
            ((m) getCurrentDrawable()).e(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.f2946e = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f2988c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f2988c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f2942a.f2958f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z4) {
        try {
            if (z4 == isIndeterminate()) {
                return;
            }
            m mVar = (m) getCurrentDrawable();
            if (mVar != null) {
                mVar.e(false, false, false);
            }
            super.setIndeterminate(z4);
            m mVar2 = (m) getCurrentDrawable();
            if (mVar2 != null) {
                mVar2.e(c(), false, false);
            }
            if ((mVar2 instanceof p) && c()) {
                ((p) mVar2).f3002q.s();
            }
            this.f2947f = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof p)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((m) drawable).e(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC0156x.G(getContext(), 2130903300, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f2942a.f2955c = iArr;
        getIndeterminateDrawable().f3002q.o();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        b(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof k)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            k kVar = (k) drawable;
            kVar.e(false, false, false);
            super.setProgressDrawable(kVar);
            kVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f2942a.f2957e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        e eVar = this.f2942a;
        if (eVar.f2956d != i) {
            eVar.f2956d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        e eVar = this.f2942a;
        if (eVar.f2954b != i) {
            eVar.f2954b = Math.min(i, eVar.f2953a / 2);
        }
    }

    public void setTrackThickness(int i) {
        e eVar = this.f2942a;
        if (eVar.f2953a != i) {
            eVar.f2953a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f2948k = i;
    }

    @Override // android.widget.ProgressBar
    public p getIndeterminateDrawable() {
        return (p) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public k getProgressDrawable() {
        return (k) super.getProgressDrawable();
    }
}
