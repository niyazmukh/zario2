package androidx.navigation.fragment;

import K3.h;
import O0.g;
import S0.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import g0.AbstractComponentCallbacksC0567t;
import g0.C0549a;
import kotlin.jvm.internal.i;
import o0.C0767B;
import o0.P;
import q0.n;
import r1.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\navigation\fragment\NavHostFragment.smali */
public class NavHostFragment extends AbstractComponentCallbacksC0567t {

    /* renamed from: a0, reason: collision with root package name */
    public final h f4680a0 = f.P(new g(this, 19));

    /* renamed from: b0, reason: collision with root package name */
    public View f4681b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f4682c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4683d0;

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void C(Context context) {
        i.e(context, "context");
        super.C(context);
        if (this.f4683d0) {
            C0549a c0549a = new C0549a(p());
            c0549a.g(this);
            c0549a.d(false);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void D(Bundle bundle) {
        Y();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f4683d0 = true;
            C0549a c0549a = new C0549a(p());
            c0549a.g(this);
            c0549a.d(false);
        }
        super.D(bundle);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        i.e(inflater, "inflater");
        Context context = inflater.getContext();
        i.d(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i = this.f7504A;
        if (i == 0 || i == -1) {
            i = 2131231071;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        this.f7510H = true;
        View view = this.f4681b0;
        if (view != null && d.u(view) == Y()) {
            view.setTag(2131231068, null);
        }
        this.f4681b0 = null;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void J(Context context, AttributeSet attrs, Bundle bundle) {
        i.e(context, "context");
        i.e(attrs, "attrs");
        super.J(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, P.f9039b);
        i.d(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f4682c0 = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, n.f9466c);
        i.d(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.f4683d0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void L(Bundle bundle) {
        if (this.f4683d0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) {
        i.e(view, "view");
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        view.setTag(2131231068, Y());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            i.c(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f4681b0 = view2;
            if (view2.getId() == this.f7504A) {
                View view3 = this.f4681b0;
                i.b(view3);
                view3.setTag(2131231068, Y());
            }
        }
    }

    public final C0767B Y() {
        return (C0767B) this.f4680a0.getValue();
    }
}
