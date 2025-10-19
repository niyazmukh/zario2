package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\N.smali */
public final class N extends AbstractC0596a {
    public static final Parcelable.Creator<N> CREATOR = new O(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f10585a;

    /* renamed from: b, reason: collision with root package name */
    public final short f10586b;

    /* renamed from: c, reason: collision with root package name */
    public final short f10587c;

    public N(int i, short s4, short s5) {
        this.f10585a = i;
        this.f10586b = s4;
        this.f10587c = s5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n5 = (N) obj;
        return this.f10585a == n5.f10585a && this.f10586b == n5.f10586b && this.f10587c == n5.f10587c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10585a), Short.valueOf(this.f10586b), Short.valueOf(this.f10587c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f10585a);
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(this.f10586b);
        S0.f.u0(parcel, 3, 4);
        parcel.writeInt(this.f10587c);
        S0.f.w0(iV0, parcel);
    }
}
