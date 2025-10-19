package B2;

import N2.C;
import N2.E;
import N2.m0;
import N2.n0;
import a.AbstractC0183a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\m.smali */
public final class m implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f328a;

    /* renamed from: b, reason: collision with root package name */
    public volatile n0 f329b;

    /* renamed from: c, reason: collision with root package name */
    public n0 f330c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f331d;

    public m(n0 n0Var) {
        this.f328a = new Object();
        this.f331d = new HashMap();
        AbstractC0183a.N(n0Var.R() == 11, "ObjectValues should be backed by a MapValue", new Object[0]);
        AbstractC0183a.N(!p1.b.A(n0Var), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f329b = n0Var;
    }

    public static E a(n0 n0Var, k kVar, Map map) {
        C cB;
        n0 n0VarD = d(kVar, n0Var);
        n0 n0Var2 = p.f335a;
        if (n0VarD == null || n0VarD.R() != 11) {
            cB = E.B();
        } else {
            E eN = n0VarD.N();
            com.google.protobuf.C c5 = (com.google.protobuf.C) eN.j(5);
            if (!c5.f6409a.equals(eN)) {
                c5.d();
                com.google.protobuf.C.e(c5.f6410b, eN);
            }
            cB = (C) c5;
        }
        boolean z4 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                E eA = a(n0Var, (k) kVar.b(str), (Map) value);
                if (eA != null) {
                    m0 m0VarT = n0.T();
                    m0VarT.i(eA);
                    cB.f((n0) m0VarT.b(), str);
                    z4 = true;
                }
            } else {
                if (value instanceof n0) {
                    cB.f((n0) value, str);
                } else {
                    cB.getClass();
                    str.getClass();
                    if (((E) cB.f6410b).y().containsKey(str)) {
                        AbstractC0183a.N(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                        cB.d();
                        E.v((E) cB.f6410b).remove(str);
                    }
                }
                z4 = true;
            }
        }
        if (z4) {
            return (E) cB.b();
        }
        return null;
    }

    public static C2.f c(E e5) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : e5.y().entrySet()) {
            k kVar = new k(Collections.singletonList((String) entry.getKey()));
            n0 n0Var = (n0) entry.getValue();
            n0 n0Var2 = p.f335a;
            if (n0Var == null || n0Var.R() != 11) {
                hashSet.add(kVar);
            } else {
                HashSet hashSet2 = c(((n0) entry.getValue()).N()).f1081a;
                if (hashSet2.isEmpty()) {
                    hashSet.add(kVar);
                } else {
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        hashSet.add((k) kVar.a((k) it.next()));
                    }
                }
            }
        }
        return new C2.f(hashSet);
    }

    public static n0 d(k kVar, n0 n0Var) {
        if (kVar.h()) {
            return n0Var;
        }
        for (int i = 0; i < kVar.f309a.size() - 1; i++) {
            n0Var = n0Var.N().z(kVar.g(i));
            n0 n0Var2 = p.f335a;
            if (n0Var == null || n0Var.R() != 11) {
                return null;
            }
        }
        return n0Var.N().z(kVar.f());
    }

    public static m e(Map map) {
        m0 m0VarT = n0.T();
        C cB = E.B();
        cB.d();
        E.v((E) cB.f6410b).putAll(map);
        m0VarT.h(cB);
        return new m((n0) m0VarT.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map] */
    public static void j(HashMap map, k kVar, n0 n0Var) {
        HashMap map2;
        for (int i = 0; i < kVar.f309a.size() - 1; i++) {
            String strG = kVar.g(i);
            Object obj = map.get(strG);
            if (obj instanceof Map) {
                map2 = (Map) obj;
            } else {
                if (obj instanceof n0) {
                    n0 n0Var2 = (n0) obj;
                    if (n0Var2.R() == 11) {
                        HashMap map3 = new HashMap(n0Var2.N().y());
                        map.put(strG, map3);
                        map = map3;
                    }
                }
                HashMap map4 = new HashMap();
                map.put(strG, map4);
                map2 = map4;
            }
            map = map2;
        }
        map.put(kVar.f(), n0Var);
    }

    public final n0 b() {
        E eA;
        n0 n0Var = this.f329b;
        if (n0Var == null) {
            synchronized (this.f328a) {
                try {
                    n0Var = this.f329b;
                    if (n0Var == null) {
                        if (this.f331d.isEmpty() || (eA = a(this.f330c, k.f321c, this.f331d)) == null) {
                            n0Var = this.f330c;
                        } else {
                            m0 m0VarT = n0.T();
                            m0VarT.i(eA);
                            n0Var = (n0) m0VarT.b();
                        }
                        this.f329b = n0Var;
                        this.f330c = null;
                        this.f331d.clear();
                    }
                } finally {
                }
            }
        }
        return n0Var;
    }

    public final Object clone() {
        return new m(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return p.e(b(), ((m) obj).b());
        }
        return false;
    }

    public final n0 f(k kVar) {
        return d(kVar, b());
    }

    public final void g(k kVar, n0 n0Var) {
        AbstractC0183a.N(!kVar.h(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        i(kVar, n0Var);
    }

    public final void h(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            k kVar = (k) entry.getKey();
            if (entry.getValue() == null) {
                AbstractC0183a.N(!kVar.h(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
                i(kVar, null);
            } else {
                g(kVar, (n0) entry.getValue());
            }
        }
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final void i(k kVar, n0 n0Var) {
        synchronized (this.f328a) {
            try {
                if (this.f329b != null) {
                    this.f330c = this.f329b;
                    this.f329b = null;
                }
                j(this.f331d, kVar, n0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectValue{internalValue=");
        n0 n0VarB = b();
        n0 n0Var = p.f335a;
        StringBuilder sb2 = new StringBuilder();
        p.a(sb2, n0VarB);
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m() {
        m0 m0VarT = n0.T();
        m0VarT.i(E.w());
        this((n0) m0VarT.b());
    }
}
