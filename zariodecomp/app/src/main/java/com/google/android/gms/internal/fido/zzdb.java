package com.google.android.gms.internal.fido;

import com.google.android.gms.common.api.f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzdb.smali */
final class zzdb extends zzdd {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzdb(byte[] bArr, int i, int i5, boolean z4, zzda zzdaVar) {
        super(null);
        this.zze = f.API_PRIORITY_OTHER;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i) {
        int i5 = this.zze;
        this.zze = 0;
        int i6 = this.zzc + this.zzd;
        this.zzc = i6;
        if (i6 > 0) {
            this.zzd = i6;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i5;
    }
}
