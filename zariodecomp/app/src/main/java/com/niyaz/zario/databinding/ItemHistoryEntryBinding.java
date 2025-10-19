package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\ItemHistoryEntryBinding.smali */
public final class ItemHistoryEntryBinding implements ViewBinding {
    public final MaterialCardView cardStatusBadge;
    public final ImageView ivAppIcon;
    public final LinearLayout layoutUsageInfo;
    public final LinearProgressIndicator progressUsage;
    private final MaterialCardView rootView;
    public final TextView tvAppName;
    public final TextView tvEvaluationDate;
    public final TextView tvEvaluationDuration;
    public final TextView tvStatusBadge;
    public final TextView tvUsagePercentage;
    public final TextView tvUsageVsGoal;

    private ItemHistoryEntryBinding(MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, LinearLayout linearLayout, LinearProgressIndicator linearProgressIndicator, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = materialCardView;
        this.cardStatusBadge = materialCardView2;
        this.ivAppIcon = imageView;
        this.layoutUsageInfo = linearLayout;
        this.progressUsage = linearProgressIndicator;
        this.tvAppName = textView;
        this.tvEvaluationDate = textView2;
        this.tvEvaluationDuration = textView3;
        this.tvStatusBadge = textView4;
        this.tvUsagePercentage = textView5;
        this.tvUsageVsGoal = textView6;
    }

    public static ItemHistoryEntryBinding bind(View view) {
        int i = 2131230860;
        MaterialCardView materialCardView = (MaterialCardView) b.q(view, 2131230860);
        if (materialCardView != null) {
            i = 2131230984;
            ImageView imageView = (ImageView) b.q(view, 2131230984);
            if (imageView != null) {
                i = 2131230992;
                LinearLayout linearLayout = (LinearLayout) b.q(view, 2131230992);
                if (linearLayout != null) {
                    i = 2131231127;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) b.q(view, 2131231127);
                    if (linearProgressIndicator != null) {
                        i = 2131231263;
                        TextView textView = (TextView) b.q(view, 2131231263);
                        if (textView != null) {
                            i = 2131231285;
                            TextView textView2 = (TextView) b.q(view, 2131231285);
                            if (textView2 != null) {
                                i = 2131231286;
                                TextView textView3 = (TextView) b.q(view, 2131231286);
                                if (textView3 != null) {
                                    i = 2131231315;
                                    TextView textView4 = (TextView) b.q(view, 2131231315);
                                    if (textView4 != null) {
                                        i = 2131231324;
                                        TextView textView5 = (TextView) b.q(view, 2131231324);
                                        if (textView5 != null) {
                                            i = 2131231326;
                                            TextView textView6 = (TextView) b.q(view, 2131231326);
                                            if (textView6 != null) {
                                                return new ItemHistoryEntryBinding((MaterialCardView) view, materialCardView, imageView, linearLayout, linearProgressIndicator, textView, textView2, textView3, textView4, textView5, textView6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemHistoryEntryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHistoryEntryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427389, viewGroup, false);
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
