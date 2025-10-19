package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\Z.smali */
public final class Z extends AbstractC0596a {
    public static final Parcelable.Creator<Z> CREATOR = new Y(5);

    /* renamed from: a, reason: collision with root package name */
    public final long f10598a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10599b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10600c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10601d;

    public Z(long j5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10598a = j5;
        com.google.android.gms.common.internal.C.f(bArr);
        this.f10599b = bArr;
        com.google.android.gms.common.internal.C.f(bArr2);
        this.f10600c = bArr2;
        com.google.android.gms.common.internal.C.f(bArr3);
        this.f10601d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z4 = (Z) obj;
        return this.f10598a == z4.f10598a && Arrays.equals(this.f10599b, z4.f10599b) && Arrays.equals(this.f10600c, z4.f10600c) && Arrays.equals(this.f10601d, z4.f10601d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10598a), this.f10599b, this.f10600c, this.f10601d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 8);
        parcel.writeLong(this.f10598a);
        S0.f.g0(parcel, 2, this.f10599b, false);
        S0.f.g0(parcel, 3, this.f10600c, false);
        S0.f.g0(parcel, 4, this.f10601d, false);
        S0.f.w0(iV0, parcel);
    }
}
