package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import y.C1041d;
import y.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\floatingactionbutton\FloatingActionButton$BaseBehavior.smali */
public class FloatingActionButton$BaseBehavior<T> extends a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // y.a
    public final boolean a(View view) {
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

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.f49j);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
