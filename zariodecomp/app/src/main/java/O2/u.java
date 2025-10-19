package o2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\u.smali */
public final class u extends AbstractC0799c implements Cloneable {
    public static final Parcelable.Creator<u> CREATOR = new g1.m(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f9225a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9226b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9227c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9228d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9229e;

    public u(String str, String str2, String str3, String str4, boolean z4) {
        com.google.android.gms.common.internal.C.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true);
        this.f9225a = str;
        this.f9226b = str2;
        this.f9227c = str3;
        this.f9228d = z4;
        this.f9229e = str4;
    }

    @Override // o2.AbstractC0799c
    public final String c() {
        return "phone";
    }

    public final Object clone() {
        boolean z4 = this.f9228d;
        return new u(this.f9225a, this.f9226b, this.f9227c, this.f9229e, z4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9225a, false);
        S0.f.n0(parcel, 2, this.f9226b, false);
        S0.f.n0(parcel, 4, this.f9227c, false);
        boolean z4 = this.f9228d;
        S0.f.u0(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        S0.f.n0(parcel, 6, this.f9229e, false);
        S0.f.w0(iV0, parcel);
    }
}
