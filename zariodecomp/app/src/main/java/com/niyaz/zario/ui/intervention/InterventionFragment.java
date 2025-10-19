package com.niyaz.zario.ui.intervention;

import C2.j;
import K3.c;
import K3.d;
import O0.g;
import P0.b;
import S0.f;
import S2.u;
import V2.k;
import V2.m;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b2.ViewOnClickListenerC0262a;
import com.niyaz.zario.databinding.FragmentInterventionBinding;
import d3.C0445a;
import d3.C0446b;
import d4.i;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import e3.o;
import f4.E;
import g0.AbstractComponentCallbacksC0567t;
import i4.I;
import kotlin.jvm.internal.s;
import m3.C0747a;
import m3.C0749c;
import m3.C0755i;
import m3.n;
import m3.q;
import u0.AbstractC0953A;

@AndroidEntryPoint
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\ui\intervention\InterventionFragment.smali */
public final class InterventionFragment extends AbstractComponentCallbacksC0567t implements GeneratedComponentManagerHolder {

    /* renamed from: a0, reason: collision with root package name */
    public ContextWrapper f6711a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6712b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile FragmentComponentManager f6713c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f6714d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6715e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public FragmentInterventionBinding f6716f0;

    /* renamed from: g0, reason: collision with root package name */
    public final j f6717g0;

    /* renamed from: h0, reason: collision with root package name */
    public o f6718h0;

    /* renamed from: i0, reason: collision with root package name */
    public u f6719i0;

    /* renamed from: j0, reason: collision with root package name */
    public C0446b f6720j0;

    /* renamed from: k0, reason: collision with root package name */
    public final C0749c f6721k0;

    public InterventionFragment() {
        g gVar = new g(this, 14);
        d[] dVarArr = d.f2276a;
        c cVarO = f.O(new g(gVar, 15));
        this.f6717g0 = new j(s.a(q.class), new i(cVarO, 11), new b(8, this, cVarO), new i(cVarO, 12));
        this.f6721k0 = new C0749c(true);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void B(Activity activity) {
        this.f7510H = true;
        ContextWrapper contextWrapper = this.f6711a0;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z();
        if (this.f6715e0) {
            return;
        }
        this.f6715e0 = true;
        ((m3.j) generatedComponent()).injectInterventionFragment((InterventionFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        super.C(context);
        Z();
        if (this.f6715e0) {
            return;
        }
        this.f6715e0 = true;
        ((m3.j) generatedComponent()).injectInterventionFragment((InterventionFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        FragmentInterventionBinding fragmentInterventionBindingInflate = FragmentInterventionBinding.inflate(inflater, viewGroup, false);
        this.f6716f0 = fragmentInterventionBindingInflate;
        kotlin.jvm.internal.i.b(fragmentInterventionBindingInflate);
        SwipeRefreshLayout root = fragmentInterventionBindingInflate.getRoot();
        kotlin.jvm.internal.i.d(root, "getRoot(...)");
        return root;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        this.f7510H = true;
        FragmentInterventionBinding fragmentInterventionBinding = this.f6716f0;
        kotlin.jvm.internal.i.b(fragmentInterventionBinding);
        Handler handler = fragmentInterventionBinding.swipeRefreshLayout.getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f6716f0 = null;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater layoutInflaterI = super.I(bundle);
        return layoutInflaterI.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterI, this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void K() {
        this.f7510H = true;
        C0446b c0446b = this.f6720j0;
        if (c0446b == null) {
            kotlin.jvm.internal.i.i("permissionsManager");
            throw null;
        }
        C0445a c0445aB = c0446b.b();
        if ((!c0445aB.f6798a || !c0445aB.f6799b) && w()) {
            AbstractC0953A.b(f.z(this), 2131230787);
        }
        q qVar = (q) this.f6717g0.getValue();
        qVar.getClass();
        E.t(a0.h(qVar), null, null, new n(qVar, null), 3);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        FragmentInterventionBinding fragmentInterventionBinding = this.f6716f0;
        kotlin.jvm.internal.i.b(fragmentInterventionBinding);
        fragmentInterventionBinding.getRoot().setFocusableInTouchMode(true);
        FragmentInterventionBinding fragmentInterventionBinding2 = this.f6716f0;
        kotlin.jvm.internal.i.b(fragmentInterventionBinding2);
        fragmentInterventionBinding2.getRoot().requestFocus();
        R().i().a(t(), this.f6721k0);
        FragmentInterventionBinding fragmentInterventionBinding3 = this.f6716f0;
        kotlin.jvm.internal.i.b(fragmentInterventionBinding3);
        fragmentInterventionBinding3.btnMenu.setOnClickListener(new ViewOnClickListenerC0262a(this, 8));
        FragmentInterventionBinding fragmentInterventionBinding4 = this.f6716f0;
        kotlin.jvm.internal.i.b(fragmentInterventionBinding4);
        SwipeRefreshLayout swipeRefreshLayout = fragmentInterventionBinding4.swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(2131034220, 2131034221, 2131034219);
        swipeRefreshLayout.setOnRefreshListener(new C0747a(this));
        E.t(a0.g(t()), null, null, new C0755i(this, null), 3);
        j jVar = this.f6717g0;
        if (((m) ((I) ((q) jVar.getValue()).f8901g.f7964a).K()) instanceof k) {
            ((q) jVar.getValue()).d();
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f6713c0 == null) {
            synchronized (this.f6714d0) {
                try {
                    if (this.f6713c0 == null) {
                        this.f6713c0 = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f6713c0;
    }

    public final void Z() {
        if (this.f6711a0 == null) {
            this.f6711a0 = FragmentComponentManager.createContextWrapper(super.n(), this);
            this.f6712b0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.n());
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
        if (super.n() == null && !this.f6712b0) {
            return null;
        }
        Z();
        return this.f6711a0;
    }
}
