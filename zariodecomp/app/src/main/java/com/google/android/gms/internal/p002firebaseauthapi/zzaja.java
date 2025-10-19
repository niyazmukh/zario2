package com.google.android.gms.internal.p002firebaseauthapi;

import N2.AbstractC0156x;
import N2.j0;
import N2.n0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaja.smali */
public final class zzaja implements Parcelable.Creator<zzajb> {
    @Override // android.os.Parcelable.Creator
    public final zzajb createFromParcel(Parcel parcel) {
        int iH0 = AbstractC0156x.h0(parcel);
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        String strU4 = null;
        String strU5 = null;
        String strU6 = null;
        String strU7 = null;
        String strU8 = null;
        String strU9 = null;
        String strU10 = null;
        String strU11 = null;
        String strU12 = null;
        String strU13 = null;
        boolean zV = false;
        boolean zV2 = false;
        boolean zV3 = false;
        while (parcel.dataPosition() < iH0) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strU = AbstractC0156x.u(i, parcel);
                    break;
                case 3:
                    strU2 = AbstractC0156x.u(i, parcel);
                    break;
                case 4:
                    strU3 = AbstractC0156x.u(i, parcel);
                    break;
                case 5:
                    strU4 = AbstractC0156x.u(i, parcel);
                    break;
                case 6:
                    strU5 = AbstractC0156x.u(i, parcel);
                    break;
                case 7:
                    strU6 = AbstractC0156x.u(i, parcel);
                    break;
                case '\b':
                    strU7 = AbstractC0156x.u(i, parcel);
                    break;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    strU8 = AbstractC0156x.u(i, parcel);
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    zV = AbstractC0156x.V(i, parcel);
                    break;
                case 11:
                    zV2 = AbstractC0156x.V(i, parcel);
                    break;
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    strU9 = AbstractC0156x.u(i, parcel);
                    break;
                case '\r':
                    strU10 = AbstractC0156x.u(i, parcel);
                    break;
                case 14:
                    strU11 = AbstractC0156x.u(i, parcel);
                    break;
                case 15:
                    strU12 = AbstractC0156x.u(i, parcel);
                    break;
                case 16:
                    zV3 = AbstractC0156x.V(i, parcel);
                    break;
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    strU13 = AbstractC0156x.u(i, parcel);
                    break;
                default:
                    AbstractC0156x.g0(i, parcel);
                    break;
            }
        }
        AbstractC0156x.E(iH0, parcel);
        return new zzajb(strU, strU2, strU3, strU4, strU5, strU6, strU7, strU8, zV, zV2, strU9, strU10, strU11, strU12, zV3, strU13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzajb[] newArray(int i) {
        return new zzajb[i];
    }
}
