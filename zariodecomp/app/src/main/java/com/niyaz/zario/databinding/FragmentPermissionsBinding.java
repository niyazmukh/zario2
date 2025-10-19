package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\FragmentPermissionsBinding.smali */
public final class FragmentPermissionsBinding implements ViewBinding {
    public final MaterialButton btnContinue;
    public final MaterialCardView cardBatteryPermission;
    public final MaterialCardView cardNotificationPermission;
    public final MaterialCardView cardUsagePermission;
    private final ScrollView rootView;
    public final TextView tvBatteryStatus;
    public final TextView tvNotificationStatus;
    public final TextView tvSubtitle;
    public final TextView tvTitle;
    public final TextView tvUsageStatus;

    private FragmentPermissionsBinding(ScrollView scrollView, MaterialButton materialButton, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = scrollView;
        this.btnContinue = materialButton;
        this.cardBatteryPermission = materialCardView;
        this.cardNotificationPermission = materialCardView2;
        this.cardUsagePermission = materialCardView3;
        this.tvBatteryStatus = textView;
        this.tvNotificationStatus = textView2;
        this.tvSubtitle = textView3;
        this.tvTitle = textView4;
        this.tvUsageStatus = textView5;
    }

    public static FragmentPermissionsBinding bind(View view) {
        int i = 2131230845;
        MaterialButton materialButton = (MaterialButton) b.q(view, 2131230845);
        if (materialButton != null) {
            i = 2131230855;
            MaterialCardView materialCardView = (MaterialCardView) b.q(view, 2131230855);
            if (materialCardView != null) {
                i = 2131230857;
                MaterialCardView materialCardView2 = (MaterialCardView) b.q(view, 2131230857);
                if (materialCardView2 != null) {
                    i = 2131230862;
                    MaterialCardView materialCardView3 = (MaterialCardView) b.q(view, 2131230862);
                    if (materialCardView3 != null) {
                        i = 2131231264;
                        TextView textView = (TextView) b.q(view, 2131231264);
                        if (textView != null) {
                            i = 2131231295;
                            TextView textView2 = (TextView) b.q(view, 2131231295);
                            if (textView2 != null) {
                                i = 2131231316;
                                TextView textView3 = (TextView) b.q(view, 2131231316);
                                if (textView3 != null) {
                                    i = 2131231318;
                                    TextView textView4 = (TextView) b.q(view, 2131231318);
                                    if (textView4 != null) {
                                        i = 2131231325;
                                        TextView textView5 = (TextView) b.q(view, 2131231325);
                                        if (textView5 != null) {
                                            return new FragmentPermissionsBinding((ScrollView) view, materialButton, materialCardView, materialCardView2, materialCardView3, textView, textView2, textView3, textView4, textView5);
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

    public static FragmentPermissionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPermissionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427381, viewGroup, false);
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
