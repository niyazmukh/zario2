package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import Q3.j;
import X3.p;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzam.smali */
final class zzam extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzam(this.zzc, this.zzd, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.util.MissingResourceException {
        /*
            r6 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r6.zzb
            if (r1 == 0) goto L10
            java.lang.Object r0 = r6.zza
            kotlin.jvm.internal.r r0 = (kotlin.jvm.internal.r) r0
            a.AbstractC0183a.m0(r7)     // Catch: java.lang.Exception -> Le
            goto L60
        Le:
            r7 = move-exception
            goto L35
        L10:
            a.AbstractC0183a.m0(r7)
            kotlin.jvm.internal.r r7 = new kotlin.jvm.internal.r
            r7.<init>()
            com.google.android.recaptcha.internal.zzal r1 = new com.google.android.recaptcha.internal.zzal     // Catch: java.lang.Exception -> L31
            com.google.android.recaptcha.internal.zzan r2 = r6.zzc     // Catch: java.lang.Exception -> L31
            com.google.android.recaptcha.internal.zzen r3 = r6.zzd     // Catch: java.lang.Exception -> L31
            r4 = 0
            r1.<init>(r2, r3, r7, r4)     // Catch: java.lang.Exception -> L31
            r6.zza = r7     // Catch: java.lang.Exception -> L31
            r2 = 1
            r6.zzb = r2     // Catch: java.lang.Exception -> L31
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r6 = f4.E.C(r2, r1, r6)     // Catch: java.lang.Exception -> L31
            if (r6 != r0) goto L60
            return r0
        L31:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L35:
            com.google.android.recaptcha.internal.zzan r1 = r6.zzc
            f4.t r1 = r1.zzf()
            java.lang.Object r0 = r0.f8431a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L42
            r0 = r7
        L42:
            f4.u r1 = (f4.C0521u) r1
            r1.R(r0)
            com.google.android.recaptcha.internal.zzan r0 = r6.zzc
            com.google.android.recaptcha.internal.zzao r1 = com.google.android.recaptcha.internal.zzao.zza
            com.google.android.recaptcha.internal.zzan.zzh(r0, r1)
            com.google.android.recaptcha.internal.zzen r6 = r6.zzd
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r7 = r7.getMessage()
            r0.<init>(r1, r2, r7)
            r6.zzb(r0)
        L60:
            K3.k r6 = K3.k.f2288a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
