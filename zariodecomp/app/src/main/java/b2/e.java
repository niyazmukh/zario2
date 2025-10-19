package B2;

import F2.s;
import a.AbstractC0183a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\e.smali */
public abstract class e implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final List f309a;

    public e(List list) {
        this.f309a = list;
    }

    public final e a(e eVar) {
        ArrayList arrayList = new ArrayList(this.f309a);
        arrayList.addAll(eVar.f309a);
        return e(arrayList);
    }

    public final e b(String str) {
        ArrayList arrayList = new ArrayList(this.f309a);
        arrayList.add(str);
        return e(arrayList);
    }

    public abstract String c();

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        int size = this.f309a.size();
        int size2 = eVar.f309a.size();
        for (int i = 0; i < size && i < size2; i++) {
            String strG = g(i);
            String strG2 = eVar.g(i);
            int iCompare = 1;
            boolean z4 = strG.startsWith("__id") && strG.endsWith("__");
            boolean z5 = strG2.startsWith("__id") && strG2.endsWith("__");
            if (z4 && !z5) {
                iCompare = -1;
            } else if (z4 || !z5) {
                iCompare = (z4 && z5) ? Long.compare(Long.parseLong(strG.substring(4, strG.length() - 2)), Long.parseLong(strG2.substring(4, strG2.length() - 2))) : s.e(strG, strG2);
            }
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(size, size2);
    }

    public abstract e e(List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    public final String f() {
        return (String) this.f309a.get(r1.size() - 1);
    }

    public final String g(int i) {
        return (String) this.f309a.get(i);
    }

    public final boolean h() {
        return this.f309a.size() == 0;
    }

    public final int hashCode() {
        return this.f309a.hashCode() + ((getClass().hashCode() + 37) * 37);
    }

    public final boolean i(e eVar) {
        List list = this.f309a;
        if (list.size() > eVar.f309a.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!g(i).equals(eVar.g(i))) {
                return false;
            }
        }
        return true;
    }

    public final e j() {
        List list = this.f309a;
        int size = list.size();
        AbstractC0183a.N(size >= 5, "Can't call popFirst with count > length() (%d > %d)", 5, Integer.valueOf(size));
        return new n(list.subList(5, size));
    }

    public final e k() {
        return e(this.f309a.subList(0, r0.size() - 1));
    }

    public final String toString() {
        return c();
    }
}
