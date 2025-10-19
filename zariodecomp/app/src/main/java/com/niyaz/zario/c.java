package com.niyaz.zario;

import android.app.Service;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import u0.v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\c.smali */
public final class c implements ActivityRetainedComponentBuilder, ServiceComponentBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl f6629a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6630b;

    public /* synthetic */ c(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl) {
        this.f6629a = daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl;
    }

    @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
    public ActivityRetainedComponent build() {
        v.a((SavedStateHandleHolder) this.f6630b, SavedStateHandleHolder.class);
        return new DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl(this.f6629a, (SavedStateHandleHolder) this.f6630b, 0);
    }

    @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
    public ActivityRetainedComponentBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder) {
        savedStateHandleHolder.getClass();
        this.f6630b = savedStateHandleHolder;
        return this;
    }

    @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
    public ServiceComponentBuilder service(Service service) {
        service.getClass();
        this.f6630b = service;
        return this;
    }

    @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
    /* renamed from: build, reason: collision with other method in class */
    public ServiceComponent mo5build() {
        v.a((Service) this.f6630b, Service.class);
        return new DaggerMinutesApp_HiltComponents_SingletonC$ServiceCImpl(this.f6629a, (Service) this.f6630b, 0);
    }
}
