package androidx.work;

import J0.h;
import J0.k;
import K2.c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\ArrayCreatingInputMerger.smali */
public final class ArrayCreatingInputMerger extends k {
    @Override // J0.k
    public final h a(ArrayList arrayList) throws Throwable {
        Object newArray;
        c cVar = new c(8);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((h) it.next()).f2051a);
            i.d(mapUnmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(key);
                i.d(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        i.d(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        i.b(componentType);
                        Object newArray2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newArray2, 0, length);
                        System.arraycopy(value, 0, newArray2, length, length2);
                        i.d(newArray2, "newArray");
                        value = newArray2;
                    } else {
                        if (!i.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        newArray = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newArray, 0, length3);
                        Array.set(newArray, length3, value);
                        i.d(newArray, "newArray");
                        value = newArray;
                    }
                } else if (!cls.isArray()) {
                    newArray = Array.newInstance(cls, 1);
                    Array.set(newArray, 0, value);
                    i.d(newArray, "newArray");
                    value = newArray;
                }
                i.d(value, "if (existingValue == nul…      }\n                }");
                map.put(key, value);
            }
        }
        cVar.t(map);
        h hVar = new h((HashMap) cVar.b);
        h.b(hVar);
        return hVar;
    }
}
