package com.google.android.gms.internal.auth;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzav.smali */
public final class zzav extends AbstractC0596a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i, String str, int i5) {
        this.zza = 1;
        C.f(str);
        this.zzb = str;
        this.zzc = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        int i5 = this.zza;
        f.u0(parcel, 1, 4);
        parcel.writeInt(i5);
        f.n0(parcel, 2, this.zzb, false);
        int i6 = this.zzc;
        f.u0(parcel, 3, 4);
        parcel.writeInt(i6);
        f.w0(iV0, parcel);
    }

    public zzav(String str, int i) {
        this(1, str, i);
    }
}
