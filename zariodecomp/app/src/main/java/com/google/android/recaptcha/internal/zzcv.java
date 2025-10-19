package com.google.android.recaptcha.internal;

import B.l;
import S0.f;
import android.app.Application;
import java.util.UUID;
import kotlin.jvm.internal.i;
import o4.a;
import o4.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzcv.smali */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final zzl zze;
    private final a zzb = d.a();
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();

    public zzcv(Application application) {
        this.zza = application;
        int i = 1;
        this.zze = new zzl(null, i, 0 == true ? 1 : 0);
        int i5 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(915034652, new zzaz(null, 1, null)), new zzaw(915034802, new zzfu()), new zzaw(915034662, new zzbe()), new zzaw(915034909, new zzjd()), new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(915034774, new zzex(0 == true ? 1 : 0, i, 0 == true ? 1 : 0)), new zzaw(915034792, new zzfk(true)), new zzaw(735120228, application), new zzaw(915034663, new zzbf(application)), new zzaw(915034791, new zzfj()), new zzaw(915034643, new zzbm(application)), new zzaw(915034775, new zzfa()), new zzaw(915034787, new zzff())};
        for (int i6 = 0; i6 < 13; i6++) {
            zzaw zzawVar = zzawVarArr[i6];
            if (!zzav.zzc.containsKey(Integer.valueOf(zzawVar.zza()))) {
                zzav.zzc.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) throws zzbd {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (i.a(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j5) throws zzbd {
        if (j5 < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (l.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return i.a(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j5, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, O3.d dVar, int i, Object obj) {
        return zzcvVar.zzg(str, (i & 2) != 0 ? 10000L : j5, null, (i & 8) != 0 ? zzcvVar.zzf : zzbiVar, (i & 16) != 0 ? zzch.zza : zzchVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(java.lang.String r6, int r7, X3.p r8, O3.d r9) throws com.google.android.recaptcha.RecaptchaException, java.util.MissingResourceException {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzcu
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzcu r0 = (com.google.android.recaptcha.internal.zzcu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcu r0 = new com.google.android.recaptcha.internal.zzcu
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.google.android.recaptcha.internal.zzen r5 = r0.zzd
            a.AbstractC0183a.m0(r9)     // Catch: java.lang.Exception -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            goto L4e
        L29:
            r6 = move-exception
            goto L5a
        L2b:
            r6 = move-exception
            goto L72
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a.AbstractC0183a.m0(r9)
            com.google.android.recaptcha.internal.zzbi r9 = r5.zzf
            com.google.android.recaptcha.internal.zzek r5 = r5.zzk(r6, r9, r7)
            r6 = 6
            com.google.android.recaptcha.internal.zzen r6 = r5.zzf(r6)
            r0.zzd = r6     // Catch: java.lang.Exception -> L53 com.google.android.recaptcha.internal.zzbd -> L55
            r0.zzc = r3     // Catch: java.lang.Exception -> L53 com.google.android.recaptcha.internal.zzbd -> L55
            java.lang.Object r9 = r8.invoke(r5, r0)     // Catch: java.lang.Exception -> L53 com.google.android.recaptcha.internal.zzbd -> L55
            if (r9 == r1) goto L52
            r5 = r6
        L4e:
            r5.zza()     // Catch: java.lang.Exception -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            return r9
        L52:
            return r1
        L53:
            r5 = move-exception
            goto L57
        L55:
            r5 = move-exception
            goto L6f
        L57:
            r4 = r6
            r6 = r5
            r5 = r4
        L5a:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r8, r9, r6)
            r5.zzb(r7)
            com.google.android.recaptcha.RecaptchaException r5 = r7.zzc()
            throw r5
        L6f:
            r4 = r6
            r6 = r5
            r5 = r4
        L72:
            r5.zzb(r6)
            com.google.android.recaptcha.RecaptchaException r5 = r6.zzc()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzj(java.lang.String, int, X3.p, O3.d):java.lang.Object");
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i) {
        String string = UUID.randomUUID().toString();
        int i5 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) f.P(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, string, i, this.zza, zzesVar, null);
        zzekVar.zzc(string);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v7, types: [o4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzg(java.lang.String r20, long r21, com.google.android.recaptcha.internal.zzcn r23, com.google.android.recaptcha.internal.zzbi r24, com.google.android.recaptcha.internal.zzch r25, O3.d r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzg(java.lang.String, long, com.google.android.recaptcha.internal.zzcn, com.google.android.recaptcha.internal.zzbi, com.google.android.recaptcha.internal.zzch, O3.d):java.lang.Object");
    }
}
