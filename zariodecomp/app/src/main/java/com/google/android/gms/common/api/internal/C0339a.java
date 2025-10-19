package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\a.1.smali */
public final class C0339a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5610a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.i f5611b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.e f5612c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5613d;

    public C0339a(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.e eVar, String str) {
        this.f5611b = iVar;
        this.f5612c = eVar;
        this.f5613d = str;
        this.f5610a = Arrays.hashCode(new Object[]{iVar, eVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0339a)) {
            return false;
        }
        C0339a c0339a = (C0339a) obj;
        return com.google.android.gms.common.internal.C.i(this.f5611b, c0339a.f5611b) && com.google.android.gms.common.internal.C.i(this.f5612c, c0339a.f5612c) && com.google.android.gms.common.internal.C.i(this.f5613d, c0339a.f5613d);
    }

    public final int hashCode() {
        return this.f5610a;
    }
}
