package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\FragmentTargetBinding.smali */
public final class FragmentTargetBinding implements ViewBinding {
    public final MaterialButton btnConfirmTarget;
    public final MaterialButton buttonGrantPermission;
    public final MaterialButton buttonRetry;
    public final LinearLayout cardGoalSummary;
    public final CircularProgressIndicator progressBar;
    private final ScrollView rootView;
    public final TextView textViewError;
    public final TextView textViewLoading;
    public final TextView tvCurrentUsage;
    public final TextView tvGoalUsage;
    public final TextView tvReductionInfo;
    public final TextView tvSubtitle;
    public final TextView tvTitle;
    public final TextView tvTodayUsage;

    private FragmentTargetBinding(ScrollView scrollView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, LinearLayout linearLayout, CircularProgressIndicator circularProgressIndicator, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = scrollView;
        this.btnConfirmTarget = materialButton;
        this.buttonGrantPermission = materialButton2;
        this.buttonRetry = materialButton3;
        this.cardGoalSummary = linearLayout;
        this.progressBar = circularProgressIndicator;
        this.textViewError = textView;
        this.textViewLoading = textView2;
        this.tvCurrentUsage = textView3;
        this.tvGoalUsage = textView4;
        this.tvReductionInfo = textView5;
        this.tvSubtitle = textView6;
        this.tvTitle = textView7;
        this.tvTodayUsage = textView8;
    }

    public static FragmentTargetBinding bind(View view) {
        int i = 2131230843;
        MaterialButton materialButton = (MaterialButton) b.q(view, 2131230843);
        if (materialButton != null) {
            i = 2131230851;
            MaterialButton materialButton2 = (MaterialButton) b.q(view, 2131230851);
            if (materialButton2 != null) {
                i = 2131230853;
                MaterialButton materialButton3 = (MaterialButton) b.q(view, 2131230853);
                if (materialButton3 != null) {
                    i = 2131230856;
                    LinearLayout linearLayout = (LinearLayout) b.q(view, 2131230856);
                    if (linearLayout != null) {
                        i = 2131231121;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b.q(view, 2131231121);
                        if (circularProgressIndicator != null) {
                            i = 2131231228;
                            TextView textView = (TextView) b.q(view, 2131231228);
                            if (textView != null) {
                                i = 2131231229;
                                TextView textView2 = (TextView) b.q(view, 2131231229);
                                if (textView2 != null) {
                                    i = 2131231268;
                                    TextView textView3 = (TextView) b.q(view, 2131231268);
                                    if (textView3 != null) {
                                        i = 2131231290;
                                        TextView textView4 = (TextView) b.q(view, 2131231290);
                                        if (textView4 != null) {
                                            i = 2131231304;
                                            TextView textView5 = (TextView) b.q(view, 2131231304);
                                            if (textView5 != null) {
                                                i = 2131231316;
                                                TextView textView6 = (TextView) b.q(view, 2131231316);
                                                if (textView6 != null) {
                                                    i = 2131231318;
                                                    TextView textView7 = (TextView) b.q(view, 2131231318);
                                                    if (textView7 != null) {
                                                        i = 2131231319;
                                                        TextView textView8 = (TextView) b.q(view, 2131231319);
                                                        if (textView8 != null) {
                                                            return new FragmentTargetBinding((ScrollView) view, materialButton, materialButton2, materialButton3, linearLayout, circularProgressIndicator, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentTargetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTargetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427385, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }
}
