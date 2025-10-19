package g1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c1.s;
import i1.AbstractC0596a;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g1.1\a.smali */
public final class C0572a extends AbstractC0596a {
    public static final Parcelable.Creator<C0572a> CREATOR = new s(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f7569a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7570b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f7571c;

    public C0572a(int i, int i5, Bundle bundle) {
        this.f7569a = i;
        this.f7570b = i5;
        this.f7571c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f7569a);
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(this.f7570b);
        S0.f.f0(parcel, 3, this.f7571c, false);
        S0.f.w0(iV0, parcel);
    }
}
