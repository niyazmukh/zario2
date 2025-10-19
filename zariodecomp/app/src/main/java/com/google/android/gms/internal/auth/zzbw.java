package com.google.android.gms.internal.auth;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbw.smali */
public final class zzbw extends AbstractC0596a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        int i5 = this.zza;
        f.u0(parcel, 1, 4);
        parcel.writeInt(i5);
        f.n0(parcel, 2, this.zzb, false);
        f.w0(iV0, parcel);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }

    public zzbw(int i, String str) {
        this.zza = i;
        this.zzb = str;
    }
}
