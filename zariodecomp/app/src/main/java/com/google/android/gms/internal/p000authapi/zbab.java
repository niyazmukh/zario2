package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import c1.g;
import com.google.android.gms.common.api.Status;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbab.smali */
public abstract class zbab extends zbb implements zbac {
    public zbab() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        g gVar = (g) zbc.zba(parcel, g.CREATOR);
        zbc.zbb(parcel);
        zbb(status, gVar);
        return true;
    }
}
