package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c1.l;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbad.smali */
public final class zbad extends zba implements IInterface {
    public zbad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbaj zbajVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbajVar);
        zbc.zbc(parcelZba, saveAccountLinkingTokenRequest);
        zbb(1, parcelZba);
    }

    public final void zbd(zbal zbalVar, l lVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbalVar);
        zbc.zbc(parcelZba, lVar);
        zbb(2, parcelZba);
    }
}
