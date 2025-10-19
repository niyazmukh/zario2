package com.google.android.gms.internal.fido;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzde.smali */
public final class zzde {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzdd zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzdb zzdbVar = new zzdb(bArr, 0, 0, false, null);
        try {
            zzdbVar.zza(0);
            zzf = zzdbVar;
        } catch (zzdf e5) {
            throw new IllegalArgumentException(e5);
        }
    }
}
