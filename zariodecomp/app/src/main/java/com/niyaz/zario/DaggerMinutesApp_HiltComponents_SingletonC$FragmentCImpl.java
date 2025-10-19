package com.niyaz.zario;

import S2.u;
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
import com.niyaz.zario.worker.MonitoringWorkScheduler;
import d3.C0446b;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import g0.AbstractComponentCallbacksC0567t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\DaggerMinutesApp_HiltComponents_SingletonC$FragmentCImpl.smali */
final class DaggerMinutesApp_HiltComponents_SingletonC$FragmentCImpl extends MinutesApp_HiltComponents$FragmentC {
    private final DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl activityCImpl;
    private final DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl activityRetainedCImpl;
    private final DaggerMinutesApp_HiltComponents_SingletonC$FragmentCImpl fragmentCImpl;
    private final DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl singletonCImpl;

    public /* synthetic */ DaggerMinutesApp_HiltComponents_SingletonC$FragmentCImpl(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, int i) {
        this(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl, daggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl, abstractComponentCallbacksC0567t);
    }

    private FeedbackFragment injectFeedbackFragment2(FeedbackFragment feedbackFragment) {
        feedbackFragment.f6690h0 = (u) this.singletonCImpl.evaluationRepositoryProvider.get();
        return feedbackFragment;
    }

    private InterventionFragment injectInterventionFragment2(InterventionFragment interventionFragment) {
        interventionFragment.f6718h0 = (e3.o) this.singletonCImpl.userSessionRepositoryProvider.get();
        interventionFragment.f6719i0 = (u) this.singletonCImpl.evaluationRepositoryProvider.get();
        interventionFragment.f6720j0 = (C0446b) this.singletonCImpl.permissionsManagerProvider.get();
        return interventionFragment;
    }

    private LoginFragment injectLoginFragment2(LoginFragment loginFragment) {
        loginFragment.f6673h0 = (u) this.singletonCImpl.evaluationRepositoryProvider.get();
        loginFragment.f6674i0 = (C0446b) this.singletonCImpl.permissionsManagerProvider.get();
        return loginFragment;
    }

    private PermissionsFragment injectPermissionsFragment2(PermissionsFragment permissionsFragment) {
        permissionsFragment.f6728g0 = (C0446b) this.singletonCImpl.permissionsManagerProvider.get();
        return permissionsFragment;
    }

    private ProfileFragment injectProfileFragment2(ProfileFragment profileFragment) {
        profileFragment.getClass();
        return profileFragment;
    }

    private SignupFragment injectSignupFragment2(SignupFragment signupFragment) {
        signupFragment.f6682h0 = (e3.o) this.singletonCImpl.userSessionRepositoryProvider.get();
        return signupFragment;
    }

    private SplashFragment injectSplashFragment2(SplashFragment splashFragment) {
        splashFragment.f6744f0 = (e3.o) this.singletonCImpl.userSessionRepositoryProvider.get();
        splashFragment.f6745g0 = (u) this.singletonCImpl.evaluationRepositoryProvider.get();
        splashFragment.f6746h0 = (C0446b) this.singletonCImpl.permissionsManagerProvider.get();
        return splashFragment;
    }

    private TargetFragment injectTargetFragment2(TargetFragment targetFragment) {
        targetFragment.f6754h0 = (u) this.singletonCImpl.evaluationRepositoryProvider.get();
        targetFragment.f6755i0 = (C0446b) this.singletonCImpl.permissionsManagerProvider.get();
        targetFragment.f6756j0 = (MonitoringWorkScheduler) this.singletonCImpl.monitoringWorkSchedulerProvider.get();
        return targetFragment;
    }

    @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return this.activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$FragmentC, i3.InterfaceC0603e
    public void injectFeedbackFragment(FeedbackFragment feedbackFragment) {
        injectFeedbackFragment2(feedbackFragment);
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$FragmentC, j3.e
    public void injectFlexStakesFragment(FlexStakesFragment flexStakesFragment) {
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$FragmentC, k3.InterfaceC0665f
    public void injectHistoryFragment(HistoryFragment historyFragment) {
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$FragmentC, m3.j
    public void injectInterventionFragment(InterventionFragment interventionFragment) {
        injectInterventionFragment2(interventionFragment);
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$FragmentC, h3.l
    public void injectLoginFragment(LoginFragment loginFragment) {
        injectLoginFragment2(loginFragment);
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$FragmentC, n3.b
    public void injectPermissionsFragment(PermissionsFragment permissionsFragment) {
        injectPermissionsFragment2(permissionsFragment);
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$FragmentC, o3.InterfaceC0810d
    public void injectProfileFragment(ProfileFragment profileFragment) {
        injectProfileFragment2(profileFragment);
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$FragmentC, h3.w
    public void injectSignupFragment(SignupFragment signupFragment) {
        injectSignupFragment2(signupFragment);
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$FragmentC, q3.InterfaceC0853c
    public void injectSplashFragment(SplashFragment splashFragment) {
        injectSplashFragment2(splashFragment);
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$FragmentC, r3.f
    public void injectTargetFragment(TargetFragment targetFragment) {
        injectTargetFragment2(targetFragment);
    }

    @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
        return new k(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl);
    }

    private DaggerMinutesApp_HiltComponents_SingletonC$FragmentCImpl(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        this.fragmentCImpl = this;
        this.singletonCImpl = daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl;
        this.activityRetainedCImpl = daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl;
        this.activityCImpl = daggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl;
    }
}
