package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\FragmentProfileBinding.smali */
public final class FragmentProfileBinding implements ViewBinding {
    public final MaterialButton btnSimulateCycleCompletion;
    public final LinearLayout cardSummary;
    public final CircularProgressIndicator progressLoading;
    public final RecyclerView recyclerCycles;
    private final ScrollView rootView;
    public final TextView tvConditionPoints;
    public final TextView tvCycleListTitle;
    public final MaterialTextView tvCyclesLabel;
    public final TextView tvCyclesMet;
    public final MaterialTextView tvDaysLabel;
    public final TextView tvDaysSinceSignup;
    public final TextView tvEmail;
    public final MaterialTextView tvEmailLabel;
    public final TextView tvEmptyCycles;
    public final MaterialTextView tvPointsLabel;
    public final TextView tvSubtitle;
    public final TextView tvTitle;
    public final TextView tvTotalPoints;

    private FragmentProfileBinding(ScrollView scrollView, MaterialButton materialButton, LinearLayout linearLayout, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, TextView textView, TextView textView2, MaterialTextView materialTextView, TextView textView3, MaterialTextView materialTextView2, TextView textView4, TextView textView5, MaterialTextView materialTextView3, TextView textView6, MaterialTextView materialTextView4, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = scrollView;
        this.btnSimulateCycleCompletion = materialButton;
        this.cardSummary = linearLayout;
        this.progressLoading = circularProgressIndicator;
        this.recyclerCycles = recyclerView;
        this.tvConditionPoints = textView;
        this.tvCycleListTitle = textView2;
        this.tvCyclesLabel = materialTextView;
        this.tvCyclesMet = textView3;
        this.tvDaysLabel = materialTextView2;
        this.tvDaysSinceSignup = textView4;
        this.tvEmail = textView5;
        this.tvEmailLabel = materialTextView3;
        this.tvEmptyCycles = textView6;
        this.tvPointsLabel = materialTextView4;
        this.tvSubtitle = textView7;
        this.tvTitle = textView8;
        this.tvTotalPoints = textView9;
    }

    public static FragmentProfileBinding bind(View view) {
        int i = 2131230850;
        MaterialButton materialButton = (MaterialButton) b.q(view, 2131230850);
        if (materialButton != null) {
            i = 2131230861;
            LinearLayout linearLayout = (LinearLayout) b.q(view, 2131230861);
            if (linearLayout != null) {
                i = 2131231125;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b.q(view, 2131231125);
                if (circularProgressIndicator != null) {
                    i = 2131231131;
                    RecyclerView recyclerView = (RecyclerView) b.q(view, 2131231131);
                    if (recyclerView != null) {
                        i = 2131231267;
                        TextView textView = (TextView) b.q(view, 2131231267);
                        if (textView != null) {
                            i = 2131231270;
                            TextView textView2 = (TextView) b.q(view, 2131231270);
                            if (textView2 != null) {
                                i = 2131231273;
                                MaterialTextView materialTextView = (MaterialTextView) b.q(view, 2131231273);
                                if (materialTextView != null) {
                                    i = 2131231274;
                                    TextView textView3 = (TextView) b.q(view, 2131231274);
                                    if (textView3 != null) {
                                        i = 2131231276;
                                        MaterialTextView materialTextView2 = (MaterialTextView) b.q(view, 2131231276);
                                        if (materialTextView2 != null) {
                                            i = 2131231277;
                                            TextView textView4 = (TextView) b.q(view, 2131231277);
                                            if (textView4 != null) {
                                                i = 2131231279;
                                                TextView textView5 = (TextView) b.q(view, 2131231279);
                                                if (textView5 != null) {
                                                    i = 2131231280;
                                                    MaterialTextView materialTextView3 = (MaterialTextView) b.q(view, 2131231280);
                                                    if (materialTextView3 != null) {
                                                        i = 2131231281;
                                                        TextView textView6 = (TextView) b.q(view, 2131231281);
                                                        if (textView6 != null) {
                                                            i = 2131231300;
                                                            MaterialTextView materialTextView4 = (MaterialTextView) b.q(view, 2131231300);
                                                            if (materialTextView4 != null) {
                                                                i = 2131231316;
                                                                TextView textView7 = (TextView) b.q(view, 2131231316);
                                                                if (textView7 != null) {
                                                                    i = 2131231318;
                                                                    TextView textView8 = (TextView) b.q(view, 2131231318);
                                                                    if (textView8 != null) {
                                                                        i = 2131231320;
                                                                        TextView textView9 = (TextView) b.q(view, 2131231320);
                                                                        if (textView9 != null) {
                                                                            return new FragmentProfileBinding((ScrollView) view, materialButton, linearLayout, circularProgressIndicator, recyclerView, textView, textView2, materialTextView, textView3, materialTextView2, textView4, textView5, materialTextView3, textView6, materialTextView4, textView7, textView8, textView9);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427382, viewGroup, false);
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
