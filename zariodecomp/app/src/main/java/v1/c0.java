package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\c0.smali */
public final class c0 extends AbstractC0596a {
    public static final Parcelable.Creator<c0> CREATOR = new O(1);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10606a;

    public c0(boolean z4) {
        this.f10606a = Boolean.valueOf(z4).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c0) && this.f10606a == ((c0) obj).f10606a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10606a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f10606a ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
