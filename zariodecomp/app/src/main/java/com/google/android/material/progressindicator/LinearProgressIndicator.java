package com.google.android.material.progressindicator;

import A1.a;
import M.C;
import M.S;
import S1.d;
import S1.e;
import S1.k;
import S1.p;
import S1.q;
import S1.r;
import S1.t;
import S1.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\progressindicator\LinearProgressIndicator.smali */
public class LinearProgressIndicator extends d {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903718, 2131952660);
        Context context2 = getContext();
        u uVar = (u) this.f2942a;
        setIndeterminateDrawable(new p(context2, uVar, new q(uVar), uVar.f3023g == 0 ? new r(uVar) : new t(context2, uVar)));
        setProgressDrawable(new k(getContext(), uVar, new q(uVar)));
    }

    @Override // S1.d
    public final e a(Context context, AttributeSet attributeSet) {
        u uVar = new u(context, attributeSet, 2130903718, 2131952660);
        int[] iArr = a.f51l;
        Q1.k.a(context, attributeSet, 2130903718, 2131952660);
        Q1.k.b(context, attributeSet, iArr, 2130903718, 2131952660, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 2130903718, 2131952660);
        uVar.f3023g = typedArrayObtainStyledAttributes.getInt(0, 1);
        uVar.h = typedArrayObtainStyledAttributes.getInt(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        uVar.a();
        uVar.i = uVar.h == 1;
        return uVar;
    }

    @Override // S1.d
    public final void b(int i) {
        e eVar = this.f2942a;
        if (eVar != null && ((u) eVar).f3023g == 0 && isIndeterminate()) {
            return;
        }
        super.b(i);
    }

    public int getIndeterminateAnimationType() {
        return ((u) this.f2942a).f3023g;
    }

    public int getIndicatorDirection() {
        return ((u) this.f2942a).h;
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        e eVar = this.f2942a;
        u uVar = (u) eVar;
        boolean z5 = true;
        if (((u) eVar).h != 1) {
            WeakHashMap weakHashMap = S.f2363a;
            if ((C.d(this) != 1 || ((u) eVar).h != 2) && (C.d(this) != 0 || ((u) eVar).h != 3)) {
                z5 = false;
            }
        }
        uVar.i = z5;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i5, int i6, int i7) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i5 - (getPaddingBottom() + getPaddingTop());
        p indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        k progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        e eVar = this.f2942a;
        if (((u) eVar).f3023g == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((u) eVar).f3023g = i;
        ((u) eVar).a();
        if (i == 0) {
            p indeterminateDrawable = getIndeterminateDrawable();
            r rVar = new r((u) eVar);
            indeterminateDrawable.f3002q = rVar;
            rVar.f2998a = indeterminateDrawable;
        } else {
            p indeterminateDrawable2 = getIndeterminateDrawable();
            t tVar = new t(getContext(), (u) eVar);
            indeterminateDrawable2.f3002q = tVar;
            tVar.f2998a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // S1.d
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((u) this.f2942a).a();
    }

    public void setIndicatorDirection(int i) {
        e eVar = this.f2942a;
        ((u) eVar).h = i;
        u uVar = (u) eVar;
        boolean z4 = true;
        if (i != 1) {
            WeakHashMap weakHashMap = S.f2363a;
            if ((C.d(this) != 1 || ((u) eVar).h != 2) && (C.d(this) != 0 || i != 3)) {
                z4 = false;
            }
        }
        uVar.i = z4;
        invalidate();
    }

    @Override // S1.d
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((u) this.f2942a).a();
        invalidate();
    }
}
