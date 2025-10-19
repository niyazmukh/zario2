package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import c1.C0334a;
import com.google.android.gms.common.api.Status;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zby.smali */
public abstract class zby extends zbb implements zbz {
    public zby() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C0334a c0334a = (C0334a) zbc.zba(parcel, C0334a.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c0334a);
        return true;
    }
}
