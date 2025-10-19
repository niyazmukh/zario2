package q2;

import A2.RunnableC0012l;
import a.AbstractC0183a;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import v2.InterfaceC1001a;
import v2.InterfaceC1002b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q2.1\f.smali */
public final class f implements InterfaceC0850b {
    public static final e h = new e(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9477a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9478b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9479c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f9480d;

    /* renamed from: e, reason: collision with root package name */
    public final k f9481e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f9482f;

    /* renamed from: g, reason: collision with root package name */
    public final J3.c f9483g;

    public f(ArrayList arrayList, ArrayList arrayList2, J3.c cVar) {
        int i = 1;
        r2.i iVar = r2.i.f9634a;
        this.f9477a = new HashMap();
        this.f9478b = new HashMap();
        this.f9479c = new HashMap();
        this.f9480d = new HashSet();
        this.f9482f = new AtomicReference();
        r2.i iVar2 = r2.i.f9634a;
        k kVar = new k();
        new HashMap();
        kVar.f9492a = new ArrayDeque();
        this.f9481e = kVar;
        this.f9483g = cVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C0849a.a(kVar, k.class, InterfaceC1002b.class, InterfaceC1001a.class));
        arrayList3.add(C0849a.a(this, f.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C0849a c0849a = (C0849a) it.next();
            if (c0849a != null) {
                arrayList3.add(c0849a);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((H2.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f9483g.e(componentRegistrar));
                        it3.remove();
                    }
                } catch (l e5) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e5);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C0849a) it4.next()).f9469b.toArray();
                int length = array.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        Object obj = array[i5];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f9480d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f9480d.add(obj.toString());
                        }
                        i5++;
                    }
                }
            }
            if (this.f9477a.isEmpty()) {
                AbstractC0183a.x(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f9477a.keySet());
                arrayList6.addAll(arrayList3);
                AbstractC0183a.x(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C0849a c0849a2 = (C0849a) it5.next();
                this.f9477a.put(c0849a2, new m(new G2.b(i, this, c0849a2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f9482f.get();
        if (bool != null) {
            i(this.f9477a, bool.booleanValue());
        }
    }

    @Override // q2.InterfaceC0850b
    public final o d(q qVar) {
        H2.b bVarE = e(qVar);
        return bVarE == null ? new o(o.f9496c, o.f9497d) : bVarE instanceof o ? (o) bVarE : new o(null, bVarE);
    }

    @Override // q2.InterfaceC0850b
    public final synchronized H2.b e(q qVar) {
        p1.b.k(qVar, "Null interface requested.");
        return (H2.b) this.f9478b.get(qVar);
    }

    @Override // q2.InterfaceC0850b
    public final synchronized H2.b g(q qVar) {
        n nVar = (n) this.f9479c.get(qVar);
        if (nVar != null) {
            return nVar;
        }
        return h;
    }

    public final void i(HashMap map, boolean z4) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C0849a c0849a = (C0849a) entry.getKey();
            c0849a.getClass();
        }
        k kVar = this.f9481e;
        synchronized (kVar) {
            arrayDeque = kVar.f9492a;
            if (arrayDeque != null) {
                kVar.f9492a = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void j() {
        for (C0849a c0849a : this.f9477a.keySet()) {
            for (i iVar : c0849a.f9470c) {
                boolean z4 = iVar.f9490b == 2;
                q qVar = iVar.f9489a;
                if (z4) {
                    HashMap map = this.f9479c;
                    if (!map.containsKey(qVar)) {
                        Set setEmptySet = Collections.emptySet();
                        n nVar = new n();
                        nVar.b = null;
                        nVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                        nVar.a.addAll(setEmptySet);
                        map.put(qVar, nVar);
                    }
                }
                HashMap map2 = this.f9478b;
                if (map2.containsKey(qVar)) {
                    continue;
                } else {
                    int i = iVar.f9490b;
                    if (i == 1) {
                        throw new j("Unsatisfied dependency for component " + c0849a + ": " + qVar);
                    }
                    if (i != 2) {
                        map2.put(qVar, new o(o.f9496c, o.f9497d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0849a c0849a = (C0849a) it.next();
            if (c0849a.f9471d == 0) {
                H2.b bVar = (H2.b) this.f9477a.get(c0849a);
                for (q qVar : c0849a.f9469b) {
                    HashMap map = this.f9478b;
                    if (map.containsKey(qVar)) {
                        arrayList2.add(new RunnableC0012l(19, (o) ((H2.b) map.get(qVar)), bVar));
                    } else {
                        map.put(qVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f9477a.entrySet()) {
            C0849a c0849a = (C0849a) entry.getKey();
            if (c0849a.f9471d != 0) {
                H2.b bVar = (H2.b) entry.getValue();
                for (q qVar : c0849a.f9469b) {
                    if (!map.containsKey(qVar)) {
                        map.put(qVar, new HashSet());
                    }
                    ((Set) map.get(qVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f9479c;
            if (map2.containsKey(key)) {
                n nVar = (n) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC0012l(20, nVar, (H2.b) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.b = null;
                nVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.a.addAll(set);
                map2.put(qVar2, nVar2);
            }
        }
        return arrayList;
    }
}
