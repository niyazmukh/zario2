package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;

/* renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\i.1.smali */
public final class C0371i extends AbstractC0596a {
    public static final Parcelable.Creator<C0371i> CREATOR = new c1.s(12);

    /* renamed from: a, reason: collision with root package name */
    public final C0380s f5707a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5708b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5709c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f5710d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5711e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f5712f;

    public C0371i(C0380s c0380s, boolean z4, boolean z5, int[] iArr, int i, int[] iArr2) {
        this.f5707a = c0380s;
        this.f5708b = z4;
        this.f5709c = z5;
        this.f5710d = iArr;
        this.f5711e = i;
        this.f5712f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 1, this.f5707a, i, false);
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(this.f5708b ? 1 : 0);
        S0.f.u0(parcel, 3, 4);
        parcel.writeInt(this.f5709c ? 1 : 0);
        S0.f.i0(parcel, 4, this.f5710d, false);
        S0.f.u0(parcel, 5, 4);
        parcel.writeInt(this.f5711e);
        S0.f.i0(parcel, 6, this.f5712f, false);
        S0.f.w0(iV0, parcel);
    }
}
