package com.google.android.recaptcha.internal;

import O3.d;
import android.content.Context;
import f4.C;
import f4.E;
import java.nio.charset.StandardCharsets;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzae.smali */
public final class zzae implements zzy {
    private final zzek zza;
    private final Context zzb;
    private final zzan zzc;
    private boolean zzd = true;
    private String zze = "";
    private final zzbs zzf;

    public zzae(zzek zzekVar, Context context, C c5, zzan zzanVar, zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzkhVarZzg = zzkh.zzg();
        byte[] bArrZzl = zzleVar.zzl();
        byte[] bArrZzd = zzjz.zza().zza(zzkhVarZzg.zzi(bArrZzl, 0, bArrZzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzleVarZzk = zzle.zzk(bArrZzd, 0, bArrZzd.length);
        zzkh zzkhVarZzh = zzkh.zzh();
        byte[] bArrZzl2 = zzleVarZzk.zzl();
        return zzkhVarZzh.zzi(bArrZzl2, 0, bArrZzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, d dVar) {
        return E.g(new zzac(this, str, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzd(com.google.android.recaptcha.internal.zzse r12, O3.d r13) throws java.util.MissingResourceException {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzad
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzad r0 = (com.google.android.recaptcha.internal.zzad) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzad r0 = new com.google.android.recaptcha.internal.zzad
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzd
            K3.k r3 = K3.k.f2288a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zzen r11 = (com.google.android.recaptcha.internal.zzen) r11
            a.AbstractC0183a.m0(r13)
            goto L8e
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            com.google.android.recaptcha.internal.zzen r11 = r0.zze
            java.lang.Object r12 = r0.zza
            com.google.android.recaptcha.internal.zzae r12 = (com.google.android.recaptcha.internal.zzae) r12
            a.AbstractC0183a.m0(r13)
            r13 = r11
            r11 = r12
            goto L7e
        L45:
            a.AbstractC0183a.m0(r13)
            com.google.android.recaptcha.internal.zzen r13 = com.google.android.recaptcha.internal.zzz.zzc(r11)
            com.google.android.recaptcha.internal.zzbs r2 = r11.zzf
            android.content.Context r7 = r11.zzb
            int r2 = r2.zza(r7)
            r7 = 3
            if (r2 != r7) goto L93
            long r7 = r12.zzf()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L62
            goto L93
        L62:
            com.google.android.recaptcha.internal.zzle r2 = r12.zzg()
            java.lang.String r2 = zzi(r2)
            r11.zze = r2
            com.google.android.recaptcha.internal.zzan r2 = r11.zzc
            long r7 = r12.zzf()
            r0.zza = r11
            r0.zze = r13
            r0.zzd = r6
            java.lang.Object r12 = r2.zzd(r7, r0)
            if (r12 == r1) goto L92
        L7e:
            com.google.android.recaptcha.internal.zzan r11 = r11.zzc
            r0.zza = r13
            r0.zze = r4
            r0.zzd = r5
            java.lang.Object r11 = r11.zze(r0)
            if (r11 != r1) goto L8d
            goto L92
        L8d:
            r11 = r13
        L8e:
            r11.zza()
            return r3
        L92:
            return r1
        L93:
            r12 = 0
            r11.zzd = r12
            com.google.android.recaptcha.internal.zzbd r11 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r12 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzab
            r11.<init>(r12, r0, r4)
            r13.zzb(r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzae.zzd(com.google.android.recaptcha.internal.zzse, O3.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
