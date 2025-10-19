package p2;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\m.smali */
public final class m extends AbstractC0596a {
    public static final Parcelable.Creator<m> CREATOR = new b(4);

    /* renamed from: a, reason: collision with root package name */
    public final List f9356a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9357b;

    public m(ArrayList arrayList, ArrayList arrayList2) {
        this.f9356a = arrayList == null ? new ArrayList() : arrayList;
        this.f9357b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.r0(parcel, 1, this.f9356a, false);
        S0.f.r0(parcel, 2, this.f9357b, false);
        S0.f.w0(iV0, parcel);
    }
}
