package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import Q3.j;
import X3.p;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzfs.smali */
final class zzfs extends j implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgd zzgdVar, zzft zzftVar, String str, d dVar) {
        super(2, dVar);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzfs(this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r1.zzh(r7, r2, r6) != r0) goto L20;
     */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 == r2) goto Le
            a.AbstractC0183a.m0(r7)
            goto L82
        Le:
            java.lang.Object r1 = r6.zzb
            com.google.android.recaptcha.internal.zzjh r1 = (com.google.android.recaptcha.internal.zzjh) r1
            java.lang.Object r2 = r6.zza
            com.google.android.recaptcha.internal.zzub r2 = (com.google.android.recaptcha.internal.zzub) r2
            a.AbstractC0183a.m0(r7)     // Catch: java.lang.Exception -> L1a
            goto L5d
        L1a:
            r7 = move-exception
            goto L6f
        L1c:
            a.AbstractC0183a.m0(r7)
            com.google.android.recaptcha.internal.zzgd r7 = r6.zzd
            com.google.android.recaptcha.internal.zzbn r1 = new com.google.android.recaptcha.internal.zzbn
            r1.<init>()
            r7.zza = r1
            java.lang.String r7 = r6.zzf     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzkh r1 = com.google.android.recaptcha.internal.zzkh.zzh()     // Catch: java.lang.Exception -> L1a
            byte[] r7 = r1.zzj(r7)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzub r7 = com.google.android.recaptcha.internal.zzub.zzi(r7)     // Catch: java.lang.Exception -> L1a
            r7.zzf()     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzft r1 = r6.zze     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzhx r1 = com.google.android.recaptcha.internal.zzft.zzb(r1)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zztz r1 = r1.zza(r7)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzjh r3 = com.google.android.recaptcha.internal.zzjh.zzb()     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzft r4 = r6.zze     // Catch: java.lang.Exception -> L1a
            java.util.List r1 = r1.zzi()     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzgd r5 = r6.zzd     // Catch: java.lang.Exception -> L1a
            r6.zza = r7     // Catch: java.lang.Exception -> L1a
            r6.zzb = r3     // Catch: java.lang.Exception -> L1a
            r6.zzc = r2     // Catch: java.lang.Exception -> L1a
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzft.zzc(r4, r1, r5, r6)     // Catch: java.lang.Exception -> L1a
            if (r1 == r0) goto L81
            r2 = r7
            r1 = r3
        L5d:
            r1.zzf()     // Catch: java.lang.Exception -> L1a
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Exception -> L1a
            long r3 = r1.zza(r7)     // Catch: java.lang.Exception -> L1a
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Exception -> L1a
            r7.<init>(r3)     // Catch: java.lang.Exception -> L1a
            r2.zzf()     // Catch: java.lang.Exception -> L1a
            goto L82
        L6f:
            com.google.android.recaptcha.internal.zzft r1 = r6.zze
            com.google.android.recaptcha.internal.zzgd r2 = r6.zzd
            r3 = 0
            r6.zza = r3
            r6.zzb = r3
            r3 = 2
            r6.zzc = r3
            java.lang.Object r6 = com.google.android.recaptcha.internal.zzft.zzd(r1, r7, r2, r6)
            if (r6 != r0) goto L82
        L81:
            return r0
        L82:
            K3.k r6 = K3.k.f2288a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
