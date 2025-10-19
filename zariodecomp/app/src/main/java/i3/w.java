package I3;

import B3.C0090w1;
import B3.C0096y1;
import h2.AbstractC0592a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import z3.AbstractC1080d;
import z3.C1077a;
import z3.C1078b;
import z3.C1094s;
import z3.EnumC1087k;
import z3.I;
import z3.J;
import z3.K;
import z3.M;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\w.smali */
public final class w extends M {

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f1983m = Logger.getLogger(w.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1080d f1985g;
    public boolean h;

    /* renamed from: j, reason: collision with root package name */
    public EnumC1087k f1986j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f1987k;

    /* renamed from: l, reason: collision with root package name */
    public K f1988l;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1984f = new LinkedHashMap();
    public final C0096y1 i = new C0096y1();

    public w(AbstractC1080d abstractC1080d) {
        this.f1985g = abstractC1080d;
        f1983m.log(Level.FINE, "Created");
        this.f1987k = new AtomicInteger(new Random().nextInt());
        this.f1988l = new u();
    }

    @Override // z3.M
    public final k0 a(J j5) {
        try {
            this.h = true;
            S0.e eVarG = g(j5);
            k0 k0Var = (k0) eVarG.f2851a;
            if (!k0Var.e()) {
                return k0Var;
            }
            j();
            Iterator it = ((ArrayList) eVarG.f2852b).iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                iVar.b.f();
                iVar.d = EnumC1087k.f11345e;
                f1983m.log(Level.FINE, "Child balancer {0} deleted", iVar.a);
            }
            return k0Var;
        } finally {
            this.h = false;
        }
    }

    @Override // z3.M
    public final void c(k0 k0Var) {
        if (this.f1986j != EnumC1087k.f11342b) {
            this.f1985g.r(EnumC1087k.f11343c, new C0090w1(I.a(k0Var), 1));
        }
    }

    @Override // z3.M
    public final void f() {
        Level level = Level.FINE;
        Logger logger = f1983m;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f1984f;
        for (i iVar : linkedHashMap.values()) {
            iVar.b.f();
            iVar.d = EnumC1087k.f11345e;
            logger.log(Level.FINE, "Child balancer {0} deleted", iVar.a);
        }
        linkedHashMap.clear();
    }

    public final S0.e g(J j5) {
        LinkedHashMap linkedHashMap;
        h2.e eVarL;
        j jVar;
        C1094s c1094s;
        Level level = Level.FINE;
        Logger logger = f1983m;
        logger.log(level, "Received resolution result: {0}", j5);
        HashMap map = new HashMap();
        List list = j5.f11250a;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f1984f;
            if (!zHasNext) {
                break;
            }
            j jVar2 = new j((C1094s) it.next());
            i iVar = (i) linkedHashMap.get(jVar2);
            if (iVar != null) {
                map.put(jVar2, iVar);
            } else {
                map.put(jVar2, new i(this, jVar2, this.i, new C0090w1(I.f11245e, 1)));
            }
        }
        if (map.isEmpty()) {
            k0 k0VarG = k0.f11355n.g("NameResolver returned no usable address. " + j5);
            c(k0VarG);
            return new S0.e(k0VarG, null);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C0096y1 c0096y1 = ((i) entry.getValue()).c;
            ((i) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                i iVar2 = (i) linkedHashMap.get(key);
                if (iVar2.f) {
                    iVar2.f = false;
                }
            } else {
                linkedHashMap.put(key, (i) entry.getValue());
            }
            i iVar3 = (i) linkedHashMap.get(key);
            if (key instanceof C1094s) {
                jVar = new j((C1094s) key);
            } else {
                S0.f.g("key is wrong type", key instanceof j);
                jVar = (j) key;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c1094s = null;
                    break;
                }
                c1094s = (C1094s) it2.next();
                if (jVar.equals(new j(c1094s))) {
                    break;
                }
            }
            S0.f.l(c1094s, key + " no longer present in load balancer children");
            C1078b c1078b = C1078b.f11279b;
            List listSingletonList = Collections.singletonList(c1094s);
            C1078b c1078b2 = C1078b.f11279b;
            C1077a c1077a = M.f11256e;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(c1077a, bool);
            for (Map.Entry entry2 : c1078b2.f11280a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((C1077a) entry2.getKey(), entry2.getValue());
                }
            }
            J j6 = new J(listSingletonList, new C1078b(identityHashMap), null);
            ((i) linkedHashMap.get(key)).getClass();
            if (!iVar3.f) {
                iVar3.b.d(j6);
            }
        }
        ArrayList arrayList = new ArrayList();
        Collection collectionKeySet = linkedHashMap.keySet();
        h2.c cVar = h2.e.f7669b;
        if (collectionKeySet instanceof AbstractC0592a) {
            eVarL = ((AbstractC0592a) collectionKeySet).f();
            if (eVarL.k()) {
                Object[] array = eVarL.toArray(AbstractC0592a.f7658a);
                eVarL = h2.e.l(array.length, array);
            }
        } else {
            Object[] array2 = collectionKeySet.toArray();
            int length = array2.length;
            for (int i = 0; i < length; i++) {
                if (array2[i] == null) {
                    throw new NullPointerException(B.a.g(i, "at index "));
                }
            }
            eVarL = h2.e.l(array2.length, array2);
        }
        h2.c cVarListIterator = eVarL.listIterator(0);
        while (cVarListIterator.hasNext()) {
            Object next = cVarListIterator.next();
            if (!map.containsKey(next)) {
                i iVar4 = (i) linkedHashMap.get(next);
                if (!iVar4.f) {
                    LinkedHashMap linkedHashMap2 = iVar4.g.f1984f;
                    j jVar3 = iVar4.a;
                    linkedHashMap2.remove(jVar3);
                    iVar4.f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", jVar3);
                }
                arrayList.add(iVar4);
            }
        }
        return new S0.e(k0.f11348e, arrayList);
    }

    public final v h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((i) it.next()).e);
        }
        return new v(arrayList, this.f1987k);
    }

    public final void i(EnumC1087k enumC1087k, K k5) {
        if (enumC1087k == this.f1986j && k5.equals(this.f1988l)) {
            return;
        }
        this.f1985g.r(enumC1087k, k5);
        this.f1986j = enumC1087k;
        this.f1988l = k5;
    }

    public final void j() {
        EnumC1087k enumC1087k;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f1984f;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC1087k = EnumC1087k.f11342b;
            if (!zHasNext) {
                break;
            }
            i iVar = (i) it.next();
            if (!iVar.f && iVar.d == enumC1087k) {
                arrayList.add(iVar);
            }
        }
        if (!arrayList.isEmpty()) {
            i(enumC1087k, h(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            EnumC1087k enumC1087k2 = ((i) it2.next()).d;
            EnumC1087k enumC1087k3 = EnumC1087k.f11341a;
            if (enumC1087k2 == enumC1087k3 || enumC1087k2 == EnumC1087k.f11344d) {
                i(enumC1087k3, new u());
                return;
            }
        }
        i(EnumC1087k.f11343c, h(linkedHashMap.values()));
    }
}
