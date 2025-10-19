package com.google.android.play.core.integrity;

import android.content.Context;
import e2.C0477z;
import e2.InterfaceC0461i;
import e2.InterfaceC0462j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\bp.smali */
public final class bp implements InterfaceC0461i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0462j f6325a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0462j f6326b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0462j f6327c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0462j f6328d;

    public bp(InterfaceC0462j interfaceC0462j, InterfaceC0462j interfaceC0462j2, InterfaceC0462j interfaceC0462j3, InterfaceC0462j interfaceC0462j4) {
        this.f6325a = interfaceC0462j;
        this.f6326b = interfaceC0462j2;
        this.f6327c = interfaceC0462j3;
        this.f6328d = interfaceC0462j4;
    }

    @Override // e2.InterfaceC0462j
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f6325a.a(), (C0477z) this.f6326b.a(), ((au) this.f6327c).a(), new j());
    }
}
