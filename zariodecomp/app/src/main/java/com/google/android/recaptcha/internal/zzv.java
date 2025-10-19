package com.google.android.recaptcha.internal;

import B0.c;
import L3.k;
import L3.l;
import L3.t;
import L3.x;
import O3.d;
import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import f4.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzv.smali */
public final class zzv extends zze {
    private final zzek zza;
    private final List zzb;
    private zzle zzc;
    private final Map zzd;

    public zzv(Context context, zzek zzekVar, zzbi zzbiVar, List list, int i, e eVar) {
        zzab zzabVar = new zzab(zzekVar.zza());
        zzp zzpVar = new zzp(zzekVar.zza());
        zzm zzmVar = new zzm(zzekVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzekVar.zza());
        zzek zzekVarZza = zzekVar.zza();
        C cZzc = zzbiVar.zzc();
        List listY = k.Y(zzabVar, zzpVar, zzmVar, zznVar, new zzae(zzekVarZza, context, cZzc, new zzan(context, cZzc, zzekVarZza, IntegrityManagerFactory.createStandard(context), 28800000L), new zzbs(h1.e.f7633b)));
        this.zza = zzekVar;
        this.zzb = listY;
        this.zzd = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzsi zzq(String str) {
        Map linkedHashMap;
        List<zzaa> list = (List) this.zzd.remove(str);
        if (list != null) {
            int iA0 = x.a0(l.a0(list));
            if (iA0 < 16) {
                iA0 = 16;
            }
            linkedHashMap = new LinkedHashMap(iA0);
            for (zzaa zzaaVar : list) {
                linkedHashMap.put(Integer.valueOf(zzaaVar.zzb()), zzaaVar);
            }
        } else {
            linkedHashMap = t.f2352a;
        }
        zzsz zzszVarZzs = zzs(linkedHashMap, str);
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        zzsf zzsfVarZzf = zzsg.zzf();
        byte[] bArrZzd = zzszVarZzs.zzd();
        zzsfVarZzf.zze(zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        zzshVarZzf.zzf(zzsfVarZzf);
        return (zzsi) zzshVarZzf.zzk();
    }

    private final zzsx zzr(zzaa zzaaVar) {
        zzle zzleVar;
        zzsv zzsvVarZzf = zzsx.zzf();
        zzsvVarZzf.zzq(3);
        if (zzaaVar instanceof zzx) {
            zzti zztiVarZza = ((zzx) zzaaVar).zza();
            zzle zzleVar2 = this.zzc;
            zzleVar = zzleVar2 != null ? zzleVar2 : null;
            byte[] bArrZzd = zztiVarZza.zzd();
            zzsvVarZzf.zzf(zzcf.zza(zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzleVar));
        } else {
            if (!(zzaaVar instanceof zzw)) {
                throw new c();
            }
            zzte zzteVarZza = ((zzw) zzaaVar).zza();
            zzle zzleVar3 = this.zzc;
            zzleVar = zzleVar3 != null ? zzleVar3 : null;
            byte[] bArrZzd2 = zzteVarZza.zzd();
            zzsvVarZzf.zze(zzcf.zza(zzkh.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), zzleVar));
        }
        return (zzsx) zzsvVarZzf.zzk();
    }

    private final zzsz zzs(Map map, String str) {
        zzsy zzsyVarZzf = zzsz.zzf();
        zzsyVarZzf.zzq(str);
        List list = this.zzb;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzy) obj).zzf()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            if (!map.containsKey(Integer.valueOf(zzyVar.zza()))) {
                int iZza = zzyVar.zza();
                zztd zztdVarZzf = zzte.zzf();
                zztdVarZzf.zzf(iZza);
                zztdVarZzf.zzr(13);
                zztdVarZzf.zzq(27);
                zzsyVarZzf.zzf(zzr(new zzw(iZza, (zzte) zztdVarZzf.zzk())));
            }
        }
        Collection collectionValues = map.values();
        ArrayList arrayList2 = new ArrayList(l.a0(collectionValues));
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zzr((zzaa) it2.next()));
        }
        zzsyVarZzf.zze(arrayList2);
        return (zzsz) zzsyVarZzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zza;
        zzekVar.zzc(str);
        return zzekVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zza;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, d dVar) {
        return zzq(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(java.lang.String r5, O3.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzq
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzq r0 = (com.google.android.recaptcha.internal.zzq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzq r0 = new com.google.android.recaptcha.internal.zzq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            a.AbstractC0183a.m0(r6)
            com.google.android.recaptcha.internal.zzs r6 = new com.google.android.recaptcha.internal.zzs
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.zzc = r3
            java.lang.Object r6 = f4.E.g(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            K3.g r6 = (K3.g) r6
            java.lang.Object r4 = r6.f2280a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzv.zzf(java.lang.String, O3.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r5, O3.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzt
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzt r0 = (com.google.android.recaptcha.internal.zzt) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzt r0 = new com.google.android.recaptcha.internal.zzt
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            a.AbstractC0183a.m0(r6)
            com.google.android.recaptcha.internal.zzu r6 = new com.google.android.recaptcha.internal.zzu
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r6 = f4.E.g(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            K3.g r6 = (K3.g) r6
            java.lang.Object r4 = r6.f2280a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzv.zzh(com.google.android.recaptcha.internal.zzsc, O3.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final void zzk(zzsr zzsrVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzy) it.next()).zze(zzsrVar);
        }
    }

    public final Map zzo() {
        return this.zzd;
    }
}
