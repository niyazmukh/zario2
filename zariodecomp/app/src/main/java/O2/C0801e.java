package o2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o2.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\e.1.smali */
public final class C0801e extends AbstractC0799c {
    public static final Parcelable.Creator<C0801e> CREATOR = new g1.m(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f9215a;

    public C0801e(String str) {
        com.google.android.gms.common.internal.C.d(str);
        this.f9215a = str;
    }

    @Override // o2.AbstractC0799c
    public final String c() {
        return "facebook.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9215a, false);
        S0.f.w0(iV0, parcel);
    }
}
