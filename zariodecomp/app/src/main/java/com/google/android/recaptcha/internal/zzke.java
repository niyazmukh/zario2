package com.google.android.recaptcha.internal;

import B.a;
import java.io.IOException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzke.smali */
final class zzke extends zzkg {
    public zzke(String str, String str2, Character ch) {
        zzkd zzkdVar = new zzkd(str, str2.toCharArray());
        super(zzkdVar, ch);
        zzjf.zza(zzkdVar.zzf.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzkf {
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzkf(a.g(charSequenceZze.length(), "Invalid input length "));
        }
        int i = 0;
        int i5 = 0;
        while (i < charSequenceZze.length()) {
            int i6 = i5 + 1;
            int iZzb = (this.zza.zzb(charSequenceZze.charAt(i)) << 18) | (this.zza.zzb(charSequenceZze.charAt(i + 1)) << 12);
            bArr[i5] = (byte) (iZzb >>> 16);
            int i7 = i + 2;
            if (i7 < charSequenceZze.length()) {
                int i8 = i + 3;
                int iZzb2 = iZzb | (this.zza.zzb(charSequenceZze.charAt(i7)) << 6);
                int i9 = i5 + 2;
                bArr[i6] = (byte) ((iZzb2 >>> 8) & 255);
                if (i8 < charSequenceZze.length()) {
                    i += 4;
                    i5 += 3;
                    bArr[i9] = (byte) ((iZzb2 | this.zza.zzb(charSequenceZze.charAt(i8))) & 255);
                } else {
                    i5 = i9;
                    i = i8;
                }
            } else {
                i = i7;
                i5 = i6;
            }
        }
        return i5;
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i5) throws IOException {
        int i6 = 0;
        zzjf.zzd(0, i5, bArr.length);
        for (int i7 = i5; i7 >= 3; i7 -= 3) {
            int i8 = bArr[i6] & 255;
            int i9 = ((bArr[i6 + 1] & 255) << 8) | (i8 << 16) | (bArr[i6 + 2] & 255);
            appendable.append(this.zza.zza(i9 >>> 18));
            appendable.append(this.zza.zza((i9 >>> 12) & 63));
            appendable.append(this.zza.zza((i9 >>> 6) & 63));
            appendable.append(this.zza.zza(i9 & 63));
            i6 += 3;
        }
        if (i6 < i5) {
            zzf(appendable, bArr, i6, i5 - i6);
        }
    }
}
