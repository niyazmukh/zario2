package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import y.C1041d;
import y.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\floatingactionbutton\ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.smali */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // y.a
    public final /* synthetic */ boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // y.a
    public final void c(C1041d c1041d) {
        if (c1041d.h == 0) {
            c1041d.h = 80;
        }
    }

    @Override // y.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // y.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.i);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
