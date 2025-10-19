package o2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\d.1.smali */
public final class C0800d extends AbstractC0799c {
    public static final Parcelable.Creator<C0800d> CREATOR = new g1.m(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f9210a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9211b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9212c;

    /* renamed from: d, reason: collision with root package name */
    public String f9213d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9214e;

    public C0800d(String str, String str2, String str3, String str4, boolean z4) {
        com.google.android.gms.common.internal.C.d(str);
        this.f9210a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f9211b = str2;
        this.f9212c = str3;
        this.f9213d = str4;
        this.f9214e = z4;
    }

    @Override // o2.AbstractC0799c
    public final String c() {
        return "password";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9210a, false);
        S0.f.n0(parcel, 2, this.f9211b, false);
        S0.f.n0(parcel, 3, this.f9212c, false);
        S0.f.n0(parcel, 4, this.f9213d, false);
        boolean z4 = this.f9214e;
        S0.f.u0(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
