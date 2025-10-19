package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e1.C0448a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbh.smali */
public final class zzbh extends zza implements IInterface {
    public zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbgVar) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzbgVar);
        zzc(3, parcelZza);
    }

    public final void zze(zzbg zzbgVar, C0448a c0448a) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzbgVar);
        zzc.zzd(parcelZza, c0448a);
        zzc(1, parcelZza);
    }
}
