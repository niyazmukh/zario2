package androidx.work;

import J0.h;
import J0.k;
import K2.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\OverwritingInputMerger.smali */
public final class OverwritingInputMerger extends k {
    @Override // J0.k
    public final h a(ArrayList arrayList) throws Throwable {
        c cVar = new c(8);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((h) it.next()).f2051a);
            i.d(mapUnmodifiableMap, "input.keyValueMap");
            linkedHashMap.putAll(mapUnmodifiableMap);
        }
        cVar.t(linkedHashMap);
        h hVar = new h((HashMap) cVar.b);
        h.b(hVar);
        return hVar;
    }
}
