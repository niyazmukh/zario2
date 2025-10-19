package com.niyaz.zario.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\databinding\FragmentSignupBinding.smali */
public final class FragmentSignupBinding implements ViewBinding {
    public final MaterialButton btnSignup;
    public final TextInputEditText etConfirmPassword;
    public final TextInputEditText etEmail;
    public final AutoCompleteTextView etGender;
    public final TextInputEditText etPassword;
    public final TextInputEditText etYearOfBirth;
    private final ScrollView rootView;
    public final TextInputLayout tilConfirmPassword;
    public final TextInputLayout tilEmail;
    public final TextInputLayout tilGender;
    public final TextInputLayout tilPassword;
    public final TextInputLayout tilYearOfBirth;
    public final TextView tvSigninLink;
    public final TextView tvSignupSubtitle;
    public final TextView tvWelcomeTitle;

    private FragmentSignupBinding(ScrollView scrollView, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, AutoCompleteTextView autoCompleteTextView, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = scrollView;
        this.btnSignup = materialButton;
        this.etConfirmPassword = textInputEditText;
        this.etEmail = textInputEditText2;
        this.etGender = autoCompleteTextView;
        this.etPassword = textInputEditText3;
        this.etYearOfBirth = textInputEditText4;
        this.tilConfirmPassword = textInputLayout;
        this.tilEmail = textInputLayout2;
        this.tilGender = textInputLayout3;
        this.tilPassword = textInputLayout4;
        this.tilYearOfBirth = textInputLayout5;
        this.tvSigninLink = textView;
        this.tvSignupSubtitle = textView2;
        this.tvWelcomeTitle = textView3;
    }

    public static FragmentSignupBinding bind(View view) {
        int i = 2131230849;
        MaterialButton materialButton = (MaterialButton) b.q(view, 2131230849);
        if (materialButton != null) {
            i = 2131230930;
            TextInputEditText textInputEditText = (TextInputEditText) b.q(view, 2131230930);
            if (textInputEditText != null) {
                i = 2131230931;
                TextInputEditText textInputEditText2 = (TextInputEditText) b.q(view, 2131230931);
                if (textInputEditText2 != null) {
                    i = 2131230932;
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) b.q(view, 2131230932);
                    if (autoCompleteTextView != null) {
                        i = 2131230933;
                        TextInputEditText textInputEditText3 = (TextInputEditText) b.q(view, 2131230933);
                        if (textInputEditText3 != null) {
                            i = 2131230934;
                            TextInputEditText textInputEditText4 = (TextInputEditText) b.q(view, 2131230934);
                            if (textInputEditText4 != null) {
                                i = 2131231239;
                                TextInputLayout textInputLayout = (TextInputLayout) b.q(view, 2131231239);
                                if (textInputLayout != null) {
                                    i = 2131231240;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) b.q(view, 2131231240);
                                    if (textInputLayout2 != null) {
                                        i = 2131231241;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) b.q(view, 2131231241);
                                        if (textInputLayout3 != null) {
                                            i = 2131231242;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) b.q(view, 2131231242);
                                            if (textInputLayout4 != null) {
                                                i = 2131231243;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) b.q(view, 2131231243);
                                                if (textInputLayout5 != null) {
                                                    i = 2131231312;
                                                    TextView textView = (TextView) b.q(view, 2131231312);
                                                    if (textView != null) {
                                                        i = 2131231314;
                                                        TextView textView2 = (TextView) b.q(view, 2131231314);
                                                        if (textView2 != null) {
                                                            i = 2131231327;
                                                            TextView textView3 = (TextView) b.q(view, 2131231327);
                                                            if (textView3 != null) {
                                                                return new FragmentSignupBinding((ScrollView) view, materialButton, textInputEditText, textInputEditText2, autoCompleteTextView, textInputEditText3, textInputEditText4, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textView, textView2, textView3);
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

    public static FragmentSignupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSignupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(2131427383, viewGroup, false);
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
