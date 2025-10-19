package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\X.smali */
public final class X extends AbstractC0596a {
    public static final Parcelable.Creator<X> CREATOR = new O(27);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10595a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10596b;

    public X(boolean z4, byte[] bArr) {
        this.f10595a = z4;
        this.f10596b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x3 = (X) obj;
        return this.f10595a == x3.f10595a && Arrays.equals(this.f10596b, x3.f10596b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10595a), this.f10596b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f10595a ? 1 : 0);
        S0.f.g0(parcel, 2, this.f10596b, false);
        S0.f.w0(iV0, parcel);
    }
}
