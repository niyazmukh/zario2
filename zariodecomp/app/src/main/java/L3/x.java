package L3;

import K3.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\x.smali */
public abstract class x extends r1.d {
    public static int a0(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static Map b0(e pair) {
        kotlin.jvm.internal.i.e(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f2277a, pair.f2278b);
        kotlin.jvm.internal.i.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map c0(e... eVarArr) {
        if (eVarArr.length <= 0) {
            return t.f2352a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a0(eVarArr.length));
        d0(linkedHashMap, eVarArr);
        return linkedHashMap;
    }

    public static final void d0(LinkedHashMap linkedHashMap, e[] eVarArr) {
        for (e eVar : eVarArr) {
            linkedHashMap.put(eVar.f2277a, eVar.f2278b);
        }
    }

    public static Map e0(ArrayList arrayList) {
        t tVar = t.f2352a;
        int size = arrayList.size();
        if (size == 0) {
            return tVar;
        }
        if (size == 1) {
            return b0((e) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            linkedHashMap.put(eVar.f2277a, eVar.f2278b);
        }
        return linkedHashMap;
    }

    public static Map f0(LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.i.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size == 0) {
            return t.f2352a;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        kotlin.jvm.internal.i.e(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.i.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
