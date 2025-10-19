package com.google.android.gms.internal.auth;

import X0.b;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC0348j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzp.smali */
public final class zzp extends zza implements IInterface {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void zzd(InterfaceC0348j interfaceC0348j, zzbw zzbwVar) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC0348j);
        zzc.zzd(parcelZza, zzbwVar);
        zzc(2, parcelZza);
    }

    public final void zze(zzm zzmVar, b bVar) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzmVar);
        zzc.zzd(parcelZza, bVar);
        zzc(4, parcelZza);
    }

    public final void zzf(zzo zzoVar, Account account, String str, Bundle bundle) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzoVar);
        zzc.zzd(parcelZza, account);
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, bundle);
        zzc(1, parcelZza);
    }

    public final void zzg(zzk zzkVar, Account account) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzkVar);
        zzc.zzd(parcelZza, account);
        zzc(6, parcelZza);
    }

    public final void zzh(zzk zzkVar, String str) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzkVar);
        parcelZza.writeString(str);
        zzc(3, parcelZza);
    }
}
