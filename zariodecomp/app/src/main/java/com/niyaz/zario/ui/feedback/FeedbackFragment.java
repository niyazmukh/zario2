package com.niyaz.zario.ui.feedback;

import C2.j;
import K3.c;
import K3.d;
import O0.g;
import P0.b;
import S0.f;
import S2.u;
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
import com.niyaz.zario.databinding.FragmentFeedbackBinding;
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
import g0.C0535B;
import i3.C0601c;
import i3.C0602d;
import i3.C0605g;
import i3.InterfaceC0603e;
import kotlin.jvm.internal.s;

@AndroidEntryPoint
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\ui\feedback\FeedbackFragment.smali */
public final class FeedbackFragment extends AbstractComponentCallbacksC0567t implements GeneratedComponentManagerHolder {

    /* renamed from: a0, reason: collision with root package name */
    public ContextWrapper f6683a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6684b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile FragmentComponentManager f6685c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f6686d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6687e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public FragmentFeedbackBinding f6688f0;

    /* renamed from: g0, reason: collision with root package name */
    public final j f6689g0;

    /* renamed from: h0, reason: collision with root package name */
    public u f6690h0;

    /* renamed from: i0, reason: collision with root package name */
    public final C0535B f6691i0;

    public FeedbackFragment() {
        g gVar = new g(this, 8);
        d[] dVarArr = d.f2276a;
        c cVarO = f.O(new g(gVar, 9));
        this.f6689g0 = new j(s.a(C0605g.class), new i(cVarO, 5), new b(5, this, cVarO), new i(cVarO, 6));
        this.f6691i0 = new C0535B(1, this);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void B(Activity activity) {
        this.f7510H = true;
        ContextWrapper contextWrapper = this.f6683a0;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z();
        if (this.f6687e0) {
            return;
        }
        this.f6687e0 = true;
        ((InterfaceC0603e) generatedComponent()).injectFeedbackFragment((FeedbackFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        super.C(context);
        Z();
        if (this.f6687e0) {
            return;
        }
        this.f6687e0 = true;
        ((InterfaceC0603e) generatedComponent()).injectFeedbackFragment((FeedbackFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void D(Bundle bundle) {
        super.D(bundle);
        R().i().a(this, this.f6691i0);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        FragmentFeedbackBinding fragmentFeedbackBindingInflate = FragmentFeedbackBinding.inflate(inflater, viewGroup, false);
        this.f6688f0 = fragmentFeedbackBindingInflate;
        kotlin.jvm.internal.i.b(fragmentFeedbackBindingInflate);
        ScrollView root = fragmentFeedbackBindingInflate.getRoot();
        kotlin.jvm.internal.i.d(root, "getRoot(...)");
        return root;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        this.f7510H = true;
        this.f6688f0 = null;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater layoutInflaterI = super.I(bundle);
        return layoutInflaterI.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterI, this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        E.t(a0.g(t()), null, null, new C0602d(this, null), 3);
        FragmentFeedbackBinding fragmentFeedbackBinding = this.f6688f0;
        kotlin.jvm.internal.i.b(fragmentFeedbackBinding);
        fragmentFeedbackBinding.tvScreenTitle.setText(r(2131886248));
        FragmentFeedbackBinding fragmentFeedbackBinding2 = this.f6688f0;
        kotlin.jvm.internal.i.b(fragmentFeedbackBinding2);
        fragmentFeedbackBinding2.tvScreenSubtitle.setText(r(2131886247));
        FragmentFeedbackBinding fragmentFeedbackBinding3 = this.f6688f0;
        kotlin.jvm.internal.i.b(fragmentFeedbackBinding3);
        fragmentFeedbackBinding3.btnContinue.setOnClickListener(new ViewOnClickListenerC0262a(this, 5));
        E.t(a0.g(t()), null, null, new C0601c(this, null), 3);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f6685c0 == null) {
            synchronized (this.f6686d0) {
                try {
                    if (this.f6685c0 == null) {
                        this.f6685c0 = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f6685c0;
    }

    public final void Z() {
        if (this.f6683a0 == null) {
            this.f6683a0 = FragmentComponentManager.createContextWrapper(super.n(), this);
            this.f6684b0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.n());
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
        if (super.n() == null && !this.f6684b0) {
            return null;
        }
        Z();
        return this.f6683a0;
    }
}
