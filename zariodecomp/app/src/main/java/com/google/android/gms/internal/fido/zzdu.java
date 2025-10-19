package com.google.android.gms.internal.fido;

import B.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzdu.smali */
public final class zzdu implements Closeable {
    private final InputStream zza;
    private zzdt zzb;
    private final byte[] zzc = new byte[8];
    private final zzdv zzd = zzdv.zza();

    public zzdu(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final long zzh() throws IOException {
        if (this.zzb.zza() < 24) {
            long jZza = this.zzb.zza();
            this.zzb = null;
            return jZza;
        }
        if (this.zzb.zza() == 24) {
            int i = this.zza.read();
            if (i == -1) {
                throw new EOFException();
            }
            this.zzb = null;
            return i & 255;
        }
        if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr = this.zzc;
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            byte[] bArr2 = this.zzc;
            return ((bArr2[0] & 255) << 24) | ((bArr2[1] & 255) << 16) | ((bArr2[2] & 255) << 8) | (bArr2[3] & 255);
        }
        if (this.zzb.zza() != 27) {
            throw new IOException(a.h("invalid additional information ", this.zzb.zza(), this.zzb.zzc(), " for major type "));
        }
        zzk(this.zzc, 8);
        byte[] bArr3 = this.zzc;
        return ((bArr3[0] & 255) << 56) | ((bArr3[1] & 255) << 48) | ((bArr3[2] & 255) << 40) | ((bArr3[3] & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16) | ((bArr3[6] & 255) << 8) | (bArr3[7] & 255);
    }

    private final void zzi() throws IOException {
        zzd();
        if (this.zzb.zza() == 31) {
            throw new IllegalStateException(a.g(this.zzb.zza(), "expected definite length but found "));
        }
    }

    private final void zzj(byte b5) throws IOException {
        zzd();
        if (this.zzb.zzb() != b5) {
            throw new IllegalStateException(a.h("expected major type ", (b5 >> 5) & 7, this.zzb.zzc(), " but found "));
        }
    }

    private final void zzk(byte[] bArr, int i) throws IOException {
        int i5 = 0;
        while (i5 != i) {
            int i6 = this.zza.read(bArr, i5, i - i5);
            if (i6 == -1) {
                throw new EOFException();
            }
            i5 += i6;
        }
        this.zzb = null;
    }

    private final byte[] zzl() throws IOException {
        zzi();
        long jZzh = zzh();
        if (jZzh < 0 || jZzh > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.zza.available() < jZzh) {
            throw new EOFException();
        }
        int i = (int) jZzh;
        byte[] bArr = new byte[i];
        zzk(bArr, i);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() throws IOException {
        zzj((byte) -128);
        zzi();
        long jZzh = zzh();
        if (jZzh < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (jZzh > 0) {
            this.zzd.zzg(jZzh);
        }
        return jZzh;
    }

    public final long zzb() throws IOException {
        boolean z4;
        zzd();
        if (this.zzb.zzb() == 0) {
            z4 = true;
        } else {
            if (this.zzb.zzb() != 32) {
                throw new IllegalStateException(a.g(this.zzb.zzc(), "expected major type 0 or 1 but found "));
            }
            z4 = false;
        }
        long jZzh = zzh();
        if (jZzh >= 0) {
            return z4 ? jZzh : ~jZzh;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long zzc() throws IOException {
        zzj((byte) -96);
        zzi();
        long jZzh = zzh();
        if (jZzh < 0 || jZzh > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jZzh > 0) {
            this.zzd.zzg(jZzh + jZzh);
        }
        return jZzh;
    }

    public final zzdt zzd() throws IOException {
        if (this.zzb == null) {
            int i = this.zza.read();
            if (i == -1) {
                this.zzd.zzb();
                return null;
            }
            zzdt zzdtVar = new zzdt(i);
            this.zzb = zzdtVar;
            byte bZzb = zzdtVar.zzb();
            if (bZzb == -128 || bZzb == -96 || bZzb == -64) {
                this.zzd.zzd();
                this.zzd.zzf();
            } else {
                if (bZzb != -32) {
                    if (bZzb != 0 && bZzb != 32) {
                        if (bZzb == 64) {
                            this.zzd.zze(-1L);
                        } else {
                            if (bZzb != 96) {
                                throw new IllegalStateException(a.g(this.zzb.zzc(), "invalid major type: "));
                            }
                            this.zzd.zze(-2L);
                        }
                    }
                    this.zzd.zzf();
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
                this.zzd.zzd();
                this.zzd.zzf();
            }
        }
        return this.zzb;
    }

    public final String zze() throws IOException {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() throws IOException {
        zzj((byte) -32);
        if (this.zzb.zza() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iZzh = (int) zzh();
        if (iZzh == 20) {
            return false;
        }
        if (iZzh == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final byte[] zzg() throws IOException {
        zzj((byte) 64);
        return zzl();
    }
}
