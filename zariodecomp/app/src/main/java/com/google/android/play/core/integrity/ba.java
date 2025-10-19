package com.google.android.play.core.integrity;

import e2.InterfaceC0461i;
import e2.InterfaceC0462j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\ba.smali */
public final class ba implements InterfaceC0461i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0462j f6290a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0462j f6291b;

    public ba(InterfaceC0462j interfaceC0462j, InterfaceC0462j interfaceC0462j2) {
        this.f6290a = interfaceC0462j;
        this.f6291b = interfaceC0462j2;
    }

    @Override // e2.InterfaceC0462j
    public final /* bridge */ /* synthetic */ Object a() {
        InterfaceC0462j interfaceC0462j = this.f6291b;
        return new az((bn) this.f6290a.a(), (bt) interfaceC0462j.a());
    }
}
