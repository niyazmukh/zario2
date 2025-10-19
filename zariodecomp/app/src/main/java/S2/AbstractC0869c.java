package s2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s2.1\c.smali */
public abstract class AbstractC0869c implements Iterable {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0869c)) {
            return false;
        }
        AbstractC0869c abstractC0869c = (AbstractC0869c) obj;
        if (!h().equals(abstractC0869c.h()) || size() != abstractC0869c.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = abstractC0869c.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean f(Object obj);

    public abstract Object g(B2.h hVar);

    public abstract Comparator h();

    public final int hashCode() {
        int iHashCode = h().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public abstract Object i();

    public abstract boolean isEmpty();

    public abstract Object j();

    public abstract AbstractC0869c k(Object obj, Object obj2);

    public abstract Iterator l(Object obj);

    public abstract AbstractC0869c m(Object obj);

    public abstract int size();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
}
