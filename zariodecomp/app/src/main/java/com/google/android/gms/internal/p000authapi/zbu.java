package com.google.android.gms.internal.p000authapi;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbu.smali */
public final class zbu extends AbstractC0596a {
    public static final Parcelable.Creator<zbu> CREATOR = new zbv();
    private final Credential zba;

    public zbu(Credential credential) {
        this.zba = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.m0(parcel, 1, this.zba, i, false);
        f.w0(iV0, parcel);
    }
}
