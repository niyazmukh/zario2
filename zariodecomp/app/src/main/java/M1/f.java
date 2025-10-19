package m1;

import android.os.Parcel;
import android.os.Parcelable;
import g1.m;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m1.1\f.smali */
public final class f extends AbstractC0596a {
    public static final Parcelable.Creator<f> CREATOR = new m(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f8847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8848b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8849c;

    public f(int i, String str, ArrayList arrayList) {
        this.f8847a = i;
        this.f8848b = str;
        this.f8849c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f8847a);
        S0.f.n0(parcel, 2, this.f8848b, false);
        S0.f.r0(parcel, 3, this.f8849c, false);
        S0.f.w0(iV0, parcel);
    }

    public f(Map map, String str) {
        ArrayList arrayList;
        this.f8847a = 1;
        this.f8848b = str;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList2.add(new g((C0742a) map.get(str2), str2));
            }
            arrayList = arrayList2;
        }
        this.f8849c = arrayList;
    }
}
