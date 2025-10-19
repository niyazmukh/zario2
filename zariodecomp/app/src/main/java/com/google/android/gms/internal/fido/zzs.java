package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import v1.B;
import v1.C0999y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzs.smali */
public final class zzs extends zza implements IInterface {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, C0999y c0999y) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeStrongBinder(zzrVar);
        zzc.zzd(parcelZza, c0999y);
        zzb(1, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzr zzrVar, B b5) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeStrongBinder(zzrVar);
        zzc.zzd(parcelZza, b5);
        zzb(2, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zze zzeVar) {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeStrongBinder(zzeVar);
        zzb(3, parcelZza);
    }
}
