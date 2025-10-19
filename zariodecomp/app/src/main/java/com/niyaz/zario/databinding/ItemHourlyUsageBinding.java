package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\ItemHourlyUsageBinding.smali */
public final class ItemHourlyUsageBinding implements ViewBinding {
    public final FrameLayout barContainer;
    private final LinearLayout rootView;
    public final TextView tvDuration;
    public final TextView tvHour;
    public final View viewBar;

    private ItemHourlyUsageBinding(LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, TextView textView2, View view) {
        this.rootView = linearLayout;
        this.barContainer = frameLayout;
        this.tvDuration = textView;
        this.tvHour = textView2;
        this.viewBar = view;
    }

    public static ItemHourlyUsageBinding bind(View view) {
        int i = 2131230830;
        FrameLayout frameLayout = (FrameLayout) b.q(view, 2131230830);
        if (frameLayout != null) {
            i = 2131231278;
            TextView textView = (TextView) b.q(view, 2131231278);
            if (textView != null) {
                i = 2131231291;
                TextView textView2 = (TextView) b.q(view, 2131231291);
                if (textView2 != null) {
                    i = 2131231333;
                    View viewQ = b.q(view, 2131231333);
                    if (viewQ != null) {
                        return new ItemHourlyUsageBinding((LinearLayout) view, frameLayout, textView, textView2, viewQ);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemHourlyUsageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHourlyUsageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427390, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
