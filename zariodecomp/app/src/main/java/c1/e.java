package c1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\e.smali */
public final class e extends AbstractC0596a {
    public static final Parcelable.Creator<e> CREATOR = new D0.k(27);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5416a;

    public e(boolean z4) {
        this.f5416a = z4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && this.f5416a == ((e) obj).f5416a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5416a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5416a ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
