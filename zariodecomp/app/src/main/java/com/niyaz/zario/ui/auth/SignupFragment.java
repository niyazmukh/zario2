package com.niyaz.zario.ui.auth;

import C2.j;
import K3.c;
import K3.d;
import O0.g;
import P0.b;
import S0.f;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import com.niyaz.zario.databinding.FragmentSignupBinding;
import com.niyaz.zario.ui.auth.SignupFragment;
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
import h3.v;
import h3.w;
import java.time.LocalDate;
import kotlin.jvm.internal.s;

@AndroidEntryPoint
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\ui\auth\SignupFragment.smali */
public final class SignupFragment extends AbstractComponentCallbacksC0567t implements GeneratedComponentManagerHolder {

    /* renamed from: a0, reason: collision with root package name */
    public ContextWrapper f6675a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6676b0;

    /* renamed from: c0, reason: collision with root package name */
    public volatile FragmentComponentManager f6677c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f6678d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6679e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public FragmentSignupBinding f6680f0;

    /* renamed from: g0, reason: collision with root package name */
    public final j f6681g0;

    /* renamed from: h0, reason: collision with root package name */
    public o f6682h0;

    public SignupFragment() {
        g gVar = new g(this, 6);
        d[] dVarArr = d.f2276a;
        c cVarO = f.O(new g(gVar, 7));
        this.f6681g0 = new j(s.a(h3.c.class), new i(cVarO, 3), new b(4, this, cVarO), new i(cVarO, 4));
    }

    public static final void Y(SignupFragment signupFragment, boolean z4) {
        FragmentSignupBinding fragmentSignupBinding = signupFragment.f6680f0;
        kotlin.jvm.internal.i.b(fragmentSignupBinding);
        fragmentSignupBinding.btnSignup.setEnabled(!z4);
        FragmentSignupBinding fragmentSignupBinding2 = signupFragment.f6680f0;
        kotlin.jvm.internal.i.b(fragmentSignupBinding2);
        fragmentSignupBinding2.btnSignup.setText(z4 ? signupFragment.r(2131886131) : signupFragment.r(2131886494));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void B(Activity activity) {
        this.f7510H = true;
        ContextWrapper contextWrapper = this.f6675a0;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b0();
        if (this.f6679e0) {
            return;
        }
        this.f6679e0 = true;
        ((w) generatedComponent()).injectSignupFragment((SignupFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        super.C(context);
        b0();
        if (this.f6679e0) {
            return;
        }
        this.f6679e0 = true;
        ((w) generatedComponent()).injectSignupFragment((SignupFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        FragmentSignupBinding fragmentSignupBindingInflate = FragmentSignupBinding.inflate(inflater, viewGroup, false);
        this.f6680f0 = fragmentSignupBindingInflate;
        kotlin.jvm.internal.i.b(fragmentSignupBindingInflate);
        ScrollView root = fragmentSignupBindingInflate.getRoot();
        kotlin.jvm.internal.i.d(root, "getRoot(...)");
        return root;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        this.f7510H = true;
        this.f6680f0 = null;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater layoutInflaterI = super.I(bundle);
        return layoutInflaterI.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflaterI, this));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        FragmentSignupBinding fragmentSignupBinding = this.f6680f0;
        kotlin.jvm.internal.i.b(fragmentSignupBinding);
        final int i = 0;
        fragmentSignupBinding.btnSignup.setOnClickListener(new View.OnClickListener(this) { // from class: h3.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignupFragment f7749b;

            {
                this.f7749b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws NumberFormatException {
                V2.q qVar;
                int i5;
                switch (i) {
                    case 0:
                        SignupFragment signupFragment = this.f7749b;
                        FragmentSignupBinding fragmentSignupBinding2 = signupFragment.f6680f0;
                        kotlin.jvm.internal.i.b(fragmentSignupBinding2);
                        String yearOfBirth = e4.m.A0(String.valueOf(fragmentSignupBinding2.etYearOfBirth.getText())).toString();
                        FragmentSignupBinding fragmentSignupBinding3 = signupFragment.f6680f0;
                        kotlin.jvm.internal.i.b(fragmentSignupBinding3);
                        String gender = e4.m.A0(fragmentSignupBinding3.etGender.getText().toString()).toString();
                        FragmentSignupBinding fragmentSignupBinding4 = signupFragment.f6680f0;
                        kotlin.jvm.internal.i.b(fragmentSignupBinding4);
                        String email = e4.m.A0(String.valueOf(fragmentSignupBinding4.etEmail.getText())).toString();
                        FragmentSignupBinding fragmentSignupBinding5 = signupFragment.f6680f0;
                        kotlin.jvm.internal.i.b(fragmentSignupBinding5);
                        String strValueOf = String.valueOf(fragmentSignupBinding5.etPassword.getText());
                        FragmentSignupBinding fragmentSignupBinding6 = signupFragment.f6680f0;
                        kotlin.jvm.internal.i.b(fragmentSignupBinding6);
                        String strValueOf2 = String.valueOf(fragmentSignupBinding6.etConfirmPassword.getText());
                        c cVarA0 = signupFragment.a0();
                        kotlin.jvm.internal.i.e(yearOfBirth, "yearOfBirth");
                        kotlin.jvm.internal.i.e(gender, "gender");
                        kotlin.jvm.internal.i.e(email, "email");
                        int length = yearOfBirth.length();
                        Context context = cVarA0.f7717a;
                        if (length == 0) {
                            qVar = new V2.q(context.getString(2131886209), false);
                        } else {
                            try {
                                i5 = Integer.parseInt(yearOfBirth);
                            } catch (NumberFormatException unused) {
                            }
                            qVar = (1900 > i5 || i5 > LocalDate.now().getYear()) ? new V2.q(context.getString(2131886213), false) : new V2.q();
                        }
                        V2.q qVar2 = gender.length() == 0 ? new V2.q(context.getString(2131886205), false) : new V2.q();
                        V2.q qVarC = cVarA0.c(email);
                        V2.q qVarD = cVarA0.d(strValueOf);
                        V2.q qVar3 = strValueOf2.length() == 0 ? new V2.q(context.getString(2131886206), false) : !strValueOf.equals(strValueOf2) ? new V2.q(context.getString(2131886217), false) : new V2.q();
                        cVarA0.f7726l.L(qVar.f3464b);
                        cVarA0.f7728n.L(qVar2.f3464b);
                        cVarA0.f7722f.L(qVarC.f3464b);
                        cVarA0.h.L(qVarD.f3464b);
                        cVarA0.f7724j.L(qVar3.f3464b);
                        if (qVar.f3463a && qVar2.f3463a && qVarC.f3463a && qVarD.f3463a && qVar3.f3463a) {
                            E.t(a0.h(cVarA0), null, null, new C0595b(cVarA0, email, strValueOf, yearOfBirth, gender, null), 3);
                            break;
                        }
                        break;
                    default:
                        S0.f.z(this.f7749b).h(2131230801, null);
                        break;
                }
            }
        });
        FragmentSignupBinding fragmentSignupBinding2 = this.f6680f0;
        kotlin.jvm.internal.i.b(fragmentSignupBinding2);
        final int i5 = 1;
        fragmentSignupBinding2.tvSigninLink.setOnClickListener(new View.OnClickListener(this) { // from class: h3.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignupFragment f7749b;

            {
                this.f7749b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws NumberFormatException {
                V2.q qVar;
                int i52;
                switch (i5) {
                    case 0:
                        SignupFragment signupFragment = this.f7749b;
                        FragmentSignupBinding fragmentSignupBinding22 = signupFragment.f6680f0;
                        kotlin.jvm.internal.i.b(fragmentSignupBinding22);
                        String yearOfBirth = e4.m.A0(String.valueOf(fragmentSignupBinding22.etYearOfBirth.getText())).toString();
                        FragmentSignupBinding fragmentSignupBinding3 = signupFragment.f6680f0;
                        kotlin.jvm.internal.i.b(fragmentSignupBinding3);
                        String gender = e4.m.A0(fragmentSignupBinding3.etGender.getText().toString()).toString();
                        FragmentSignupBinding fragmentSignupBinding4 = signupFragment.f6680f0;
                        kotlin.jvm.internal.i.b(fragmentSignupBinding4);
                        String email = e4.m.A0(String.valueOf(fragmentSignupBinding4.etEmail.getText())).toString();
                        FragmentSignupBinding fragmentSignupBinding5 = signupFragment.f6680f0;
                        kotlin.jvm.internal.i.b(fragmentSignupBinding5);
                        String strValueOf = String.valueOf(fragmentSignupBinding5.etPassword.getText());
                        FragmentSignupBinding fragmentSignupBinding6 = signupFragment.f6680f0;
                        kotlin.jvm.internal.i.b(fragmentSignupBinding6);
                        String strValueOf2 = String.valueOf(fragmentSignupBinding6.etConfirmPassword.getText());
                        c cVarA0 = signupFragment.a0();
                        kotlin.jvm.internal.i.e(yearOfBirth, "yearOfBirth");
                        kotlin.jvm.internal.i.e(gender, "gender");
                        kotlin.jvm.internal.i.e(email, "email");
                        int length = yearOfBirth.length();
                        Context context = cVarA0.f7717a;
                        if (length == 0) {
                            qVar = new V2.q(context.getString(2131886209), false);
                        } else {
                            try {
                                i52 = Integer.parseInt(yearOfBirth);
                            } catch (NumberFormatException unused) {
                            }
                            qVar = (1900 > i52 || i52 > LocalDate.now().getYear()) ? new V2.q(context.getString(2131886213), false) : new V2.q();
                        }
                        V2.q qVar2 = gender.length() == 0 ? new V2.q(context.getString(2131886205), false) : new V2.q();
                        V2.q qVarC = cVarA0.c(email);
                        V2.q qVarD = cVarA0.d(strValueOf);
                        V2.q qVar3 = strValueOf2.length() == 0 ? new V2.q(context.getString(2131886206), false) : !strValueOf.equals(strValueOf2) ? new V2.q(context.getString(2131886217), false) : new V2.q();
                        cVarA0.f7726l.L(qVar.f3464b);
                        cVarA0.f7728n.L(qVar2.f3464b);
                        cVarA0.f7722f.L(qVarC.f3464b);
                        cVarA0.h.L(qVarD.f3464b);
                        cVarA0.f7724j.L(qVar3.f3464b);
                        if (qVar.f3463a && qVar2.f3463a && qVarC.f3463a && qVarD.f3463a && qVar3.f3463a) {
                            E.t(a0.h(cVarA0), null, null, new C0595b(cVarA0, email, strValueOf, yearOfBirth, gender, null), 3);
                            break;
                        }
                        break;
                    default:
                        S0.f.z(this.f7749b).h(2131230801, null);
                        break;
                }
            }
        });
        ArrayAdapter arrayAdapter = new ArrayAdapter(S(), R.layout.simple_dropdown_item_1line, new String[]{r(2131886267), r(2131886265), r(2131886268), r(2131886269)});
        FragmentSignupBinding fragmentSignupBinding3 = this.f6680f0;
        kotlin.jvm.internal.i.b(fragmentSignupBinding3);
        fragmentSignupBinding3.etGender.setAdapter(arrayAdapter);
        E.t(a0.g(t()), null, null, new v(this, null), 3);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f6677c0 == null) {
            synchronized (this.f6678d0) {
                try {
                    if (this.f6677c0 == null) {
                        this.f6677c0 = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f6677c0;
    }

    public final h3.c a0() {
        return (h3.c) this.f6681g0.getValue();
    }

    public final void b0() {
        if (this.f6675a0 == null) {
            this.f6675a0 = FragmentComponentManager.createContextWrapper(super.n(), this);
            this.f6676b0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.n());
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
        if (super.n() == null && !this.f6676b0) {
            return null;
        }
        b0();
        return this.f6675a0;
    }
}
