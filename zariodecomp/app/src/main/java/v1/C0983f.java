package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* renamed from: v1.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\f.1.smali */
public final class C0983f extends AbstractC0596a {
    public static final Parcelable.Creator<C0983f> CREATOR = new O(24);

    /* renamed from: a, reason: collision with root package name */
    public final C0997v f10609a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f10610b;

    /* renamed from: c, reason: collision with root package name */
    public final L f10611c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f10612d;

    /* renamed from: e, reason: collision with root package name */
    public final P f10613e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f10614f;

    /* renamed from: k, reason: collision with root package name */
    public final b0 f10615k;

    /* renamed from: l, reason: collision with root package name */
    public final S f10616l;

    /* renamed from: m, reason: collision with root package name */
    public final w f10617m;

    /* renamed from: n, reason: collision with root package name */
    public final T f10618n;

    public C0983f(C0997v c0997v, a0 a0Var, L l4, c0 c0Var, P p5, Q q5, b0 b0Var, S s4, w wVar, T t4) {
        this.f10609a = c0997v;
        this.f10611c = l4;
        this.f10610b = a0Var;
        this.f10612d = c0Var;
        this.f10613e = p5;
        this.f10614f = q5;
        this.f10615k = b0Var;
        this.f10616l = s4;
        this.f10617m = wVar;
        this.f10618n = t4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0983f)) {
            return false;
        }
        C0983f c0983f = (C0983f) obj;
        return com.google.android.gms.common.internal.C.i(this.f10609a, c0983f.f10609a) && com.google.android.gms.common.internal.C.i(this.f10610b, c0983f.f10610b) && com.google.android.gms.common.internal.C.i(this.f10611c, c0983f.f10611c) && com.google.android.gms.common.internal.C.i(this.f10612d, c0983f.f10612d) && com.google.android.gms.common.internal.C.i(this.f10613e, c0983f.f10613e) && com.google.android.gms.common.internal.C.i(this.f10614f, c0983f.f10614f) && com.google.android.gms.common.internal.C.i(this.f10615k, c0983f.f10615k) && com.google.android.gms.common.internal.C.i(this.f10616l, c0983f.f10616l) && com.google.android.gms.common.internal.C.i(this.f10617m, c0983f.f10617m) && com.google.android.gms.common.internal.C.i(this.f10618n, c0983f.f10618n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10609a, this.f10610b, this.f10611c, this.f10612d, this.f10613e, this.f10614f, this.f10615k, this.f10616l, this.f10617m, this.f10618n});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 2, this.f10609a, i, false);
        S0.f.m0(parcel, 3, this.f10610b, i, false);
        S0.f.m0(parcel, 4, this.f10611c, i, false);
        S0.f.m0(parcel, 5, this.f10612d, i, false);
        S0.f.m0(parcel, 6, this.f10613e, i, false);
        S0.f.m0(parcel, 7, this.f10614f, i, false);
        S0.f.m0(parcel, 8, this.f10615k, i, false);
        S0.f.m0(parcel, 9, this.f10616l, i, false);
        S0.f.m0(parcel, 10, this.f10617m, i, false);
        S0.f.m0(parcel, 11, this.f10618n, i, false);
        S0.f.w0(iV0, parcel);
    }
}
