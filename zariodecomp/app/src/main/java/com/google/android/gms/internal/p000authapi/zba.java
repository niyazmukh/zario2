package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zba.smali */
public class zba implements IInterface {
    private final IBinder zba;
    private final String zbb;

    public zba(IBinder iBinder, String str) {
        this.zba = iBinder;
        this.zbb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zba;
    }

    public final Parcel zba() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zbb);
        return parcelObtain;
    }

    public final void zbb(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.zba.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
