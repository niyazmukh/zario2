package com.niyaz.zario;

import N2.AbstractC0156x;
import androidx.lifecycle.X;
import androidx.lifecycle.f0;
import dagger.hilt.android.ViewModelLifecycle;
import java.util.Map;
import javax.inject.Provider;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\DaggerMinutesApp_HiltComponents_SingletonC$ViewModelCImpl.smali */
final class DaggerMinutesApp_HiltComponents_SingletonC$ViewModelCImpl extends MinutesApp_HiltComponents$ViewModelC {
    private final DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl activityRetainedCImpl;
    private InterfaceC1060c authViewModelProvider;
    private InterfaceC1060c feedbackViewModelProvider;
    private InterfaceC1060c flexStakesViewModelProvider;
    private InterfaceC1060c historyViewModelProvider;
    private InterfaceC1060c interventionViewModelProvider;
    private InterfaceC1060c profileViewModelProvider;
    private final DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl singletonCImpl;
    private InterfaceC1060c targetViewModelProvider;
    private final DaggerMinutesApp_HiltComponents_SingletonC$ViewModelCImpl viewModelCImpl;

    public /* synthetic */ DaggerMinutesApp_HiltComponents_SingletonC$ViewModelCImpl(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl, X x3, ViewModelLifecycle viewModelLifecycle, int i) {
        this(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl, x3, viewModelLifecycle);
    }

    private void initialize(X x3, ViewModelLifecycle viewModelLifecycle) {
        DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl = this.singletonCImpl;
        int i = 1;
        this.authViewModelProvider = new i(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, 0, i);
        this.feedbackViewModelProvider = new i(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, 1, i);
        this.flexStakesViewModelProvider = new i(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, 2, i);
        this.historyViewModelProvider = new i(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, 3, i);
        this.interventionViewModelProvider = new i(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, 4, i);
        this.profileViewModelProvider = new i(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, 5, i);
        this.targetViewModelProvider = new i(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, 6, i);
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
        return h2.n.f7689k;
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
    public Map<Class<?>, Provider<f0>> getHiltViewModelMap() {
        AbstractC0156x.h(7, "expectedSize");
        C.d dVar = new C.d(7, 5);
        dVar.g("h3.c", this.authViewModelProvider);
        dVar.g("i3.g", this.feedbackViewModelProvider);
        dVar.g("j3.l", this.flexStakesViewModelProvider);
        dVar.g("k3.u", this.historyViewModelProvider);
        dVar.g("m3.q", this.interventionViewModelProvider);
        dVar.g("o3.k", this.profileViewModelProvider);
        dVar.g("r3.m", this.targetViewModelProvider);
        return new I3.l(dVar.b());
    }

    private DaggerMinutesApp_HiltComponents_SingletonC$ViewModelCImpl(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl, X x3, ViewModelLifecycle viewModelLifecycle) {
        this.viewModelCImpl = this;
        this.singletonCImpl = daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl;
        this.activityRetainedCImpl = daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl;
        initialize(x3, viewModelLifecycle);
    }
}
