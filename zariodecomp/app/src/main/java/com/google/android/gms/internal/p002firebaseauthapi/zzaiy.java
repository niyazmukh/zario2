package com.google.android.gms.internal.p002firebaseauthapi;

import N2.AbstractC0156x;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaiy.smali */
public final class zzaiy implements Parcelable.Creator<zzaiz> {
    @Override // android.os.Parcelable.Creator
    public final zzaiz createFromParcel(Parcel parcel) {
        int iH0 = AbstractC0156x.h0(parcel);
        while (parcel.dataPosition() < iH0) {
            AbstractC0156x.g0(parcel.readInt(), parcel);
        }
        AbstractC0156x.E(iH0, parcel);
        return new zzaiz();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiz[] newArray(int i) {
        return new zzaiz[i];
    }
}
