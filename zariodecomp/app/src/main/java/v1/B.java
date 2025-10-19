package v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\B.smali */
public final class B extends AbstractC0989l {
    public static final Parcelable.Creator<B> CREATOR = new O(11);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10558a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f10559b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10560c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10561d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f10562e;

    /* renamed from: f, reason: collision with root package name */
    public final TokenBinding f10563f;

    /* renamed from: k, reason: collision with root package name */
    public final V f10564k;

    /* renamed from: l, reason: collision with root package name */
    public final C0983f f10565l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f10566m;

    public B(byte[] bArr, Double d5, String str, ArrayList arrayList, Integer num, TokenBinding tokenBinding, String str2, C0983f c0983f, Long l4) {
        com.google.android.gms.common.internal.C.f(bArr);
        this.f10558a = bArr;
        this.f10559b = d5;
        com.google.android.gms.common.internal.C.f(str);
        this.f10560c = str;
        this.f10561d = arrayList;
        this.f10562e = num;
        this.f10563f = tokenBinding;
        this.f10566m = l4;
        if (str2 != null) {
            try {
                this.f10564k = V.b(str2);
            } catch (U e5) {
                throw new IllegalArgumentException(e5);
            }
        } else {
            this.f10564k = null;
        }
        this.f10565l = c0983f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        if (Arrays.equals(this.f10558a, b5.f10558a) && com.google.android.gms.common.internal.C.i(this.f10559b, b5.f10559b) && com.google.android.gms.common.internal.C.i(this.f10560c, b5.f10560c)) {
            ArrayList arrayList = this.f10561d;
            ArrayList arrayList2 = b5.f10561d;
            if (((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && com.google.android.gms.common.internal.C.i(this.f10562e, b5.f10562e) && com.google.android.gms.common.internal.C.i(this.f10563f, b5.f10563f) && com.google.android.gms.common.internal.C.i(this.f10564k, b5.f10564k) && com.google.android.gms.common.internal.C.i(this.f10565l, b5.f10565l) && com.google.android.gms.common.internal.C.i(this.f10566m, b5.f10566m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f10558a)), this.f10559b, this.f10560c, this.f10561d, this.f10562e, this.f10563f, this.f10564k, this.f10565l, this.f10566m});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.g0(parcel, 2, this.f10558a, false);
        S0.f.h0(parcel, 3, this.f10559b);
        S0.f.n0(parcel, 4, this.f10560c, false);
        S0.f.r0(parcel, 5, this.f10561d, false);
        S0.f.j0(parcel, 6, this.f10562e);
        S0.f.m0(parcel, 7, this.f10563f, i, false);
        V v4 = this.f10564k;
        S0.f.n0(parcel, 8, v4 == null ? null : v4.f10594a, false);
        S0.f.m0(parcel, 9, this.f10565l, i, false);
        S0.f.l0(parcel, 10, this.f10566m);
        S0.f.w0(iV0, parcel);
    }
}
