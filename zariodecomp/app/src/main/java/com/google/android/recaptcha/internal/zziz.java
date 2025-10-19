package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import Q3.j;
import X3.p;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zziz.smali */
final class zziz extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziz(zzja zzjaVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzc = zzjaVar;
        this.zzd = zzenVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zziz(this.zzc, this.zzd, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (f4.E.C(20000, r6, r5) == r0) goto L20;
     */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.util.MissingResourceException {
        /*
            r5 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r5.zzb
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L14
            java.lang.Object r0 = r5.zza
            com.google.android.recaptcha.internal.zzbd r0 = (com.google.android.recaptcha.internal.zzbd) r0
            a.AbstractC0183a.m0(r6)
            goto L69
        L14:
            a.AbstractC0183a.m0(r6)     // Catch: java.lang.Exception -> L18
            goto L6e
        L18:
            r6 = move-exception
            goto L40
        L1a:
            a.AbstractC0183a.m0(r6)     // Catch: java.lang.Exception -> L18
            goto L2b
        L1e:
            a.AbstractC0183a.m0(r6)
            com.google.android.recaptcha.internal.zzja r6 = r5.zzc     // Catch: java.lang.Exception -> L18
            r5.zzb = r3     // Catch: java.lang.Exception -> L18
            java.lang.Object r6 = r6.zzx(r5)     // Catch: java.lang.Exception -> L18
            if (r6 == r0) goto L67
        L2b:
            com.google.android.recaptcha.internal.zziy r6 = new com.google.android.recaptcha.internal.zziy     // Catch: java.lang.Exception -> L18
            com.google.android.recaptcha.internal.zzja r1 = r5.zzc     // Catch: java.lang.Exception -> L18
            com.google.android.recaptcha.internal.zzen r3 = r5.zzd     // Catch: java.lang.Exception -> L18
            r4 = 0
            r6.<init>(r1, r3, r4)     // Catch: java.lang.Exception -> L18
            r5.zzb = r2     // Catch: java.lang.Exception -> L18
            r1 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r5 = f4.E.C(r1, r6, r5)     // Catch: java.lang.Exception -> L18
            if (r5 != r0) goto L6e
            goto L67
        L40:
            r6.getMessage()
            com.google.android.recaptcha.internal.zzbd r1 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r2 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r3 = com.google.android.recaptcha.internal.zzba.zzV
            java.lang.String r4 = r6.getMessage()
            r1.<init>(r2, r3, r4)
            com.google.android.recaptcha.internal.zzbd r6 = com.google.android.recaptcha.internal.zzf.zza(r6, r1)
            com.google.android.recaptcha.internal.zzja r1 = r5.zzc
            com.google.android.recaptcha.internal.zzcb r1 = r1.zzm()
            com.google.android.recaptcha.internal.zzje r2 = com.google.android.recaptcha.internal.zzje.zza
            r5.zza = r6
            r3 = 3
            r5.zzb = r3
            java.lang.Object r1 = r1.zzc(r2, r5)
            if (r1 != r0) goto L68
        L67:
            return r0
        L68:
            r0 = r6
        L69:
            com.google.android.recaptcha.internal.zzen r5 = r5.zzd
            r5.zzb(r0)
        L6e:
            K3.k r5 = K3.k.f2288a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
