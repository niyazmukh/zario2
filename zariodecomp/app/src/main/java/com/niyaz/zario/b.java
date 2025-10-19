package com.niyaz.zario;

import android.app.Activity;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import u0.v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\b.smali */
public final class b implements ActivityComponentBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl f6626a;

    /* renamed from: b, reason: collision with root package name */
    public final DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl f6627b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f6628c;

    public b(DaggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl, DaggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl) {
        this.f6626a = daggerMinutesApp_HiltComponents_SingletonC$SingletonCImpl;
        this.f6627b = daggerMinutesApp_HiltComponents_SingletonC$ActivityRetainedCImpl;
    }

    @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
    public final ActivityComponentBuilder activity(Activity activity) {
        activity.getClass();
        this.f6628c = activity;
        return this;
    }

    @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
    public final ActivityComponent build() {
        v.a(this.f6628c, Activity.class);
        Activity activity = this.f6628c;
        return new DaggerMinutesApp_HiltComponents_SingletonC$ActivityCImpl(this.f6626a, this.f6627b, activity, 0);
    }
}
