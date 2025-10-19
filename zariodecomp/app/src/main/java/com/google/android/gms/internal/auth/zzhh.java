package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzhh.smali */
abstract class zzhh {
    final Unsafe zza;

    public zzhh(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j5);

    public abstract float zzb(Object obj, long j5);

    public abstract void zzc(Object obj, long j5, boolean z4);

    public abstract void zzd(Object obj, long j5, double d5);

    public abstract void zze(Object obj, long j5, float f2);

    public abstract boolean zzf(Object obj, long j5);

    public final int zzg(Class cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzh(Class cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzi(Object obj, long j5) {
        return this.zza.getInt(obj, j5);
    }

    public final long zzj(Object obj, long j5) {
        return this.zza.getLong(obj, j5);
    }

    public final long zzk(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzl(Object obj, long j5) {
        return this.zza.getObject(obj, j5);
    }

    public final void zzm(Object obj, long j5, int i) {
        this.zza.putInt(obj, j5, i);
    }

    public final void zzn(Object obj, long j5, long j6) {
        this.zza.putLong(obj, j5, j6);
    }

    public final void zzo(Object obj, long j5, Object obj2) {
        this.zza.putObject(obj, j5, obj2);
    }
}
