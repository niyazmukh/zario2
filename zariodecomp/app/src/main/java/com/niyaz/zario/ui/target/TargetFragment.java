package com.niyaz.zario.ui.target;

import C2.j;
import K3.c;
import K3.d;
import O0.g;
import P0.b;
import S0.f;
import S2.u;
import V2.n;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import com.niyaz.zario.databinding.FragmentTargetBinding;
import com.niyaz.zario.ui.target.TargetFragment;
import com.niyaz.zario.worker.MonitoringWorkScheduler;
import d3.C0446b;
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
import kotlin.jvm.internal.s;
import r3.e;
import r3.m;

@AndroidEntryPoint
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\ui\target\TargetFragment.smali */
public final class TargetFragment extends AbstractComponentCallbacksC0567t implements GeneratedComponentManagerHolder {

    /* renamed from: a0, reason: collision with root package name */
    public ContextWrapper f6747a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6748b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile FragmentComponentManager f6749c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f6750d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6751e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public FragmentTargetBinding f6752f0;

    /* renamed from: g0, reason: collision with root package name */
    public final j f6753g0;

    /* renamed from: h0, reason: collision with root package name */
    public u f6754h0;

    /* renamed from: i0, reason: collision with root package name */
    public C0446b f6755i0;

    /* renamed from: j0, reason: collision with root package name */
    public MonitoringWorkScheduler f6756j0;

    public TargetFragment() {
        g gVar = new g(this, 20);
        d[] dVarArr = d.f2276a;
        c cVarO = f.O(new g(gVar, 21));
        this.f6753g0 = new j(s.a(m.class), new i(cVarO, 15), new b(12, this, cVarO), new i(cVarO, 16));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void B(Activity activity) {
        this.f7510H = true;
        ContextWrapper contextWrapper = this.f6747a0;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a0();
        if (this.f6751e0) {
            return;
        }
        this.f6751e0 = true;
        ((r3.f) generatedComponent()).injectTargetFragment((TargetFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        super.C(context);
        a0();
        if (this.f6751e0) {
            return;
        }
        this.f6751e0 = true;
        ((r3.f) generatedComponent()).injectTargetFragment((TargetFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        FragmentTargetBinding fragmentTargetBindingInflate = FragmentTargetBinding.inflate(inflater, viewGroup, false);
        this.f6752f0 = fragmentTargetBindingInflate;
        kotlin.jvm.internal.i.b(fragmentTargetBindingInflate);
        ScrollView root = fragmentTargetBindingInflate.getRoot();
        kotlin.jvm.internal.i.d(root, "getRoot(...)");
        return root;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        this.f7510H = true;
        this.f6752f0 = null;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater layoutInflaterI = super.I(bundle);
        return layoutInflaterI.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterI, this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void K() {
        this.f7510H = true;
        Z().b();
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        FragmentTargetBinding fragmentTargetBinding = this.f6752f0;
        kotlin.jvm.internal.i.b(fragmentTargetBinding);
        fragmentTargetBinding.getRoot().setFocusableInTouchMode(true);
        FragmentTargetBinding fragmentTargetBinding2 = this.f6752f0;
        kotlin.jvm.internal.i.b(fragmentTargetBinding2);
        fragmentTargetBinding2.getRoot().requestFocus();
        FragmentTargetBinding fragmentTargetBinding3 = this.f6752f0;
        kotlin.jvm.internal.i.b(fragmentTargetBinding3);
        final int i = 0;
        fragmentTargetBinding3.buttonRetry.setOnClickListener(new View.OnClickListener(this) { // from class: r3.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetFragment f9638b;

            {
                this.f9638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f9638b.Z().c();
                        return;
                    case 1:
                        TargetFragment targetFragment = this.f9638b;
                        C0446b c0446b = targetFragment.f6755i0;
                        if (c0446b == null) {
                            kotlin.jvm.internal.i.i("permissionsManager");
                            throw null;
                        }
                        if (c0446b.b().f6798a) {
                            targetFragment.Z().b();
                            return;
                        } else {
                            targetFragment.X(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                            return;
                        }
                    default:
                        TargetFragment targetFragment2 = this.f9638b;
                        m mVarZ = targetFragment2.Z();
                        n nVar = new n(mVarZ.f9663f, mVarZ.f9662e, (String) null, System.currentTimeMillis(), 20);
                        MonitoringWorkScheduler monitoringWorkScheduler = targetFragment2.f6756j0;
                        if (monitoringWorkScheduler == null) {
                            kotlin.jvm.internal.i.i("monitoringWorkScheduler");
                            throw null;
                        }
                        monitoringWorkScheduler.cancelMonitoring();
                        MonitoringWorkScheduler monitoringWorkScheduler2 = targetFragment2.f6756j0;
                        if (monitoringWorkScheduler2 == null) {
                            kotlin.jvm.internal.i.i("monitoringWorkScheduler");
                            throw null;
                        }
                        monitoringWorkScheduler2.cancelScheduler();
                        E.t(a0.g(targetFragment2.t()), null, null, new c(targetFragment2, nVar, null), 3);
                        return;
                }
            }
        });
        FragmentTargetBinding fragmentTargetBinding4 = this.f6752f0;
        kotlin.jvm.internal.i.b(fragmentTargetBinding4);
        final int i5 = 1;
        fragmentTargetBinding4.buttonGrantPermission.setOnClickListener(new View.OnClickListener(this) { // from class: r3.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetFragment f9638b;

            {
                this.f9638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        this.f9638b.Z().c();
                        return;
                    case 1:
                        TargetFragment targetFragment = this.f9638b;
                        C0446b c0446b = targetFragment.f6755i0;
                        if (c0446b == null) {
                            kotlin.jvm.internal.i.i("permissionsManager");
                            throw null;
                        }
                        if (c0446b.b().f6798a) {
                            targetFragment.Z().b();
                            return;
                        } else {
                            targetFragment.X(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                            return;
                        }
                    default:
                        TargetFragment targetFragment2 = this.f9638b;
                        m mVarZ = targetFragment2.Z();
                        n nVar = new n(mVarZ.f9663f, mVarZ.f9662e, (String) null, System.currentTimeMillis(), 20);
                        MonitoringWorkScheduler monitoringWorkScheduler = targetFragment2.f6756j0;
                        if (monitoringWorkScheduler == null) {
                            kotlin.jvm.internal.i.i("monitoringWorkScheduler");
                            throw null;
                        }
                        monitoringWorkScheduler.cancelMonitoring();
                        MonitoringWorkScheduler monitoringWorkScheduler2 = targetFragment2.f6756j0;
                        if (monitoringWorkScheduler2 == null) {
                            kotlin.jvm.internal.i.i("monitoringWorkScheduler");
                            throw null;
                        }
                        monitoringWorkScheduler2.cancelScheduler();
                        E.t(a0.g(targetFragment2.t()), null, null, new c(targetFragment2, nVar, null), 3);
                        return;
                }
            }
        });
        FragmentTargetBinding fragmentTargetBinding5 = this.f6752f0;
        kotlin.jvm.internal.i.b(fragmentTargetBinding5);
        final int i6 = 2;
        fragmentTargetBinding5.btnConfirmTarget.setOnClickListener(new View.OnClickListener(this) { // from class: r3.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetFragment f9638b;

            {
                this.f9638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        this.f9638b.Z().c();
                        return;
                    case 1:
                        TargetFragment targetFragment = this.f9638b;
                        C0446b c0446b = targetFragment.f6755i0;
                        if (c0446b == null) {
                            kotlin.jvm.internal.i.i("permissionsManager");
                            throw null;
                        }
                        if (c0446b.b().f6798a) {
                            targetFragment.Z().b();
                            return;
                        } else {
                            targetFragment.X(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                            return;
                        }
                    default:
                        TargetFragment targetFragment2 = this.f9638b;
                        m mVarZ = targetFragment2.Z();
                        n nVar = new n(mVarZ.f9663f, mVarZ.f9662e, (String) null, System.currentTimeMillis(), 20);
                        MonitoringWorkScheduler monitoringWorkScheduler = targetFragment2.f6756j0;
                        if (monitoringWorkScheduler == null) {
                            kotlin.jvm.internal.i.i("monitoringWorkScheduler");
                            throw null;
                        }
                        monitoringWorkScheduler.cancelMonitoring();
                        MonitoringWorkScheduler monitoringWorkScheduler2 = targetFragment2.f6756j0;
                        if (monitoringWorkScheduler2 == null) {
                            kotlin.jvm.internal.i.i("monitoringWorkScheduler");
                            throw null;
                        }
                        monitoringWorkScheduler2.cancelScheduler();
                        E.t(a0.g(targetFragment2.t()), null, null, new c(targetFragment2, nVar, null), 3);
                        return;
                }
            }
        });
        E.t(a0.g(t()), null, null, new e(this, null), 3);
        Z().b();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f6749c0 == null) {
            synchronized (this.f6750d0) {
                try {
                    if (this.f6749c0 == null) {
                        this.f6749c0 = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f6749c0;
    }

    public final m Z() {
        return (m) this.f6753g0.getValue();
    }

    public final void a0() {
        if (this.f6747a0 == null) {
            this.f6747a0 = FragmentComponentManager.createContextWrapper(super.n(), this);
            this.f6748b0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.n());
        }
    }

    public final void b0(String str) {
        FragmentTargetBinding fragmentTargetBinding = this.f6752f0;
        kotlin.jvm.internal.i.b(fragmentTargetBinding);
        fragmentTargetBinding.progressBar.setVisibility(8);
        fragmentTargetBinding.textViewLoading.setVisibility(8);
        fragmentTargetBinding.cardGoalSummary.setVisibility(8);
        fragmentTargetBinding.textViewError.setVisibility(0);
        fragmentTargetBinding.textViewError.setText(str);
        fragmentTargetBinding.buttonRetry.setVisibility(0);
        fragmentTargetBinding.buttonGrantPermission.setVisibility(8);
        FragmentTargetBinding fragmentTargetBinding2 = this.f6752f0;
        kotlin.jvm.internal.i.b(fragmentTargetBinding2);
        fragmentTargetBinding2.btnConfirmTarget.setEnabled(false);
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
        if (super.n() == null && !this.f6748b0) {
            return null;
        }
        a0();
        return this.f6747a0;
    }
}
