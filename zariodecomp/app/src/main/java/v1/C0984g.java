package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* renamed from: v1.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\g.1.smali */
public final class C0984g extends AbstractC0596a {
    public static final Parcelable.Creator<C0984g> CREATOR = new O(23);

    /* renamed from: a, reason: collision with root package name */
    public final M f10619a;

    /* renamed from: b, reason: collision with root package name */
    public final W f10620b;

    /* renamed from: c, reason: collision with root package name */
    public final C0985h f10621c;

    /* renamed from: d, reason: collision with root package name */
    public final X f10622d;

    public C0984g(M m5, W w4, C0985h c0985h, X x3) {
        this.f10619a = m5;
        this.f10620b = w4;
        this.f10621c = c0985h;
        this.f10622d = x3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0984g)) {
            return false;
        }
        C0984g c0984g = (C0984g) obj;
        return com.google.android.gms.common.internal.C.i(this.f10619a, c0984g.f10619a) && com.google.android.gms.common.internal.C.i(this.f10620b, c0984g.f10620b) && com.google.android.gms.common.internal.C.i(this.f10621c, c0984g.f10621c) && com.google.android.gms.common.internal.C.i(this.f10622d, c0984g.f10622d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10619a, this.f10620b, this.f10621c, this.f10622d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 1, this.f10619a, i, false);
        S0.f.m0(parcel, 2, this.f10620b, i, false);
        S0.f.m0(parcel, 3, this.f10621c, i, false);
        S0.f.m0(parcel, 4, this.f10622d, i, false);
        S0.f.w0(iV0, parcel);
    }
}
