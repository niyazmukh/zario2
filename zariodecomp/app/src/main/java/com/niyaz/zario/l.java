package com.niyaz.zario;

import c.InterfaceC0332a;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\l.smali */
public final class l implements InterfaceC0332a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f6657a;

    public l(MainActivity mainActivity) {
        this.f6657a = mainActivity;
    }

    @Override // c.InterfaceC0332a
    public final void a() {
        MainActivity mainActivity = this.f6657a;
        if (mainActivity.f6615F) {
            return;
        }
        mainActivity.f6615F = true;
        ((o) mainActivity.generatedComponent()).injectMainActivity((MainActivity) UnsafeCasts.unsafeCast(mainActivity));
    }
}
