package c1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\i.smali */
public final class i extends AbstractC0596a {
    public static final Parcelable.Creator<i> CREATOR = new D0.k(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f5425a;

    public i(int i) {
        this.f5425a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return C.i(Integer.valueOf(this.f5425a), Integer.valueOf(((i) obj).f5425a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5425a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5425a);
        S0.f.w0(iV0, parcel);
    }
}
