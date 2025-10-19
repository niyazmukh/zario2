package com.google.android.gms.internal.auth;

import B.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzdy.smali */
final class zzdy extends zzeb {
    private final int zzc;

    public zzdy(byte[] bArr, int i, int i5) {
        super(bArr);
        zzee.zzi(0, i5, bArr.length);
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zza(int i) {
        int i5 = this.zzc;
        if (((i5 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(a.g(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a.h("Index > length: ", i, i5, ", "));
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final int zzd() {
        return this.zzc;
    }
}
