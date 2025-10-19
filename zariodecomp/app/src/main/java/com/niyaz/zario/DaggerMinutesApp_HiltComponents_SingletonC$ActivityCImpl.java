package com.niyaz.zario;

import N2.AbstractC0156x;
import S2.u;
import android.app.Activity;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl.smali */
final class DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl extends MinutesApp_HiltComponents$ActivityC {
    private final DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl activityCImpl;
    private final DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl activityRetainedCImpl;
    private final DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl singletonCImpl;

    public /* synthetic */ DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl, Activity activity, int i) {
        this(daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl, activity);
    }

    private MainActivity injectMainActivity2(MainActivity mainActivity) {
        mainActivity.f6616H = (u) this.singletonCImpl.evaluationRepositoryProvider.get();
        return mainActivity;
    }

    @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
    public FragmentComponentBuilder fragmentComponentBuilder() {
        return new e(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
    }

    @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new j(this.singletonCImpl, this.activityRetainedCImpl));
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new j(this.singletonCImpl, this.activityRetainedCImpl);
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
    public Map<Class<?>, Boolean> getViewModelKeys() {
        AbstractC0156x.h(7, "expectedSize");
        C.d dVar = new C.d(7, 5);
        Boolean bool = Boolean.TRUE;
        dVar.g("h3.c", bool);
        dVar.g("i3.g", bool);
        dVar.g("j3.l", bool);
        dVar.g("k3.u", bool);
        dVar.g("m3.q", bool);
        dVar.g("o3.k", bool);
        dVar.g("r3.m", bool);
        return new I3.l(dVar.b());
    }

    @Override // com.niyaz.zario.MinutesApp_HiltComponents$ActivityC, com.niyaz.zario.o
    public void injectMainActivity(MainActivity mainActivity) {
        injectMainActivity2(mainActivity);
    }

    @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
    public ViewComponentBuilder viewComponentBuilder() {
        return new e(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
    }

    private DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl, Activity activity) {
        this.activityCImpl = this;
        this.singletonCImpl = daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl;
        this.activityRetainedCImpl = daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl;
    }
}
