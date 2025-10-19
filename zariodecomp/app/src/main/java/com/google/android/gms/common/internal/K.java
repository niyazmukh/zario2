package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h1.C0590c;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\K.smali */
public final class K extends AbstractC0596a {
    public static final Parcelable.Creator<K> CREATOR = new c1.s(11);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f5674a;

    /* renamed from: b, reason: collision with root package name */
    public C0590c[] f5675b;

    /* renamed from: c, reason: collision with root package name */
    public int f5676c;

    /* renamed from: d, reason: collision with root package name */
    public C0371i f5677d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.f0(parcel, 1, this.f5674a, false);
        S0.f.q0(parcel, 2, this.f5675b, i);
        S0.f.u0(parcel, 3, 4);
        parcel.writeInt(this.f5676c);
        S0.f.m0(parcel, 4, this.f5677d, i, false);
        S0.f.w0(iV0, parcel);
    }
}
