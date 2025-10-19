package com.google.android.gms.common.internal;

import android.os.Bundle;
import h1.C0588a;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\A.smali */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f5655a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0368f f5657c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5658d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f5659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0368f f5660f;

    public A(AbstractC0368f abstractC0368f, int i, Bundle bundle) {
        Objects.requireNonNull(abstractC0368f);
        this.f5660f = abstractC0368f;
        Boolean bool = Boolean.TRUE;
        this.f5657c = abstractC0368f;
        this.f5655a = bool;
        this.f5656b = false;
        this.f5658d = i;
        this.f5659e = bundle;
    }

    public abstract boolean a();

    public abstract void b(C0588a c0588a);
}
