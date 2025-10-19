package com.google.android.material.behavior;

import N2.AbstractC0156x;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import y.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\behavior\HideBottomViewOnScrollBehavior.smali */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: b, reason: collision with root package name */
    public int f5801b;

    /* renamed from: c, reason: collision with root package name */
    public int f5802c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f5803d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f5804e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f5800a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f5805f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f5806g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // y.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f5805f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f5801b = AbstractC0156x.d0(view.getContext(), 2130903821, 225);
        this.f5802c = AbstractC0156x.d0(view.getContext(), 2130903827, 175);
        this.f5803d = AbstractC0156x.e0(view.getContext(), 2130903837, B1.a.f286d);
        this.f5804e = AbstractC0156x.e0(view.getContext(), 2130903837, B1.a.f285c);
        return false;
    }

    @Override // y.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i6, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f5800a;
        if (i > 0) {
            if (this.f5806g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f5806g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f5805f).setInterpolator(this.f5804e).setDuration(this.f5802c).setListener(new D1.a(this, 0));
            return;
        }
        if (i >= 0 || this.f5806g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f5806g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.f5803d).setDuration(this.f5801b).setListener(new D1.a(this, 0));
    }

    @Override // y.a
    public boolean o(View view, int i, int i5) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
