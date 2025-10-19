package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import c1.k;
import com.google.android.gms.common.api.Status;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbai.smali */
public abstract class zbai extends zbb implements zbaj {
    public zbai() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        k kVar = (k) zbc.zba(parcel, k.CREATOR);
        zbc.zbb(parcel);
        zbb(status, kVar);
        return true;
    }
}
