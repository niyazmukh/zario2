package com.google.android.material.appbar;

import C1.a;
import M.S;
import S0.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y.C1041d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\appbar\AppBarLayout$ScrollingViewBehavior.smali */
public class AppBarLayout$ScrollingViewBehavior extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f5793b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // y.a
    public final void b(View view) {
    }

    @Override // y.a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        y.a aVar = ((C1041d) view2.getLayoutParams()).f11027a;
        if (aVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) aVar).getClass();
            int i = this.f5793b;
            int iR = bottom - (i == 0 ? 0 : f.r((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = S.f2363a;
            view.offsetTopAndBottom(iR);
        }
        return false;
    }

    @Override // y.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i5, int i6) {
        int i7 = view.getLayoutParams().height;
        if (i7 != -1 && i7 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // y.a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // C1.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.f32A);
        this.f5793b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
