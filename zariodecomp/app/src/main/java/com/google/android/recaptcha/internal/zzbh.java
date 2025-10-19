package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzbh.smali */
final class zzbh extends j implements p {
    public zzbh(d dVar) {
        super(2, dVar);
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzbh(dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2678a;
        AbstractC0183a.m0(obj);
        Thread.currentThread().setPriority(8);
        return k.f2288a;
    }
}
