package m1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import g1.m;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m1.1\h.smali */
public final class h extends AbstractC0596a {
    public static final Parcelable.Creator<h> CREATOR = new m(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f8853a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8854b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8855c;

    public h(int i, String str, ArrayList arrayList) {
        this.f8853a = i;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            f fVar = (f) arrayList.get(i5);
            String str2 = fVar.f8848b;
            HashMap map2 = new HashMap();
            ArrayList arrayList2 = fVar.f8849c;
            C.f(arrayList2);
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                g gVar = (g) arrayList2.get(i6);
                map2.put(gVar.f8851b, gVar.f8852c);
            }
            map.put(str2, map2);
        }
        this.f8854b = map;
        C.f(str);
        this.f8855c = str;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map3 = (Map) map.get((String) it.next());
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                ((C0742a) map3.get((String) it2.next())).f8838n = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap map = this.f8854b;
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map2.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f8853a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f8854b;
        for (String str : map.keySet()) {
            arrayList.add(new f((Map) map.get(str), str));
        }
        S0.f.r0(parcel, 2, arrayList, false);
        S0.f.n0(parcel, 3, this.f8855c, false);
        S0.f.w0(iV0, parcel);
    }
}
