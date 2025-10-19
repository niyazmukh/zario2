package com.google.android.gms.internal.auth;

import N2.AbstractC0156x;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzaw.smali */
public final class zzaw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH0 = AbstractC0156x.h0(parcel);
        int iX = 0;
        String strU = null;
        int iX2 = 0;
        while (parcel.dataPosition() < iH0) {
            int i = parcel.readInt();
            char c5 = (char) i;
            if (c5 == 1) {
                iX = AbstractC0156x.X(i, parcel);
            } else if (c5 == 2) {
                strU = AbstractC0156x.u(i, parcel);
            } else if (c5 != 3) {
                AbstractC0156x.g0(i, parcel);
            } else {
                iX2 = AbstractC0156x.X(i, parcel);
            }
        }
        AbstractC0156x.E(iH0, parcel);
        return new zzav(iX, strU, iX2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzav[i];
    }
}
