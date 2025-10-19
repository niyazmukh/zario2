package com.google.android.play.core.integrity;

import android.content.Context;
import e2.C0477z;
import e2.InterfaceC0461i;
import e2.InterfaceC0462j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\al.smali */
public final class al implements InterfaceC0461i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0462j f6261a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0462j f6262b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0462j f6263c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0462j f6264d;

    public al(InterfaceC0462j interfaceC0462j, InterfaceC0462j interfaceC0462j2, InterfaceC0462j interfaceC0462j3, InterfaceC0462j interfaceC0462j4) {
        this.f6261a = interfaceC0462j;
        this.f6262b = interfaceC0462j2;
        this.f6263c = interfaceC0462j3;
        this.f6264d = interfaceC0462j4;
    }

    @Override // e2.InterfaceC0462j
    public final /* bridge */ /* synthetic */ Object a() {
        return new aj((Context) this.f6261a.a(), (C0477z) this.f6262b.a(), ((au) this.f6263c).a(), new i());
    }
}
