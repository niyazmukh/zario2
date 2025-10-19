package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.slider.Slider;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\FragmentFlexstakesBinding.smali */
public final class FragmentFlexstakesBinding implements ViewBinding {
    public final MaterialButton btnContinue;
    public final MaterialCardView cardPenalty;
    public final MaterialCardView cardReward;
    private final ScrollView rootView;
    public final Slider sliderPenalty;
    public final Slider sliderReward;
    public final TextView tvPenaltyMaxLabel;
    public final TextView tvPenaltyMinLabel;
    public final TextView tvPenaltyValue;
    public final TextView tvRewardMaxLabel;
    public final TextView tvRewardMinLabel;
    public final TextView tvRewardValue;
    public final TextView tvScreenSubtitle;
    public final TextView tvScreenTitle;

    private FragmentFlexstakesBinding(ScrollView scrollView, MaterialButton materialButton, MaterialCardView materialCardView, MaterialCardView materialCardView2, Slider slider, Slider slider2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = scrollView;
        this.btnContinue = materialButton;
        this.cardPenalty = materialCardView;
        this.cardReward = materialCardView2;
        this.sliderPenalty = slider;
        this.sliderReward = slider2;
        this.tvPenaltyMaxLabel = textView;
        this.tvPenaltyMinLabel = textView2;
        this.tvPenaltyValue = textView3;
        this.tvRewardMaxLabel = textView4;
        this.tvRewardMinLabel = textView5;
        this.tvRewardValue = textView6;
        this.tvScreenSubtitle = textView7;
        this.tvScreenTitle = textView8;
    }

    public static FragmentFlexstakesBinding bind(View view) {
        int i = 2131230845;
        MaterialButton materialButton = (MaterialButton) b.q(view, 2131230845);
        if (materialButton != null) {
            i = 2131230858;
            MaterialCardView materialCardView = (MaterialCardView) b.q(view, 2131230858);
            if (materialCardView != null) {
                i = 2131230859;
                MaterialCardView materialCardView2 = (MaterialCardView) b.q(view, 2131230859);
                if (materialCardView2 != null) {
                    i = 2131231174;
                    Slider slider = (Slider) b.q(view, 2131231174);
                    if (slider != null) {
                        i = 2131231175;
                        Slider slider2 = (Slider) b.q(view, 2131231175);
                        if (slider2 != null) {
                            i = 2131231296;
                            TextView textView = (TextView) b.q(view, 2131231296);
                            if (textView != null) {
                                i = 2131231297;
                                TextView textView2 = (TextView) b.q(view, 2131231297);
                                if (textView2 != null) {
                                    i = 2131231298;
                                    TextView textView3 = (TextView) b.q(view, 2131231298);
                                    if (textView3 != null) {
                                        i = 2131231307;
                                        TextView textView4 = (TextView) b.q(view, 2131231307);
                                        if (textView4 != null) {
                                            i = 2131231308;
                                            TextView textView5 = (TextView) b.q(view, 2131231308);
                                            if (textView5 != null) {
                                                i = 2131231309;
                                                TextView textView6 = (TextView) b.q(view, 2131231309);
                                                if (textView6 != null) {
                                                    i = 2131231310;
                                                    TextView textView7 = (TextView) b.q(view, 2131231310);
                                                    if (textView7 != null) {
                                                        i = 2131231311;
                                                        TextView textView8 = (TextView) b.q(view, 2131231311);
                                                        if (textView8 != null) {
                                                            return new FragmentFlexstakesBinding((ScrollView) view, materialButton, materialCardView, materialCardView2, slider, slider2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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

    public static FragmentFlexstakesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFlexstakesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427377, viewGroup, false);
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
