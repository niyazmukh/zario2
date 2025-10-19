package com.google.android.material.slider;

import N2.AbstractC0156x;
import X1.a;
import X1.e;
import X1.h;
import X1.l;
import X1.m;
import Z1.c;
import Z1.d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\slider\Slider.smali */
public class Slider extends c {
    public Slider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f3968P;
    }

    public int getFocusedThumbIndex() {
        return this.f3969Q;
    }

    public int getHaloRadius() {
        return this.f3960H;
    }

    public ColorStateList getHaloTintList() {
        return this.f3981c0;
    }

    public int getLabelBehavior() {
        return this.f3957D;
    }

    public float getStepSize() {
        return this.f3970R;
    }

    public float getThumbElevation() {
        return this.f3989h0.f3738a.f3732m;
    }

    public int getThumbRadius() {
        return this.G;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f3989h0.f3738a.f3725d;
    }

    public float getThumbStrokeWidth() {
        return this.f3989h0.f3738a.f3729j;
    }

    public ColorStateList getThumbTintList() {
        return this.f3989h0.f3738a.f3724c;
    }

    public int getTickActiveRadius() {
        return this.f3973U;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f3983d0;
    }

    public int getTickInactiveRadius() {
        return this.f3974V;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f3985e0;
    }

    public ColorStateList getTickTintList() {
        if (this.f3985e0.equals(this.f3983d0)) {
            return this.f3983d0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f3987f0;
    }

    public int getTrackHeight() {
        return this.f3958E;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f3988g0;
    }

    public int getTrackSidePadding() {
        return this.f3959F;
    }

    public ColorStateList getTrackTintList() {
        if (this.f3988g0.equals(this.f3987f0)) {
            return this.f3987f0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f3975W;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.f3965M;
    }

    public float getValueTo() {
        return this.f3966N;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    @Override // Z1.c, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z4) {
        super.setEnabled(z4);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f3967O.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f3969Q = i;
        this.f3992k.w(i);
        postInvalidate();
    }

    @Override // Z1.c
    public void setHaloRadius(int i) {
        if (i == this.f3960H) {
            return;
        }
        this.f3960H = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.f3960H);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // Z1.c
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3981c0)) {
            return;
        }
        this.f3981c0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        Paint paint = this.f3982d;
        paint.setColor(f(colorStateList));
        paint.setAlpha(63);
        invalidate();
    }

    @Override // Z1.c
    public void setLabelBehavior(int i) {
        if (this.f3957D != i) {
            this.f3957D = i;
            requestLayout();
        }
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(d dVar) {
    }

    public void setStepSize(float f2) {
        if (f2 >= 0.0f) {
            if (this.f3970R != f2) {
                this.f3970R = f2;
                this.f3979b0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f2 + ") must be 0, or a factor of the valueFrom(" + this.f3965M + ")-valueTo(" + this.f3966N + ") range");
    }

    @Override // Z1.c
    public void setThumbElevation(float f2) {
        this.f3989h0.l(f2);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // Z1.c
    public void setThumbRadius(int i) {
        if (i == this.G) {
            return;
        }
        this.G = i;
        h hVar = this.f3989h0;
        e eVar = new e();
        e eVar2 = new e();
        e eVar3 = new e();
        e eVar4 = new e();
        float f2 = this.G;
        r1.d dVarQ = AbstractC0156x.q(0);
        l.b(dVarQ);
        l.b(dVarQ);
        l.b(dVarQ);
        l.b(dVarQ);
        a aVar = new a(f2);
        a aVar2 = new a(f2);
        a aVar3 = new a(f2);
        a aVar4 = new a(f2);
        m mVar = new m();
        mVar.f3773a = dVarQ;
        mVar.f3774b = dVarQ;
        mVar.f3775c = dVarQ;
        mVar.f3776d = dVarQ;
        mVar.f3777e = aVar;
        mVar.f3778f = aVar2;
        mVar.f3779g = aVar3;
        mVar.h = aVar4;
        mVar.i = eVar;
        mVar.f3780j = eVar2;
        mVar.f3781k = eVar3;
        mVar.f3782l = eVar4;
        hVar.setShapeAppearanceModel(mVar);
        int i5 = this.G * 2;
        hVar.setBounds(0, 0, i5, i5);
        Drawable drawable = this.f3990i0;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.f3991j0.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        u();
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // Z1.c
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f3989h0.q(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(B.l.getColorStateList(getContext(), i));
        }
    }

    @Override // Z1.c
    public void setThumbStrokeWidth(float f2) {
        h hVar = this.f3989h0;
        hVar.f3738a.f3729j = f2;
        hVar.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        h hVar = this.f3989h0;
        if (colorStateList.equals(hVar.f3738a.f3724c)) {
            return;
        }
        hVar.m(colorStateList);
        invalidate();
    }

    @Override // Z1.c
    public void setTickActiveRadius(int i) {
        if (this.f3973U != i) {
            this.f3973U = i;
            this.f3986f.setStrokeWidth(i * 2);
            u();
        }
    }

    @Override // Z1.c
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3983d0)) {
            return;
        }
        this.f3983d0 = colorStateList;
        this.f3986f.setColor(f(colorStateList));
        invalidate();
    }

    @Override // Z1.c
    public void setTickInactiveRadius(int i) {
        if (this.f3974V != i) {
            this.f3974V = i;
            this.f3984e.setStrokeWidth(i * 2);
            u();
        }
    }

    @Override // Z1.c
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3985e0)) {
            return;
        }
        this.f3985e0 = colorStateList;
        this.f3984e.setColor(f(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z4) {
        if (this.f3972T != z4) {
            this.f3972T = z4;
            postInvalidate();
        }
    }

    @Override // Z1.c
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3987f0)) {
            return;
        }
        this.f3987f0 = colorStateList;
        this.f3978b.setColor(f(colorStateList));
        invalidate();
    }

    @Override // Z1.c
    public void setTrackHeight(int i) {
        if (this.f3958E != i) {
            this.f3958E = i;
            this.f3976a.setStrokeWidth(i);
            this.f3978b.setStrokeWidth(this.f3958E);
            u();
        }
    }

    @Override // Z1.c
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3988g0)) {
            return;
        }
        this.f3988g0 = colorStateList;
        this.f3976a.setColor(f(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f2) {
        setValues(Float.valueOf(f2));
    }

    public void setValueFrom(float f2) {
        this.f3965M = f2;
        this.f3979b0 = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.f3966N = f2;
        this.f3979b0 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(drawableNewDrawable);
        this.f3990i0 = drawableNewDrawable;
        this.f3991j0.clear();
        postInvalidate();
    }
}
