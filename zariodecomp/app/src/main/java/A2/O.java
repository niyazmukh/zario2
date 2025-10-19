package A2;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import x2.C1038d;
import y2.C1048A;
import y2.C1055d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\O.smali */
public final class O implements InterfaceC0007g {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f109o = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final X f110a;

    /* renamed from: b, reason: collision with root package name */
    public final K2.c f111b;

    /* renamed from: c, reason: collision with root package name */
    public final String f112c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f113d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final g1.i f114e = new g1.i(1);

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f115f = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final PriorityQueue f116k = new PriorityQueue(10, new C0002b(3));

    /* renamed from: l, reason: collision with root package name */
    public boolean f117l = false;

    /* renamed from: m, reason: collision with root package name */
    public int f118m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f119n = -1;

    public O(X x3, K2.c cVar, C1038d c1038d) {
        this.f110a = x3;
        this.f111b = cVar;
        String str = c1038d.f11025a;
        this.f112c = str == null ? "" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (B2.p.f(r5) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        r7 = new java.util.ArrayList(r0);
        r0 = new java.util.ArrayList();
        r8 = r5.G().a().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if (r8.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        r10 = (N2.n0) r8.next();
        r11 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r11.hasNext() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        r13 = (z2.c) r11.next();
        r14 = new z2.c();
        r13 = r13.f11220a;
        r13 = java.util.Arrays.copyOf(r13.f11225a, r13.f11226b);
        r15 = r14.f11220a;
        r15.a(r13.length);
        r4 = r13.length;
        r22 = r1;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        if (r1 >= r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        r16 = r13[r1];
        r17 = r2;
        r2 = r15.f11225a;
        r18 = r3;
        r3 = r15.f11226b;
        r15.f11226b = r3 + 1;
        r2[r3] = r16;
        r1 = r1 + 1;
        r2 = r17;
        r3 = r18;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
    
        r1 = r14.a(r12);
        u0.AbstractC0967h.g(r10, r1);
        r1.l();
        r0.add(r14);
        r1 = r22;
        r2 = r2;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0106, code lost:
    
        r22 = r1;
        r17 = r2;
        r18 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] d(B2.a r20, y2.C1048A r21, java.util.Collection r22) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.O.d(B2.a, y2.A, java.util.Collection):java.lang.Object[]");
    }

    public static B2.b h(Collection collection) {
        AbstractC0183a.N(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator it = collection.iterator();
        B2.b bVar = ((B2.a) it.next()).f299d.f306b;
        int iMax = bVar.f304c;
        while (it.hasNext()) {
            B2.b bVar2 = ((B2.a) it.next()).f299d.f306b;
            if (bVar2.compareTo(bVar) < 0) {
                bVar = bVar2;
            }
            iMax = Math.max(bVar2.f304c, iMax);
        }
        return new B2.b(bVar.f302a, bVar.f303b, iMax);
    }

    @Override // A2.InterfaceC0007g
    public final int a(C1048A c1048a) {
        List listI = i(c1048a);
        Iterator it = listI.iterator();
        int i = 3;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1048A c1048a2 = (C1048A) it.next();
            B2.a aVarF = f(c1048a2);
            if (aVarF == null) {
                i = 1;
                break;
            }
            int size = aVarF.f298c.size();
            HashSet hashSet = new HashSet();
            Iterator it2 = c1048a2.f11052c.iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                for (y2.j jVar : ((y2.k) it2.next()).c()) {
                    if (!jVar.f11112c.equals(B2.k.f320b)) {
                        y2.i iVar = y2.i.ARRAY_CONTAINS;
                        y2.i iVar2 = jVar.f11110a;
                        if (iVar2.equals(iVar) || iVar2.equals(y2.i.ARRAY_CONTAINS_ANY)) {
                            i5 = 1;
                        } else {
                            hashSet.add(jVar.f11112c);
                        }
                    }
                }
            }
            for (y2.u uVar : c1048a2.f11051b) {
                if (!uVar.f11143b.equals(B2.k.f320b)) {
                    hashSet.add(uVar.f11143b);
                }
            }
            if (size < hashSet.size() + i5) {
                i = 2;
            }
        }
        if (c1048a.e() && listI.size() > 1 && i == 3) {
            return 2;
        }
        return i;
    }

    @Override // A2.InterfaceC0007g
    public final List b(String str) {
        AbstractC0183a.N(this.f117l, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        C0009i c0009iZ0 = this.f110a.z0("SELECT parent FROM collection_parents WHERE collection_id = ?");
        c0009iZ0.v(str);
        Cursor cursorH0 = c0009iZ0.h0();
        while (cursorH0.moveToNext()) {
            try {
                arrayList.add(AbstractC0156x.z(cursorH0.getString(0)));
            } catch (Throwable th) {
                if (cursorH0 != null) {
                    try {
                        cursorH0.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorH0.close();
        return arrayList;
    }

    @Override // A2.InterfaceC0007g
    public final B2.b c(String str) {
        Collection collectionG = g(str);
        AbstractC0183a.N(!collectionG.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return h(collectionG);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    @Override // A2.InterfaceC0007g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(s2.AbstractC0869c r17) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.O.e(s2.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        r8.add(((B2.d) r7.get(r9)).f307a.c());
        r9 = r9 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final B2.a f(y2.C1048A r14) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.O.f(y2.A):B2.a");
    }

    public final Collection g(String str) {
        AbstractC0183a.N(this.f117l, "IndexManager not started", new Object[0]);
        Map map = (Map) this.f115f.get(str);
        return map == null ? Collections.emptyList() : map.values();
    }

    public final List i(C1048A c1048a) {
        List listSingletonList;
        HashMap map = this.f113d;
        if (map.containsKey(c1048a)) {
            return (List) map.get(c1048a);
        }
        ArrayList arrayList = new ArrayList();
        if (c1048a.f11052c.isEmpty()) {
            arrayList.add(c1048a);
        } else {
            C1055d c1055d = new C1055d(1, c1048a.f11052c);
            if (Collections.unmodifiableList(c1055d.f11083a).isEmpty()) {
                listSingletonList = Collections.emptyList();
            } else {
                y2.k kVarP = r1.d.p(r1.d.q(c1055d));
                AbstractC0183a.N(r1.d.J(kVarP), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
                listSingletonList = ((kVarP instanceof y2.j) || r1.d.K(kVarP)) ? Collections.singletonList(kVarP) : kVarP.b();
            }
            Iterator it = listSingletonList.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1048A(c1048a.f11053d, c1048a.f11054e, ((y2.k) it.next()).b(), c1048a.f11051b, c1048a.f11055f, c1048a.f11056g, c1048a.h));
            }
        }
        map.put(c1048a, arrayList);
        return arrayList;
    }

    public final void j(B2.a aVar) {
        HashMap map = this.f115f;
        String str = aVar.f297b;
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        int i = aVar.f296a;
        B2.a aVar2 = (B2.a) map2.get(Integer.valueOf(i));
        PriorityQueue priorityQueue = this.f116k;
        if (aVar2 != null) {
            priorityQueue.remove(aVar2);
        }
        map2.put(Integer.valueOf(i), aVar);
        priorityQueue.add(aVar);
        this.f118m = Math.max(this.f118m, i);
        this.f119n = Math.max(this.f119n, aVar.f299d.f305a);
    }

    @Override // A2.InterfaceC0007g
    public final void l(String str, B2.b bVar) {
        AbstractC0183a.N(this.f117l, "IndexManager not started", new Object[0]);
        this.f119n++;
        for (B2.a aVar : g(str)) {
            B2.a aVar2 = new B2.a(aVar.f296a, aVar.f297b, aVar.f298c, new B2.c(this.f119n, bVar));
            Integer numValueOf = Integer.valueOf(aVar.f296a);
            Long lValueOf = Long.valueOf(this.f119n);
            B2.o oVar = bVar.f302a;
            this.f110a.y0("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", numValueOf, this.f112c, lValueOf, Long.valueOf(oVar.f334a.f8792a), Integer.valueOf(oVar.f334a.f8793b), AbstractC0156x.C(bVar.f303b.f315a), Integer.valueOf(bVar.f304c));
            j(aVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.Collection] */
    @Override // A2.InterfaceC0007g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m(y2.C1048A r23) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.O.m(y2.A):java.util.List");
    }

    @Override // A2.InterfaceC0007g
    public final B2.b n(C1048A c1048a) {
        ArrayList arrayList = new ArrayList();
        Iterator it = i(c1048a).iterator();
        while (it.hasNext()) {
            B2.a aVarF = f((C1048A) it.next());
            if (aVarF != null) {
                arrayList.add(aVarF);
            }
        }
        return h(arrayList);
    }

    @Override // A2.InterfaceC0007g
    public final String q() {
        AbstractC0183a.N(this.f117l, "IndexManager not started", new Object[0]);
        B2.a aVar = (B2.a) this.f116k.peek();
        if (aVar != null) {
            return aVar.f297b;
        }
        return null;
    }

    @Override // A2.InterfaceC0007g
    public final void r(B2.n nVar) {
        AbstractC0183a.N(this.f117l, "IndexManager not started", new Object[0]);
        AbstractC0183a.N(nVar.f309a.size() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f114e.i(nVar)) {
            this.f110a.y0("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", nVar.f(), AbstractC0156x.C((B2.n) nVar.k()));
        }
    }

    @Override // A2.InterfaceC0007g
    public final void start() {
        HashMap map = new HashMap();
        X x3 = this.f110a;
        C0009i c0009iZ0 = x3.z0("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?");
        c0009iZ0.v(this.f112c);
        c0009iZ0.C(new M(map, 0));
        x3.z0("SELECT index_id, collection_group, index_proto FROM index_configuration").C(new N(0, this, map));
        this.f117l = true;
    }
}
