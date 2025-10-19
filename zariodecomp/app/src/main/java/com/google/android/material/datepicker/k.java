package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import t0.d0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\k.smali */
public final class k extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f5963E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ o f5964F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, int i, int i5) {
        super(i);
        this.f5964F = oVar;
        this.f5963E = i5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC0910Q
    public final void v0(RecyclerView recyclerView, int i) {
        B b5 = new B(recyclerView.getContext());
        b5.f9875a = i;
        w0(b5);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void y0(d0 d0Var, int[] iArr) {
        int i = this.f5963E;
        o oVar = this.f5964F;
        if (i == 0) {
            iArr[0] = oVar.f5980i0.getWidth();
            iArr[1] = oVar.f5980i0.getWidth();
        } else {
            iArr[0] = oVar.f5980i0.getHeight();
            iArr[1] = oVar.f5980i0.getHeight();
        }
    }
}
