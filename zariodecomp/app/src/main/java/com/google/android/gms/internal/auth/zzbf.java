package com.google.android.gms.internal.auth;

import android.os.Parcel;
import e1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbf.smali */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i == 1) {
            b bVar = (b) zzc.zza(parcel, b.CREATOR);
            zzc.zzb(parcel);
            zzb(bVar);
        } else {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            zzc.zzb(parcel);
            zzc(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
