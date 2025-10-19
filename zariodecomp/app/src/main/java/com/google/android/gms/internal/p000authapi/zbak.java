package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import c1.m;
import com.google.android.gms.common.api.Status;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbak.smali */
public abstract class zbak extends zbb implements zbal {
    public zbak() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        m mVar = (m) zbc.zba(parcel, m.CREATOR);
        zbc.zbb(parcel);
        zbb(status, mVar);
        return true;
    }
}
