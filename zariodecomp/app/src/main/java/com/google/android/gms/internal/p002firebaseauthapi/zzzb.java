package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkb;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzzb.smali */
public final class zzzb implements zzbd {
    private final ECPrivateKey zza;
    private final zzzd zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzzh zze;
    private final zzlr zzf;
    private final byte[] zzg;

    private zzzb(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzzh zzzhVar, zzlr zzlrVar, byte[] bArr2) {
        this.zza = eCPrivateKey;
        this.zzb = new zzzd(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzzhVar;
        this.zzf = zzlrVar;
        this.zzg = bArr2;
    }

    public static zzbd zza(zzke zzkeVar) throws NoSuchAlgorithmException {
        ECPrivateKey eCPrivateKeyZza = zzzf.zza((zzzi) zzze.zza.zza((zznl<zzzi, zzkb.zzc>) ((zzkb) ((zzlg) zzkeVar.zza())).zzd()), zzne.zza(zzkeVar.zzf().zza(zzbf.zza())));
        byte[] bArrZzb = new byte[0];
        if (((zzkb) ((zzlg) zzkeVar.zza())).zzh() != null) {
            bArrZzb = ((zzkb) ((zzlg) zzkeVar.zza())).zzh().zzb();
        }
        return new zzzb(eCPrivateKeyZza, bArrZzb, zzze.zza(((zzkb) ((zzlg) zzkeVar.zza())).zze()), (zzzh) zzze.zzb.zza((zznl<zzzh, zzkb.zze>) ((zzkb) ((zzlg) zzkeVar.zza())).zzf()), zzln.zza((zzkb) ((zzlg) zzkeVar.zza())), zzkeVar.zzh().zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] zza(byte[] r11, byte[] r12) throws java.security.GeneralSecurityException {
        /*
            r10 = this;
            byte[] r0 = r10.zzg
            boolean r0 = com.google.android.gms.internal.p002firebaseauthapi.zzqn.zza(r0, r11)
            if (r0 == 0) goto L5f
            byte[] r0 = r10.zzg
            int r0 = r0.length
            java.security.interfaces.ECPrivateKey r1 = r10.zza
            java.security.spec.ECParameterSpec r1 = r1.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            com.google.android.gms.internal.firebase-auth-api.zzzh r2 = r10.zze
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzzf.zza(r1)
            int r2 = r2.ordinal()
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            int r1 = r1 * r3
            goto L35
        L29:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "unknown EC point format"
            r10.<init>(r11)
            throw r10
        L31:
            int r1 = r1 + r4
            goto L35
        L33:
            int r1 = r1 * r3
            goto L31
        L35:
            int r2 = r11.length
            int r1 = r1 + r0
            if (r2 < r1) goto L57
            byte[] r4 = java.util.Arrays.copyOfRange(r11, r0, r1)
            com.google.android.gms.internal.firebase-auth-api.zzzd r3 = r10.zzb
            java.lang.String r5 = r10.zzc
            byte[] r6 = r10.zzd
            com.google.android.gms.internal.firebase-auth-api.zzlr r0 = r10.zzf
            int r8 = r0.zza()
            com.google.android.gms.internal.firebase-auth-api.zzzh r9 = r10.zze
            r7 = r12
            byte[] r12 = r3.zza(r4, r5, r6, r7, r8, r9)
            com.google.android.gms.internal.firebase-auth-api.zzlr r10 = r10.zzf
            byte[] r10 = r10.zza(r12, r11, r1)
            return r10
        L57:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
        L5f:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "Invalid ciphertext (output prefix mismatch)"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzzb.zza(byte[], byte[]):byte[]");
    }
}
