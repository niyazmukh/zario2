package z1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.y;
import i1.AbstractC0596a;
import v1.Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z1.1\f.smali */
public final class f extends AbstractC0596a {
    public static final Parcelable.Creator<f> CREATOR = new Y(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f11209a;

    /* renamed from: b, reason: collision with root package name */
    public final y f11210b;

    public f(int i, y yVar) {
        this.f11209a = i;
        this.f11210b = yVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f11209a);
        S0.f.m0(parcel, 2, this.f11210b, i, false);
        S0.f.w0(iV0, parcel);
    }
}
