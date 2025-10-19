package d4;

import L3.q;
import L3.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d4\g.smali */
public abstract class g extends h {
    public static e k0(Iterator it) {
        kotlin.jvm.internal.i.e(it, "<this>");
        return new a(new q(it, 3));
    }

    public static e l0(Object obj, X3.l lVar) {
        return obj == null ? b.f6802a : new k(new i(obj, 0), lVar);
    }

    public static List m0(e eVar) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        Iterator it = eVar.iterator();
        if (!it.hasNext()) {
            return s.f2351a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return p1.b.B(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
