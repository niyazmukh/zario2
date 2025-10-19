package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import e4.d;
import f4.E;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzdc.smali */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final d zza = new d();
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final void zze(zzdc zzdcVar, long j5, RecaptchaAction recaptchaAction) throws zzbd {
        d dVar = zza;
        String input = recaptchaAction.getAction();
        dVar.getClass();
        i.e(input, "input");
        zzbd zzbdVar = !dVar.f6956a.matcher(input).matches() ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j5 < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(com.google.android.recaptcha.RecaptchaAction r12, long r13, O3.d r15) throws java.util.MissingResourceException {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.google.android.recaptcha.internal.zzcy
            if (r0 == 0) goto L13
            r0 = r15
            com.google.android.recaptcha.internal.zzcy r0 = (com.google.android.recaptcha.internal.zzcy) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcy r0 = new com.google.android.recaptcha.internal.zzcy
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a.AbstractC0183a.m0(r15)     // Catch: com.google.android.recaptcha.internal.zzbd -> L27
            goto L50
        L27:
            r11 = move-exception
            goto L55
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            a.AbstractC0183a.m0(r15)
            java.util.UUID r15 = java.util.UUID.randomUUID()     // Catch: com.google.android.recaptcha.internal.zzbd -> L27
            java.lang.String r15 = r15.toString()     // Catch: com.google.android.recaptcha.internal.zzbd -> L27
            com.google.android.recaptcha.internal.zzcz r2 = new com.google.android.recaptcha.internal.zzcz     // Catch: com.google.android.recaptcha.internal.zzbd -> L27
            r10 = 0
            r4 = r2
            r5 = r11
            r6 = r13
            r8 = r12
            r9 = r15
            r4.<init>(r5, r6, r8, r9, r10)     // Catch: com.google.android.recaptcha.internal.zzbd -> L27
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L27
            java.lang.Object r15 = r11.zzg(r15, r2, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L27
            if (r15 != r1) goto L50
            return r1
        L50:
            K3.g r15 = (K3.g) r15     // Catch: com.google.android.recaptcha.internal.zzbd -> L27
            java.lang.Object r11 = r15.f2280a     // Catch: com.google.android.recaptcha.internal.zzbd -> L27
            goto L5d
        L55:
            com.google.android.recaptcha.RecaptchaException r11 = r11.zzc()
            K3.f r11 = a.AbstractC0183a.v(r11)
        L5d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.zzf(com.google.android.recaptcha.RecaptchaAction, long, O3.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzg(java.lang.String r6, X3.p r7, O3.d r8) throws java.util.MissingResourceException, com.google.android.recaptcha.internal.zzbd {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzdb
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzdb r0 = (com.google.android.recaptcha.internal.zzdb) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdb r0 = new com.google.android.recaptcha.internal.zzdb
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.google.android.recaptcha.internal.zzen r5 = r0.zzd
            a.AbstractC0183a.m0(r8)     // Catch: java.lang.Exception -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            goto L52
        L29:
            r6 = move-exception
            goto L5e
        L2b:
            r6 = move-exception
            goto L72
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a.AbstractC0183a.m0(r8)
            com.google.android.recaptcha.internal.zzek r5 = r5.zzd
            com.google.android.recaptcha.internal.zzek r5 = r5.zza()
            r5.zzc(r6)
            r6 = 9
            com.google.android.recaptcha.internal.zzen r6 = r5.zzf(r6)
            r0.zzd = r6     // Catch: java.lang.Exception -> L57 com.google.android.recaptcha.internal.zzbd -> L59
            r0.zzc = r3     // Catch: java.lang.Exception -> L57 com.google.android.recaptcha.internal.zzbd -> L59
            java.lang.Object r8 = r7.invoke(r5, r0)     // Catch: java.lang.Exception -> L57 com.google.android.recaptcha.internal.zzbd -> L59
            if (r8 == r1) goto L56
            r5 = r6
        L52:
            r5.zza()     // Catch: java.lang.Exception -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            return r8
        L56:
            return r1
        L57:
            r5 = move-exception
            goto L5b
        L59:
            r5 = move-exception
            goto L6f
        L5b:
            r4 = r6
            r6 = r5
            r5 = r4
        L5e:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzX
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r8, r0, r6)
            r5.zzb(r7)
            throw r7
        L6f:
            r4 = r6
            r6 = r5
            r5 = r4
        L72:
            r5.zzb(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.zzg(java.lang.String, X3.p, O3.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r5, long r6, O3.d r8) throws java.util.MissingResourceException {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzcw
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzcw r0 = (com.google.android.recaptcha.internal.zzcw) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcw r0 = new com.google.android.recaptcha.internal.zzcw
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            a.AbstractC0183a.m0(r8)
            K3.g r8 = (K3.g) r8
            java.lang.Object r4 = r8.f2280a
            goto L3f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            a.AbstractC0183a.m0(r8)
            r0.zzc = r3
            java.lang.Object r4 = r4.zzf(r5, r6, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.mo3execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, O3.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo4executegIAlus(com.google.android.recaptcha.RecaptchaAction r5, O3.d r6) throws java.util.MissingResourceException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzcx
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcx r0 = new com.google.android.recaptcha.internal.zzcx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            a.AbstractC0183a.m0(r6)
            K3.g r6 = (K3.g) r6
            java.lang.Object r4 = r6.f2280a
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            a.AbstractC0183a.m0(r6)
            r0.zzc = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r4 = r4.mo3execute0E7RQCE(r5, r2, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.mo4executegIAlus(com.google.android.recaptcha.RecaptchaAction, O3.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzas.zza(E.e(this.zze.zzb(), new zzda(this, recaptchaAction, 10000L, null)));
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j5) {
        return zzas.zza(E.e(this.zze.zzb(), new zzda(this, recaptchaAction, j5, null)));
    }
}
