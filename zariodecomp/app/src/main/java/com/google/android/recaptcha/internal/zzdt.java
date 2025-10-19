package com.google.android.recaptcha.internal;

import K3.c;
import L3.j;
import L3.l;
import L3.x;
import O3.d;
import S0.f;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import f4.E;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.MissingResourceException;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzdt.smali */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final c zzd;
    private final c zze;
    private final c zzf;
    private final c zzg;
    private final c zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i = zzav.zza;
        this.zzd = f.P(zzdm.zza);
        this.zze = f.P(zzdn.zza);
        this.zzf = f.P(zzdo.zza);
        this.zzg = f.P(zzdp.zza);
        this.zzh = f.P(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zzekVarZza = this.zzb.zza();
        zzekVarZza.zzc(str);
        return zzekVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzv(com.google.android.recaptcha.internal.zzsc r10, long r11, O3.d r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzv(com.google.android.recaptcha.internal.zzsc, long, O3.d):java.lang.Object");
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return j.u0(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) throws zzbd {
        try {
            zzrv zzrvVarZzj = zzrv.zzj(zzbt.zza(str));
            int i = zzav.zza;
            ((zzfu) f.P(zzde.zza).getValue()).zza(zzrvVarZzj);
        } catch (Exception e5) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e5.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzsoVarZzf = zzsp.zzf();
        zzsoVarZzf.zzs(this.zza);
        zzsoVarZzf.zze(recaptchaAction.getAction());
        zzsoVarZzf.zzf(zzscVar.zzN());
        zzsoVarZzf.zzq(zzscVar.zzM());
        zzsoVarZzf.zzr(zzsiVar);
        return (zzsp) zzsoVarZzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzl(java.lang.String r6, long r7, O3.d r9) throws java.util.MissingResourceException, com.google.android.recaptcha.internal.zzbd {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdd
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdd r0 = (com.google.android.recaptcha.internal.zzdd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdd r0 = new com.google.android.recaptcha.internal.zzdd
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.google.android.recaptcha.internal.zzen r5 = r0.zzd
            a.AbstractC0183a.m0(r9)     // Catch: java.lang.Exception -> L29 f4.D0 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            goto L53
        L29:
            r6 = move-exception
            goto L64
        L2b:
            r6 = move-exception
            goto L76
        L2d:
            r6 = move-exception
            goto L88
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            a.AbstractC0183a.m0(r9)
            com.google.android.recaptcha.internal.zzek r9 = r5.zzu(r6)
            r2 = 27
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzl r5 = r5.zzc     // Catch: java.lang.Exception -> L5a f4.D0 -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            r0.zzd = r9     // Catch: java.lang.Exception -> L5a f4.D0 -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            r0.zzc = r3     // Catch: java.lang.Exception -> L5a f4.D0 -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            java.lang.Object r5 = r5.zzb(r6, r7, r0)     // Catch: java.lang.Exception -> L5a f4.D0 -> L5d com.google.android.recaptcha.internal.zzbd -> L60
            if (r5 == r1) goto L59
            r4 = r9
            r9 = r5
            r5 = r4
        L53:
            com.google.android.recaptcha.internal.zzsi r9 = (com.google.android.recaptcha.internal.zzsi) r9     // Catch: java.lang.Exception -> L29 f4.D0 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            r5.zza()     // Catch: java.lang.Exception -> L29 f4.D0 -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            return r9
        L59:
            return r1
        L5a:
            r5 = move-exception
            r6 = r5
            goto L63
        L5d:
            r5 = move-exception
            r6 = r5
            goto L75
        L60:
            r5 = move-exception
            r6 = r5
            goto L87
        L63:
            r5 = r9
        L64:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r8, r9, r6)
            r5.zzb(r7)
            throw r7
        L75:
            r5 = r9
        L76:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r8, r9, r6)
            r5.zzb(r7)
            throw r7
        L87:
            r5 = r9
        L88:
            r5.zzb(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzl(java.lang.String, long, O3.d):java.lang.Object");
    }

    public final Object zzm(zzsp zzspVar, String str, long j5, d dVar) {
        return E.B(this.zzi.zza().e(), new zzdg(this, str, j5, zzspVar, (d) null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzn(com.google.android.recaptcha.internal.zzsc r11, long r12, O3.d r14) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzdk
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzdk r0 = (com.google.android.recaptcha.internal.zzdk) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdk r0 = new com.google.android.recaptcha.internal.zzdk
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            a.AbstractC0183a.m0(r14)     // Catch: java.lang.Exception -> L27 f4.D0 -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            goto L4b
        L27:
            r10 = move-exception
            goto L4e
        L29:
            r10 = move-exception
            goto L5c
        L2b:
            r10 = move-exception
            goto L6a
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            a.AbstractC0183a.m0(r14)
            com.google.android.recaptcha.internal.zzdl r14 = new com.google.android.recaptcha.internal.zzdl     // Catch: java.lang.Exception -> L27 f4.D0 -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Exception -> L27 f4.D0 -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            r0.zzc = r3     // Catch: java.lang.Exception -> L27 f4.D0 -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            java.lang.Object r10 = f4.E.C(r12, r14, r0)     // Catch: java.lang.Exception -> L27 f4.D0 -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            if (r10 != r1) goto L4b
            return r1
        L4b:
            K3.k r10 = K3.k.f2288a
            return r10
        L4e:
            com.google.android.recaptcha.internal.zzbd r11 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r12 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r13 = com.google.android.recaptcha.internal.zzba.zzap
            java.lang.String r10 = r10.getMessage()
            r11.<init>(r12, r13, r10)
            throw r11
        L5c:
            com.google.android.recaptcha.internal.zzbd r11 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r12 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r13 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r10 = r10.getMessage()
            r11.<init>(r12, r13, r10)
            throw r11
        L6a:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzn(com.google.android.recaptcha.internal.zzsc, long, O3.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzo(long r7, O3.d r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdr
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdr r0 = (com.google.android.recaptcha.internal.zzdr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdr r0 = new com.google.android.recaptcha.internal.zzdr
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            com.google.android.recaptcha.internal.zzen r6 = r0.zze
            com.google.android.recaptcha.internal.zzdt r7 = r0.zzd
            a.AbstractC0183a.m0(r9)     // Catch: java.lang.Exception -> L2b f4.D0 -> L2d com.google.android.recaptcha.internal.zzbd -> L30
            goto L5e
        L2b:
            r8 = move-exception
            goto L70
        L2d:
            r8 = move-exception
            goto L87
        L30:
            r8 = move-exception
            r9 = r6
            r6 = r7
            goto L9c
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            a.AbstractC0183a.m0(r9)
            com.google.android.recaptcha.internal.zzek r9 = r6.zzb
            r2 = 22
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzds r2 = new com.google.android.recaptcha.internal.zzds     // Catch: java.lang.Exception -> L68 f4.D0 -> L6a com.google.android.recaptcha.internal.zzbd -> L6c
            r4 = 0
            r2.<init>(r6, r9, r4)     // Catch: java.lang.Exception -> L68 f4.D0 -> L6a com.google.android.recaptcha.internal.zzbd -> L6c
            r0.zzd = r6     // Catch: java.lang.Exception -> L68 f4.D0 -> L6a com.google.android.recaptcha.internal.zzbd -> L6c
            r0.zze = r9     // Catch: java.lang.Exception -> L68 f4.D0 -> L6a com.google.android.recaptcha.internal.zzbd -> L6c
            r0.zzc = r3     // Catch: java.lang.Exception -> L68 f4.D0 -> L6a com.google.android.recaptcha.internal.zzbd -> L6c
            java.lang.Object r7 = f4.E.C(r7, r2, r0)     // Catch: java.lang.Exception -> L68 f4.D0 -> L6a com.google.android.recaptcha.internal.zzbd -> L6c
            if (r7 == r1) goto L61
            r5 = r7
            r7 = r6
            r6 = r9
            r9 = r5
        L5e:
            com.google.android.recaptcha.internal.zzsc r9 = (com.google.android.recaptcha.internal.zzsc) r9     // Catch: java.lang.Exception -> L2b f4.D0 -> L2d com.google.android.recaptcha.internal.zzbd -> L30
            return r9
        L61:
            return r1
        L62:
            r8 = r7
            goto L6e
        L64:
            r8 = r7
            goto L85
        L66:
            r8 = r7
            goto L9c
        L68:
            r7 = move-exception
            goto L62
        L6a:
            r7 = move-exception
            goto L64
        L6c:
            r7 = move-exception
            goto L66
        L6e:
            r7 = r6
            r6 = r9
        L70:
            com.google.android.recaptcha.internal.zzbd r9 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzaw
            java.lang.String r2 = r8.getMessage()
            r9.<init>(r0, r1, r2)
            com.google.android.recaptcha.internal.zzbd r7 = r7.zzs(r8, r9)
            r6.zzb(r7)
            throw r7
        L85:
            r7 = r6
            r6 = r9
        L87:
            com.google.android.recaptcha.internal.zzbd r9 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r2 = r8.getMessage()
            r9.<init>(r0, r1, r2)
            com.google.android.recaptcha.internal.zzbd r7 = r7.zzs(r8, r9)
            r6.zzb(r7)
            throw r7
        L9c:
            com.google.android.recaptcha.internal.zzbb r7 = r8.zzb()
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzc
            boolean r7 = kotlin.jvm.internal.i.a(r7, r0)
            if (r7 == 0) goto Lac
            com.google.android.recaptcha.internal.zzbd r8 = r6.zzs(r8, r8)
        Lac:
            r9.zzb(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzo(long, O3.d):java.lang.Object");
    }

    public final void zzq(String str, zzsr zzsrVar) throws MissingResourceException {
        zzen zzenVarZzf = zzu(str).zzf(29);
        try {
            List<zzst> listZzk = zzsrVar.zzk();
            int iA0 = x.a0(l.a0(listZzk));
            if (iA0 < 16) {
                iA0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA0);
            for (zzst zzstVar : listZzk) {
                linkedHashMap.put(zzstVar.zzg(), zzstVar.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzenVarZzf.zza();
        } catch (zzbd e5) {
            zzenVarZzf.zzb(e5);
        } catch (Exception e6) {
            zzenVarZzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e6.getMessage()));
        }
    }
}
