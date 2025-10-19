package com.google.android.material.datepicker;

import B3.RunnableC0040f;
import M.S;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import t0.C0896C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\o.smali */
public final class o<S> extends y {

    /* renamed from: b0, reason: collision with root package name */
    public int f5973b0;

    /* renamed from: c0, reason: collision with root package name */
    public A f5974c0;

    /* renamed from: d0, reason: collision with root package name */
    public C0383c f5975d0;

    /* renamed from: e0, reason: collision with root package name */
    public t f5976e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f5977f0;

    /* renamed from: g0, reason: collision with root package name */
    public K0.t f5978g0;

    /* renamed from: h0, reason: collision with root package name */
    public RecyclerView f5979h0;

    /* renamed from: i0, reason: collision with root package name */
    public RecyclerView f5980i0;

    /* renamed from: j0, reason: collision with root package name */
    public View f5981j0;

    /* renamed from: k0, reason: collision with root package name */
    public View f5982k0;

    /* renamed from: l0, reason: collision with root package name */
    public View f5983l0;

    /* renamed from: m0, reason: collision with root package name */
    public View f5984m0;

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void D(Bundle bundle) {
        super.D(bundle);
        if (bundle == null) {
            bundle = this.f7532f;
        }
        this.f5973b0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f5974c0 = (A) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f5975d0 = (C0383c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5976e0 = (t) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        int i;
        int i5;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(n(), this.f5973b0);
        this.f5978g0 = new K0.t(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        t tVar = this.f5975d0.f5942a;
        if (r.g0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = 2131427427;
            i5 = 1;
        } else {
            i = 2131427422;
            i5 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = S().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131100311) + resources.getDimensionPixelOffset(2131100313) + resources.getDimensionPixelSize(2131100312);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131100296);
        int i6 = u.f6026f;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(2131100310) * (i6 - 1)) + (resources.getDimensionPixelSize(2131100291) * i6) + resources.getDimensionPixelOffset(2131100288));
        GridView gridView = (GridView) viewInflate.findViewById(2131231046);
        S.h(gridView, new Q.i(1));
        int i7 = this.f5975d0.f5946e;
        gridView.setAdapter((ListAdapter) (i7 > 0 ? new i(i7) : new i()));
        gridView.setNumColumns(tVar.f6022d);
        gridView.setEnabled(false);
        this.f5980i0 = (RecyclerView) viewInflate.findViewById(2131231049);
        this.f5980i0.setLayoutManager(new k(this, i5, i5));
        this.f5980i0.setTag("MONTHS_VIEW_GROUP_TAG");
        x xVar = new x(contextThemeWrapper, this.f5974c0, this.f5975d0, new K2.c(this, 16));
        this.f5980i0.setAdapter(xVar);
        int integer = contextThemeWrapper.getResources().getInteger(2131296308);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131231052);
        this.f5979h0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f5979h0.setLayoutManager(new GridLayoutManager(integer));
            this.f5979h0.setAdapter(new G(this));
            this.f5979h0.g(new l(this));
        }
        if (viewInflate.findViewById(2131231039) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(2131231039);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            S.h(materialButton, new G1.e(this, 4));
            View viewFindViewById = viewInflate.findViewById(2131231041);
            this.f5981j0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(2131231040);
            this.f5982k0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f5983l0 = viewInflate.findViewById(2131231052);
            this.f5984m0 = viewInflate.findViewById(2131231045);
            a0(1);
            materialButton.setText(this.f5976e0.e());
            this.f5980i0.h(new m(this, xVar, materialButton));
            materialButton.setOnClickListener(new n(this, 0));
            this.f5982k0.setOnClickListener(new j(this, xVar, 1));
            this.f5981j0.setOnClickListener(new j(this, xVar, 0));
        }
        if (!r.g0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new C0896C(1).a(this.f5980i0);
        }
        this.f5980i0.a0(xVar.f6037c.f5942a.f(this.f5976e0));
        S.h(this.f5980i0, new Q.i(2));
        return viewInflate;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void L(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f5973b0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f5974c0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5975d0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5976e0);
    }

    @Override // com.google.android.material.datepicker.y
    public final void Y(q qVar) {
        this.f6041a0.add(qVar);
    }

    public final void Z(t tVar) {
        x xVar = (x) this.f5980i0.getAdapter();
        int iF = xVar.f6037c.f5942a.f(tVar);
        int iF2 = iF - xVar.f6037c.f5942a.f(this.f5976e0);
        boolean z4 = Math.abs(iF2) > 3;
        boolean z5 = iF2 > 0;
        this.f5976e0 = tVar;
        if (z4 && z5) {
            this.f5980i0.a0(iF - 3);
            this.f5980i0.post(new RunnableC0040f(this, iF, 7));
        } else if (!z4) {
            this.f5980i0.post(new RunnableC0040f(this, iF, 7));
        } else {
            this.f5980i0.a0(iF + 3);
            this.f5980i0.post(new RunnableC0040f(this, iF, 7));
        }
    }

    public final void a0(int i) {
        this.f5977f0 = i;
        if (i == 2) {
            this.f5979h0.getLayoutManager().l0(this.f5976e0.f6021c - ((G) this.f5979h0.getAdapter()).f5932c.f5975d0.f5942a.f6021c);
            this.f5983l0.setVisibility(0);
            this.f5984m0.setVisibility(8);
            this.f5981j0.setVisibility(8);
            this.f5982k0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f5983l0.setVisibility(8);
            this.f5984m0.setVisibility(0);
            this.f5981j0.setVisibility(0);
            this.f5982k0.setVisibility(0);
            Z(this.f5976e0);
        }
    }
}
