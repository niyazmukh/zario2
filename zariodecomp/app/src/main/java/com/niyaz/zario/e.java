package com.niyaz.zario;

import android.view.View;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import g0.AbstractComponentCallbacksC0567t;
import u0.v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\e.smali */
public final class e implements FragmentComponentBuilder, ViewComponentBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl f6634a;

    /* renamed from: b, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl f6635b;

    /* renamed from: c, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl f6636c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6637d;

    public /* synthetic */ e(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl) {
        this.f6634a = daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl;
        this.f6635b = daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl;
        this.f6636c = daggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl;
    }

    @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
    public FragmentComponent build() {
        v.a((AbstractComponentCallbacksC0567t) this.f6637d, AbstractComponentCallbacksC0567t.class);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = (AbstractComponentCallbacksC0567t) this.f6637d;
        return new DaggerMinutesApp_HiltComponents_SingletonC$FragmentCImpl(this.f6634a, this.f6635b, this.f6636c, abstractComponentCallbacksC0567t, 0);
    }

    @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
    public FragmentComponentBuilder fragment(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        abstractComponentCallbacksC0567t.getClass();
        this.f6637d = abstractComponentCallbacksC0567t;
        return this;
    }

    @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
    public ViewComponentBuilder view(View view) {
        view.getClass();
        this.f6637d = view;
        return this;
    }

    @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
    /* renamed from: build, reason: collision with other method in class */
    public ViewComponent mo6build() {
        v.a((View) this.f6637d, View.class);
        View view = (View) this.f6637d;
        return new DaggerMinutesApp_HiltComponents_SingletonC$ViewCImpl(this.f6634a, this.f6635b, this.f6636c, view, 0);
    }
}
