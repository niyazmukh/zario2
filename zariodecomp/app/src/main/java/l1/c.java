package l1;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import g1.m;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l1\c.smali */
public final class c extends AbstractC0596a {
    public static final Parcelable.Creator<c> CREATOR = new m(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f8759a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8760b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8761c;

    public c(int i, String str, int i5) {
        this.f8759a = i;
        this.f8760b = str;
        this.f8761c = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.u0(parcel, 1, 4);
        parcel.writeInt(this.f8759a);
        f.n0(parcel, 2, this.f8760b, false);
        f.u0(parcel, 3, 4);
        parcel.writeInt(this.f8761c);
        f.w0(iV0, parcel);
    }

    public c(String str, int i) {
        this.f8759a = 1;
        this.f8760b = str;
        this.f8761c = i;
    }
}
