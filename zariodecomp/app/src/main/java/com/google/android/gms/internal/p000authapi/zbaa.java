package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbaa.smali */
public final class zbaa extends zba implements IInterface {
    public zbaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbz zbzVar, AuthorizationRequest authorizationRequest) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbzVar);
        zbc.zbc(parcelZba, authorizationRequest);
        zbb(1, parcelZba);
    }
}
