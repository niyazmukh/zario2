package S0;

import A2.C0002b;
import A2.C0009i;
import A2.C0011k;
import A2.InterfaceC0007g;
import A2.J;
import A2.T;
import A2.X;
import A2.Z;
import B3.i2;
import B3.o2;
import E2.G;
import N2.AbstractC0156x;
import N2.C0146k;
import N2.C0148m;
import W.L;
import W.d0;
import a.AbstractC0183a;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.protobuf.B0;
import d0.C0442a;
import f4.B;
import f4.E;
import f4.InterfaceC0506g0;
import j.AbstractC0616a;
import j.C0620f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import k.MenuC0638B;
import q.C0828e;
import q.C0834k;
import s2.AbstractC0869c;
import s2.AbstractC0874j;
import s2.C0871f;
import s2.C0872g;
import s2.C0875k;
import s2.C0876l;
import s2.InterfaceC0873h;
import u0.AbstractC0967h;
import u0.C0955C;
import z2.C1071b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\i.smali */
public final class i implements J, V0.a, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2858a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2859b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2860c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2861d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f2858a = obj;
        this.f2859b = obj2;
        this.f2860c = obj3;
        this.f2861d = obj4;
    }

    public static C0876l j(List list, Map map, Comparator comparator) {
        i iVar = new i(list, map);
        Collections.sort(list, comparator);
        C0875k c0875k = new C0875k(list.size());
        int i = c0875k.f9689b - 1;
        int size = list.size();
        while (i >= 0) {
            boolean z4 = (c0875k.f9688a & ((long) (1 << i))) == 0;
            int iPow = (int) Math.pow(2.0d, i);
            i--;
            size -= iPow;
            if (z4) {
                iVar.k(2, iPow, size);
            } else {
                iVar.k(2, iPow, size);
                size -= iPow;
                iVar.k(1, iPow, size);
            }
        }
        InterfaceC0873h interfaceC0873h = (AbstractC0874j) iVar.f2860c;
        if (interfaceC0873h == null) {
            interfaceC0873h = C0872g.f9683a;
        }
        return new C0876l(interfaceC0873h, comparator);
    }

    @Override // A2.J
    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        AbstractC0869c abstractC0869cK = B2.g.f312a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B2.h hVar = (B2.h) it.next();
            arrayList2.add(AbstractC0156x.C(hVar.f315a));
            abstractC0869cK = abstractC0869cK.k(hVar, B2.l.h(hVar, B2.o.f333b));
        }
        List listEmptyList = Collections.emptyList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList3 = new ArrayList(listEmptyList);
            for (int i = 0; it2.hasNext() && i < 900 - listEmptyList.size(); i++) {
                arrayList3.add(it2.next());
            }
            Object[] array = arrayList3.toArray();
            ((X) this.f2858a).y0("DELETE FROM remote_documents WHERE path IN (" + ((Object) F2.s.g("?", array.length, ", ")) + ")", array);
        }
        ((InterfaceC0007g) this.f2860c).e(abstractC0869cK);
    }

    @Override // A2.J
    public HashMap b(y2.v vVar, B2.b bVar, Set set, G2.e eVar) {
        return n(Collections.singletonList(vVar.f11148e), bVar, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Z.FOUND_DOCUMENT, new C0011k(2, vVar, set), eVar);
    }

    @Override // A2.J
    public Map d(String str, B2.b bVar, int i) {
        List listB = ((InterfaceC0007g) this.f2860c).b(str);
        ArrayList arrayList = new ArrayList(listB.size());
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add((B2.n) ((B2.n) it.next()).b(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return n(arrayList, bVar, i, null, null, null);
        }
        HashMap map = new HashMap();
        int i5 = 0;
        while (i5 < arrayList.size()) {
            int i6 = i5 + 100;
            map.putAll(n(arrayList.subList(i5, Math.min(arrayList.size(), i6)), bVar, i, null, null, null));
            i5 = i6;
        }
        C0002b c0002b = B2.b.f301e;
        E2.n nVar = F2.s.f1736a;
        if (map.size() > i) {
            ArrayList arrayList2 = new ArrayList(map.entrySet());
            Collections.sort(arrayList2, new B2.i(c0002b, 2));
            map = new HashMap();
            for (int i7 = 0; i7 < i; i7++) {
                map.put(((Map.Entry) arrayList2.get(i7)).getKey(), ((Map.Entry) arrayList2.get(i7)).getValue());
            }
        }
        return map;
    }

    @Override // A2.J
    public void e(InterfaceC0007g interfaceC0007g) {
        this.f2860c = interfaceC0007g;
    }

    @Override // A2.J
    public B2.l f(B2.h hVar) {
        return (B2.l) h(Collections.singletonList(hVar)).get(hVar);
    }

    @Override // A2.J
    public void g(B2.l lVar, B2.o oVar) {
        AbstractC0183a.N(!oVar.equals(B2.o.f333b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        K2.c cVar = (K2.c) this.f2859b;
        cVar.getClass();
        D2.a aVarE = D2.b.E();
        boolean zA = t.h.a(lVar.f323b, 3);
        l lVar2 = (l) cVar.b;
        B2.h hVar = lVar.f322a;
        if (zA) {
            D2.c cVarA = D2.d.A();
            String strS = lVar2.s(hVar);
            cVarA.d();
            D2.d.v((D2.d) cVarA.f6410b, strS);
            B0 b0W = l.w(lVar.f324c.f334a);
            cVarA.d();
            D2.d.w((D2.d) cVarA.f6410b, b0W);
            D2.d dVar = (D2.d) cVarA.b();
            aVarE.d();
            D2.b.w((D2.b) aVarE.f6410b, dVar);
        } else if (lVar.d()) {
            C0146k c0146kC = C0148m.C();
            String strS2 = lVar2.s(hVar);
            c0146kC.d();
            C0148m.v((C0148m) c0146kC.f6410b, strS2);
            Map mapY = lVar.f326e.b().N().y();
            c0146kC.d();
            C0148m.w((C0148m) c0146kC.f6410b).putAll(mapY);
            B0 b0W2 = l.w(lVar.f324c.f334a);
            c0146kC.d();
            C0148m.x((C0148m) c0146kC.f6410b, b0W2);
            C0148m c0148m = (C0148m) c0146kC.b();
            aVarE.d();
            D2.b.x((D2.b) aVarE.f6410b, c0148m);
        } else {
            if (!t.h.a(lVar.f323b, 4)) {
                AbstractC0183a.z("Cannot encode invalid document %s", lVar);
                throw null;
            }
            D2.h hVarA = D2.i.A();
            String strS3 = lVar2.s(hVar);
            hVarA.d();
            D2.i.v((D2.i) hVarA.f6410b, strS3);
            B0 b0W3 = l.w(lVar.f324c.f334a);
            hVarA.d();
            D2.i.w((D2.i) hVarA.f6410b, b0W3);
            D2.i iVar = (D2.i) hVarA.b();
            aVarE.d();
            D2.b.y((D2.b) aVarE.f6410b, iVar);
        }
        boolean zA2 = t.h.a(lVar.f327f, 2);
        aVarE.d();
        D2.b.v((D2.b) aVarE.f6410b, zA2);
        D2.b bVar = (D2.b) aVarE.b();
        String strC = AbstractC0156x.C(hVar.f315a);
        Integer numValueOf = Integer.valueOf(hVar.f315a.f309a.size());
        l2.o oVar2 = oVar.f334a;
        ((X) this.f2858a).y0("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, document_type, contents) VALUES (?, ?, ?, ?, ?, ?)", strC, numValueOf, Long.valueOf(oVar2.f8792a), Integer.valueOf(oVar2.f8793b), Integer.valueOf(Z.a(lVar).f163a), bVar.d());
        ((InterfaceC0007g) this.f2860c).r(hVar.d());
    }

    @Override // A2.J
    public HashMap h(Iterable iterable) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            B2.h hVar = (B2.h) it.next();
            arrayList.add(AbstractC0156x.C(hVar.f315a));
            map.put(hVar, B2.l.g(hVar));
        }
        X x3 = (X) this.f2858a;
        T t4 = new T();
        t4.f135c = 0;
        t4.f133a = x3;
        t4.f134b = "SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path IN (";
        t4.f137e = Collections.emptyList();
        t4.f136d = ") ORDER BY path";
        t4.f138f = arrayList.iterator();
        F2.j jVar = new F2.j();
        while (((Iterator) t4.f138f).hasNext()) {
            Cursor cursorH0 = t4.D().h0();
            while (cursorH0.moveToNext()) {
                try {
                    s(jVar, map, cursorH0, null);
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
        }
        jVar.a();
        ((g1.i) this.f2861d).l((X) this.f2858a);
        synchronized (map) {
        }
        return map;
    }

    public InterfaceC0873h i(int i, int i5) {
        if (i5 == 0) {
            return C0872g.f9683a;
        }
        Map map = (Map) this.f2859b;
        List list = (List) this.f2858a;
        if (i5 == 1) {
            Object obj = list.get(i);
            return new C0871f(obj, map.get(obj), null, null);
        }
        int i6 = i5 / 2;
        int i7 = i + i6;
        InterfaceC0873h interfaceC0873hI = i(i, i6);
        InterfaceC0873h interfaceC0873hI2 = i(i7 + 1, i6);
        Object obj2 = list.get(i7);
        return new C0871f(obj2, map.get(obj2), interfaceC0873hI, interfaceC0873hI2);
    }

    public void k(int i, int i5, int i6) {
        InterfaceC0873h interfaceC0873hI = i(i6 + 1, i5 - 1);
        Object obj = ((List) this.f2858a).get(i6);
        Map map = (Map) this.f2859b;
        s2.i iVar = i == 1 ? new s2.i(obj, map.get(obj), null, interfaceC0873hI) : new C0871f(obj, map.get(obj), null, interfaceC0873hI);
        if (((AbstractC0874j) this.f2860c) == null) {
            this.f2860c = iVar;
            this.f2861d = iVar;
        } else {
            ((AbstractC0874j) this.f2861d).q(iVar);
            this.f2861d = iVar;
        }
    }

    public void l(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C0834k) this.f2859b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                l(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public C0620f m(AbstractC0616a abstractC0616a) {
        ArrayList arrayList = (ArrayList) this.f2860c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0620f c0620f = (C0620f) arrayList.get(i);
            if (c0620f != null && c0620f.f7984b == abstractC0616a) {
                return c0620f;
            }
        }
        C0620f c0620f2 = new C0620f((Context) this.f2859b, abstractC0616a);
        arrayList.add(c0620f2);
        return c0620f2;
    }

    public HashMap n(List list, B2.b bVar, int i, Z z4, C0011k c0011k, G2.e eVar) {
        l2.o oVar = bVar.f302a.f334a;
        B2.h hVar = bVar.f303b;
        StringBuilder sbG = F2.s.g(B.a.m(new StringBuilder("SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? "), z4 == null ? "" : " AND (document_type IS NULL OR document_type = ?) ", "AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) "), list.size(), " UNION ");
        sbG.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        boolean z5 = true;
        Object[] objArr = new Object[(list.size() * ((z4 != null ? 1 : 0) + 9)) + 1];
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            B2.n nVar = (B2.n) it.next();
            String strC = AbstractC0156x.C(nVar);
            int i6 = i5 + 1;
            objArr[i5] = strC;
            int i7 = i5 + 2;
            StringBuilder sb = new StringBuilder(strC);
            int length = sb.length() - (z5 ? 1 : 0);
            char cCharAt = sb.charAt(length);
            if (cCharAt != z5) {
                z5 = false;
            }
            Iterator it2 = it;
            StringBuilder sb2 = sbG;
            AbstractC0183a.N(z5, "successor may only operate on paths generated by encode", new Object[0]);
            sb.setCharAt(length, (char) (cCharAt + 1));
            objArr[i6] = sb.toString();
            int i8 = i5 + 3;
            objArr[i7] = Integer.valueOf(nVar.f309a.size() + 1);
            if (z4 != null) {
                objArr[i8] = Integer.valueOf(z4.f163a);
                i8 = i5 + 4;
            }
            objArr[i8] = Long.valueOf(oVar.f8792a);
            objArr[i8 + 1] = Long.valueOf(oVar.f8792a);
            objArr[i8 + 2] = Integer.valueOf(oVar.f8793b);
            objArr[i8 + 3] = Long.valueOf(oVar.f8792a);
            objArr[i8 + 4] = Integer.valueOf(oVar.f8793b);
            i5 = i8 + 6;
            objArr[i8 + 5] = AbstractC0156x.C(hVar.f315a);
            sbG = sb2;
            z5 = true;
            it = it2;
        }
        objArr[i5] = Integer.valueOf(i);
        F2.j jVar = new F2.j();
        HashMap map = new HashMap();
        C0009i c0009iZ0 = ((X) this.f2858a).z0(sbG.toString());
        c0009iZ0.v(objArr);
        Cursor cursorH0 = c0009iZ0.h0();
        while (cursorH0.moveToNext()) {
            try {
                s(jVar, map, cursorH0, c0011k);
            } finally {
            }
        }
        cursorH0.close();
        jVar.a();
        ((g1.i) this.f2861d).l((X) this.f2858a);
        synchronized (map) {
        }
        return map;
    }

    public g o(j jVar) {
        C0955C c0955cK = C0955C.k(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = jVar.f2862a;
        if (str == null) {
            c0955cK.f(1);
        } else {
            c0955cK.c(1, str);
        }
        c0955cK.d(2, jVar.f2863b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2858a;
        workDatabase_Impl.b();
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            int iG = C1071b.g(cursorF, "work_spec_id");
            int iG2 = C1071b.g(cursorF, "generation");
            int iG3 = C1071b.g(cursorF, "system_id");
            g gVar = null;
            String string = null;
            if (cursorF.moveToFirst()) {
                if (!cursorF.isNull(iG)) {
                    string = cursorF.getString(iG);
                }
                gVar = new g(string, cursorF.getInt(iG2), cursorF.getInt(iG3));
            }
            return gVar;
        } finally {
            cursorF.close();
            c0955cK.l();
        }
    }

    public void p(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2858a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f2859b).y(gVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public boolean q(AbstractC0616a abstractC0616a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2858a).onActionItemClicked(m(abstractC0616a), new k.s((Context) this.f2859b, (F.a) menuItem));
    }

    public boolean r(AbstractC0616a abstractC0616a, k.l lVar) {
        C0620f c0620fM = m(abstractC0616a);
        C0834k c0834k = (C0834k) this.f2861d;
        Menu menuC0638B = (Menu) c0834k.getOrDefault(lVar, null);
        if (menuC0638B == null) {
            menuC0638B = new MenuC0638B((Context) this.f2859b, lVar);
            c0834k.put(lVar, menuC0638B);
        }
        return ((ActionMode.Callback) this.f2858a).onCreateActionMode(c0620fM, menuC0638B);
    }

    public void s(F2.j jVar, final HashMap map, Cursor cursor, final C0011k c0011k) {
        final byte[] blob = cursor.getBlob(0);
        final int i = cursor.getInt(1);
        final int i5 = cursor.getInt(2);
        final boolean zIsNull = cursor.isNull(3);
        final String string = cursor.getString(4);
        Runnable runnable = new Runnable() { // from class: A2.Y
            /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r11 = this;
                    S0.i r0 = r11.f150a
                    byte[] r1 = r2
                    int r2 = r3
                    int r3 = r4
                    boolean r4 = r5
                    java.lang.String r5 = r6
                    A2.k r6 = r7
                    java.util.HashMap r11 = r8
                    r0.getClass()
                    java.lang.Object r7 = r0.f2859b     // Catch: com.google.protobuf.N -> L79
                    K2.c r7 = (K2.c) r7     // Catch: com.google.protobuf.N -> L79
                    D2.b r1 = D2.b.F(r1)     // Catch: com.google.protobuf.N -> L79
                    B2.l r1 = r7.p(r1)     // Catch: com.google.protobuf.N -> L79
                    B2.o r7 = new B2.o     // Catch: com.google.protobuf.N -> L79
                    l2.o r8 = new l2.o     // Catch: com.google.protobuf.N -> L79
                    long r9 = (long) r2     // Catch: com.google.protobuf.N -> L79
                    r8.<init>(r3, r9)     // Catch: com.google.protobuf.N -> L79
                    r7.<init>(r8)     // Catch: com.google.protobuf.N -> L79
                    r1.f325d = r7     // Catch: com.google.protobuf.N -> L79
                    if (r4 == 0) goto L45
                    java.lang.Object r0 = r0.f2861d
                    g1.i r0 = (g1.i) r0
                    r0.getClass()
                    A2.a0 r4 = new A2.a0
                    r4.<init>(r5, r2, r3)
                    A2.Z r2 = A2.Z.a(r1)
                    java.lang.Object r0 = r0.f7594b
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    r0.putIfAbsent(r4, r2)
                L45:
                    if (r6 == 0) goto L6e
                    r6.getClass()
                    java.lang.Object r0 = r6.f210b
                    y2.v r0 = (y2.v) r0
                    boolean r0 = r0.e(r1)
                    if (r0 != 0) goto L63
                    B2.h r0 = r1.f322a
                    java.lang.Object r2 = r6.f211c
                    java.util.Set r2 = (java.util.Set) r2
                    boolean r0 = r2.contains(r0)
                    if (r0 == 0) goto L61
                    goto L63
                L61:
                    r0 = 0
                    goto L64
                L63:
                    r0 = 1
                L64:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L75
                L6e:
                    monitor-enter(r11)
                    B2.h r0 = r1.f322a     // Catch: java.lang.Throwable -> L76
                    r11.put(r0, r1)     // Catch: java.lang.Throwable -> L76
                    monitor-exit(r11)     // Catch: java.lang.Throwable -> L76
                L75:
                    return
                L76:
                    r0 = move-exception
                    monitor-exit(r11)     // Catch: java.lang.Throwable -> L76
                    throw r0
                L79:
                    r11 = move-exception
                    java.lang.String r0 = "MaybeDocument failed to parse: %s"
                    java.lang.Object[] r11 = new java.lang.Object[]{r11}
                    a.AbstractC0183a.z(r0, r11)
                    r11 = 0
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: A2.Y.run():void");
            }
        };
        if (cursor.isFirst() && cursor.isLast()) {
            runnable.run();
        } else {
            jVar.b(runnable);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            C.f(exception);
            if (zzaen.zzc(exception)) {
                boolean zIsLoggable = Log.isLoggable("RecaptchaCallWrapper", 4);
                String str = (String) this.f2858a;
                if (zIsLoggable) {
                    Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
                }
                return ((G) this.f2859b).s(str, Boolean.TRUE, (RecaptchaAction) this.f2860c).continueWithTask((K2.c) this.f2861d);
            }
        }
        return task;
    }

    public i(f4.C c5, J0.m mVar, L l4) {
        this.f2858a = c5;
        this.f2859b = l4;
        this.f2860c = AbstractC0183a.c(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 6, null);
        this.f2861d = new K2.c(12);
        InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) c5.e().get(B.f7000b);
        if (interfaceC0506g0 != null) {
            interfaceC0506g0.invokeOnCompletion(new d0(0, mVar, this));
        }
    }

    public i(WorkDatabase_Impl workDatabase_Impl) {
        this.f2858a = workDatabase_Impl;
        this.f2859b = new b(workDatabase_Impl, 2);
        this.f2860c = new h(workDatabase_Impl, 0);
        this.f2861d = new h(workDatabase_Impl, 1);
    }

    public i(int i) {
        switch (i) {
            case 3:
                this.f2858a = new q.b();
                this.f2859b = new SparseArray();
                this.f2860c = new C0828e();
                this.f2861d = new q.b();
                break;
            case 11:
                this.f2858a = new L.e(10);
                this.f2859b = new C0834k();
                this.f2860c = new ArrayList();
                this.f2861d = new HashSet();
                break;
            default:
                o2 o2Var = o2.f930b;
                this.f2859b = i2.n();
                this.f2860c = i2.n();
                this.f2861d = i2.n();
                this.f2858a = o2Var;
                break;
        }
    }

    public i(ExecutorService executorService) {
        this.f2860c = new Handler(Looper.getMainLooper());
        this.f2861d = new V0.b(this, 0);
        T0.m mVar = new T0.m(executorService);
        this.f2858a = mVar;
        this.f2859b = E.k(mVar);
    }

    public i(X x3, K2.c cVar) {
        this.f2861d = new g1.i(2);
        this.f2858a = x3;
        this.f2859b = cVar;
    }

    public i(Typeface typeface, d0.b bVar) {
        int i;
        int i5;
        this.f2861d = typeface;
        this.f2858a = bVar;
        this.f2860c = new c0.r(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i6 = iA + bVar.f2433a;
            i = ((ByteBuffer) bVar.f2436d).getInt(((ByteBuffer) bVar.f2436d).getInt(i6) + i6);
        } else {
            i = 0;
        }
        this.f2859b = new char[i * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i7 = iA2 + bVar.f2433a;
            i5 = ((ByteBuffer) bVar.f2436d).getInt(((ByteBuffer) bVar.f2436d).getInt(i7) + i7);
        } else {
            i5 = 0;
        }
        for (int i8 = 0; i8 < i5; i8++) {
            c0.n nVar = new c0.n(this, i8);
            C0442a c0442aC = nVar.c();
            int iA3 = c0442aC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) c0442aC.f2436d).getInt(iA3 + c0442aC.f2433a) : 0, (char[]) this.f2859b, i8 * 2);
            r1.d.k("invalid metadata codepoint length", nVar.b() > 0);
            ((c0.r) this.f2860c).a(nVar, 0, nVar.b() - 1);
        }
    }

    public i(Context context, ActionMode.Callback callback) {
        this.f2859b = context;
        this.f2858a = callback;
        this.f2860c = new ArrayList();
        this.f2861d = new C0834k();
    }

    public i(List list, Map map) {
        this.f2858a = list;
        this.f2859b = map;
    }
}
