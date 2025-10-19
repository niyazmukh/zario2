package com.google.android.play.core.integrity;

import e2.InterfaceC0461i;
import e2.InterfaceC0462j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\au.smali */
public final class au implements InterfaceC0461i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0462j f6281a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0462j f6282b;

    public au(InterfaceC0462j interfaceC0462j, InterfaceC0462j interfaceC0462j2) {
        this.f6281a = interfaceC0462j;
        this.f6282b = interfaceC0462j2;
    }

    @Override // e2.InterfaceC0462j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final at a() {
        return new at(this.f6281a, this.f6282b);
    }
}
