package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzbq.smali */
public final class zzbq {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[PHI: r0
  0x007f: PHI (r0v4 java.lang.Object) = (r0v6 java.lang.Object), (r0v1 java.lang.Object) binds: [B:23:0x007c, B:17:0x0058] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00aa -> B:13:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(X3.l r18, long r19, long r21, double r23, X3.l r25, O3.d r26) throws java.lang.Exception {
        /*
            r17 = this;
            r0 = r26
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzbp
            if (r1 == 0) goto L15
            r1 = r0
            com.google.android.recaptcha.internal.zzbp r1 = (com.google.android.recaptcha.internal.zzbp) r1
            int r2 = r1.zzh
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.zzh = r2
            goto L1c
        L15:
            com.google.android.recaptcha.internal.zzbp r1 = new com.google.android.recaptcha.internal.zzbp
            r2 = r17
            r1.<init>(r2, r0)
        L1c:
            java.lang.Object r0 = r1.zzf
            P3.a r2 = P3.a.f2678a
            int r3 = r1.zzh
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L5e
            if (r3 == r5) goto L4a
            if (r3 != r4) goto L42
            long r6 = r1.zzd
            double r8 = r1.zze
            long r10 = r1.zzc
            java.lang.Object r3 = r1.zzb
            X3.l r3 = (X3.l) r3
            java.lang.Object r12 = r1.zza
            X3.l r12 = (X3.l) r12
            a.AbstractC0183a.m0(r0)
        L3b:
            r14 = r12
            r12 = r1
            r1 = r14
            r15 = r8
            r8 = r10
            r10 = r15
            goto L6c
        L42:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4a:
            long r6 = r1.zzd
            double r8 = r1.zze
            long r10 = r1.zzc
            java.lang.Object r3 = r1.zzb
            X3.l r3 = (X3.l) r3
            java.lang.Object r12 = r1.zza
            X3.l r12 = (X3.l) r12
            a.AbstractC0183a.m0(r0)     // Catch: java.lang.Exception -> L5c
            goto L7f
        L5c:
            r0 = move-exception
            goto L87
        L5e:
            a.AbstractC0183a.m0(r0)
            r6 = r19
            r8 = r21
            r10 = r23
            r3 = r25
            r12 = r1
            r1 = r18
        L6c:
            r12.zza = r1     // Catch: java.lang.Exception -> L80
            r12.zzb = r3     // Catch: java.lang.Exception -> L80
            r12.zzc = r8     // Catch: java.lang.Exception -> L80
            r12.zze = r10     // Catch: java.lang.Exception -> L80
            r12.zzd = r6     // Catch: java.lang.Exception -> L80
            r12.zzh = r5     // Catch: java.lang.Exception -> L80
            java.lang.Object r0 = r3.invoke(r12)     // Catch: java.lang.Exception -> L80
            if (r0 != r2) goto L7f
            return r2
        L7f:
            return r0
        L80:
            r0 = move-exception
            r14 = r12
            r12 = r1
            r1 = r14
            r15 = r8
            r8 = r10
            r10 = r15
        L87:
            java.lang.Object r13 = r12.invoke(r0)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lae
            double r6 = (double) r6
            double r6 = r6 * r8
            long r6 = (long) r6
            long r6 = S0.f.v(r6, r10)
            r1.zza = r12
            r1.zzb = r3
            r1.zzc = r10
            r1.zze = r8
            r1.zzd = r6
            r1.zzh = r4
            java.lang.Object r0 = f4.E.h(r6, r1)
            if (r0 == r2) goto Lad
            goto L3b
        Lad:
            return r2
        Lae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbq.zza(X3.l, long, long, double, X3.l, O3.d):java.lang.Object");
    }
}
