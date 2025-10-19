package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\FragmentSplashBinding.smali */
public final class FragmentSplashBinding implements ViewBinding {
    private final FrameLayout rootView;

    private FragmentSplashBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    public static FragmentSplashBinding bind(View view) {
        if (view != null) {
            return new FragmentSplashBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static FragmentSplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427384, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
