package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\S.smali */
public final class S extends AbstractC0596a {
    public static final Parcelable.Creator<S> CREATOR = new O(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f10591a;

    public S(String str) {
        com.google.android.gms.common.internal.C.f(str);
        this.f10591a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S) {
            return this.f10591a.equals(((S) obj).f10591a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10591a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f10591a, false);
        S0.f.w0(iV0, parcel);
    }
}
