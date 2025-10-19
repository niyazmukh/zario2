package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;

/* renamed from: com.google.android.gms.common.internal.s, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\s.1.smali */
public final class C0380s extends AbstractC0596a {
    public static final Parcelable.Creator<C0380s> CREATOR = new c1.s(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f5747a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5748b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5749c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5750d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5751e;

    public C0380s(int i, boolean z4, boolean z5, int i5, int i6) {
        this.f5747a = i;
        this.f5748b = z4;
        this.f5749c = z5;
        this.f5750d = i5;
        this.f5751e = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5747a);
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(this.f5748b ? 1 : 0);
        S0.f.u0(parcel, 3, 4);
        parcel.writeInt(this.f5749c ? 1 : 0);
        S0.f.u0(parcel, 4, 4);
        parcel.writeInt(this.f5750d);
        S0.f.u0(parcel, 5, 4);
        parcel.writeInt(this.f5751e);
        S0.f.w0(iV0, parcel);
    }
}
