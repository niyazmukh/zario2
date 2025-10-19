package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\L.smali */
public final class L extends AbstractC0596a {
    public static final Parcelable.Creator<L> CREATOR = new O(18);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10583a;

    public L(boolean z4) {
        this.f10583a = z4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof L) && this.f10583a == ((L) obj).f10583a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10583a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f10583a ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
