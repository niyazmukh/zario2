package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\FragmentAboutBinding.smali */
public final class FragmentAboutBinding implements ViewBinding {
    public final MaterialButton btnContact;
    public final LinearLayout layoutAboutContent;
    private final ScrollView rootView;
    public final TextView tvAboutSubtitle;
    public final TextView tvAboutTitle;
    public final TextView tvEvaluation;
    public final TextView tvHowItWorksHeader;
    public final TextView tvPrivacy;
    public final TextView tvPrivacyHeader;
    public final TextView tvReductionGoal;
    public final TextView tvResearch;
    public final TextView tvResearchHeader;

    private FragmentAboutBinding(ScrollView scrollView, MaterialButton materialButton, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = scrollView;
        this.btnContact = materialButton;
        this.layoutAboutContent = linearLayout;
        this.tvAboutSubtitle = textView;
        this.tvAboutTitle = textView2;
        this.tvEvaluation = textView3;
        this.tvHowItWorksHeader = textView4;
        this.tvPrivacy = textView5;
        this.tvPrivacyHeader = textView6;
        this.tvReductionGoal = textView7;
        this.tvResearch = textView8;
        this.tvResearchHeader = textView9;
    }

    public static FragmentAboutBinding bind(View view) {
        int i = 2131230844;
        MaterialButton materialButton = (MaterialButton) b.q(view, 2131230844);
        if (materialButton != null) {
            i = 2131230989;
            LinearLayout linearLayout = (LinearLayout) b.q(view, 2131230989);
            if (linearLayout != null) {
                i = 2131231260;
                TextView textView = (TextView) b.q(view, 2131231260);
                if (textView != null) {
                    i = 2131231261;
                    TextView textView2 = (TextView) b.q(view, 2131231261);
                    if (textView2 != null) {
                        i = 2131231284;
                        TextView textView3 = (TextView) b.q(view, 2131231284);
                        if (textView3 != null) {
                            i = 2131231292;
                            TextView textView4 = (TextView) b.q(view, 2131231292);
                            if (textView4 != null) {
                                i = 2131231301;
                                TextView textView5 = (TextView) b.q(view, 2131231301);
                                if (textView5 != null) {
                                    i = 2131231302;
                                    TextView textView6 = (TextView) b.q(view, 2131231302);
                                    if (textView6 != null) {
                                        i = 2131231303;
                                        TextView textView7 = (TextView) b.q(view, 2131231303);
                                        if (textView7 != null) {
                                            i = 2131231305;
                                            TextView textView8 = (TextView) b.q(view, 2131231305);
                                            if (textView8 != null) {
                                                i = 2131231306;
                                                TextView textView9 = (TextView) b.q(view, 2131231306);
                                                if (textView9 != null) {
                                                    return new FragmentAboutBinding((ScrollView) view, materialButton, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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

    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427375, viewGroup, false);
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
