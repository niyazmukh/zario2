package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzcg.smali */
class zzcg extends zzch {
    private volatile zzch zza;
    final zzcd zzb;
    final Character zzc;

    public zzcg(zzcd zzcdVar, Character ch) {
        this.zzb = zzcdVar;
        if (ch != null && zzcdVar.zzc('=')) {
            throw new IllegalArgumentException(zzaq.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcg) {
            zzcg zzcgVar = (zzcg) obj;
            if (this.zzb.equals(zzcgVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzcgVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        return (ch == null ? 0 : ch.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public zzch zza(zzcd zzcdVar, Character ch) {
        return new zzcg(zzcdVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public void zzb(Appendable appendable, byte[] bArr, int i, int i5) {
        int i6 = 0;
        zzap.zze(0, i5, bArr.length);
        while (i6 < i5) {
            zze(appendable, bArr, i6, Math.min(this.zzb.zzd, i5 - i6));
            i6 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public final int zzc(int i) {
        zzcd zzcdVar = this.zzb;
        return zzcj.zza(i, zzcdVar.zzd, RoundingMode.CEILING) * zzcdVar.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public final zzch zzd() {
        zzch zzchVarZza = this.zza;
        if (zzchVarZza == null) {
            zzcd zzcdVarZzb = this.zzb.zzb();
            zzchVarZza = zzcdVarZzb == this.zzb ? this : zza(zzcdVarZzb, this.zzc);
            this.zza = zzchVarZza;
        }
        return zzchVarZza;
    }

    public final void zze(Appendable appendable, byte[] bArr, int i, int i5) {
        zzap.zze(i, i + i5, bArr.length);
        int i6 = 0;
        zzap.zzc(i5 <= this.zzb.zzd);
        long j5 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            j5 = (j5 | (bArr[i + i7] & 255)) << 8;
        }
        int i8 = ((i5 + 1) * 8) - this.zzb.zzb;
        while (i6 < i5 * 8) {
            zzcd zzcdVar = this.zzb;
            appendable.append(zzcdVar.zza(zzcdVar.zza & ((int) (j5 >>> (i8 - i6)))));
            i6 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i6 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i6 += this.zzb.zzb;
            }
        }
    }

    public zzcg(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }
}
