package I3;

import A2.C0020u;
import B3.C0099z1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import z3.I;
import z3.K;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\v.smali */
public final class v extends K {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1980a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f1981b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1982c;

    public v(ArrayList arrayList, AtomicInteger atomicInteger) {
        S0.f.g("empty list", !arrayList.isEmpty());
        this.f1980a = arrayList;
        S0.f.l(atomicInteger, "index");
        this.f1981b = atomicInteger;
        Iterator it = arrayList.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((K) it.next()).hashCode();
        }
        this.f1982c = iHashCode;
    }

    @Override // z3.K
    public final I a(C0099z1 c0099z1) {
        int andIncrement = this.f1981b.getAndIncrement() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        ArrayList arrayList = this.f1980a;
        return ((K) arrayList.get(andIncrement % arrayList.size())).a(c0099z1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (vVar == this) {
            return true;
        }
        if (this.f1982c != vVar.f1982c || this.f1981b != vVar.f1981b) {
            return false;
        }
        ArrayList arrayList = this.f1980a;
        int size = arrayList.size();
        ArrayList arrayList2 = vVar.f1980a;
        return size == arrayList2.size() && new HashSet(arrayList).containsAll(arrayList2);
    }

    public final int hashCode() {
        return this.f1982c;
    }

    public final String toString() {
        C0020u c0020u = new C0020u(v.class.getSimpleName());
        c0020u.a(this.f1980a, "subchannelPickers");
        return c0020u.toString();
    }
}
