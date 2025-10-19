package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\b0.smali */
public final class b0 extends AbstractC0596a {
    public static final Parcelable.Creator<b0> CREATOR = new Y(7);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10603a;

    public b0(boolean z4) {
        this.f10603a = Boolean.valueOf(z4).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && this.f10603a == ((b0) obj).f10603a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10603a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f10603a ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
