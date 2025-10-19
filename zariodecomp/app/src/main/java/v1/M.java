package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\M.smali */
public final class M extends AbstractC0596a {
    public static final Parcelable.Creator<M> CREATOR = new O(20);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10584a;

    public M(ArrayList arrayList) {
        this.f10584a = arrayList;
    }

    public final boolean equals(Object obj) {
        ArrayList arrayList;
        if (!(obj instanceof M)) {
            return false;
        }
        M m5 = (M) obj;
        ArrayList arrayList2 = this.f10584a;
        return (arrayList2 == null && m5.f10584a == null) || (arrayList2 != null && (arrayList = m5.f10584a) != null && arrayList2.containsAll(arrayList) && m5.f10584a.containsAll(arrayList2));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f10584a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.r0(parcel, 1, this.f10584a, false);
        S0.f.w0(iV0, parcel);
    }
}
