package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;

/* renamed from: com.google.android.gms.common.internal.q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\q.1.smali */
public final class C0379q extends AbstractC0596a {
    public static final Parcelable.Creator<C0379q> CREATOR = new c1.s(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f5735a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5736b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5737c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5738d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5739e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5740f;

    /* renamed from: k, reason: collision with root package name */
    public final String f5741k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5742l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5743m;

    public C0379q(int i, int i5, int i6, long j5, long j6, String str, String str2, int i7, int i8) {
        this.f5735a = i;
        this.f5736b = i5;
        this.f5737c = i6;
        this.f5738d = j5;
        this.f5739e = j6;
        this.f5740f = str;
        this.f5741k = str2;
        this.f5742l = i7;
        this.f5743m = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5735a);
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(this.f5736b);
        S0.f.u0(parcel, 3, 4);
        parcel.writeInt(this.f5737c);
        S0.f.u0(parcel, 4, 8);
        parcel.writeLong(this.f5738d);
        S0.f.u0(parcel, 5, 8);
        parcel.writeLong(this.f5739e);
        S0.f.n0(parcel, 6, this.f5740f, false);
        S0.f.n0(parcel, 7, this.f5741k, false);
        S0.f.u0(parcel, 8, 4);
        parcel.writeInt(this.f5742l);
        S0.f.u0(parcel, 9, 4);
        parcel.writeInt(this.f5743m);
        S0.f.w0(iV0, parcel);
    }
}
