package l1;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import g1.m;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l1\b.smali */
public final class b extends AbstractC0596a {
    public static final Parcelable.Creator<b> CREATOR = new m(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f8757a;

    /* renamed from: b, reason: collision with root package name */
    public final a f8758b;

    public b(int i, a aVar) {
        this.f8757a = i;
        this.f8758b = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.u0(parcel, 1, 4);
        parcel.writeInt(this.f8757a);
        f.m0(parcel, 2, this.f8758b, i, false);
        f.w0(iV0, parcel);
    }

    public b(a aVar) {
        this.f8757a = 1;
        this.f8758b = aVar;
    }
}
