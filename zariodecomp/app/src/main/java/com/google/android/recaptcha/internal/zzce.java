package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzce.smali */
public final class zzce extends Exception {
    private final Throwable zza;
    private final zztd zzb;
    private final int zzc;
    private final int zzd;

    public zzce(int i, int i5, Throwable th) {
        this.zzc = i;
        this.zzd = i5;
        this.zza = th;
        zztd zztdVarZzf = zzte.zzf();
        zztdVarZzf.zzq(i5);
        zztdVarZzf.zzr(i);
        this.zzb = zztdVarZzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zztd zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
