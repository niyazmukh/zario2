package com.google.android.material.transformation;

import M.E;
import M.S;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y.a;

@Deprecated
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\transformation\ExpandableBehavior.smali */
public abstract class ExpandableBehavior extends a {
    public ExpandableBehavior() {
    }

    @Override // y.a
    public abstract void b(View view);

    @Override // y.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // y.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = S.f2363a;
        if (!E.c(view)) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            for (int i5 = 0; i5 < size; i5++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
