package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\ItemTodayUsageEntryBinding.smali */
public final class ItemTodayUsageEntryBinding implements ViewBinding {
    public final ShapeableImageView ivAppIcon;
    private final LinearLayout rootView;
    public final TextView tvAppLabel;
    public final TextView tvUsageDuration;

    private ItemTodayUsageEntryBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.ivAppIcon = shapeableImageView;
        this.tvAppLabel = textView;
        this.tvUsageDuration = textView2;
    }

    public static ItemTodayUsageEntryBinding bind(View view) {
        int i = 2131230984;
        ShapeableImageView shapeableImageView = (ShapeableImageView) b.q(view, 2131230984);
        if (shapeableImageView != null) {
            i = 2131231262;
            TextView textView = (TextView) b.q(view, 2131231262);
            if (textView != null) {
                i = 2131231323;
                TextView textView2 = (TextView) b.q(view, 2131231323);
                if (textView2 != null) {
                    return new ItemTodayUsageEntryBinding((LinearLayout) view, shapeableImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemTodayUsageEntryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTodayUsageEntryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427392, viewGroup, false);
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
