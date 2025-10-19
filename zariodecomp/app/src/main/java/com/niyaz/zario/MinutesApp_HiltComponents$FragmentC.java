package com.niyaz.zario;

import com.niyaz.zario.ui.auth.LoginFragment;
import com.niyaz.zario.ui.auth.SignupFragment;
import com.niyaz.zario.ui.feedback.FeedbackFragment;
import com.niyaz.zario.ui.flexstakes.FlexStakesFragment;
import com.niyaz.zario.ui.history.HistoryFragment;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import com.niyaz.zario.ui.permissions.PermissionsFragment;
import com.niyaz.zario.ui.profile.ProfileFragment;
import com.niyaz.zario.ui.splash.SplashFragment;
import com.niyaz.zario.ui.target.TargetFragment;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.internal.GeneratedComponent;
import h3.w;
import i3.InterfaceC0603e;
import k3.InterfaceC0665f;
import o3.InterfaceC0810d;
import q3.InterfaceC0853c;

@FragmentScoped
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\MinutesApp_HiltComponents$FragmentC.smali */
public abstract class MinutesApp_HiltComponents$FragmentC implements h3.l, w, InterfaceC0603e, j3.e, InterfaceC0665f, m3.j, n3.b, InterfaceC0810d, InterfaceC0853c, r3.f, FragmentComponent, DefaultViewModelFactories.FragmentEntryPoint, ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint, GeneratedComponent {
    public abstract /* synthetic */ void injectFeedbackFragment(FeedbackFragment feedbackFragment);

    public abstract /* synthetic */ void injectFlexStakesFragment(FlexStakesFragment flexStakesFragment);

    public abstract /* synthetic */ void injectHistoryFragment(HistoryFragment historyFragment);

    public abstract /* synthetic */ void injectInterventionFragment(InterventionFragment interventionFragment);

    @Override // h3.l
    public abstract /* synthetic */ void injectLoginFragment(LoginFragment loginFragment);

    public abstract /* synthetic */ void injectPermissionsFragment(PermissionsFragment permissionsFragment);

    public abstract /* synthetic */ void injectProfileFragment(ProfileFragment profileFragment);

    public abstract /* synthetic */ void injectSignupFragment(SignupFragment signupFragment);

    public abstract /* synthetic */ void injectSplashFragment(SplashFragment splashFragment);

    public abstract /* synthetic */ void injectTargetFragment(TargetFragment targetFragment);
}
