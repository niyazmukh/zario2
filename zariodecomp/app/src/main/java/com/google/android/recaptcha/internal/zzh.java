package com.google.android.recaptcha.internal;

import K3.f;
import K3.g;
import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;
import f4.E;
import f4.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzh.smali */
final class zzh extends j implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j5, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j5;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, dVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        zzen zzenVarZzf;
        zzen zzenVar;
        a aVar = a.f2678a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zze;
            AbstractC0183a.m0(obj);
        } else {
            AbstractC0183a.m0(obj);
            C c5 = (C) this.zze;
            zzek zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVarZzf = zzekVar.zzf(31);
            } else {
                zzenVarZzf = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(E.e(c5, new zzg(zzeVar, this.zzc, this.zzd, null)));
                }
            }
            H[] hArr = (H[]) arrayList.toArray(new H[0]);
            H[] hArr2 = (H[]) Arrays.copyOf(hArr, hArr.length);
            this.zze = zzenVarZzf;
            this.zza = 1;
            obj = E.f(hArr2, this);
            if (obj == aVar) {
                return aVar;
            }
            zzenVar = zzenVarZzf;
        }
        String str = this.zzc;
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((g) it.next()).f2280a;
            if (!(obj2 instanceof f)) {
                zzshVarZzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzshVarZzf.zzk();
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return zzsiVar;
    }
}
