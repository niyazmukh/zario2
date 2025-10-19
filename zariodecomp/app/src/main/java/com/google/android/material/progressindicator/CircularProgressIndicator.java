package com.google.android.material.progressindicator;

import A1.a;
import S1.d;
import S1.e;
import S1.f;
import S1.h;
import S1.i;
import S1.k;
import S1.p;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\progressindicator\CircularProgressIndicator.smali */
public class CircularProgressIndicator extends d {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903241, 2131952648);
        Context context2 = getContext();
        i iVar = (i) this.f2942a;
        setIndeterminateDrawable(new p(context2, iVar, new f(iVar), new h(iVar)));
        setProgressDrawable(new k(getContext(), iVar, new f(iVar)));
    }

    @Override // S1.d
    public final e a(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        i iVar = new i(context, attributeSet, 2130903241, 2131952648);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131100391);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131100386);
        int[] iArr = a.f47f;
        Q1.k.a(context, attributeSet, 2130903241, 2131952648);
        Q1.k.b(context, attributeSet, iArr, 2130903241, 2131952648, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 2130903241, 2131952648);
        iVar.f2976g = Math.max(r1.d.z(context, typedArrayObtainStyledAttributes, 2, dimensionPixelSize), iVar.f2953a * 2);
        iVar.h = r1.d.z(context, typedArrayObtainStyledAttributes, 1, dimensionPixelSize2);
        iVar.i = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return iVar;
    }

    public int getIndicatorDirection() {
        return ((i) this.f2942a).i;
    }

    public int getIndicatorInset() {
        return ((i) this.f2942a).h;
    }

    public int getIndicatorSize() {
        return ((i) this.f2942a).f2976g;
    }

    public void setIndicatorDirection(int i) {
        ((i) this.f2942a).i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        e eVar = this.f2942a;
        if (((i) eVar).h != i) {
            ((i) eVar).h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        e eVar = this.f2942a;
        if (((i) eVar).f2976g != iMax) {
            ((i) eVar).f2976g = iMax;
            ((i) eVar).getClass();
            invalidate();
        }
    }

    @Override // S1.d
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((i) this.f2942a).getClass();
    }
}
