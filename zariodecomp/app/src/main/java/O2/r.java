package o2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\r.smali */
public final class r extends AbstractC0799c {
    public static final Parcelable.Creator<r> CREATOR = new g1.m(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f9223a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9224b;

    public r(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f9223a = str;
        this.f9224b = str2;
    }

    @Override // o2.AbstractC0799c
    public final String c() {
        return "google.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9223a, false);
        S0.f.n0(parcel, 2, this.f9224b, false);
        S0.f.w0(iV0, parcel);
    }
}
