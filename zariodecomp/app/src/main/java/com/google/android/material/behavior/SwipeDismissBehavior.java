package com.google.android.material.behavior;

import D1.b;
import M.B;
import M.S;
import V.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g1.i;
import java.util.WeakHashMap;
import y.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\behavior\SwipeDismissBehavior.smali */
public class SwipeDismissBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public e f5807a;

    /* renamed from: b, reason: collision with root package name */
    public i f5808b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5809c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5810d;

    /* renamed from: e, reason: collision with root package name */
    public int f5811e = 2;

    /* renamed from: f, reason: collision with root package name */
    public float f5812f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f5813g = 0.5f;
    public final b h = new b(this);

    @Override // y.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f5809c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f5809c = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5809c = false;
        }
        if (!zO) {
            return false;
        }
        if (this.f5807a == null) {
            this.f5807a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.h);
        }
        return !this.f5810d && this.f5807a.p(motionEvent);
    }

    @Override // y.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = S.f2363a;
        if (B.c(view) == 0) {
            B.s(view, 1);
            S.f(view, 1048576);
            S.d(view, 0);
            if (r(view)) {
                S.g(view, N.i.f2534j, new h1.i(this, 4));
            }
        }
        return false;
    }

    @Override // y.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f5807a == null) {
            return false;
        }
        if (this.f5810d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f5807a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
