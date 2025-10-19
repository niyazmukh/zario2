package com.google.android.material.timepicker;

import A2.RunnableC0005e;
import M.B;
import M.C;
import M.S;
import X1.j;
import X1.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\timepicker\e.smali */
public abstract class e extends ConstraintLayout {

    /* renamed from: t, reason: collision with root package name */
    public final RunnableC0005e f6225t;

    /* renamed from: u, reason: collision with root package name */
    public int f6226u;

    /* renamed from: v, reason: collision with root package name */
    public final X1.h f6227v;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903771);
        LayoutInflater.from(context).inflate(2131427405, this);
        X1.h hVar = new X1.h();
        this.f6227v = hVar;
        j jVar = new j(0.5f);
        l lVarE = hVar.f3738a.f3722a.e();
        lVarE.f3767e = jVar;
        lVarE.f3768f = jVar;
        lVarE.f3769g = jVar;
        lVarE.h = jVar;
        hVar.setShapeAppearanceModel(lVarE.a());
        this.f6227v.m(ColorStateList.valueOf(-1));
        X1.h hVar2 = this.f6227v;
        WeakHashMap weakHashMap = S.f2363a;
        B.q(this, hVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.f65z, 2130903771, 0);
        this.f6226u = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f6225t = new RunnableC0005e(this, 25);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = S.f2363a;
            view.setId(C.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0005e runnableC0005e = this.f6225t;
            handler.removeCallbacks(runnableC0005e);
            handler.post(runnableC0005e);
        }
    }

    public abstract void f();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0005e runnableC0005e = this.f6225t;
            handler.removeCallbacks(runnableC0005e);
            handler.post(runnableC0005e);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f6227v.m(ColorStateList.valueOf(i));
    }
}
