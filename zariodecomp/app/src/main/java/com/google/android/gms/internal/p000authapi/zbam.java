package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c1.f;
import c1.i;
import c1.j;
import com.google.android.gms.common.api.internal.InterfaceC0348j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbam.smali */
public final class zbam extends zba implements IInterface {
    public zbam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbac zbacVar, f fVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbacVar);
        zbc.zbc(parcelZba, fVar);
        zbb(1, parcelZba);
    }

    public final void zbd(zbaf zbafVar, i iVar, String str) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbafVar);
        zbc.zbc(parcelZba, iVar);
        parcelZba.writeString(str);
        zbb(4, parcelZba);
    }

    public final void zbe(zbah zbahVar, j jVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbahVar);
        zbc.zbc(parcelZba, jVar);
        zbb(3, parcelZba);
    }

    public final void zbf(InterfaceC0348j interfaceC0348j, String str) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, interfaceC0348j);
        parcelZba.writeString(str);
        zbb(2, parcelZba);
    }
}
