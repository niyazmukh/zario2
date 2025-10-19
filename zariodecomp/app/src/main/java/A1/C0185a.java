package a1;

import D0.k;
import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a1.1\a.smali */
public final class C0185a extends AbstractC0596a {
    public static final Parcelable.Creator<C0185a> CREATOR = new k(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f4028a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4029b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4030c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4031d;

    public C0185a(int i, boolean z4, long j5, boolean z5) {
        this.f4028a = i;
        this.f4029b = z4;
        this.f4030c = j5;
        this.f4031d = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f4028a);
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(this.f4029b ? 1 : 0);
        S0.f.u0(parcel, 3, 8);
        parcel.writeLong(this.f4030c);
        S0.f.u0(parcel, 4, 4);
        parcel.writeInt(this.f4031d ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
