package com.google.android.gms.internal.auth;

import S0.f;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbb.smali */
public final class zzbb extends AbstractC0596a {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    public zzbb(int i, String str, PendingIntent pendingIntent) {
        this.zza = 1;
        C.f(str);
        this.zzb = str;
        C.f(pendingIntent);
        this.zzc = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        int i5 = this.zza;
        f.u0(parcel, 1, 4);
        parcel.writeInt(i5);
        f.n0(parcel, 2, this.zzb, false);
        f.m0(parcel, 3, this.zzc, i, false);
        f.w0(iV0, parcel);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
