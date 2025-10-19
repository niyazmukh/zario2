package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\FragmentInterventionBinding.smali */
public final class FragmentInterventionBinding implements ViewBinding {
    public final ImageButton btnMenu;
    public final CircularProgressIndicator progressIndicator;
    public final TextView progressText;
    private final SwipeRefreshLayout rootView;
    public final LinearLayout statsCard;
    public final SwipeRefreshLayout swipeRefreshLayout;
    public final TextView tvCurrentUsage;
    public final TextView tvGoalTime;
    public final TextView tvSubtitle;
    public final TextView tvTimeRemaining;
    public final TextView tvTitle;
    public final TextView tvTotalPoints;

    private FragmentInterventionBinding(SwipeRefreshLayout swipeRefreshLayout, ImageButton imageButton, CircularProgressIndicator circularProgressIndicator, TextView textView, LinearLayout linearLayout, SwipeRefreshLayout swipeRefreshLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = swipeRefreshLayout;
        this.btnMenu = imageButton;
        this.progressIndicator = circularProgressIndicator;
        this.progressText = textView;
        this.statsCard = linearLayout;
        this.swipeRefreshLayout = swipeRefreshLayout2;
        this.tvCurrentUsage = textView2;
        this.tvGoalTime = textView3;
        this.tvSubtitle = textView4;
        this.tvTimeRemaining = textView5;
        this.tvTitle = textView6;
        this.tvTotalPoints = textView7;
    }

    public static FragmentInterventionBinding bind(View view) {
        int i = 2131230848;
        ImageButton imageButton = (ImageButton) b.q(view, 2131230848);
        if (imageButton != null) {
            i = 2131231124;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b.q(view, 2131231124);
            if (circularProgressIndicator != null) {
                i = 2131231126;
                TextView textView = (TextView) b.q(view, 2131231126);
                if (textView != null) {
                    i = 2131231200;
                    LinearLayout linearLayout = (LinearLayout) b.q(view, 2131231200);
                    if (linearLayout != null) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                        i = 2131231268;
                        TextView textView2 = (TextView) b.q(view, 2131231268);
                        if (textView2 != null) {
                            i = 2131231289;
                            TextView textView3 = (TextView) b.q(view, 2131231289);
                            if (textView3 != null) {
                                i = 2131231316;
                                TextView textView4 = (TextView) b.q(view, 2131231316);
                                if (textView4 != null) {
                                    i = 2131231317;
                                    TextView textView5 = (TextView) b.q(view, 2131231317);
                                    if (textView5 != null) {
                                        i = 2131231318;
                                        TextView textView6 = (TextView) b.q(view, 2131231318);
                                        if (textView6 != null) {
                                            i = 2131231320;
                                            TextView textView7 = (TextView) b.q(view, 2131231320);
                                            if (textView7 != null) {
                                                return new FragmentInterventionBinding(swipeRefreshLayout, imageButton, circularProgressIndicator, textView, linearLayout, swipeRefreshLayout, textView2, textView3, textView4, textView5, textView6, textView7);
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

    public static FragmentInterventionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInterventionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427379, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public SwipeRefreshLayout getRoot() {
        return this.rootView;
    }
}
