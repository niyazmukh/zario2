package com.google.android.gms.internal.fido;

import B.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzct.smali */
final class zzct extends zzcw {
    private final int zzc;
    private final int zzd;

    public zzct(byte[] bArr, int i, int i5) {
        super(bArr);
        zzcz.zzj(i, i + i5, bArr.length);
        this.zzc = i;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte zza(int i) {
        int i5 = this.zzd;
        if (((i5 - (i + 1)) | i) >= 0) {
            return this.zza[this.zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(a.g(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a.h("Index > length: ", i, i5, ", "));
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.fido.zzcw
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final void zze(byte[] bArr, int i, int i5, int i6) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i6);
    }
}
