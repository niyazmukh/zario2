package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzpl.smali */
abstract class zzpl {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i, int i5);

    public abstract void zze(Object obj, int i, long j5);

    public abstract void zzf(Object obj, int i, Object obj2);

    public abstract void zzg(Object obj, int i, zzle zzleVar);

    public abstract void zzh(Object obj, int i, long j5);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzov zzovVar, int i) throws zznn {
        int iZzd = zzovVar.zzd();
        int i5 = iZzd >>> 3;
        int i6 = iZzd & 7;
        if (i6 == 0) {
            zzh(obj, i5, zzovVar.zzl());
            return true;
        }
        if (i6 == 1) {
            zze(obj, i5, zzovVar.zzk());
            return true;
        }
        if (i6 == 2) {
            zzg(obj, i5, zzovVar.zzp());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                return false;
            }
            if (i6 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i5, zzovVar.zzf());
            return true;
        }
        Object objZzb = zzb();
        int i7 = i5 << 3;
        int i8 = i + 1;
        if (i8 >= zza) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzovVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzovVar, i8)) {
        }
        if ((i7 | 4) != zzovVar.zzd()) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i5, zzc(objZzb));
        return true;
    }
}
