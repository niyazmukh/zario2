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
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\FragmentHistoryBinding.smali */
public final class FragmentHistoryBinding implements ViewBinding {
    public final MaterialButton btnDatePicker;
    public final LinearLayout layoutDatePicker;
    public final LinearLayout layoutEmpty;
    public final CircularProgressIndicator progressLoading;
    public final RecyclerView recyclerHistory;
    public final RecyclerView recyclerHourlyChart;
    private final ScrollView rootView;
    public final TextView tvChartEmpty;
    public final TextView tvChartTitle;
    public final TextView tvDateRange;
    public final TextView tvEmptyDescription;
    public final TextView tvEmptyTitle;
    public final TextView tvLoading;
    public final TextView tvSubtitle;
    public final TextView tvTitle;
    public final TextView tvTotalUsage;

    private FragmentHistoryBinding(ScrollView scrollView, MaterialButton materialButton, LinearLayout linearLayout, LinearLayout linearLayout2, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = scrollView;
        this.btnDatePicker = materialButton;
        this.layoutDatePicker = linearLayout;
        this.layoutEmpty = linearLayout2;
        this.progressLoading = circularProgressIndicator;
        this.recyclerHistory = recyclerView;
        this.recyclerHourlyChart = recyclerView2;
        this.tvChartEmpty = textView;
        this.tvChartTitle = textView2;
        this.tvDateRange = textView3;
        this.tvEmptyDescription = textView4;
        this.tvEmptyTitle = textView5;
        this.tvLoading = textView6;
        this.tvSubtitle = textView7;
        this.tvTitle = textView8;
        this.tvTotalUsage = textView9;
    }

    public static FragmentHistoryBinding bind(View view) {
        int i = 2131230846;
        MaterialButton materialButton = (MaterialButton) b.q(view, 2131230846);
        if (materialButton != null) {
            i = 2131230990;
            LinearLayout linearLayout = (LinearLayout) b.q(view, 2131230990);
            if (linearLayout != null) {
                i = 2131230991;
                LinearLayout linearLayout2 = (LinearLayout) b.q(view, 2131230991);
                if (linearLayout2 != null) {
                    i = 2131231125;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b.q(view, 2131231125);
                    if (circularProgressIndicator != null) {
                        i = 2131231132;
                        RecyclerView recyclerView = (RecyclerView) b.q(view, 2131231132);
                        if (recyclerView != null) {
                            i = 2131231133;
                            RecyclerView recyclerView2 = (RecyclerView) b.q(view, 2131231133);
                            if (recyclerView2 != null) {
                                i = 2131231265;
                                TextView textView = (TextView) b.q(view, 2131231265);
                                if (textView != null) {
                                    i = 2131231266;
                                    TextView textView2 = (TextView) b.q(view, 2131231266);
                                    if (textView2 != null) {
                                        i = 2131231275;
                                        TextView textView3 = (TextView) b.q(view, 2131231275);
                                        if (textView3 != null) {
                                            i = 2131231282;
                                            TextView textView4 = (TextView) b.q(view, 2131231282);
                                            if (textView4 != null) {
                                                i = 2131231283;
                                                TextView textView5 = (TextView) b.q(view, 2131231283);
                                                if (textView5 != null) {
                                                    i = 2131231293;
                                                    TextView textView6 = (TextView) b.q(view, 2131231293);
                                                    if (textView6 != null) {
                                                        i = 2131231316;
                                                        TextView textView7 = (TextView) b.q(view, 2131231316);
                                                        if (textView7 != null) {
                                                            i = 2131231318;
                                                            TextView textView8 = (TextView) b.q(view, 2131231318);
                                                            if (textView8 != null) {
                                                                i = 2131231322;
                                                                TextView textView9 = (TextView) b.q(view, 2131231322);
                                                                if (textView9 != null) {
                                                                    return new FragmentHistoryBinding((ScrollView) view, materialButton, linearLayout, linearLayout2, circularProgressIndicator, recyclerView, recyclerView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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

    public static FragmentHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427378, viewGroup, false);
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
