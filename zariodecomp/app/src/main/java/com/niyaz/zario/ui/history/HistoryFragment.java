package com.niyaz.zario.ui.history;

import C2.j;
import K3.c;
import K3.d;
import L3.t;
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
import b2.ViewOnClickListenerC0262a;
import com.niyaz.zario.databinding.FragmentHistoryBinding;
import d4.i;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import f4.E;
import g0.AbstractActivityC0570w;
import g0.AbstractComponentCallbacksC0567t;
import g0.C0535B;
import i4.I;
import java.time.ZoneId;
import k3.C0660a;
import k3.C0662c;
import k3.C0664e;
import k3.C0666g;
import k3.C0671l;
import k3.InterfaceC0665f;
import k3.q;
import k3.u;
import kotlin.jvm.internal.s;
import l3.C0730b;
import l3.C0733f;
import t0.C0896C;

@AndroidEntryPoint
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\ui\history\HistoryFragment.smali */
public final class HistoryFragment extends AbstractComponentCallbacksC0567t implements GeneratedComponentManagerHolder {

    /* renamed from: a0, reason: collision with root package name */
    public ContextWrapper f6699a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6700b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile FragmentComponentManager f6701c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f6702d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6703e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public FragmentHistoryBinding f6704f0;

    /* renamed from: g0, reason: collision with root package name */
    public final j f6705g0;

    /* renamed from: h0, reason: collision with root package name */
    public C0733f f6706h0;

    /* renamed from: i0, reason: collision with root package name */
    public C0730b f6707i0;

    /* renamed from: j0, reason: collision with root package name */
    public C0671l f6708j0;

    /* renamed from: k0, reason: collision with root package name */
    public final ZoneId f6709k0;

    /* renamed from: l0, reason: collision with root package name */
    public final C0535B f6710l0;

    public HistoryFragment() {
        g gVar = new g(this, 12);
        d[] dVarArr = d.f2276a;
        c cVarO = f.O(new g(gVar, 13));
        this.f6705g0 = new j(s.a(u.class), new i(cVarO, 9), new b(7, this, cVarO), new i(cVarO, 10));
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        kotlin.jvm.internal.i.d(zoneIdSystemDefault, "systemDefault(...)");
        this.f6709k0 = zoneIdSystemDefault;
        this.f6710l0 = new C0535B(2, this);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void B(Activity activity) {
        this.f7510H = true;
        ContextWrapper contextWrapper = this.f6699a0;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z();
        if (this.f6703e0) {
            return;
        }
        this.f6703e0 = true;
        ((InterfaceC0665f) generatedComponent()).injectHistoryFragment((HistoryFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        super.C(context);
        Z();
        if (this.f6703e0) {
            return;
        }
        this.f6703e0 = true;
        ((InterfaceC0665f) generatedComponent()).injectHistoryFragment((HistoryFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void D(Bundle bundle) {
        super.D(bundle);
        R().i().a(this, this.f6710l0);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        FragmentHistoryBinding fragmentHistoryBindingInflate = FragmentHistoryBinding.inflate(inflater, viewGroup, false);
        this.f6704f0 = fragmentHistoryBindingInflate;
        kotlin.jvm.internal.i.b(fragmentHistoryBindingInflate);
        ScrollView root = fragmentHistoryBindingInflate.getRoot();
        kotlin.jvm.internal.i.d(root, "getRoot(...)");
        return root;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        AbstractActivityC0570w abstractActivityC0570wL;
        this.f7510H = true;
        if (this.f7538p || ((abstractActivityC0570wL = l()) != null && abstractActivityC0570wL.isFinishing())) {
            u uVar = (u) this.f6705g0.getValue();
            uVar.i = L3.s.f2351a;
            uVar.f8364j = new C0666g(u.f(), t.f2352a);
            C0671l c0671lE = uVar.e();
            I i = uVar.f8363g;
            i.getClass();
            i.M(null, c0671lE);
        }
        this.f6704f0 = null;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater layoutInflaterI = super.I(bundle);
        return layoutInflaterI.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterI, this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void K() {
        this.f7510H = true;
        u uVar = (u) this.f6705g0.getValue();
        uVar.getClass();
        E.t(a0.h(uVar), null, null, new q(null, uVar), 3);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) throws Resources.NotFoundException {
        kotlin.jvm.internal.i.e(view, "view");
        FragmentHistoryBinding fragmentHistoryBinding = this.f6704f0;
        kotlin.jvm.internal.i.b(fragmentHistoryBinding);
        fragmentHistoryBinding.getRoot().setFocusableInTouchMode(true);
        FragmentHistoryBinding fragmentHistoryBinding2 = this.f6704f0;
        kotlin.jvm.internal.i.b(fragmentHistoryBinding2);
        fragmentHistoryBinding2.getRoot().requestFocus();
        this.f6706h0 = new C0733f(new C0660a(this, 0));
        FragmentHistoryBinding fragmentHistoryBinding3 = this.f6704f0;
        kotlin.jvm.internal.i.b(fragmentHistoryBinding3);
        RecyclerView recyclerView = fragmentHistoryBinding3.recyclerHistory;
        S();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        C0733f c0733f = this.f6706h0;
        if (c0733f == null) {
            kotlin.jvm.internal.i.i("todayUsageAdapter");
            throw null;
        }
        recyclerView.setAdapter(c0733f);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(2131100461);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.g(new C0662c(dimensionPixelSize, 1));
        }
        this.f6707i0 = new C0730b(q().getDimensionPixelSize(2131099814), q().getDimensionPixelSize(2131100463), new C0660a(this, 1));
        FragmentHistoryBinding fragmentHistoryBinding4 = this.f6704f0;
        kotlin.jvm.internal.i.b(fragmentHistoryBinding4);
        RecyclerView recyclerView2 = fragmentHistoryBinding4.recyclerHourlyChart;
        S();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0));
        C0730b c0730b = this.f6707i0;
        if (c0730b == null) {
            kotlin.jvm.internal.i.i("hourlyUsageAdapter");
            throw null;
        }
        recyclerView2.setAdapter(c0730b);
        recyclerView2.setHasFixedSize(true);
        int dimensionPixelSize2 = recyclerView2.getResources().getDimensionPixelSize(2131100461);
        if (recyclerView2.getItemDecorationCount() == 0) {
            recyclerView2.g(new C0662c(dimensionPixelSize2, 0));
        }
        new C0896C(0).a(recyclerView2);
        FragmentHistoryBinding fragmentHistoryBinding5 = this.f6704f0;
        kotlin.jvm.internal.i.b(fragmentHistoryBinding5);
        fragmentHistoryBinding5.btnDatePicker.setOnClickListener(new ViewOnClickListenerC0262a(this, 7));
        E.t(a0.g(t()), null, null, new C0664e(this, null), 3);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f6701c0 == null) {
            synchronized (this.f6702d0) {
                try {
                    if (this.f6701c0 == null) {
                        this.f6701c0 = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f6701c0;
    }

    public final void Z() {
        if (this.f6699a0 == null) {
            this.f6699a0 = FragmentComponentManager.createContextWrapper(super.n(), this);
            this.f6700b0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.n());
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
        if (super.n() == null && !this.f6700b0) {
            return null;
        }
        Z();
        return this.f6699a0;
    }
}
