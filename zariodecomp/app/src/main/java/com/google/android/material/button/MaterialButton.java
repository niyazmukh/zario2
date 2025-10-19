package com.google.android.material.button;

import E.b;
import G1.a;
import G1.c;
import M.C;
import M.S;
import N2.AbstractC0156x;
import Q.p;
import Q1.k;
import X1.l;
import X1.m;
import X1.x;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import c2.AbstractC0336a;
import h1.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0702n;
import r1.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\button\MaterialButton.smali */
public class MaterialButton extends C0702n implements Checkable, x {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f5866v = {R.attr.state_checkable};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f5867w = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final c f5868d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f5869e;

    /* renamed from: f, reason: collision with root package name */
    public a f5870f;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f5871k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f5872l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f5873m;

    /* renamed from: n, reason: collision with root package name */
    public String f5874n;

    /* renamed from: o, reason: collision with root package name */
    public int f5875o;

    /* renamed from: p, reason: collision with root package name */
    public int f5876p;

    /* renamed from: q, reason: collision with root package name */
    public int f5877q;

    /* renamed from: r, reason: collision with root package name */
    public int f5878r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5879s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5880t;

    /* renamed from: u, reason: collision with root package name */
    public int f5881u;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0336a.a(context, attributeSet, 2130903749, 2131952629), attributeSet, 2130903749);
        this.f5869e = new LinkedHashSet();
        this.f5879s = false;
        this.f5880t = false;
        Context context2 = getContext();
        TypedArray typedArrayH = k.h(context2, attributeSet, A1.a.f54o, 2130903749, 2131952629, new int[0]);
        this.f5878r = typedArrayH.getDimensionPixelSize(12, 0);
        int i = typedArrayH.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f5871k = k.i(i, mode);
        this.f5872l = d.x(getContext(), typedArrayH, 14);
        this.f5873m = d.C(getContext(), typedArrayH, 10);
        this.f5881u = typedArrayH.getInteger(11, 1);
        this.f5875o = typedArrayH.getDimensionPixelSize(13, 0);
        c cVar = new c(this, m.b(context2, attributeSet, 2130903749, 2131952629).a());
        this.f5868d = cVar;
        cVar.f1816c = typedArrayH.getDimensionPixelOffset(1, 0);
        cVar.f1817d = typedArrayH.getDimensionPixelOffset(2, 0);
        cVar.f1818e = typedArrayH.getDimensionPixelOffset(3, 0);
        cVar.f1819f = typedArrayH.getDimensionPixelOffset(4, 0);
        if (typedArrayH.hasValue(8)) {
            int dimensionPixelSize = typedArrayH.getDimensionPixelSize(8, -1);
            cVar.f1820g = dimensionPixelSize;
            l lVarE = cVar.f1815b.e();
            lVarE.c(dimensionPixelSize);
            cVar.c(lVarE.a());
            cVar.f1827p = true;
        }
        cVar.h = typedArrayH.getDimensionPixelSize(20, 0);
        cVar.i = k.i(typedArrayH.getInt(7, -1), mode);
        cVar.f1821j = d.x(getContext(), typedArrayH, 6);
        cVar.f1822k = d.x(getContext(), typedArrayH, 19);
        cVar.f1823l = d.x(getContext(), typedArrayH, 16);
        cVar.f1828q = typedArrayH.getBoolean(5, false);
        cVar.f1831t = typedArrayH.getDimensionPixelSize(9, 0);
        cVar.f1829r = typedArrayH.getBoolean(21, true);
        WeakHashMap weakHashMap = S.f2363a;
        int iF = C.f(this);
        int paddingTop = getPaddingTop();
        int iE = C.e(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayH.hasValue(0)) {
            cVar.f1826o = true;
            setSupportBackgroundTintList(cVar.f1821j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        C.k(this, iF + cVar.f1816c, paddingTop + cVar.f1818e, iE + cVar.f1817d, paddingBottom + cVar.f1819f);
        typedArrayH.recycle();
        setCompoundDrawablePadding(this.f5878r);
        d(this.f5873m != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        c cVar = this.f5868d;
        return cVar != null && cVar.f1828q;
    }

    public final boolean b() {
        c cVar = this.f5868d;
        return (cVar == null || cVar.f1826o) ? false : true;
    }

    public final void c() {
        int i = this.f5881u;
        boolean z4 = true;
        if (i != 1 && i != 2) {
            z4 = false;
        }
        if (z4) {
            p.e(this, this.f5873m, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            p.e(this, null, null, this.f5873m, null);
        } else if (i == 16 || i == 32) {
            p.e(this, null, this.f5873m, null, null);
        }
    }

    public final void d(boolean z4) {
        Drawable drawable = this.f5873m;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f5873m = drawableMutate;
            b.h(drawableMutate, this.f5872l);
            PorterDuff.Mode mode = this.f5871k;
            if (mode != null) {
                b.i(this.f5873m, mode);
            }
            int intrinsicWidth = this.f5875o;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f5873m.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f5875o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f5873m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f5873m;
            int i = this.f5876p;
            int i5 = this.f5877q;
            drawable2.setBounds(i, i5, intrinsicWidth + i, intrinsicHeight + i5);
            this.f5873m.setVisible(true, z4);
        }
        if (z4) {
            c();
            return;
        }
        Drawable[] drawableArrA = p.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        int i6 = this.f5881u;
        if (((i6 == 1 || i6 == 2) && drawable3 != this.f5873m) || (((i6 == 3 || i6 == 4) && drawable5 != this.f5873m) || ((i6 == 16 || i6 == 32) && drawable4 != this.f5873m))) {
            c();
        }
    }

    public final void e(int i, int i5) {
        if (this.f5873m == null || getLayout() == null) {
            return;
        }
        int i6 = this.f5881u;
        if (!(i6 == 1 || i6 == 2) && i6 != 3 && i6 != 4) {
            if (i6 == 16 || i6 == 32) {
                this.f5876p = 0;
                if (i6 == 16) {
                    this.f5877q = 0;
                    d(false);
                    return;
                }
                int intrinsicHeight = this.f5875o;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f5873m.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i5 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f5878r) - getPaddingBottom()) / 2);
                if (this.f5877q != iMax) {
                    this.f5877q = iMax;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f5877q = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i7 = this.f5881u;
        if (i7 == 1 || i7 == 3 || ((i7 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i7 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f5876p = 0;
            d(false);
            return;
        }
        int intrinsicWidth = this.f5875o;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f5873m.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = S.f2363a;
        int iE = (((textLayoutWidth - C.e(this)) - intrinsicWidth) - this.f5878r) - C.f(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            iE /= 2;
        }
        if ((C.d(this) == 1) != (this.f5881u == 4)) {
            iE = -iE;
        }
        if (this.f5876p != iE) {
            this.f5876p = iE;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f5874n)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f5874n;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f5868d.f1820g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f5873m;
    }

    public int getIconGravity() {
        return this.f5881u;
    }

    public int getIconPadding() {
        return this.f5878r;
    }

    public int getIconSize() {
        return this.f5875o;
    }

    public ColorStateList getIconTint() {
        return this.f5872l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f5871k;
    }

    public int getInsetBottom() {
        return this.f5868d.f1819f;
    }

    public int getInsetTop() {
        return this.f5868d.f1818e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f5868d.f1823l;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        if (b()) {
            return this.f5868d.f1815b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f5868d.f1822k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f5868d.h;
        }
        return 0;
    }

    @Override // l.C0702n
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f5868d.f1821j : super.getSupportBackgroundTintList();
    }

    @Override // l.C0702n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f5868d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f5879s;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            AbstractC0156x.f0(this, this.f5868d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5866v);
        }
        if (this.f5879s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5867w);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // l.C0702n, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f5879s);
    }

    @Override // l.C0702n, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f5879s);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.C0702n, android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof G1.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        G1.b bVar = (G1.b) parcelable;
        super.onRestoreInstanceState(bVar.f3264a);
        setChecked(bVar.f1813c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        G1.b bVar = new G1.b(super.onSaveInstanceState());
        bVar.f1813c = this.f5879s;
        return bVar;
    }

    @Override // l.C0702n, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        super.onTextChanged(charSequence, i, i5, i6);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f5868d.f1829r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f5873m != null) {
            if (this.f5873m.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f5874n = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!b()) {
            super.setBackgroundColor(i);
            return;
        }
        c cVar = this.f5868d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i);
        }
    }

    @Override // l.C0702n, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f5868d;
        cVar.f1826o = true;
        ColorStateList colorStateList = cVar.f1821j;
        MaterialButton materialButton = cVar.f1814a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.C0702n, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? d.B(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z4) {
        if (b()) {
            this.f5868d.f1828q = z4;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (a() && isEnabled() && this.f5879s != z4) {
            this.f5879s = z4;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z5 = this.f5879s;
                if (!materialButtonToggleGroup.f5888f) {
                    materialButtonToggleGroup.b(getId(), z5);
                }
            }
            if (this.f5880t) {
                return;
            }
            this.f5880t = true;
            Iterator it = this.f5869e.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f5880t = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            c cVar = this.f5868d;
            if (cVar.f1827p && cVar.f1820g == i) {
                return;
            }
            cVar.f1820g = i;
            cVar.f1827p = true;
            l lVarE = cVar.f1815b.e();
            lVarE.c(i);
            cVar.c(lVarE.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (b()) {
            this.f5868d.b(false).l(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f5873m != drawable) {
            this.f5873m = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f5881u != i) {
            this.f5881u = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f5878r != i) {
            this.f5878r = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? d.B(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f5875o != i) {
            this.f5875o = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f5872l != colorStateList) {
            this.f5872l = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f5871k != mode) {
            this.f5871k = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(B.l.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.f5868d;
        cVar.d(cVar.f1818e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.f5868d;
        cVar.d(i, cVar.f1819f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f5870f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        a aVar = this.f5870f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((i) aVar).f7641b).invalidate();
        }
        super.setPressed(z4);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f5868d;
            if (cVar.f1823l != colorStateList) {
                cVar.f1823l = colorStateList;
                MaterialButton materialButton = cVar.f1814a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(B.l.getColorStateList(getContext(), i));
        }
    }

    @Override // X1.x
    public void setShapeAppearanceModel(m mVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f5868d.c(mVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z4) {
        if (b()) {
            c cVar = this.f5868d;
            cVar.f1825n = z4;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f5868d;
            if (cVar.f1822k != colorStateList) {
                cVar.f1822k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(B.l.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            c cVar = this.f5868d;
            if (cVar.h != i) {
                cVar.h = i;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // l.C0702n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f5868d;
        if (cVar.f1821j != colorStateList) {
            cVar.f1821j = colorStateList;
            if (cVar.b(false) != null) {
                b.h(cVar.b(false), cVar.f1821j);
            }
        }
    }

    @Override // l.C0702n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f5868d;
        if (cVar.i != mode) {
            cVar.i = mode;
            if (cVar.b(false) == null || cVar.i == null) {
                return;
            }
            b.i(cVar.b(false), cVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z4) {
        this.f5868d.f1829r = z4;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f5879s);
    }
}
