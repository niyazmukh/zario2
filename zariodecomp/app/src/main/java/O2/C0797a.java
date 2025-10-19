package o2;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\a.1.smali */
public final class C0797a extends AbstractC0596a {
    public static final Parcelable.Creator<C0797a> CREATOR = new g1.m(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f9196a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9197b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9198c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9199d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9200e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9201f;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f9202k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9203l;

    /* renamed from: m, reason: collision with root package name */
    public int f9204m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9205n;

    /* renamed from: o, reason: collision with root package name */
    public final String f9206o;

    public C0797a(String str, String str2, String str3, String str4, boolean z4, String str5, boolean z5, String str6, int i, String str7, String str8) {
        this.f9196a = str;
        this.f9197b = str2;
        this.f9198c = str3;
        this.f9199d = str4;
        this.f9200e = z4;
        this.f9201f = str5;
        this.f9202k = z5;
        this.f9203l = str6;
        this.f9204m = i;
        this.f9205n = str7;
        this.f9206o = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9196a, false);
        S0.f.n0(parcel, 2, this.f9197b, false);
        S0.f.n0(parcel, 3, this.f9198c, false);
        S0.f.n0(parcel, 4, this.f9199d, false);
        S0.f.u0(parcel, 5, 4);
        parcel.writeInt(this.f9200e ? 1 : 0);
        S0.f.n0(parcel, 6, this.f9201f, false);
        S0.f.u0(parcel, 7, 4);
        parcel.writeInt(this.f9202k ? 1 : 0);
        S0.f.n0(parcel, 8, this.f9203l, false);
        int i5 = this.f9204m;
        S0.f.u0(parcel, 9, 4);
        parcel.writeInt(i5);
        S0.f.n0(parcel, 10, this.f9205n, false);
        S0.f.n0(parcel, 11, this.f9206o, false);
        S0.f.w0(iV0, parcel);
    }
}
