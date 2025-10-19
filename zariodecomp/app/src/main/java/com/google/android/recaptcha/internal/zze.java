package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zze.smali */
public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[PHI: r15
  0x00c1: PHI (r15v11 java.lang.Object) = (r15v9 java.lang.Object), (r15v9 java.lang.Object), (r15v10 java.lang.Object), (r15v1 java.lang.Object) binds: [B:27:0x007f, B:28:0x0081, B:40:0x00be, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r12, long r13, O3.d r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, O3.d):java.lang.Object");
    }

    public abstract Object zzd(String str, d dVar);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r10 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(long r10, com.google.android.recaptcha.internal.zzsc r12, O3.d r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzd
            K3.k r3 = K3.k.f2288a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L59
            if (r2 == r7) goto L47
            if (r2 == r6) goto L3d
            if (r2 != r5) goto L35
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zzbd r9 = (com.google.android.recaptcha.internal.zzbd) r9
            a.AbstractC0183a.m0(r13)
            goto Lb4
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            a.AbstractC0183a.m0(r13)
            goto L9f
        L47:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            a.AbstractC0183a.m0(r13)     // Catch: java.lang.Exception -> L55
            r8 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            goto L79
        L55:
            r11 = move-exception
            r13 = r9
            r9 = r10
            goto L8c
        L59:
            a.AbstractC0183a.m0(r13)
            com.google.android.recaptcha.internal.zzen r13 = r9.zzb()
            boolean r2 = r9.zza
            if (r2 == 0) goto L68
            r13.zza()
            return r3
        L68:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L88
            r2.<init>(r9, r12, r4)     // Catch: java.lang.Exception -> L88
            r0.zza = r9     // Catch: java.lang.Exception -> L88
            r0.zze = r13     // Catch: java.lang.Exception -> L88
            r0.zzd = r7     // Catch: java.lang.Exception -> L88
            java.lang.Object r10 = f4.E.C(r10, r2, r0)     // Catch: java.lang.Exception -> L88
            if (r10 == r1) goto Lb9
        L79:
            K3.g r10 = (K3.g) r10     // Catch: java.lang.Exception -> L88
            java.lang.Object r10 = r10.f2280a     // Catch: java.lang.Exception -> L88
            a.AbstractC0183a.m0(r10)     // Catch: java.lang.Exception -> L88
            r9.zza = r7     // Catch: java.lang.Exception -> L88
            if (r13 == 0) goto L8b
            r13.zza()     // Catch: java.lang.Exception -> L88
            goto L8b
        L88:
            r10 = move-exception
            r11 = r10
            goto L8c
        L8b:
            return r3
        L8c:
            r10 = 0
            r9.zza = r10
            r0.zza = r9
            r0.zze = r13
            r0.zzd = r6
            java.lang.Object r10 = r9.zzj(r11, r0)
            if (r10 == r1) goto Lb9
            r8 = r10
            r10 = r9
            r9 = r13
            r13 = r8
        L9f:
            r11 = r13
            com.google.android.recaptcha.internal.zzbd r11 = (com.google.android.recaptcha.internal.zzbd) r11
            if (r9 == 0) goto La7
            r9.zzb(r11)
        La7:
            r0.zza = r11
            r0.zze = r4
            r0.zzd = r5
            java.lang.Object r9 = r10.zzg(r11, r0)
            if (r9 == r1) goto Lb9
            r9 = r11
        Lb4:
            K3.f r9 = a.AbstractC0183a.v(r9)
            return r9
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, O3.d):java.lang.Object");
    }

    public abstract Object zzf(String str, d dVar);

    public Object zzg(zzbd zzbdVar, d dVar) {
        return k.f2288a;
    }

    public abstract Object zzh(zzsc zzscVar, d dVar);

    public Object zzi(String str, long j5, Exception exc, d dVar) {
        return k.f2288a;
    }

    public Object zzj(Exception exc, d dVar) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
