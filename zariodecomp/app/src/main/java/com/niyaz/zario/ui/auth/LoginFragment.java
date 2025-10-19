package com.niyaz.zario.ui.auth;

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
import com.niyaz.zario.databinding.FragmentLoginBinding;
import com.niyaz.zario.ui.auth.LoginFragment;
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
import h3.k;
import h3.l;
import kotlin.jvm.internal.s;

@AndroidEntryPoint
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\ui\auth\LoginFragment.smali */
public final class LoginFragment extends AbstractComponentCallbacksC0567t implements GeneratedComponentManagerHolder {

    /* renamed from: a0, reason: collision with root package name */
    public ContextWrapper f6666a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6667b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile FragmentComponentManager f6668c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f6669d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6670e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public FragmentLoginBinding f6671f0;

    /* renamed from: g0, reason: collision with root package name */
    public final j f6672g0;

    /* renamed from: h0, reason: collision with root package name */
    public u f6673h0;

    /* renamed from: i0, reason: collision with root package name */
    public C0446b f6674i0;

    public LoginFragment() {
        g gVar = new g(this, 4);
        d[] dVarArr = d.f2276a;
        c cVarO = f.O(new g(gVar, 5));
        this.f6672g0 = new j(s.a(h3.c.class), new i(cVarO, 1), new b(3, this, cVarO), new i(cVarO, 2));
    }

    public static final void Y(LoginFragment loginFragment, boolean z4) {
        FragmentLoginBinding fragmentLoginBinding = loginFragment.f6671f0;
        kotlin.jvm.internal.i.b(fragmentLoginBinding);
        fragmentLoginBinding.btnLogin.setEnabled(!z4);
        FragmentLoginBinding fragmentLoginBinding2 = loginFragment.f6671f0;
        kotlin.jvm.internal.i.b(fragmentLoginBinding2);
        fragmentLoginBinding2.btnLogin.setText(z4 ? loginFragment.r(2131886137) : loginFragment.r(2131886330));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void B(Activity activity) {
        this.f7510H = true;
        ContextWrapper contextWrapper = this.f6666a0;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a0();
        if (this.f6670e0) {
            return;
        }
        this.f6670e0 = true;
        ((l) generatedComponent()).injectLoginFragment((LoginFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        super.C(context);
        a0();
        if (this.f6670e0) {
            return;
        }
        this.f6670e0 = true;
        ((l) generatedComponent()).injectLoginFragment((LoginFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        FragmentLoginBinding fragmentLoginBindingInflate = FragmentLoginBinding.inflate(inflater, viewGroup, false);
        this.f6671f0 = fragmentLoginBindingInflate;
        kotlin.jvm.internal.i.b(fragmentLoginBindingInflate);
        ScrollView root = fragmentLoginBindingInflate.getRoot();
        kotlin.jvm.internal.i.d(root, "getRoot(...)");
        return root;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        this.f7510H = true;
        this.f6671f0 = null;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater layoutInflaterI = super.I(bundle);
        return layoutInflaterI.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterI, this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        FragmentLoginBinding fragmentLoginBinding = this.f6671f0;
        kotlin.jvm.internal.i.b(fragmentLoginBinding);
        final int i = 0;
        fragmentLoginBinding.btnLogin.setOnClickListener(new View.OnClickListener(this) { // from class: h3.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f7731b;

            {
                this.f7731b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        LoginFragment loginFragment = this.f7731b;
                        FragmentLoginBinding fragmentLoginBinding2 = loginFragment.f6671f0;
                        kotlin.jvm.internal.i.b(fragmentLoginBinding2);
                        String email = e4.m.A0(String.valueOf(fragmentLoginBinding2.etEmail.getText())).toString();
                        FragmentLoginBinding fragmentLoginBinding3 = loginFragment.f6671f0;
                        kotlin.jvm.internal.i.b(fragmentLoginBinding3);
                        String strValueOf = String.valueOf(fragmentLoginBinding3.etPassword.getText());
                        c cVar = (c) loginFragment.f6672g0.getValue();
                        kotlin.jvm.internal.i.e(email, "email");
                        V2.q qVarC = cVar.c(email);
                        V2.q qVarD = cVar.d(strValueOf);
                        cVar.f7722f.L(qVarC.f3464b);
                        cVar.h.L(qVarD.f3464b);
                        if (qVarC.f3463a && qVarD.f3463a) {
                            E.t(a0.h(cVar), null, null, new C0594a(cVar, email, strValueOf, null), 3);
                            break;
                        }
                        break;
                    default:
                        S0.f.z(this.f7731b).h(2131230791, null);
                        break;
                }
            }
        });
        FragmentLoginBinding fragmentLoginBinding2 = this.f6671f0;
        kotlin.jvm.internal.i.b(fragmentLoginBinding2);
        final int i5 = 1;
        fragmentLoginBinding2.tvSignupLink.setOnClickListener(new View.OnClickListener(this) { // from class: h3.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f7731b;

            {
                this.f7731b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        LoginFragment loginFragment = this.f7731b;
                        FragmentLoginBinding fragmentLoginBinding22 = loginFragment.f6671f0;
                        kotlin.jvm.internal.i.b(fragmentLoginBinding22);
                        String email = e4.m.A0(String.valueOf(fragmentLoginBinding22.etEmail.getText())).toString();
                        FragmentLoginBinding fragmentLoginBinding3 = loginFragment.f6671f0;
                        kotlin.jvm.internal.i.b(fragmentLoginBinding3);
                        String strValueOf = String.valueOf(fragmentLoginBinding3.etPassword.getText());
                        c cVar = (c) loginFragment.f6672g0.getValue();
                        kotlin.jvm.internal.i.e(email, "email");
                        V2.q qVarC = cVar.c(email);
                        V2.q qVarD = cVar.d(strValueOf);
                        cVar.f7722f.L(qVarC.f3464b);
                        cVar.h.L(qVarD.f3464b);
                        if (qVarC.f3463a && qVarD.f3463a) {
                            E.t(a0.h(cVar), null, null, new C0594a(cVar, email, strValueOf, null), 3);
                            break;
                        }
                        break;
                    default:
                        S0.f.z(this.f7731b).h(2131230791, null);
                        break;
                }
            }
        });
        E.t(a0.g(t()), null, null, new k(this, null), 3);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f6668c0 == null) {
            synchronized (this.f6669d0) {
                try {
                    if (this.f6668c0 == null) {
                        this.f6668c0 = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f6668c0;
    }

    public final void a0() {
        if (this.f6666a0 == null) {
            this.f6666a0 = FragmentComponentManager.createContextWrapper(super.n(), this);
            this.f6667b0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.n());
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
        if (super.n() == null && !this.f6667b0) {
            return null;
        }
        a0();
        return this.f6666a0;
    }
}
