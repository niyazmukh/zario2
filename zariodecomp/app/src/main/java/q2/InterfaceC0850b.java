package q2;

import java.util.Set;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q2.1\b.smali */
public interface InterfaceC0850b {
    default Object a(Class cls) {
        return c(q.a(cls));
    }

    default H2.b b(Class cls) {
        return e(q.a(cls));
    }

    default Object c(q qVar) {
        H2.b bVarE = e(qVar);
        if (bVarE == null) {
            return null;
        }
        return bVarE.get();
    }

    o d(q qVar);

    H2.b e(q qVar);

    default o f(Class cls) {
        return d(q.a(cls));
    }

    H2.b g(q qVar);

    default Set h(q qVar) {
        return (Set) g(qVar).get();
    }
}
