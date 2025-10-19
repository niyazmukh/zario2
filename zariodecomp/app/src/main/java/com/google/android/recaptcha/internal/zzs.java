package com.google.android.recaptcha.internal;

import K3.g;
import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;
import f4.E;
import f4.InterfaceC0506g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzs.smali */
final class zzs extends j implements p {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, dVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2678a;
        int i = this.zza;
        AbstractC0183a.m0(obj);
        if (i == 0) {
            C c5 = (C) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(E.t(c5, null, null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3));
            }
            InterfaceC0506g0[] interfaceC0506g0Arr = (InterfaceC0506g0[]) arrayList2.toArray(new InterfaceC0506g0[0]);
            InterfaceC0506g0[] interfaceC0506g0Arr2 = (InterfaceC0506g0[]) Arrays.copyOf(interfaceC0506g0Arr, interfaceC0506g0Arr.length);
            this.zza = 1;
            if (E.s(interfaceC0506g0Arr2, this) == aVar) {
                return aVar;
            }
        }
        return new g(this.zzb.zzq(this.zzc));
    }
}
