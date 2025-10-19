package com.niyaz.zario;

import S2.u;
import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import androidx.navigation.fragment.NavHostFragment;
import com.niyaz.zario.databinding.ActivityMainBinding;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import f4.E;
import g.C0532g;
import g.C0533h;
import g0.AbstractComponentCallbacksC0567t;
import l.C0708q;
import o0.C0767B;

@AndroidEntryPoint
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\MainActivity.smali */
public final class MainActivity extends g.i implements GeneratedComponentManagerHolder {

    /* renamed from: C, reason: collision with root package name */
    public SavedStateHandleHolder f6612C;

    /* renamed from: D, reason: collision with root package name */
    public volatile ActivityComponentManager f6613D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f6614E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6615F;
    public C0767B G;

    /* renamed from: H, reason: collision with root package name */
    public u f6616H;

    public MainActivity() {
        ((C0708q) this.f4906e.f88c).f("androidx:appcompat", new C0532g(this));
        f(new C0533h(this));
        this.f6614E = new Object();
        this.f6615F = false;
        f(new l(this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // b.AbstractActivityC0255l, androidx.lifecycle.InterfaceC0232j
    public final i0 h() {
        return DefaultViewModelFactories.getActivityFactory(this, super.h());
    }

    @Override // g0.AbstractActivityC0570w, b.AbstractActivityC0255l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        r(bundle);
        ActivityMainBinding activityMainBindingInflate = ActivityMainBinding.inflate(getLayoutInflater());
        if (activityMainBindingInflate == null) {
            kotlin.jvm.internal.i.i("binding");
            throw null;
        }
        setContentView(activityMainBindingInflate.getRoot());
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tB = m().B(2131231070);
        kotlin.jvm.internal.i.c(abstractComponentCallbacksC0567tB, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.G = ((NavHostFragment) abstractComponentCallbacksC0567tB).Y();
        String stringExtra = getIntent().getStringExtra("navigate_to");
        if (stringExtra == null) {
            return;
        }
        E.t(a0.g(this), null, null, new n(stringExtra, this, null), 3);
    }

    @Override // g.i, g0.AbstractActivityC0570w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.f6612C;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final ActivityComponentManager componentManager() {
        if (this.f6613D == null) {
            synchronized (this.f6614E) {
                try {
                    if (this.f6613D == null) {
                        this.f6613D = new ActivityComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f6613D;
    }

    public final void r(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof GeneratedComponentManager) {
            SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
            this.f6612C = savedStateHandleHolder;
            if (savedStateHandleHolder.isInvalid()) {
                this.f6612C.setExtras(a());
            }
        }
    }
}
