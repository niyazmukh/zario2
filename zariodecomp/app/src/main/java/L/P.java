package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import k.ViewTreeObserverOnGlobalLayoutListenerC0645d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\P.smali */
public final class P extends Spinner {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f8481m = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final A2.T f8482a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8483b;

    /* renamed from: c, reason: collision with root package name */
    public final C0676F f8484c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f8485d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8486e;

    /* renamed from: f, reason: collision with root package name */
    public final O f8487f;

    /* renamed from: k, reason: collision with root package name */
    public int f8488k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f8489l;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public P(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130903998(0x7f0303be, float:1.741483E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f8489l = r1
            android.content.Context r1 = r12.getContext()
            l.V0.a(r1, r12)
            int[] r1 = f.AbstractC0489a.f6981v
            A2.i r2 = A2.C0009i.Y(r13, r14, r1, r0)
            A2.T r3 = new A2.T
            r3.<init>(r12)
            r12.f8482a = r3
            java.lang.Object r3 = r2.f205c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            j.d r6 = new j.d
            r6.<init>(r13, r4)
            r12.f8483b = r6
            goto L37
        L35:
            r12.f8483b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = l.P.f8481m     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r12 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r12 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            l.M r4 = new l.M
            android.content.Context r9 = r12.f8483b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f8483b
            A2.i r1 = A2.C0009i.Y(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f205c
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f8488k = r9
            android.graphics.drawable.Drawable r9 = r1.I(r8)
            r4.l(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f8474E = r7
            r1.e0()
            r12.f8487f = r4
            l.F r1 = new l.F
            r1.<init>(r12, r12, r4)
            r12.f8484c = r1
            goto Laa
        L9d:
            l.J r1 = new l.J
            r1.<init>(r12)
            r12.f8487f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f8459c = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131427453(0x7f0b007d, float:1.8476523E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.e0()
            r12.f8486e = r8
            android.widget.SpinnerAdapter r13 = r12.f8485d
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f8485d = r6
        Lcf:
            A2.T r12 = r12.f8482a
            r12.z(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.P.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f8489l;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A2.T t4 = this.f8482a;
        if (t4 != null) {
            t4.l();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        O o5 = this.f8487f;
        return o5 != null ? o5.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        O o5 = this.f8487f;
        return o5 != null ? o5.g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f8487f != null ? this.f8488k : super.getDropDownWidth();
    }

    public final O getInternalPopup() {
        return this.f8487f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        O o5 = this.f8487f;
        return o5 != null ? o5.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f8483b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        O o5 = this.f8487f;
        return o5 != null ? o5.i() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        A2.T t4 = this.f8482a;
        if (t4 != null) {
            return t4.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        A2.T t4 = this.f8482a;
        if (t4 != null) {
            return t4.w();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O o5 = this.f8487f;
        if (o5 == null || !o5.b()) {
            return;
        }
        o5.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        if (this.f8487f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        N n5 = (N) parcelable;
        super.onRestoreInstanceState(n5.getSuperState());
        if (!n5.f8479a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0645d(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        N n5 = new N(super.onSaveInstanceState());
        O o5 = this.f8487f;
        n5.f8479a = o5 != null && o5.b();
        return n5;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0676F c0676f = this.f8484c;
        if (c0676f == null || !c0676f.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        O o5 = this.f8487f;
        if (o5 == null) {
            return super.performClick();
        }
        if (o5.b()) {
            return true;
        }
        this.f8487f.e(H.b(this), H.a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        A2.T t4 = this.f8482a;
        if (t4 != null) {
            t4.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A2.T t4 = this.f8482a;
        if (t4 != null) {
            t4.C(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        O o5 = this.f8487f;
        if (o5 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            o5.p(i);
            o5.a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        O o5 = this.f8487f;
        if (o5 != null) {
            o5.m(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f8487f != null) {
            this.f8488k = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        O o5 = this.f8487f;
        if (o5 != null) {
            o5.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(r1.d.B(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        O o5 = this.f8487f;
        if (o5 != null) {
            o5.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        A2.T t4 = this.f8482a;
        if (t4 != null) {
            t4.I(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        A2.T t4 = this.f8482a;
        if (t4 != null) {
            t4.J(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f8486e) {
            this.f8485d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        O o5 = this.f8487f;
        if (o5 != null) {
            Context context = this.f8483b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            K k5 = new K();
            k5.f8468a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                k5.f8469b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                I.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            o5.o(k5);
        }
    }
}
