package L3;

import N2.AbstractC0156x;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\C.smali */
public abstract class C extends AbstractC0156x {
    public static LinkedHashSet k0(Set set, Object obj) {
        kotlin.jvm.internal.i.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.a0(set.size()));
        boolean z4 = false;
        for (Object obj2 : set) {
            boolean z5 = true;
            if (!z4 && kotlin.jvm.internal.i.a(obj2, obj)) {
                z4 = true;
                z5 = false;
            }
            if (z5) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet l0(Set set, Object obj) {
        kotlin.jvm.internal.i.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.a0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set m0(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return u.f2353a;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            kotlin.jvm.internal.i.d(setSingleton, "singleton(...)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.a0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
