package com.niyaz.zario.ui.profile;

import C2.j;
import K3.c;
import K3.d;
import O0.g;
import P0.b;
import S0.f;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.niyaz.zario.databinding.FragmentProfileBinding;
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
import java.text.NumberFormat;
import k3.C0662c;
import kotlin.jvm.internal.s;
import o3.C0809c;
import o3.InterfaceC0810d;
import o3.k;
import p3.C0823b;
import p3.C0824c;

@AndroidEntryPoint
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\ui\profile\ProfileFragment.smali */
public final class ProfileFragment extends AbstractComponentCallbacksC0567t implements GeneratedComponentManagerHolder {

    /* renamed from: a0, reason: collision with root package name */
    public ContextWrapper f6730a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6731b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile FragmentComponentManager f6732c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f6733d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6734e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public FragmentProfileBinding f6735f0;

    /* renamed from: g0, reason: collision with root package name */
    public final j f6736g0;

    /* renamed from: h0, reason: collision with root package name */
    public C0824c f6737h0;

    /* renamed from: i0, reason: collision with root package name */
    public final NumberFormat f6738i0;

    public ProfileFragment() {
        g gVar = new g(this, 17);
        d[] dVarArr = d.f2276a;
        c cVarO = f.O(new g(gVar, 18));
        this.f6736g0 = new j(s.a(k.class), new i(cVarO, 13), new b(10, this, cVarO), new i(cVarO, 14));
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        kotlin.jvm.internal.i.d(integerInstance, "getIntegerInstance(...)");
        this.f6738i0 = integerInstance;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void B(Activity activity) {
        this.f7510H = true;
        ContextWrapper contextWrapper = this.f6730a0;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a0();
        if (this.f6734e0) {
            return;
        }
        this.f6734e0 = true;
        ((InterfaceC0810d) generatedComponent()).injectProfileFragment((ProfileFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        super.C(context);
        a0();
        if (this.f6734e0) {
            return;
        }
        this.f6734e0 = true;
        ((InterfaceC0810d) generatedComponent()).injectProfileFragment((ProfileFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        FragmentProfileBinding fragmentProfileBindingInflate = FragmentProfileBinding.inflate(inflater, viewGroup, false);
        this.f6735f0 = fragmentProfileBindingInflate;
        kotlin.jvm.internal.i.b(fragmentProfileBindingInflate);
        ScrollView root = fragmentProfileBindingInflate.getRoot();
        kotlin.jvm.internal.i.d(root, "getRoot(...)");
        return root;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        this.f7510H = true;
        this.f6735f0 = null;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater layoutInflaterI = super.I(bundle);
        return layoutInflaterI.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterI, this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) throws Resources.NotFoundException {
        kotlin.jvm.internal.i.e(view, "view");
        this.f6737h0 = new C0824c(C0823b.f9386d);
        FragmentProfileBinding fragmentProfileBinding = this.f6735f0;
        kotlin.jvm.internal.i.b(fragmentProfileBinding);
        RecyclerView recyclerView = fragmentProfileBinding.recyclerCycles;
        S();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        C0824c c0824c = this.f6737h0;
        if (c0824c == null) {
            kotlin.jvm.internal.i.i("cyclesAdapter");
            throw null;
        }
        recyclerView.setAdapter(c0824c);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(2131100461);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.g(new C0662c(dimensionPixelSize, 2));
        }
        FragmentProfileBinding fragmentProfileBinding2 = this.f6735f0;
        kotlin.jvm.internal.i.b(fragmentProfileBinding2);
        MaterialButton btnSimulateCycleCompletion = fragmentProfileBinding2.btnSimulateCycleCompletion;
        kotlin.jvm.internal.i.d(btnSimulateCycleCompletion, "btnSimulateCycleCompletion");
        btnSimulateCycleCompletion.setVisibility(8);
        E.t(a0.g(t()), null, null, new C0809c(this, null), 3);
    }

    public final String Y(int i, int i5, int i6) throws Resources.NotFoundException {
        String quantityString = q().getQuantityString(2131755009, i5, Integer.valueOf(i5));
        kotlin.jvm.internal.i.d(quantityString, "getQuantityString(...)");
        String quantityString2 = q().getQuantityString(2131755009, i6, Integer.valueOf(i6));
        kotlin.jvm.internal.i.d(quantityString2, "getQuantityString(...)");
        String strS = s(i, quantityString, quantityString2);
        kotlin.jvm.internal.i.d(strS, "getString(...)");
        return strS;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f6732c0 == null) {
            synchronized (this.f6733d0) {
                try {
                    if (this.f6732c0 == null) {
                        this.f6732c0 = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f6732c0;
    }

    public final void a0() {
        if (this.f6730a0 == null) {
            this.f6730a0 = FragmentComponentManager.createContextWrapper(super.n(), this);
            this.f6731b0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.n());
        }
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
        if (super.n() == null && !this.f6731b0) {
            return null;
        }
        a0();
        return this.f6730a0;
    }
}
