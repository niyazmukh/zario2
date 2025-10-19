package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import f4.C0521u;
import f4.E;
import f4.InterfaceC0520t;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzec.smali */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private zzbd zzd;
    private zzsc zze;
    private final zzbi zzg;
    private InterfaceC0520t zzc = E.a();
    private zzcm zzf = zzcm.zza;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzl(X3.l r5, O3.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzdv
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzdv r0 = (com.google.android.recaptcha.internal.zzdv) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdv r0 = new com.google.android.recaptcha.internal.zzdv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.zza
            P3.a r6 = P3.a.f2678a
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            com.google.android.recaptcha.internal.zzbn r5 = r0.zzd
            a.AbstractC0183a.m0(r4)
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            a.AbstractC0183a.m0(r4)
            com.google.android.recaptcha.internal.zzbn r4 = new com.google.android.recaptcha.internal.zzbn
            r4.<init>()
            r0.zzd = r4
            r0.zzc = r2
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 == r6) goto L52
            r5 = r4
        L44:
            r5.zzc()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r5.zza(r4)
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zzl(X3.l, O3.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:25:0x0064, B:30:0x0077, B:31:0x0080), top: B:50:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzm(long r9, O3.d r11) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.google.android.recaptcha.internal.zzdw
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.recaptcha.internal.zzdw r0 = (com.google.android.recaptcha.internal.zzdw) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdw r0 = new com.google.android.recaptcha.internal.zzdw
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.zzb
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            long r8 = r0.zza
            com.google.android.recaptcha.internal.zzec r10 = r0.zze
            a.AbstractC0183a.m0(r11)     // Catch: java.lang.Exception -> L2f
            goto L64
        L2f:
            r8 = move-exception
            goto L84
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            long r9 = r0.zza
            com.google.android.recaptcha.internal.zzec r8 = r0.zze
            a.AbstractC0183a.m0(r11)
            goto L50
        L41:
            a.AbstractC0183a.m0(r11)
            r0.zze = r8
            r0.zza = r9
            r0.zzd = r4
            java.lang.Object r11 = r8.zzn(r9, r0)
            if (r11 == r1) goto Lba
        L50:
            com.google.android.recaptcha.internal.zzdy r11 = new com.google.android.recaptcha.internal.zzdy     // Catch: java.lang.Exception -> L81
            r11.<init>(r9, r8, r5)     // Catch: java.lang.Exception -> L81
            r0.zze = r8     // Catch: java.lang.Exception -> L81
            r0.zza = r9     // Catch: java.lang.Exception -> L81
            r0.zzd = r3     // Catch: java.lang.Exception -> L81
            java.lang.Object r11 = r8.zzl(r11, r0)     // Catch: java.lang.Exception -> L81
            if (r11 == r1) goto Lba
            r6 = r9
            r10 = r8
            r8 = r6
        L64:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Exception -> L2f
            long r0 = r11.longValue()     // Catch: java.lang.Exception -> L2f
            long r8 = r8 - r0
            r0 = 500(0x1f4, double:2.47E-321)
            int r11 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r11 < 0) goto L77
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            return r10
        L77:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd     // Catch: java.lang.Exception -> L2f
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzc     // Catch: java.lang.Exception -> L2f
            com.google.android.recaptcha.internal.zzba r11 = com.google.android.recaptcha.internal.zzba.zzar     // Catch: java.lang.Exception -> L2f
            r8.<init>(r9, r11, r5)     // Catch: java.lang.Exception -> L2f
            throw r8     // Catch: java.lang.Exception -> L2f
        L81:
            r9 = move-exception
            r10 = r8
            r8 = r9
        L84:
            boolean r9 = r8 instanceof com.google.android.recaptcha.internal.zzbd
            if (r9 == 0) goto L8b
            r5 = r8
            com.google.android.recaptcha.internal.zzbd r5 = (com.google.android.recaptcha.internal.zzbd) r5
        L8b:
            if (r5 != 0) goto L9a
            com.google.android.recaptcha.internal.zzbd r5 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r11 = com.google.android.recaptcha.internal.zzba.zzar
            java.lang.String r8 = r8.getMessage()
            r5.<init>(r9, r11, r8)
        L9a:
            com.google.android.recaptcha.internal.zzcm r8 = r10.zzf
            com.google.android.recaptcha.internal.zzci r9 = com.google.android.recaptcha.internal.zzcm.zza()
            boolean r8 = kotlin.jvm.internal.i.a(r8, r9)
            if (r8 != 0) goto Lb4
            com.google.android.recaptcha.internal.zzcm r8 = r10.zzf
            com.google.android.recaptcha.internal.zzck r9 = com.google.android.recaptcha.internal.zzcm.zzc()
            boolean r8 = kotlin.jvm.internal.i.a(r8, r9)
            if (r8 == 0) goto Lb3
            goto Lb4
        Lb3:
            throw r5
        Lb4:
            com.google.android.recaptcha.internal.zzbd r8 = r10.zzd
            if (r8 == 0) goto Lb9
            r5 = r8
        Lb9:
            throw r5
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zzm(long, O3.d):java.lang.Object");
    }

    private final Object zzn(long j5, d dVar) {
        boolean zA = i.a(this.zzf, zzcm.zzb);
        k kVar = k.f2288a;
        if (zA || i.a(this.zzf, zzcm.zzc) || (i.a(this.zzf, zzcm.zzd) && !zzo(this.zzd))) {
            return kVar;
        }
        this.zzf = zzcm.zzc;
        C0521u c0521uA = E.a();
        this.zzc = c0521uA;
        E.t(this.zzg.zza(), null, null, new zzeb(this, c0521uA, j5, null), 3);
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (i.a(zzbdVar.zzb(), zzbb.zzd) || i.a(zzbdVar.zzb(), zzbb.zze) || i.a(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(java.lang.String r11, com.google.android.recaptcha.RecaptchaAction r12, long r13, O3.d r15) throws com.google.android.recaptcha.internal.zzbd {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zza(java.lang.String, com.google.android.recaptcha.RecaptchaAction, long, O3.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j5, d dVar) {
        Object objZzn = zzn(j5, dVar);
        return objZzn == a.f2678a ? objZzn : k.f2288a;
    }
}
