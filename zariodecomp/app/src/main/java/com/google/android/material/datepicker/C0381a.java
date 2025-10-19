package com.google.android.material.datepicker;

import android.os.Bundle;

/* renamed from: com.google.android.material.datepicker.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\a.1.smali */
public final class C0381a {

    /* renamed from: f, reason: collision with root package name */
    public static final long f5935f = D.a(t.c(1900, 0).f6024f);

    /* renamed from: g, reason: collision with root package name */
    public static final long f5936g = D.a(t.c(2100, 11).f6024f);
    public static final /* synthetic */ int h = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f5937a;

    /* renamed from: b, reason: collision with root package name */
    public long f5938b;

    /* renamed from: c, reason: collision with root package name */
    public Long f5939c;

    /* renamed from: d, reason: collision with root package name */
    public int f5940d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0382b f5941e;

    public final C0383c a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f5941e);
        t tVarD = t.d(this.f5937a);
        t tVarD2 = t.d(this.f5938b);
        InterfaceC0382b interfaceC0382b = (InterfaceC0382b) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = this.f5939c;
        return new C0383c(tVarD, tVarD2, interfaceC0382b, l4 == null ? null : t.d(l4.longValue()), this.f5940d);
    }
}
