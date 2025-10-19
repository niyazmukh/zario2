package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\B.smali */
public final class B implements InterfaceC0377o {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f5661a;

    public B(IBinder iBinder) {
        this.f5661a = iBinder;
    }

    public final void a(G g3, C0372j c0372j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(g3.asBinder());
            parcelObtain.writeInt(1);
            c1.s.a(c0372j, parcelObtain, 0);
            this.f5661a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5661a;
    }
}
