package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\t.smali */
public final class t extends AbstractC0596a {
    public static final Parcelable.Creator<t> CREATOR = new c1.s(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f5752a;

    /* renamed from: b, reason: collision with root package name */
    public List f5753b;

    public t(int i, List list) {
        this.f5752a = i;
        this.f5753b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5752a);
        S0.f.r0(parcel, 2, this.f5753b, false);
        S0.f.w0(iV0, parcel);
    }
}
