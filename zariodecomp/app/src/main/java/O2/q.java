package o2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\q.smali */
public final class q extends AbstractC0799c {
    public static final Parcelable.Creator<q> CREATOR = new g1.m(13);

    /* renamed from: a, reason: collision with root package name */
    public final String f9222a;

    public q(String str) {
        com.google.android.gms.common.internal.C.d(str);
        this.f9222a = str;
    }

    @Override // o2.AbstractC0799c
    public final String c() {
        return "github.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9222a, false);
        S0.f.w0(iV0, parcel);
    }
}
