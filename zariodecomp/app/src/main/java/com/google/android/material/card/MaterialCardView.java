package com.google.android.material.card;

import A1.a;
import E.b;
import H1.d;
import N2.AbstractC0156x;
import Q1.k;
import X1.h;
import X1.l;
import X1.m;
import X1.x;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import c2.AbstractC0336a;
import p.AbstractC0817a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\card\MaterialCardView.smali */
public class MaterialCardView extends AbstractC0817a implements Checkable, x {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f5893p = {R.attr.state_checkable};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f5894q = {R.attr.state_checked};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f5895r = {2130904018};

    /* renamed from: l, reason: collision with root package name */
    public final d f5896l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f5897m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5898n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5899o;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(AbstractC0336a.a(context, attributeSet, 2130903769, 2131952641), attributeSet);
        this.f5898n = false;
        this.f5899o = false;
        this.f5897m = true;
        TypedArray typedArrayH = k.h(getContext(), attributeSet, a.f58s, 2130903769, 2131952641, new int[0]);
        d dVar = new d(this, attributeSet);
        this.f5896l = dVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        h hVar = dVar.f1889c;
        hVar.m(cardBackgroundColor);
        dVar.f1888b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        dVar.l();
        MaterialCardView materialCardView = dVar.f1887a;
        ColorStateList colorStateListX = r1.d.x(materialCardView.getContext(), typedArrayH, 11);
        dVar.f1898n = colorStateListX;
        if (colorStateListX == null) {
            dVar.f1898n = ColorStateList.valueOf(-1);
        }
        dVar.h = typedArrayH.getDimensionPixelSize(12, 0);
        boolean z4 = typedArrayH.getBoolean(0, false);
        dVar.f1903s = z4;
        materialCardView.setLongClickable(z4);
        dVar.f1896l = r1.d.x(materialCardView.getContext(), typedArrayH, 6);
        dVar.g(r1.d.C(materialCardView.getContext(), typedArrayH, 2));
        dVar.f1892f = typedArrayH.getDimensionPixelSize(5, 0);
        dVar.f1891e = typedArrayH.getDimensionPixelSize(4, 0);
        dVar.f1893g = typedArrayH.getInteger(3, 8388661);
        ColorStateList colorStateListX2 = r1.d.x(materialCardView.getContext(), typedArrayH, 7);
        dVar.f1895k = colorStateListX2;
        if (colorStateListX2 == null) {
            dVar.f1895k = ColorStateList.valueOf(AbstractC0156x.I(materialCardView, 2130903273));
        }
        ColorStateList colorStateListX3 = r1.d.x(materialCardView.getContext(), typedArrayH, 1);
        h hVar2 = dVar.f1890d;
        hVar2.m(colorStateListX3 == null ? ColorStateList.valueOf(0) : colorStateListX3);
        RippleDrawable rippleDrawable = dVar.f1899o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(dVar.f1895k);
        }
        hVar.l(materialCardView.getCardElevation());
        float f2 = dVar.h;
        ColorStateList colorStateList = dVar.f1898n;
        hVar2.f3738a.f3729j = f2;
        hVar2.invalidateSelf();
        hVar2.q(colorStateList);
        materialCardView.setBackgroundInternal(dVar.d(hVar));
        Drawable drawableC = dVar.j() ? dVar.c() : hVar2;
        dVar.i = drawableC;
        materialCardView.setForeground(dVar.d(drawableC));
        typedArrayH.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f5896l.f1889c.getBounds());
        return rectF;
    }

    public final void b() {
        d dVar = this.f5896l;
        RippleDrawable rippleDrawable = dVar.f1899o;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            dVar.f1899o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            dVar.f1899o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @Override // p.AbstractC0817a
    public ColorStateList getCardBackgroundColor() {
        return this.f5896l.f1889c.f3738a.f3724c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f5896l.f1890d.f3738a.f3724c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f5896l.f1894j;
    }

    public int getCheckedIconGravity() {
        return this.f5896l.f1893g;
    }

    public int getCheckedIconMargin() {
        return this.f5896l.f1891e;
    }

    public int getCheckedIconSize() {
        return this.f5896l.f1892f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f5896l.f1896l;
    }

    @Override // p.AbstractC0817a
    public int getContentPaddingBottom() {
        return this.f5896l.f1888b.bottom;
    }

    @Override // p.AbstractC0817a
    public int getContentPaddingLeft() {
        return this.f5896l.f1888b.left;
    }

    @Override // p.AbstractC0817a
    public int getContentPaddingRight() {
        return this.f5896l.f1888b.right;
    }

    @Override // p.AbstractC0817a
    public int getContentPaddingTop() {
        return this.f5896l.f1888b.top;
    }

    public float getProgress() {
        return this.f5896l.f1889c.f3738a.i;
    }

    @Override // p.AbstractC0817a
    public float getRadius() {
        return this.f5896l.f1889c.h();
    }

    public ColorStateList getRippleColor() {
        return this.f5896l.f1895k;
    }

    public m getShapeAppearanceModel() {
        return this.f5896l.f1897m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f5896l.f1898n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f5896l.f1898n;
    }

    public int getStrokeWidth() {
        return this.f5896l.h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f5898n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVar = this.f5896l;
        dVar.k();
        AbstractC0156x.f0(this, dVar.f1889c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        d dVar = this.f5896l;
        if (dVar != null && dVar.f1903s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5893p);
        }
        if (this.f5898n) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5894q);
        }
        if (this.f5899o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5895r);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f5898n);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        d dVar = this.f5896l;
        accessibilityNodeInfo.setCheckable(dVar != null && dVar.f1903s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f5898n);
    }

    @Override // p.AbstractC0817a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        this.f5896l.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f5897m) {
            d dVar = this.f5896l;
            if (!dVar.f1902r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                dVar.f1902r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p.AbstractC0817a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f5896l.f1889c.m(colorStateList);
    }

    @Override // p.AbstractC0817a
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        d dVar = this.f5896l;
        dVar.f1889c.l(dVar.f1887a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        h hVar = this.f5896l.f1890d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        hVar.m(colorStateList);
    }

    public void setCheckable(boolean z4) {
        this.f5896l.f1903s = z4;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (this.f5898n != z4) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f5896l.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        d dVar = this.f5896l;
        if (dVar.f1893g != i) {
            dVar.f1893g = i;
            MaterialCardView materialCardView = dVar.f1887a;
            dVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f5896l.f1891e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f5896l.f1891e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f5896l.g(r1.d.B(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f5896l.f1892f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f5896l.f1892f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        d dVar = this.f5896l;
        dVar.f1896l = colorStateList;
        Drawable drawable = dVar.f1894j;
        if (drawable != null) {
            b.h(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z4) {
        super.setClickable(z4);
        d dVar = this.f5896l;
        if (dVar != null) {
            dVar.k();
        }
    }

    public void setDragged(boolean z4) {
        if (this.f5899o != z4) {
            this.f5899o = z4;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // p.AbstractC0817a
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f5896l.m();
    }

    public void setOnCheckedChangeListener(H1.a aVar) {
    }

    @Override // p.AbstractC0817a
    public void setPreventCornerOverlap(boolean z4) {
        super.setPreventCornerOverlap(z4);
        d dVar = this.f5896l;
        dVar.m();
        dVar.l();
    }

    public void setProgress(float f2) {
        d dVar = this.f5896l;
        dVar.f1889c.n(f2);
        h hVar = dVar.f1890d;
        if (hVar != null) {
            hVar.n(f2);
        }
        h hVar2 = dVar.f1901q;
        if (hVar2 != null) {
            hVar2.n(f2);
        }
    }

    @Override // p.AbstractC0817a
    public void setRadius(float f2) {
        super.setRadius(f2);
        d dVar = this.f5896l;
        l lVarE = dVar.f1897m.e();
        lVarE.c(f2);
        dVar.h(lVarE.a());
        dVar.i.invalidateSelf();
        if (dVar.i() || (dVar.f1887a.getPreventCornerOverlap() && !dVar.f1889c.k())) {
            dVar.l();
        }
        if (dVar.i()) {
            dVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.f5896l;
        dVar.f1895k = colorStateList;
        RippleDrawable rippleDrawable = dVar.f1899o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) throws Resources.NotFoundException {
        ColorStateList colorStateList = B.l.getColorStateList(getContext(), i);
        d dVar = this.f5896l;
        dVar.f1895k = colorStateList;
        RippleDrawable rippleDrawable = dVar.f1899o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // X1.x
    public void setShapeAppearanceModel(m mVar) {
        setClipToOutline(mVar.d(getBoundsAsRectF()));
        this.f5896l.h(mVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        d dVar = this.f5896l;
        if (i != dVar.h) {
            dVar.h = i;
            h hVar = dVar.f1890d;
            ColorStateList colorStateList = dVar.f1898n;
            hVar.f3738a.f3729j = i;
            hVar.invalidateSelf();
            hVar.q(colorStateList);
        }
        invalidate();
    }

    @Override // p.AbstractC0817a
    public void setUseCompatPadding(boolean z4) {
        super.setUseCompatPadding(z4);
        d dVar = this.f5896l;
        dVar.m();
        dVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        d dVar = this.f5896l;
        if (dVar != null && dVar.f1903s && isEnabled()) {
            this.f5898n = !this.f5898n;
            refreshDrawableState();
            b();
            dVar.f(this.f5898n, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        d dVar = this.f5896l;
        if (dVar.f1898n != colorStateList) {
            dVar.f1898n = colorStateList;
            h hVar = dVar.f1890d;
            hVar.f3738a.f3729j = dVar.h;
            hVar.invalidateSelf();
            hVar.q(colorStateList);
        }
        invalidate();
    }

    @Override // p.AbstractC0817a
    public void setCardBackgroundColor(int i) {
        this.f5896l.f1889c.m(ColorStateList.valueOf(i));
    }
}
