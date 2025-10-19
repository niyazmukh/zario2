package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzhg.smali */
final class zzhg extends zzhh {
    public zzhg(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final double zza(Object obj, long j5) {
        return Double.longBitsToDouble(zzj(obj, j5));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final float zzb(Object obj, long j5) {
        return Float.intBitsToFloat(zzi(obj, j5));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzc(Object obj, long j5, boolean z4) {
        if (zzhi.zza) {
            zzhi.zzi(obj, j5, z4);
        } else {
            zzhi.zzj(obj, j5, z4);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzd(Object obj, long j5, double d5) {
        zzn(obj, j5, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zze(Object obj, long j5, float f2) {
        zzm(obj, j5, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final boolean zzf(Object obj, long j5) {
        return zzhi.zza ? zzhi.zzq(obj, j5) : zzhi.zzr(obj, j5);
    }
}
