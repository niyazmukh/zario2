package com.google.android.gms.internal.p002firebaseauthapi;

import N2.AbstractC0156x;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzahu.smali */
public final class zzahu implements Parcelable.Creator<zzahv> {
    @Override // android.os.Parcelable.Creator
    public final zzahv createFromParcel(Parcel parcel) {
        int iH0 = AbstractC0156x.h0(parcel);
        String strU = null;
        String strU2 = null;
        Long lB0 = null;
        String strU3 = null;
        Long lB02 = null;
        while (parcel.dataPosition() < iH0) {
            int i = parcel.readInt();
            char c5 = (char) i;
            if (c5 == 2) {
                strU = AbstractC0156x.u(i, parcel);
            } else if (c5 == 3) {
                strU2 = AbstractC0156x.u(i, parcel);
            } else if (c5 == 4) {
                lB0 = AbstractC0156x.b0(i, parcel);
            } else if (c5 == 5) {
                strU3 = AbstractC0156x.u(i, parcel);
            } else if (c5 != 6) {
                AbstractC0156x.g0(i, parcel);
            } else {
                lB02 = AbstractC0156x.b0(i, parcel);
            }
        }
        AbstractC0156x.E(iH0, parcel);
        return new zzahv(strU, strU2, lB0, strU3, lB02);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahv[] newArray(int i) {
        return new zzahv[i];
    }
}
