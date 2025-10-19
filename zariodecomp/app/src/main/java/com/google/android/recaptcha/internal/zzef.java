package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzef.smali */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb = zzcm.zza;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        this.zza = zzdtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(java.lang.String r18, com.google.android.recaptcha.RecaptchaAction r19, long r20, O3.d r22) throws com.google.android.recaptcha.internal.zzbd {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zza(java.lang.String, com.google.android.recaptcha.RecaptchaAction, long, O3.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (r12.zza.zzn(r15, (long) r13, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb(long r13, O3.d r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.google.android.recaptcha.internal.zzee
            if (r0 == 0) goto L13
            r0 = r15
            com.google.android.recaptcha.internal.zzee r0 = (com.google.android.recaptcha.internal.zzee) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzee r0 = new com.google.android.recaptcha.internal.zzee
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.zzb
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzd
            K3.k r3 = K3.k.f2288a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            com.google.android.recaptcha.internal.zzef r12 = r0.zze
            a.AbstractC0183a.m0(r15)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            goto L96
        L2e:
            r13 = move-exception
            goto L9e
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            double r12 = r0.zza
            com.google.android.recaptcha.internal.zzef r14 = r0.zze
            a.AbstractC0183a.m0(r15)     // Catch: com.google.android.recaptcha.internal.zzbd -> L44
            r10 = r12
            r12 = r14
            r13 = r10
            goto L85
        L44:
            r13 = move-exception
            r12 = r14
            goto L9e
        L47:
            a.AbstractC0183a.m0(r15)
            com.google.android.recaptcha.internal.zzcm r15 = r12.zzb
            com.google.android.recaptcha.internal.zzcj r2 = com.google.android.recaptcha.internal.zzcm.zzb()
            boolean r15 = kotlin.jvm.internal.i.a(r15, r2)
            if (r15 != 0) goto La5
            com.google.android.recaptcha.internal.zzcm r15 = r12.zzb
            com.google.android.recaptcha.internal.zzci r2 = com.google.android.recaptcha.internal.zzcm.zza()
            boolean r15 = kotlin.jvm.internal.i.a(r15, r2)
            if (r15 == 0) goto L63
            goto La5
        L63:
            com.google.android.recaptcha.internal.zzck r15 = com.google.android.recaptcha.internal.zzcm.zzc()
            r12.zzb = r15
            double r13 = (double) r13
            com.google.android.recaptcha.internal.zzdt r15 = r12.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r6 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r6 = r6 * r13
            r0.zze = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r8 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r13 = r13 * r8
            r0.zza = r13     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r0.zzd = r5     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            long r5 = (long) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            java.lang.Object r15 = r15.zzo(r5, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            if (r15 == r1) goto L9d
        L85:
            com.google.android.recaptcha.internal.zzsc r15 = (com.google.android.recaptcha.internal.zzsc) r15     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r12.zzc = r15     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            com.google.android.recaptcha.internal.zzdt r2 = r12.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            long r13 = (long) r13     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r0.zze = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            java.lang.Object r13 = r2.zzn(r15, r13, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            if (r13 == r1) goto L9d
        L96:
            com.google.android.recaptcha.internal.zzcj r13 = com.google.android.recaptcha.internal.zzcm.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r12.zzb = r13     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            return r3
        L9d:
            return r1
        L9e:
            com.google.android.recaptcha.internal.zzci r14 = com.google.android.recaptcha.internal.zzcm.zza()
            r12.zzb = r14
            throw r13
        La5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zzb(long, O3.d):java.lang.Object");
    }
}
