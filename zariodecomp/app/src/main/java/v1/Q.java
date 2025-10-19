package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\Q.smali */
public final class Q extends AbstractC0596a {
    public static final Parcelable.Creator<Q> CREATOR = new O(3);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10590a;

    public Q(boolean z4) {
        this.f10590a = Boolean.valueOf(z4).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Q) && this.f10590a == ((Q) obj).f10590a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10590a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f10590a ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
