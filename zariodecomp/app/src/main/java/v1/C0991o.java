package v1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: v1.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\o.1.smali */
public final class C0991o extends AbstractC0992p {
    public static final Parcelable.Creator<C0991o> CREATOR = new Y(3);

    /* renamed from: a, reason: collision with root package name */
    public final B f10640a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f10641b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10642c;

    public C0991o(B b5, Uri uri, byte[] bArr) {
        com.google.android.gms.common.internal.C.f(b5);
        this.f10640a = b5;
        com.google.android.gms.common.internal.C.f(uri);
        boolean z4 = true;
        com.google.android.gms.common.internal.C.a("origin scheme must be non-empty", uri.getScheme() != null);
        com.google.android.gms.common.internal.C.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f10641b = uri;
        if (bArr != null && bArr.length != 32) {
            z4 = false;
        }
        com.google.android.gms.common.internal.C.a("clientDataHash must be 32 bytes long", z4);
        this.f10642c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0991o)) {
            return false;
        }
        C0991o c0991o = (C0991o) obj;
        return com.google.android.gms.common.internal.C.i(this.f10640a, c0991o.f10640a) && com.google.android.gms.common.internal.C.i(this.f10641b, c0991o.f10641b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10640a, this.f10641b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 2, this.f10640a, i, false);
        S0.f.m0(parcel, 3, this.f10641b, i, false);
        S0.f.g0(parcel, 4, this.f10642c, false);
        S0.f.w0(iV0, parcel);
    }
}
