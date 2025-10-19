package com.niyaz.zario;

import android.view.View;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import u0.v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\k.smali */
public final class k implements ViewWithFragmentComponentBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl f6652a;

    /* renamed from: b, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl f6653b;

    /* renamed from: c, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl f6654c;

    /* renamed from: d, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$FragmentCImpl f6655d;

    /* renamed from: e, reason: collision with root package name */
    public View f6656e;

    public k(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl, DaggerMinutesApp_HiltComponents_SingletonC$FragmentCImpl daggerMinutesApp_HiltComponents_SingletonC$FragmentCImpl) {
        this.f6652a = daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl;
        this.f6653b = daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl;
        this.f6654c = daggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl;
        this.f6655d = daggerMinutesApp_HiltComponents_SingletonC$FragmentCImpl;
    }

    @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
    public final ViewWithFragmentComponent build() {
        v.a(this.f6656e, View.class);
        View view = this.f6656e;
        return new DaggerMinutesApp_HiltComponents_SingletonC$ViewWithFragmentCImpl(this.f6652a, this.f6653b, this.f6654c, this.f6655d, view, 0);
    }

    @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
    public final ViewWithFragmentComponentBuilder view(View view) {
        view.getClass();
        this.f6656e = view;
        return this;
    }
}
