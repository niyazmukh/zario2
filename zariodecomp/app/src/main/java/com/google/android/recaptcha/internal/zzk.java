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

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzk.smali */
final class zzk extends j implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j5, zzsc zzscVar, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j5;
        this.zze = zzscVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, dVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        zzen zzenVar;
        Object objV;
        a aVar = a.f2678a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            AbstractC0183a.m0(obj);
        } else {
            AbstractC0183a.m0(obj);
            C c5 = (C) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(E.e(c5, new zzj((zze) it.next(), this.zzd, this.zze, null)));
            }
            H[] hArr = (H[]) arrayList.toArray(new H[0]);
            H[] hArr2 = (H[]) Arrays.copyOf(hArr, hArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            obj = E.f(hArr2, this);
            if (obj == aVar) {
                return aVar;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((g) it2.next()).f2280a instanceof f)) {
                    zzenVar.zza();
                    objV = k.f2288a;
                    break;
                }
            }
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            objV = AbstractC0183a.v(zzbdVar);
        } else {
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            objV = AbstractC0183a.v(zzbdVar2);
        }
        return new g(objV);
    }
}
