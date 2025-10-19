package kotlin.jvm.internal;

import java.util.Collection;
import java.util.Map;
import r.AbstractC0854a;
import z0.C1062a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\kotlin\jvm\internal\u.smali */
public abstract class u {
    public static Collection a(Collection collection) {
        if (!(collection instanceof Y3.a) || (collection instanceof Y3.b)) {
            return collection;
        }
        d(collection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Map b(Map map) {
        if ((map instanceof Y3.a) && !(map instanceof Y3.c)) {
            d(map, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return map;
        } catch (ClassCastException e5) {
            i.h(e5, u.class.getName());
            throw e5;
        }
    }

    public static void c(int i, Object obj) {
        if (obj != null) {
            if (obj instanceof K3.a) {
                if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof X3.a ? 0 : obj instanceof X3.l ? 1 : obj instanceof X3.p ? 2 : obj instanceof X3.q ? 3 : obj instanceof C1062a ? 4 : obj instanceof X3.s ? 6 : -1) == i) {
                    return;
                }
            }
            d(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC0854a.c(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        i.h(classCastException, u.class.getName());
        throw classCastException;
    }
}
