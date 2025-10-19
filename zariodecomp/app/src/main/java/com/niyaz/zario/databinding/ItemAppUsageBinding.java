package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\ItemAppUsageBinding.smali */
public final class ItemAppUsageBinding implements ViewBinding {
    public final ImageView ivAppIcon;
    private final MaterialCardView rootView;
    public final TextView tvAppName;
    public final TextView tvTotalTime;

    private ItemAppUsageBinding(MaterialCardView materialCardView, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = materialCardView;
        this.ivAppIcon = imageView;
        this.tvAppName = textView;
        this.tvTotalTime = textView2;
    }

    public static ItemAppUsageBinding bind(View view) {
        int i = 2131230984;
        ImageView imageView = (ImageView) b.q(view, 2131230984);
        if (imageView != null) {
            i = 2131231263;
            TextView textView = (TextView) b.q(view, 2131231263);
            if (textView != null) {
                i = 2131231321;
                TextView textView2 = (TextView) b.q(view, 2131231321);
                if (textView2 != null) {
                    return new ItemAppUsageBinding((MaterialCardView) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemAppUsageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAppUsageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427388, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
