package v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: v1.y, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\y.1.smali */
public final class C0999y extends AbstractC0989l {
    public static final Parcelable.Creator<C0999y> CREATOR = new O(7);

    /* renamed from: a, reason: collision with root package name */
    public final C f10658a;

    /* renamed from: b, reason: collision with root package name */
    public final F f10659b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10660c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10661d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f10662e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10663f;

    /* renamed from: k, reason: collision with root package name */
    public final C0990m f10664k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f10665l;

    /* renamed from: m, reason: collision with root package name */
    public final TokenBinding f10666m;

    /* renamed from: n, reason: collision with root package name */
    public final EnumC0982e f10667n;

    /* renamed from: o, reason: collision with root package name */
    public final C0983f f10668o;

    public C0999y(C c5, F f2, byte[] bArr, ArrayList arrayList, Double d5, ArrayList arrayList2, C0990m c0990m, Integer num, TokenBinding tokenBinding, String str, C0983f c0983f) {
        com.google.android.gms.common.internal.C.f(c5);
        this.f10658a = c5;
        com.google.android.gms.common.internal.C.f(f2);
        this.f10659b = f2;
        com.google.android.gms.common.internal.C.f(bArr);
        this.f10660c = bArr;
        com.google.android.gms.common.internal.C.f(arrayList);
        this.f10661d = arrayList;
        this.f10662e = d5;
        this.f10663f = arrayList2;
        this.f10664k = c0990m;
        this.f10665l = num;
        this.f10666m = tokenBinding;
        if (str != null) {
            try {
                this.f10667n = EnumC0982e.b(str);
            } catch (C0981d e5) {
                throw new IllegalArgumentException(e5);
            }
        } else {
            this.f10667n = null;
        }
        this.f10668o = c0983f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0999y)) {
            return false;
        }
        C0999y c0999y = (C0999y) obj;
        if (com.google.android.gms.common.internal.C.i(this.f10658a, c0999y.f10658a) && com.google.android.gms.common.internal.C.i(this.f10659b, c0999y.f10659b) && Arrays.equals(this.f10660c, c0999y.f10660c) && com.google.android.gms.common.internal.C.i(this.f10662e, c0999y.f10662e)) {
            ArrayList arrayList = this.f10661d;
            ArrayList arrayList2 = c0999y.f10661d;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList)) {
                ArrayList arrayList3 = this.f10663f;
                ArrayList arrayList4 = c0999y.f10663f;
                if (((arrayList3 == null && arrayList4 == null) || (arrayList3 != null && arrayList4 != null && arrayList3.containsAll(arrayList4) && arrayList4.containsAll(arrayList3))) && com.google.android.gms.common.internal.C.i(this.f10664k, c0999y.f10664k) && com.google.android.gms.common.internal.C.i(this.f10665l, c0999y.f10665l) && com.google.android.gms.common.internal.C.i(this.f10666m, c0999y.f10666m) && com.google.android.gms.common.internal.C.i(this.f10667n, c0999y.f10667n) && com.google.android.gms.common.internal.C.i(this.f10668o, c0999y.f10668o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10658a, this.f10659b, Integer.valueOf(Arrays.hashCode(this.f10660c)), this.f10661d, this.f10662e, this.f10663f, this.f10664k, this.f10665l, this.f10666m, this.f10667n, this.f10668o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 2, this.f10658a, i, false);
        S0.f.m0(parcel, 3, this.f10659b, i, false);
        S0.f.g0(parcel, 4, this.f10660c, false);
        S0.f.r0(parcel, 5, this.f10661d, false);
        S0.f.h0(parcel, 6, this.f10662e);
        S0.f.r0(parcel, 7, this.f10663f, false);
        S0.f.m0(parcel, 8, this.f10664k, i, false);
        S0.f.j0(parcel, 9, this.f10665l);
        S0.f.m0(parcel, 10, this.f10666m, i, false);
        EnumC0982e enumC0982e = this.f10667n;
        S0.f.n0(parcel, 11, enumC0982e == null ? null : enumC0982e.f10608a, false);
        S0.f.m0(parcel, 12, this.f10668o, i, false);
        S0.f.w0(iV0, parcel);
    }
}
