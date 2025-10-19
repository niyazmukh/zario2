package com.niyaz.zario;

import androidx.lifecycle.X;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import u0.v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\j.smali */
public final class j implements ViewModelComponentBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl f6648a;

    /* renamed from: b, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl f6649b;

    /* renamed from: c, reason: collision with root package name */
    public X f6650c;

    /* renamed from: d, reason: collision with root package name */
    public ViewModelLifecycle f6651d;

    public j(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl) {
        this.f6648a = daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl;
        this.f6649b = daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl;
    }

    public final ViewModelComponent build() {
        v.a(this.f6650c, X.class);
        v.a(this.f6651d, ViewModelLifecycle.class);
        X x3 = this.f6650c;
        ViewModelLifecycle viewModelLifecycle = this.f6651d;
        return new DaggerMinutesApp_HiltComponents_SingletonC$ViewModelCImpl(this.f6648a, this.f6649b, x3, viewModelLifecycle, 0);
    }

    public final ViewModelComponentBuilder savedStateHandle(X x3) {
        x3.getClass();
        this.f6650c = x3;
        return this;
    }

    public final ViewModelComponentBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
        viewModelLifecycle.getClass();
        this.f6651d = viewModelLifecycle;
        return this;
    }
}
