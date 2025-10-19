package com.niyaz.zario.ui.flexstakes;

import C2.j;
import K3.c;
import K3.d;
import O0.g;
import P0.b;
import S0.f;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import b2.ViewOnClickListenerC0262a;
import com.google.android.material.slider.Slider;
import com.niyaz.zario.databinding.FragmentFlexstakesBinding;
import d4.i;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import f4.E;
import g0.AbstractComponentCallbacksC0567t;
import j3.C0628a;
import j3.e;
import j3.l;
import kotlin.jvm.internal.s;

@AndroidEntryPoint
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\ui\flexstakes\FlexStakesFragment.smali */
public final class FlexStakesFragment extends AbstractComponentCallbacksC0567t implements GeneratedComponentManagerHolder {

    /* renamed from: a0, reason: collision with root package name */
    public ContextWrapper f6692a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6693b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile FragmentComponentManager f6694c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f6695d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6696e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public FragmentFlexstakesBinding f6697f0;

    /* renamed from: g0, reason: collision with root package name */
    public final j f6698g0;

    public FlexStakesFragment() {
        g gVar = new g(this, 10);
        d[] dVarArr = d.f2276a;
        c cVarO = f.O(new g(gVar, 11));
        this.f6698g0 = new j(s.a(l.class), new i(cVarO, 7), new b(6, this, cVarO), new i(cVarO, 8));
    }

    public static final void Y(FlexStakesFragment flexStakesFragment, boolean z4) {
        FragmentFlexstakesBinding fragmentFlexstakesBinding = flexStakesFragment.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding);
        boolean z5 = !z4;
        fragmentFlexstakesBinding.btnContinue.setEnabled(z5);
        FragmentFlexstakesBinding fragmentFlexstakesBinding2 = flexStakesFragment.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding2);
        fragmentFlexstakesBinding2.sliderReward.setEnabled(z5);
        FragmentFlexstakesBinding fragmentFlexstakesBinding3 = flexStakesFragment.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding3);
        fragmentFlexstakesBinding3.sliderPenalty.setEnabled(z5);
        FragmentFlexstakesBinding fragmentFlexstakesBinding4 = flexStakesFragment.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding4);
        fragmentFlexstakesBinding4.btnContinue.setText(z4 ? flexStakesFragment.r(2131886137) : flexStakesFragment.r(2131886251));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void B(Activity activity) {
        this.f7510H = true;
        ContextWrapper contextWrapper = this.f6692a0;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a0();
        if (this.f6696e0) {
            return;
        }
        this.f6696e0 = true;
        ((e) generatedComponent()).injectFlexStakesFragment((FlexStakesFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        super.C(context);
        a0();
        if (this.f6696e0) {
            return;
        }
        this.f6696e0 = true;
        ((e) generatedComponent()).injectFlexStakesFragment((FlexStakesFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        FragmentFlexstakesBinding fragmentFlexstakesBindingInflate = FragmentFlexstakesBinding.inflate(inflater, viewGroup, false);
        this.f6697f0 = fragmentFlexstakesBindingInflate;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBindingInflate);
        ScrollView root = fragmentFlexstakesBindingInflate.getRoot();
        kotlin.jvm.internal.i.d(root, "getRoot(...)");
        return root;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        this.f7510H = true;
        this.f6697f0 = null;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater layoutInflaterI = super.I(bundle);
        return layoutInflaterI.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterI, this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        FragmentFlexstakesBinding fragmentFlexstakesBinding = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding);
        fragmentFlexstakesBinding.tvScreenTitle.setText(r(2131886263));
        FragmentFlexstakesBinding fragmentFlexstakesBinding2 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding2);
        fragmentFlexstakesBinding2.tvScreenSubtitle.setText(r(2131886262));
        FragmentFlexstakesBinding fragmentFlexstakesBinding3 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding3);
        fragmentFlexstakesBinding3.tvRewardMinLabel.setText(s(2131886498, 0));
        FragmentFlexstakesBinding fragmentFlexstakesBinding4 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding4);
        fragmentFlexstakesBinding4.tvRewardMaxLabel.setText(s(2131886498, 10));
        FragmentFlexstakesBinding fragmentFlexstakesBinding5 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding5);
        Slider slider = fragmentFlexstakesBinding5.sliderReward;
        slider.setValueFrom(0.0f);
        slider.setValueTo(10.0f);
        slider.setStepSize(1.0f);
        slider.setValue(5.0f);
        slider.f3999p.add(new C0628a(this, 0));
        FragmentFlexstakesBinding fragmentFlexstakesBinding6 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding6);
        fragmentFlexstakesBinding6.tvPenaltyMaxLabel.setText(s(2131886498, 40));
        FragmentFlexstakesBinding fragmentFlexstakesBinding7 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding7);
        fragmentFlexstakesBinding7.tvPenaltyMinLabel.setText(s(2131886498, 10));
        FragmentFlexstakesBinding fragmentFlexstakesBinding8 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding8);
        Slider slider2 = fragmentFlexstakesBinding8.sliderPenalty;
        slider2.setValueFrom(10.0f);
        slider2.setValueTo(40.0f);
        slider2.setStepSize(1.0f);
        slider2.setValue(20.0f);
        slider2.f3999p.add(new C0628a(this, 1));
        FragmentFlexstakesBinding fragmentFlexstakesBinding9 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding9);
        d0((int) fragmentFlexstakesBinding9.sliderReward.getValue());
        FragmentFlexstakesBinding fragmentFlexstakesBinding10 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding10);
        c0((int) fragmentFlexstakesBinding10.sliderPenalty.getValue());
        FragmentFlexstakesBinding fragmentFlexstakesBinding11 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding11);
        fragmentFlexstakesBinding11.btnContinue.setOnClickListener(new ViewOnClickListenerC0262a(this, 6));
        E.t(a0.g(t()), null, null, new j3.d(this, null), 3);
        b0();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f6694c0 == null) {
            synchronized (this.f6695d0) {
                try {
                    if (this.f6694c0 == null) {
                        this.f6694c0 = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f6694c0;
    }

    public final void a0() {
        if (this.f6692a0 == null) {
            this.f6692a0 = FragmentComponentManager.createContextWrapper(super.n(), this);
            this.f6693b0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.n());
        }
    }

    public final void b0() {
        FragmentFlexstakesBinding fragmentFlexstakesBinding = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding);
        fragmentFlexstakesBinding.btnContinue.setEnabled(true);
        FragmentFlexstakesBinding fragmentFlexstakesBinding2 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding2);
        fragmentFlexstakesBinding2.btnContinue.setText(r(2131886251));
    }

    public final void c0(int i) {
        FragmentFlexstakesBinding fragmentFlexstakesBinding = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding);
        fragmentFlexstakesBinding.tvPenaltyValue.setText(s(2131886257, Integer.valueOf(i)));
        FragmentFlexstakesBinding fragmentFlexstakesBinding2 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding2);
        fragmentFlexstakesBinding2.tvPenaltyValue.setTextColor(S().getColor(2131034219));
    }

    public final void d0(int i) {
        FragmentFlexstakesBinding fragmentFlexstakesBinding = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding);
        fragmentFlexstakesBinding.tvRewardValue.setText(s(2131886261, Integer.valueOf(i)));
        FragmentFlexstakesBinding fragmentFlexstakesBinding2 = this.f6697f0;
        kotlin.jvm.internal.i.b(fragmentFlexstakesBinding2);
        fragmentFlexstakesBinding2.tvRewardValue.setTextColor(S().getColor(2131034222));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // g0.AbstractComponentCallbacksC0567t, androidx.lifecycle.InterfaceC0232j
    public final i0 h() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.h());
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final Context n() {
        if (super.n() == null && !this.f6693b0) {
            return null;
        }
        a0();
        return this.f6692a0;
    }
}
