package p2;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\g.smali */
public final class g extends AbstractC0596a {
    public static final Parcelable.Creator<g> CREATOR = new b(3);

    /* renamed from: a, reason: collision with root package name */
    public String f9343a;

    /* renamed from: b, reason: collision with root package name */
    public String f9344b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f9345c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f9346d;

    /* renamed from: e, reason: collision with root package name */
    public e f9347e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9343a, false);
        S0.f.n0(parcel, 2, this.f9344b, false);
        S0.f.r0(parcel, 3, this.f9345c, false);
        S0.f.r0(parcel, 4, this.f9346d, false);
        S0.f.m0(parcel, 5, this.f9347e, i, false);
        S0.f.w0(iV0, parcel);
    }
}
