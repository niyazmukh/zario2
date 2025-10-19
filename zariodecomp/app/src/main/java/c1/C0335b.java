package c1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\b.smali */
public final class C0335b extends AbstractC0596a {
    public static final Parcelable.Creator<C0335b> CREATOR = new D0.k(24);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5404a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5405b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5406c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5407d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5408e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5409f;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5410k;

    public C0335b(boolean z4, String str, String str2, boolean z5, String str3, ArrayList arrayList, boolean z6) {
        boolean z7 = true;
        if (z5 && z6) {
            z7 = false;
        }
        C.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z7);
        this.f5404a = z4;
        if (z4) {
            C.g(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f5405b = str;
        this.f5406c = str2;
        this.f5407d = z5;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f5409f = arrayList2;
        this.f5408e = str3;
        this.f5410k = z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0335b)) {
            return false;
        }
        C0335b c0335b = (C0335b) obj;
        return this.f5404a == c0335b.f5404a && C.i(this.f5405b, c0335b.f5405b) && C.i(this.f5406c, c0335b.f5406c) && this.f5407d == c0335b.f5407d && C.i(this.f5408e, c0335b.f5408e) && C.i(this.f5409f, c0335b.f5409f) && this.f5410k == c0335b.f5410k;
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f5404a);
        Boolean boolValueOf2 = Boolean.valueOf(this.f5407d);
        Boolean boolValueOf3 = Boolean.valueOf(this.f5410k);
        return Arrays.hashCode(new Object[]{boolValueOf, this.f5405b, this.f5406c, boolValueOf2, this.f5408e, this.f5409f, boolValueOf3});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5404a ? 1 : 0);
        S0.f.n0(parcel, 2, this.f5405b, false);
        S0.f.n0(parcel, 3, this.f5406c, false);
        S0.f.u0(parcel, 4, 4);
        parcel.writeInt(this.f5407d ? 1 : 0);
        S0.f.n0(parcel, 5, this.f5408e, false);
        S0.f.p0(parcel, 6, this.f5409f);
        S0.f.u0(parcel, 7, 4);
        parcel.writeInt(this.f5410k ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
