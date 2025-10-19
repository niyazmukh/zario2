package com.google.android.recaptcha.internal;

import N2.AbstractC0156x;
import e4.m;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzbj.smali */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return "avgExecutionTime: " + m.r0(10, String.valueOf(this.zzb / this.zza)) + " us| maxExecutionTime: " + m.r0(10, String.valueOf(this.zzc)) + " us| totalTime: " + m.r0(10, String.valueOf(this.zzb)) + " us| #Usages: " + m.r0(5, String.valueOf(this.zza));
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return AbstractC0156x.j(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j5) {
        this.zzc = j5;
    }

    public final void zzf(long j5) {
        this.zzb = j5;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
