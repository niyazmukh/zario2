package com.google.android.recaptcha.internal;

import B.a;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzkg.smali */
class zzkg extends zzkh {
    final zzkd zza;
    final Character zzb;

    public zzkg(zzkd zzkdVar, Character ch) {
        this.zza = zzkdVar;
        if (ch != null && zzkdVar.zzd('=')) {
            throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzb = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza) && Objects.equals(this.zzb, zzkgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ Objects.hashCode(this.zzb);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public int zza(byte[] bArr, CharSequence charSequence) throws zzkf {
        zzkd zzkdVar;
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzkf(a.g(charSequenceZze.length(), "Invalid input length "));
        }
        int i = 0;
        int i5 = 0;
        while (i < charSequenceZze.length()) {
            long jZzb = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                zzkdVar = this.zza;
                if (i6 >= zzkdVar.zzc) {
                    break;
                }
                jZzb <<= zzkdVar.zzb;
                if (i + i6 < charSequenceZze.length()) {
                    jZzb |= this.zza.zzb(charSequenceZze.charAt(i7 + i));
                    i7++;
                }
                i6++;
            }
            int i8 = zzkdVar.zzd;
            int i9 = i7 * zzkdVar.zzb;
            int i10 = (i8 - 1) * 8;
            while (i10 >= (i8 * 8) - i9) {
                bArr[i5] = (byte) ((jZzb >>> i10) & 255);
                i10 -= 8;
                i5++;
            }
            i += this.zza.zzc;
        }
        return i5;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public void zzb(Appendable appendable, byte[] bArr, int i, int i5) {
        int i6 = 0;
        zzjf.zzd(0, i5, bArr.length);
        while (i6 < i5) {
            zzf(appendable, bArr, i6, Math.min(this.zza.zzd, i5 - i6));
            i6 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzc(int i) {
        return (int) (((this.zza.zzb * i) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzd(int i) {
        zzkd zzkdVar = this.zza;
        return zzkdVar.zzc * zzkj.zza(i, zzkdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i, int i5) {
        zzjf.zzd(i, i + i5, bArr.length);
        int i6 = 0;
        zzjf.zza(i5 <= this.zza.zzd);
        long j5 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            j5 = (j5 | (bArr[i + i7] & 255)) << 8;
        }
        int i8 = (i5 + 1) * 8;
        zzkd zzkdVar = this.zza;
        while (i6 < i5 * 8) {
            long j6 = j5 >>> ((i8 - zzkdVar.zzb) - i6);
            zzkd zzkdVar2 = this.zza;
            appendable.append(zzkdVar2.zza(((int) j6) & zzkdVar2.zza));
            i6 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i6 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i6 += this.zza.zzb;
            }
        }
    }

    public zzkg(String str, String str2, Character ch) {
        this(new zzkd(str, str2.toCharArray()), ch);
    }
}
