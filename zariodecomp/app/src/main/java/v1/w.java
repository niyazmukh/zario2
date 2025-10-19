package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\w.1.smali */
public final class w extends AbstractC0596a {
    public static final Parcelable.Creator<w> CREATOR = new O(4);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10649a;

    public w(boolean z4) {
        this.f10649a = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f10649a == ((w) obj).f10649a;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10649a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f10649a ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
