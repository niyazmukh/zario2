package com.niyaz.zario.ui.splash;

import A2.RunnableC0015o;
import S0.f;
import S2.u;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import d3.C0446b;
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
import kotlin.jvm.internal.i;
import q3.C0852b;
import q3.InterfaceC0853c;

@AndroidEntryPoint
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\ui\splash\SplashFragment.smali */
public final class SplashFragment extends AbstractComponentCallbacksC0567t implements GeneratedComponentManagerHolder {

    /* renamed from: a0, reason: collision with root package name */
    public ContextWrapper f6739a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6740b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile FragmentComponentManager f6741c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f6742d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6743e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public o f6744f0;

    /* renamed from: g0, reason: collision with root package name */
    public u f6745g0;

    /* renamed from: h0, reason: collision with root package name */
    public C0446b f6746h0;

    public static final void Y(SplashFragment splashFragment, int i) {
        if (splashFragment.w()) {
            if (i.a(Looper.myLooper(), Looper.getMainLooper())) {
                f.z(splashFragment).h(i, null);
                return;
            }
            View view = splashFragment.f7512J;
            if (view != null) {
                view.post(new RunnableC0015o(splashFragment, i, 3));
            }
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void B(Activity activity) {
        this.f7510H = true;
        ContextWrapper contextWrapper = this.f6739a0;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a0();
        if (this.f6743e0) {
            return;
        }
        this.f6743e0 = true;
        ((InterfaceC0853c) generatedComponent()).injectSplashFragment((SplashFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        super.C(context);
        a0();
        if (this.f6743e0) {
            return;
        }
        this.f6743e0 = true;
        ((InterfaceC0853c) generatedComponent()).injectSplashFragment((SplashFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        i.e(inflater, "inflater");
        return inflater.inflate(2131427384, viewGroup, false);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater layoutInflaterI = super.I(bundle);
        return layoutInflaterI.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterI, this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) {
        i.e(view, "view");
        E.t(a0.g(this), null, null, new C0852b(this, null), 3);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f6741c0 == null) {
            synchronized (this.f6742d0) {
                try {
                    if (this.f6741c0 == null) {
                        this.f6741c0 = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f6741c0;
    }

    public final void a0() {
        if (this.f6739a0 == null) {
            this.f6739a0 = FragmentComponentManager.createContextWrapper(super.n(), this);
            this.f6740b0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.n());
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
        if (super.n() == null && !this.f6740b0) {
            return null;
        }
        a0();
        return this.f6739a0;
    }
}
