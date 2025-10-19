package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzanu.smali */
abstract class zzanu<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t4);

    public abstract B zza();

    public abstract T zza(T t4, T t5);

    public abstract void zza(B b5, int i, int i5);

    public abstract void zza(B b5, int i, long j5);

    public abstract void zza(B b5, int i, zzajv zzajvVar);

    public abstract void zza(B b5, int i, T t4);

    public abstract void zza(T t4, zzaol zzaolVar);

    public abstract boolean zza(zzanc zzancVar);

    public final boolean zza(B b5, zzanc zzancVar, int i) throws zzall {
        int iZzd = zzancVar.zzd();
        int i5 = iZzd >>> 3;
        int i6 = iZzd & 7;
        if (i6 == 0) {
            zzb(b5, i5, zzancVar.zzl());
            return true;
        }
        if (i6 == 1) {
            zza((zzanu<T, B>) b5, i5, zzancVar.zzk());
            return true;
        }
        if (i6 == 2) {
            zza((zzanu<T, B>) b5, i5, zzancVar.zzp());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                if (i != 0) {
                    return false;
                }
                throw zzall.zzb();
            }
            if (i6 != 5) {
                throw zzall.zza();
            }
            zza((zzanu<T, B>) b5, i5, zzancVar.zzf());
            return true;
        }
        B bZza = zza();
        int i7 = 4 | (i5 << 3);
        int i8 = i + 1;
        if (i8 >= zza) {
            throw zzall.zzh();
        }
        while (zzancVar.zzc() != Integer.MAX_VALUE && zza((zzanu<T, B>) bZza, zzancVar, i8)) {
        }
        if (i7 != zzancVar.zzd()) {
            throw zzall.zzb();
        }
        zza((zzanu<T, B>) b5, i5, (int) zze(bZza));
        return true;
    }

    public abstract int zzb(T t4);

    public abstract void zzb(B b5, int i, long j5);

    public abstract void zzb(T t4, zzaol zzaolVar);

    public abstract void zzb(Object obj, B b5);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t4);

    public abstract T zzd(Object obj);

    public abstract T zze(B b5);

    public abstract void zzf(Object obj);
}
