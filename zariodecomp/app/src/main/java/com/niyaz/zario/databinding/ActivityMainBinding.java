package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\ActivityMainBinding.smali */
public final class ActivityMainBinding implements ViewBinding {
    public final FragmentContainerView navHostFragment;
    private final ConstraintLayout rootView;

    private ActivityMainBinding(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.rootView = constraintLayout;
        this.navHostFragment = fragmentContainerView;
    }

    public static ActivityMainBinding bind(View view) {
        FragmentContainerView fragmentContainerView = (FragmentContainerView) b.q(view, 2131231070);
        if (fragmentContainerView != null) {
            return new ActivityMainBinding((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131231070)));
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427356, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
