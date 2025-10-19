package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import v1.C0991o;
import v1.n;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzn.smali */
public final class zzn extends zza implements IInterface {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzg zzgVar, String str) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeStrongBinder(zzgVar);
        parcelZza.writeString(str);
        zzb(4, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzm zzmVar, n nVar) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeStrongBinder(zzmVar);
        zzc.zzd(parcelZza, nVar);
        zzb(1, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzm zzmVar, C0991o c0991o) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeStrongBinder(zzmVar);
        zzc.zzd(parcelZza, c0991o);
        zzb(2, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(zze zzeVar) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeStrongBinder(zzeVar);
        zzb(3, parcelZza);
    }
}
