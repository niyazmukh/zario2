package m1;

import android.os.Parcel;
import android.os.Parcelable;
import g1.m;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m1.1\g.smali */
public final class g extends AbstractC0596a {
    public static final Parcelable.Creator<g> CREATOR = new m(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f8850a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8851b;

    /* renamed from: c, reason: collision with root package name */
    public final C0742a f8852c;

    public g(C0742a c0742a, String str) {
        this.f8850a = 1;
        this.f8851b = str;
        this.f8852c = c0742a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f8850a);
        S0.f.n0(parcel, 2, this.f8851b, false);
        S0.f.m0(parcel, 3, this.f8852c, i, false);
        S0.f.w0(iV0, parcel);
    }

    public g(C0742a c0742a, String str, int i) {
        this.f8850a = i;
        this.f8851b = str;
        this.f8852c = c0742a;
    }
}
