package com.google.android.gms.internal.fido;

import java.io.IOException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzch.smali */
public abstract class zzch {
    private static final zzch zza = new zzcf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzch zzb = new zzcf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzch zzc = new zzcg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzch zzd = new zzcg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzch zze = new zzce("base16()", "0123456789ABCDEF");

    public static zzch zzf() {
        return zze;
    }

    public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i5);

    public abstract int zzc(int i);

    public abstract zzch zzd();

    public final String zzg(byte[] bArr, int i, int i5) {
        zzap.zze(0, i5, bArr.length);
        StringBuilder sb = new StringBuilder(zzc(i5));
        try {
            zzb(sb, bArr, 0, i5);
            return sb.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}
