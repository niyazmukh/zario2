package com.google.android.material.snackbar;

import S0.n;
import a2.AbstractC0192g;
import a2.C0190e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import h1.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\snackbar\BaseTransientBottomBar$Behavior.smali */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final i i;

    public BaseTransientBottomBar$Behavior() {
        i iVar = new i(12);
        this.f5812f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f5813g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f5811e = 0;
        this.i = iVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, y.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        i iVar = this.i;
        iVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                n.i().o((C0190e) iVar.f7641b);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            n.i().n((C0190e) iVar.f7641b);
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.i.getClass();
        return view instanceof AbstractC0192g;
    }
}
