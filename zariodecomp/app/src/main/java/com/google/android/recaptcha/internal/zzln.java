package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzln.smali */
public abstract class zzln extends zzkw {
    private static final Logger zzb = Logger.getLogger(zzln.class.getName());
    private static final boolean zzc = zzps.zzx();
    zzlo zza;

    private zzln() {
        throw null;
    }

    public static int zzA(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzB(long j5) {
        return (640 - (Long.numberOfLeadingZeros(j5) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i, zzoi zzoiVar, zzow zzowVar) {
        int iZzA = zzA(i << 3);
        return ((zzko) zzoiVar).zza(zzowVar) + iZzA + iZzA;
    }

    public static int zzx(zzoi zzoiVar) {
        int iZzo = zzoiVar.zzo();
        return zzA(iZzo) + iZzo;
    }

    public static int zzy(zzoi zzoiVar, zzow zzowVar) {
        int iZza = ((zzko) zzoiVar).zza(zzowVar);
        return zzA(iZza) + iZza;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzpv.zzc(str);
        } catch (zzpu unused) {
            length = str.getBytes(zznl.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzC() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzD(String str, zzpu zzpuVar) throws zzll {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzpuVar);
        byte[] bytes = str.getBytes(zznl.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzll(e5);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b5);

    public abstract void zzd(int i, boolean z4);

    public abstract void zze(int i, zzle zzleVar);

    public abstract void zzf(int i, int i5);

    public abstract void zzg(int i);

    public abstract void zzh(int i, long j5);

    public abstract void zzi(long j5);

    public abstract void zzj(int i, int i5);

    public abstract void zzk(int i);

    public abstract void zzl(byte[] bArr, int i, int i5);

    public abstract void zzm(int i, zzoi zzoiVar, zzow zzowVar);

    public abstract void zzn(int i, zzoi zzoiVar);

    public abstract void zzo(int i, zzle zzleVar);

    public abstract void zzp(int i, String str);

    public abstract void zzr(int i, int i5);

    public abstract void zzs(int i, int i5);

    public abstract void zzt(int i);

    public abstract void zzu(int i, long j5);

    public abstract void zzv(long j5);

    public /* synthetic */ zzln(zzlm zzlmVar) {
    }
}
