package A2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: A2.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\z.1.smali */
public final class C0025z implements InterfaceC0001a {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f262a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f263b = new HashMap();

    @Override // A2.InterfaceC0001a
    public final void a(int i, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            C2.h hVar = (C2.h) entry.getValue();
            Object[] objArr = {entry.getKey()};
            if (hVar == null) {
                throw new NullPointerException(String.format(Locale.US, "null value for key: %s", objArr));
            }
            TreeMap treeMap = this.f262a;
            B2.h hVar2 = hVar.f1084a;
            C2.d dVar = (C2.d) treeMap.get(hVar2);
            HashMap map2 = this.f263b;
            if (dVar != null) {
                ((Set) map2.get(Integer.valueOf(dVar.f1078a))).remove(hVar2);
            }
            treeMap.put(hVar2, new C2.d(i, hVar));
            if (map2.get(Integer.valueOf(i)) == null) {
                map2.put(Integer.valueOf(i), new HashSet());
            }
            ((Set) map2.get(Integer.valueOf(i))).add(hVar2);
        }
    }

    @Override // A2.InterfaceC0001a
    public final void d(int i) {
        HashMap map = this.f263b;
        if (map.containsKey(Integer.valueOf(i))) {
            Set set = (Set) map.get(Integer.valueOf(i));
            map.remove(Integer.valueOf(i));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f262a.remove((B2.h) it.next());
            }
        }
    }

    @Override // A2.InterfaceC0001a
    public final HashMap h(B2.n nVar, int i) {
        HashMap map = new HashMap();
        int size = nVar.f309a.size() + 1;
        for (C2.d dVar : this.f262a.tailMap(new B2.h((B2.n) nVar.b(""))).values()) {
            B2.h hVar = dVar.f1079b.f1084a;
            if (!nVar.i(hVar.f315a)) {
                break;
            }
            if (hVar.f315a.f309a.size() == size && dVar.f1078a > i) {
                map.put(dVar.f1079b.f1084a, dVar);
            }
        }
        return map;
    }

    @Override // A2.InterfaceC0001a
    public final HashMap i(TreeSet treeSet) {
        HashMap map = new HashMap();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            B2.h hVar = (B2.h) it.next();
            C2.d dVar = (C2.d) this.f262a.get(hVar);
            if (dVar != null) {
                map.put(hVar, dVar);
            }
        }
        return map;
    }

    @Override // A2.InterfaceC0001a
    public final C2.d l(B2.h hVar) {
        return (C2.d) this.f262a.get(hVar);
    }

    @Override // A2.InterfaceC0001a
    public final HashMap n(int i, int i5, String str) {
        int i6;
        TreeMap treeMap = new TreeMap();
        for (C2.d dVar : this.f262a.values()) {
            if (dVar.f1079b.f1084a.f315a.g(r2.f309a.size() - 2).equals(str) && (i6 = dVar.f1078a) > i) {
                Map map = (Map) treeMap.get(Integer.valueOf(i6));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(i6), map);
                }
                map.put(dVar.f1079b.f1084a, dVar);
            }
        }
        HashMap map2 = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            map2.putAll((Map) it.next());
            if (map2.size() >= i5) {
                break;
            }
        }
        return map2;
    }
}
