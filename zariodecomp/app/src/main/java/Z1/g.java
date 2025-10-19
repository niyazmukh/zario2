package z1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z;
import h1.C0588a;
import i1.AbstractC0596a;
import v1.Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z1.1\g.smali */
public final class g extends AbstractC0596a {
    public static final Parcelable.Creator<g> CREATOR = new Y(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f11211a;

    /* renamed from: b, reason: collision with root package name */
    public final C0588a f11212b;

    /* renamed from: c, reason: collision with root package name */
    public final z f11213c;

    public g(int i, C0588a c0588a, z zVar) {
        this.f11211a = i;
        this.f11212b = c0588a;
        this.f11213c = zVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f11211a);
        S0.f.m0(parcel, 2, this.f11212b, i, false);
        S0.f.m0(parcel, 3, this.f11213c, i, false);
        S0.f.w0(iV0, parcel);
    }
}
