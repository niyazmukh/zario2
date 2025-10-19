package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\FragmentFeedbackBinding.smali */
public final class FragmentFeedbackBinding implements ViewBinding {
    public final MaterialButton btnContinue;
    private final ScrollView rootView;
    public final TextView tvGoalStatus;
    public final TextView tvGoalStreak;
    public final TextView tvPointsChange;
    public final TextView tvScreenSubtitle;
    public final TextView tvScreenTitle;

    private FragmentFeedbackBinding(ScrollView scrollView, MaterialButton materialButton, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = scrollView;
        this.btnContinue = materialButton;
        this.tvGoalStatus = textView;
        this.tvGoalStreak = textView2;
        this.tvPointsChange = textView3;
        this.tvScreenSubtitle = textView4;
        this.tvScreenTitle = textView5;
    }

    public static FragmentFeedbackBinding bind(View view) {
        int i = 2131230845;
        MaterialButton materialButton = (MaterialButton) b.q(view, 2131230845);
        if (materialButton != null) {
            i = 2131231287;
            TextView textView = (TextView) b.q(view, 2131231287);
            if (textView != null) {
                i = 2131231288;
                TextView textView2 = (TextView) b.q(view, 2131231288);
                if (textView2 != null) {
                    i = 2131231299;
                    TextView textView3 = (TextView) b.q(view, 2131231299);
                    if (textView3 != null) {
                        i = 2131231310;
                        TextView textView4 = (TextView) b.q(view, 2131231310);
                        if (textView4 != null) {
                            i = 2131231311;
                            TextView textView5 = (TextView) b.q(view, 2131231311);
                            if (textView5 != null) {
                                return new FragmentFeedbackBinding((ScrollView) view, materialButton, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentFeedbackBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFeedbackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427376, viewGroup, false);
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
