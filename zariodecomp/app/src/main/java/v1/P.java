package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\P.smali */
public final class P extends AbstractC0596a {
    public static final Parcelable.Creator<P> CREATOR = new O(2);

    /* renamed from: a, reason: collision with root package name */
    public final long f10589a;

    public P(long j5) {
        this.f10589a = Long.valueOf(j5).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof P) && this.f10589a == ((P) obj).f10589a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10589a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 8);
        parcel.writeLong(this.f10589a);
        S0.f.w0(iV0, parcel);
    }
}
