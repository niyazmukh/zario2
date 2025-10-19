package l1;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import g1.m;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l1\a.smali */
public final class a extends AbstractC0596a {
    public static final Parcelable.Creator<a> CREATOR = new m(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f8754a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8755b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f8756c = new SparseArray();

    public a(int i, ArrayList arrayList) {
        this.f8754a = i;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            c cVar = (c) arrayList.get(i5);
            String str = cVar.f8760b;
            int i6 = cVar.f8761c;
            this.f8755b.put(str, Integer.valueOf(i6));
            this.f8756c.put(i6, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.u0(parcel, 1, 4);
        parcel.writeInt(this.f8754a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f8755b;
        for (String str : map.keySet()) {
            arrayList.add(new c(str, ((Integer) map.get(str)).intValue()));
        }
        f.r0(parcel, 2, arrayList, false);
        f.w0(iV0, parcel);
    }
}
