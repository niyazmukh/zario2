package com.google.android.gms.common.api.internal;

import h1.C0590c;

/* renamed from: com.google.android.gms.common.api.internal.w, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\w.1.smali */
public abstract class AbstractC0359w {

    /* renamed from: a, reason: collision with root package name */
    public final C0590c[] f5642a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5643b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5644c;

    public AbstractC0359w(C0590c[] c0590cArr, boolean z4, int i) {
        this.f5642a = c0590cArr;
        boolean z5 = false;
        if (c0590cArr != null && z4) {
            z5 = true;
        }
        this.f5643b = z5;
        this.f5644c = i;
    }

    public static F1.h a() {
        F1.h hVar = new F1.h();
        hVar.f1682c = true;
        hVar.f1681b = 0;
        return hVar;
    }
}
