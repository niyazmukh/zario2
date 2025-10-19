package com.google.android.recaptcha.internal;

import B.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzkz.smali */
final class zzkz extends zzlc {
    private final int zzc;

    public zzkz(byte[] bArr, int i, int i5) {
        super(bArr);
        zzle.zzi(0, i5, bArr.length);
        this.zzc = i5;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zza(int i) {
        int i5 = this.zzc;
        if (((i5 - (i + 1)) | i) >= 0) {
            return ((zzlc) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(a.g(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a.h("Index > length: ", i, i5, ", "));
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zzb(int i) {
        return ((zzlc) this).zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzlc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final void zze(byte[] bArr, int i, int i5, int i6) {
        System.arraycopy(((zzlc) this).zza, 0, bArr, 0, i6);
    }
}
