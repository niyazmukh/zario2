package com.google.android.gms.internal.p000authapi;

import N2.AbstractC0156x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbv.smali */
public final class zbv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH0 = AbstractC0156x.h0(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < iH0) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                AbstractC0156x.g0(i, parcel);
            } else {
                credential = (Credential) AbstractC0156x.t(parcel, i, Credential.CREATOR);
            }
        }
        AbstractC0156x.E(iH0, parcel);
        return new zbu(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zbu[i];
    }
}
