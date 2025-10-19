package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\FragmentLoginBinding.smali */
public final class FragmentLoginBinding implements ViewBinding {
    public final MaterialButton btnLogin;
    public final TextInputEditText etEmail;
    public final TextInputEditText etPassword;
    private final ScrollView rootView;
    public final TextInputLayout tilEmail;
    public final TextInputLayout tilPassword;
    public final TextView tvLoginSubtitle;
    public final TextView tvSignupLink;
    public final TextView tvWelcomeTitle;

    private FragmentLoginBinding(ScrollView scrollView, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = scrollView;
        this.btnLogin = materialButton;
        this.etEmail = textInputEditText;
        this.etPassword = textInputEditText2;
        this.tilEmail = textInputLayout;
        this.tilPassword = textInputLayout2;
        this.tvLoginSubtitle = textView;
        this.tvSignupLink = textView2;
        this.tvWelcomeTitle = textView3;
    }

    public static FragmentLoginBinding bind(View view) {
        int i = 2131230847;
        MaterialButton materialButton = (MaterialButton) b.q(view, 2131230847);
        if (materialButton != null) {
            i = 2131230931;
            TextInputEditText textInputEditText = (TextInputEditText) b.q(view, 2131230931);
            if (textInputEditText != null) {
                i = 2131230933;
                TextInputEditText textInputEditText2 = (TextInputEditText) b.q(view, 2131230933);
                if (textInputEditText2 != null) {
                    i = 2131231240;
                    TextInputLayout textInputLayout = (TextInputLayout) b.q(view, 2131231240);
                    if (textInputLayout != null) {
                        i = 2131231242;
                        TextInputLayout textInputLayout2 = (TextInputLayout) b.q(view, 2131231242);
                        if (textInputLayout2 != null) {
                            i = 2131231294;
                            TextView textView = (TextView) b.q(view, 2131231294);
                            if (textView != null) {
                                i = 2131231313;
                                TextView textView2 = (TextView) b.q(view, 2131231313);
                                if (textView2 != null) {
                                    i = 2131231327;
                                    TextView textView3 = (TextView) b.q(view, 2131231327);
                                    if (textView3 != null) {
                                        return new FragmentLoginBinding((ScrollView) view, materialButton, textInputEditText, textInputEditText2, textInputLayout, textInputLayout2, textView, textView2, textView3);
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

    public static FragmentLoginBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427380, viewGroup, false);
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
