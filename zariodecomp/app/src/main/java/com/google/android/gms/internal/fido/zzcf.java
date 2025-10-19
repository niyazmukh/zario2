package com.google.android.gms.internal.fido;

import java.io.IOException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzcf.smali */
final class zzcf extends zzcg {
    private zzcf(zzcd zzcdVar, Character ch) {
        super(zzcdVar, ch);
        zzap.zzc(zzcdVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    public final zzch zza(zzcd zzcdVar, Character ch) {
        return new zzcf(zzcdVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i5) throws IOException {
        int i6 = 0;
        zzap.zze(0, i5, bArr.length);
        for (int i7 = i5; i7 >= 3; i7 -= 3) {
            int i8 = bArr[i6] & 255;
            int i9 = ((bArr[i6 + 1] & 255) << 8) | (i8 << 16) | (bArr[i6 + 2] & 255);
            appendable.append(this.zzb.zza(i9 >>> 18));
            appendable.append(this.zzb.zza((i9 >>> 12) & 63));
            appendable.append(this.zzb.zza((i9 >>> 6) & 63));
            appendable.append(this.zzb.zza(i9 & 63));
            i6 += 3;
        }
        if (i6 < i5) {
            zze(appendable, bArr, i6, i5 - i6);
        }
    }

    public zzcf(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }
}
