package o2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\C.smali */
public final class C extends AbstractC0799c {
    public static final Parcelable.Creator<C> CREATOR = new g1.m(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f9169a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9170b;

    public C(String str, String str2) {
        com.google.android.gms.common.internal.C.d(str);
        this.f9169a = str;
        com.google.android.gms.common.internal.C.d(str2);
        this.f9170b = str2;
    }

    @Override // o2.AbstractC0799c
    public final String c() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9169a, false);
        S0.f.n0(parcel, 2, this.f9170b, false);
        S0.f.w0(iV0, parcel);
    }
}
