package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import h1.C0588a;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\z.smali */
public final class z extends AbstractC0596a {
    public static final Parcelable.Creator<z> CREATOR = new c1.s(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f5766a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f5767b;

    /* renamed from: c, reason: collision with root package name */
    public final C0588a f5768c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5769d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5770e;

    public z(int i, IBinder iBinder, C0588a c0588a, boolean z4, boolean z5) {
        this.f5766a = i;
        this.f5767b = iBinder;
        this.f5768c = c0588a;
        this.f5769d = z4;
        this.f5770e = z5;
    }

    public final boolean equals(Object obj) {
        Object q5;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f5768c.equals(zVar.f5768c)) {
            Object q6 = null;
            IBinder iBinder = this.f5767b;
            if (iBinder == null) {
                q5 = null;
            } else {
                int i = AbstractBinderC0363a.f5696a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                q5 = iInterfaceQueryLocalInterface instanceof InterfaceC0375m ? (InterfaceC0375m) iInterfaceQueryLocalInterface : new Q(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            IBinder iBinder2 = zVar.f5767b;
            if (iBinder2 != null) {
                int i5 = AbstractBinderC0363a.f5696a;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                q6 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0375m ? (InterfaceC0375m) iInterfaceQueryLocalInterface2 : new Q(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            if (C.i(q5, q6)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5766a);
        IBinder iBinder = this.f5767b;
        if (iBinder != null) {
            int iV02 = S0.f.v0(2, parcel);
            parcel.writeStrongBinder(iBinder);
            S0.f.w0(iV02, parcel);
        }
        S0.f.m0(parcel, 3, this.f5768c, i, false);
        S0.f.u0(parcel, 4, 4);
        parcel.writeInt(this.f5769d ? 1 : 0);
        S0.f.u0(parcel, 5, 4);
        parcel.writeInt(this.f5770e ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
