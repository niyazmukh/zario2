package o2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\E.smali */
public final class E extends AbstractC0596a {
    public static final Parcelable.Creator<E> CREATOR = new g1.m(21);

    /* renamed from: a, reason: collision with root package name */
    public String f9171a;

    /* renamed from: b, reason: collision with root package name */
    public String f9172b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9173c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9174d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f9175e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 2, this.f9171a, false);
        S0.f.n0(parcel, 3, this.f9172b, false);
        S0.f.u0(parcel, 4, 4);
        parcel.writeInt(this.f9173c ? 1 : 0);
        S0.f.u0(parcel, 5, 4);
        parcel.writeInt(this.f9174d ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
