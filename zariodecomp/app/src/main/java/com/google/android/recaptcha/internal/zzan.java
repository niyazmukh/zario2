package com.google.android.recaptcha.internal;

import K3.k;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import f4.C;
import f4.InterfaceC0520t;
import o4.a;
import o4.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzan.smali */
public final class zzan {
    public InterfaceC0520t zza;
    private final C zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final a zzg = d.a();

    public zzan(Context context, C c5, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j5) {
        this.zzb = c5;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(O3.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzag
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzag r0 = (com.google.android.recaptcha.internal.zzag) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzag r0 = new com.google.android.recaptcha.internal.zzag
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0183a.m0(r7)
            goto L53
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0183a.m0(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r4 = r6.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = r7.setCloudProjectNumber(r4)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r7 = r7.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r6 = r6.zzd
            com.google.android.gms.tasks.Task r6 = r6.prepareIntegrityToken(r7)
            f4.H r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzi(O3.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(java.lang.String r6, O3.d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0183a.m0(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.String r6 = r0.zzd
            a.AbstractC0183a.m0(r7)
            goto L4b
        L38:
            a.AbstractC0183a.m0(r7)
            f4.t r5 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            f4.u r5 = (f4.C0521u) r5
            java.lang.Object r7 = r5.k(r0)
            if (r7 == r1) goto L74
        L4b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r5 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r5 = r5.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r5 = r5.build()
            com.google.android.gms.tasks.Task r5 = r7.request(r5)
            f4.H r5 = com.google.android.recaptcha.internal.zzbx.zza(r5)
            r6 = 0
            r0.zzd = r6
            r0.zzc = r3
            java.lang.Object r7 = r5.await(r0)
            if (r7 != r1) goto L6d
            goto L74
        L6d:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r5 = r7.token()
            return r5
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, O3.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r8, O3.d r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            a.AbstractC0183a.m0(r9)
            goto L75
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r8 = r0.zzd
            a.AbstractC0183a.m0(r9)
            goto L68
        L3d:
            java.lang.String r8 = r0.zze
            com.google.android.recaptcha.internal.zzan r7 = r0.zzd
            a.AbstractC0183a.m0(r9)     // Catch: java.lang.Exception -> L58
            goto L55
        L45:
            a.AbstractC0183a.m0(r9)
            r0.zzd = r7     // Catch: java.lang.Exception -> L58
            r0.zze = r8     // Catch: java.lang.Exception -> L58
            r0.zzc = r5     // Catch: java.lang.Exception -> L58
            java.lang.Object r9 = r7.zzj(r8, r0)     // Catch: java.lang.Exception -> L58
            if (r9 != r1) goto L55
            return r1
        L55:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L58
            goto L77
        L58:
            r0.zzd = r7
            r0.zze = r8
            r0.zzc = r4
            java.lang.Object r9 = r7.zze(r0)
            if (r9 != r1) goto L65
            return r1
        L65:
            r6 = r8
            r8 = r7
            r7 = r6
        L68:
            r9 = 0
            r0.zzd = r9
            r0.zze = r9
            r0.zzc = r3
            java.lang.Object r9 = r8.zzj(r7, r0)
            if (r9 == r1) goto L78
        L75:
            java.lang.String r9 = (java.lang.String) r9
        L77:
            return r9
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, O3.d):java.lang.Object");
    }

    public final Object zzd(long j5, O3.d dVar) {
        this.zzf = j5;
        return k.f2288a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v4, types: [o4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(O3.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzak
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzak r0 = (com.google.android.recaptcha.internal.zzak) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzak r0 = new com.google.android.recaptcha.internal.zzak
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzd
            K3.k r3 = K3.k.f2288a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            a.AbstractC0183a.m0(r13)
            goto Lb1
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            java.lang.Object r12 = r0.zza
            o4.a r12 = (o4.a) r12
            com.google.android.recaptcha.internal.zzan r2 = r0.zze
            a.AbstractC0183a.m0(r13)
            r13 = r12
            r12 = r2
            goto L54
        L41:
            a.AbstractC0183a.m0(r13)
            o4.a r13 = r12.zzg
            r0.zze = r12
            r0.zza = r13
            r0.zzd = r5
            o4.c r13 = (o4.c) r13
            java.lang.Object r2 = r13.c(r0)
            if (r2 == r1) goto Lb9
        L54:
            r2 = 0
            com.google.android.recaptcha.internal.zzao r6 = r12.zze     // Catch: java.lang.Throwable -> Lb2
            com.google.android.recaptcha.internal.zzao r7 = com.google.android.recaptcha.internal.zzao.zza     // Catch: java.lang.Throwable -> Lb2
            boolean r6 = kotlin.jvm.internal.i.a(r6, r7)     // Catch: java.lang.Throwable -> Lb2
            if (r6 != 0) goto L65
            o4.c r13 = (o4.c) r13
            r13.e(r2)
            return r3
        L65:
            com.google.android.recaptcha.internal.zzao r6 = com.google.android.recaptcha.internal.zzao.zzb     // Catch: java.lang.Throwable -> Lb2
            r12.zze = r6     // Catch: java.lang.Throwable -> Lb2
            o4.c r13 = (o4.c) r13
            r13.e(r2)
            com.google.android.recaptcha.internal.zzek r13 = r12.zzc
            java.lang.String r6 = r13.zzd()
            r13.zzc(r6)
            r13.zzb(r4)
            r6 = 38
            com.google.android.recaptcha.internal.zzen r13 = r13.zzf(r6)
            f4.u r6 = f4.E.a()
            r12.zza = r6
            f4.C r6 = r12.zzb
            com.google.android.recaptcha.internal.zzam r7 = new com.google.android.recaptcha.internal.zzam
            r7.<init>(r12, r13, r2)
            r13 = 3
            f4.E.t(r6, r2, r2, r7, r13)
            r0.zze = r2
            r0.zza = r2
            r0.zzd = r4
            boolean r13 = r12.zzh
            if (r13 != 0) goto Lae
            java.util.Timer r6 = new java.util.Timer
            r6.<init>()
            com.google.android.recaptcha.internal.zzai r7 = new com.google.android.recaptcha.internal.zzai
            r7.<init>(r12)
            r10 = 28800000(0x1b77400, double:1.42290906E-316)
            r8 = r10
            r6.schedule(r7, r8, r10)
            r12.zzh = r5
        Lae:
            if (r3 != r1) goto Lb1
            goto Lb9
        Lb1:
            return r3
        Lb2:
            r12 = move-exception
            o4.c r13 = (o4.c) r13
            r13.e(r2)
            throw r12
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zze(O3.d):java.lang.Object");
    }

    public final InterfaceC0520t zzf() {
        InterfaceC0520t interfaceC0520t = this.zza;
        if (interfaceC0520t != null) {
            return interfaceC0520t;
        }
        return null;
    }
}
