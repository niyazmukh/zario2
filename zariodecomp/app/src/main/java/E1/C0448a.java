package e1;

import S0.f;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c1.s;
import i1.AbstractC0596a;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e1.1\a.smali */
public final class C0448a extends AbstractC0596a {
    public static final Parcelable.Creator<C0448a> CREATOR = new s(22);

    /* renamed from: a, reason: collision with root package name */
    public final String f6841a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6842b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6843c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6844d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6845e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f6846f;

    public C0448a(int i, String str, int i5, long j5, byte[] bArr, Bundle bundle) {
        this.f6845e = i;
        this.f6841a = str;
        this.f6842b = i5;
        this.f6843c = j5;
        this.f6844d = bArr;
        this.f6846f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f6841a + ", method: " + this.f6842b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.n0(parcel, 1, this.f6841a, false);
        f.u0(parcel, 2, 4);
        parcel.writeInt(this.f6842b);
        f.u0(parcel, 3, 8);
        parcel.writeLong(this.f6843c);
        f.g0(parcel, 4, this.f6844d, false);
        f.f0(parcel, 5, this.f6846f, false);
        f.u0(parcel, 1000, 4);
        parcel.writeInt(this.f6845e);
        f.w0(iV0, parcel);
    }
}
