package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* renamed from: v1.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\x.1.smali */
public final class C0998x extends AbstractC0596a {
    public static final Parcelable.Creator<C0998x> CREATOR = new O(8);

    /* renamed from: a, reason: collision with root package name */
    public final String f10650a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10651b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10652c;

    /* renamed from: d, reason: collision with root package name */
    public final C0987j f10653d;

    /* renamed from: e, reason: collision with root package name */
    public final C0986i f10654e;

    /* renamed from: f, reason: collision with root package name */
    public final C0988k f10655f;

    /* renamed from: k, reason: collision with root package name */
    public final C0984g f10656k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10657l;

    public C0998x(String str, String str2, byte[] bArr, C0987j c0987j, C0986i c0986i, C0988k c0988k, C0984g c0984g, String str3) {
        boolean z4 = true;
        if ((c0987j == null || c0986i != null || c0988k != null) && ((c0987j != null || c0986i == null || c0988k != null) && (c0987j != null || c0986i != null || c0988k == null))) {
            z4 = false;
        }
        com.google.android.gms.common.internal.C.b(z4);
        this.f10650a = str;
        this.f10651b = str2;
        this.f10652c = bArr;
        this.f10653d = c0987j;
        this.f10654e = c0986i;
        this.f10655f = c0988k;
        this.f10656k = c0984g;
        this.f10657l = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0998x)) {
            return false;
        }
        C0998x c0998x = (C0998x) obj;
        return com.google.android.gms.common.internal.C.i(this.f10650a, c0998x.f10650a) && com.google.android.gms.common.internal.C.i(this.f10651b, c0998x.f10651b) && Arrays.equals(this.f10652c, c0998x.f10652c) && com.google.android.gms.common.internal.C.i(this.f10653d, c0998x.f10653d) && com.google.android.gms.common.internal.C.i(this.f10654e, c0998x.f10654e) && com.google.android.gms.common.internal.C.i(this.f10655f, c0998x.f10655f) && com.google.android.gms.common.internal.C.i(this.f10656k, c0998x.f10656k) && com.google.android.gms.common.internal.C.i(this.f10657l, c0998x.f10657l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10650a, this.f10651b, this.f10652c, this.f10654e, this.f10653d, this.f10655f, this.f10656k, this.f10657l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f10650a, false);
        S0.f.n0(parcel, 2, this.f10651b, false);
        S0.f.g0(parcel, 3, this.f10652c, false);
        S0.f.m0(parcel, 4, this.f10653d, i, false);
        S0.f.m0(parcel, 5, this.f10654e, i, false);
        S0.f.m0(parcel, 6, this.f10655f, i, false);
        S0.f.m0(parcel, 7, this.f10656k, i, false);
        S0.f.n0(parcel, 8, this.f10657l, false);
        S0.f.w0(iV0, parcel);
    }
}
