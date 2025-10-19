package com.niyaz.zario.ui.about;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import b2.ViewOnClickListenerC0262a;
import com.niyaz.zario.databinding.FragmentAboutBinding;
import g0.AbstractComponentCallbacksC0567t;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\ui\about\AboutFragment.smali */
public final class AboutFragment extends AbstractComponentCallbacksC0567t {

    /* renamed from: a0, reason: collision with root package name */
    public FragmentAboutBinding f6665a0;

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater inflater, ViewGroup viewGroup) {
        i.e(inflater, "inflater");
        FragmentAboutBinding fragmentAboutBindingInflate = FragmentAboutBinding.inflate(inflater, viewGroup, false);
        this.f6665a0 = fragmentAboutBindingInflate;
        i.b(fragmentAboutBindingInflate);
        ScrollView root = fragmentAboutBindingInflate.getRoot();
        i.d(root, "getRoot(...)");
        return root;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void G() {
        this.f7510H = true;
        this.f6665a0 = null;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void O(View view) {
        i.e(view, "view");
        FragmentAboutBinding fragmentAboutBinding = this.f6665a0;
        i.b(fragmentAboutBinding);
        fragmentAboutBinding.btnContact.setOnClickListener(new ViewOnClickListenerC0262a(this, 4));
    }
}
