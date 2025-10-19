package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\ItemProfileCycleBinding.smali */
public final class ItemProfileCycleBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final TextView tvCycleDate;
    public final TextView tvCyclePoints;
    public final TextView tvCycleStatus;

    private ItemProfileCycleBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.tvCycleDate = textView;
        this.tvCyclePoints = textView2;
        this.tvCycleStatus = textView3;
    }

    public static ItemProfileCycleBinding bind(View view) {
        int i = 2131231269;
        TextView textView = (TextView) b.q(view, 2131231269);
        if (textView != null) {
            i = 2131231271;
            TextView textView2 = (TextView) b.q(view, 2131231271);
            if (textView2 != null) {
                i = 2131231272;
                TextView textView3 = (TextView) b.q(view, 2131231272);
                if (textView3 != null) {
                    return new ItemProfileCycleBinding((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemProfileCycleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemProfileCycleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427391, viewGroup, false);
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
