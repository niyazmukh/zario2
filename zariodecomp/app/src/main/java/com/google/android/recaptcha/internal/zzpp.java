package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzpp.smali */
final class zzpp extends zzpr {
    public zzpp(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final double zza(Object obj, long j5) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j5));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final float zzb(Object obj, long j5) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j5));
    }

    /* JADX WARN: Failed to inline method: com.google.android.recaptcha.internal.zzps.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.recaptcha.internal.zzps.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 boolean)' in method call: com.google.android.recaptcha.internal.zzps.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 boolean)' in method call: com.google.android.recaptcha.internal.zzps.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzc(Object obj, long j5, boolean z4) {
        if (zzps.zzb) {
            zzps.zzi(obj, j5, z4);
        } else {
            zzps.zzj(obj, j5, z4);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzd(Object obj, long j5, byte b5) {
        if (zzps.zzb) {
            zzps.zzD(obj, j5, b5);
        } else {
            zzps.zzE(obj, j5, b5);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zze(Object obj, long j5, double d5) {
        this.zza.putLong(obj, j5, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzf(Object obj, long j5, float f2) {
        this.zza.putInt(obj, j5, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final boolean zzg(Object obj, long j5) {
        return zzps.zzb ? zzps.zzt(obj, j5) : zzps.zzu(obj, j5);
    }
}
