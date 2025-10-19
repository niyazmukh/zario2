package o0;

import android.content.res.Resources;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o0.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\m.1.smali */
public final class C0790m {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f9086a;

    /* renamed from: b, reason: collision with root package name */
    public final i4.I f9087b;

    /* renamed from: c, reason: collision with root package name */
    public final i4.I f9088c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9089d;

    /* renamed from: e, reason: collision with root package name */
    public final i4.x f9090e;

    /* renamed from: f, reason: collision with root package name */
    public final i4.x f9091f;

    /* renamed from: g, reason: collision with root package name */
    public final N f9092g;
    public final /* synthetic */ C0767B h;

    public C0790m(C0767B c0767b, N navigator) {
        kotlin.jvm.internal.i.e(navigator, "navigator");
        this.h = c0767b;
        this.f9086a = new ReentrantLock(true);
        i4.I iB = i4.C.b(L3.s.f2351a);
        this.f9087b = iB;
        i4.I iB2 = i4.C.b(L3.u.f2353a);
        this.f9088c = iB2;
        this.f9090e = new i4.x(iB);
        this.f9091f = new i4.x(iB2);
        this.f9092g = navigator;
    }

    public final void a(C0787j backStackEntry) {
        kotlin.jvm.internal.i.e(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f9086a;
        reentrantLock.lock();
        try {
            i4.I i = this.f9087b;
            Collection collection = (Collection) i.K();
            kotlin.jvm.internal.i.e(collection, "<this>");
            ArrayList arrayList = new ArrayList(collection.size() + 1);
            arrayList.addAll(collection);
            arrayList.add(backStackEntry);
            i.getClass();
            i.M(null, arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Type inference failed for: r2v3, types: [L3.h, java.util.AbstractList, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(o0.C0787j r7) {
        /*
            r6 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.i.e(r7, r0)
            o0.B r0 = r6.h
            java.util.LinkedHashMap r1 = r0.f9001y
            java.lang.Object r1 = r1.get(r7)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.i.a(r1, r2)
            i4.I r2 = r6.f9088c
            java.lang.Object r3 = r2.K()
            java.util.Set r3 = (java.util.Set) r3
            java.util.LinkedHashSet r3 = L3.C.k0(r3, r7)
            r4 = 0
            r2.M(r4, r3)
            java.util.LinkedHashMap r2 = r0.f9001y
            r2.remove(r7)
            L3.h r2 = r0.f8985g
            boolean r3 = r2.contains(r7)
            i4.I r5 = r0.i
            if (r3 != 0) goto L90
            r0.p(r7)
            androidx.lifecycle.x r6 = r7.f9075l
            androidx.lifecycle.o r6 = r6.f4672d
            androidx.lifecycle.o r3 = androidx.lifecycle.EnumC0236o.f4660c
            int r6 = r6.compareTo(r3)
            if (r6 < 0) goto L46
            androidx.lifecycle.o r6 = androidx.lifecycle.EnumC0236o.f4658a
            r7.d(r6)
        L46:
            java.lang.String r6 = r7.f9073f
            if (r2 == 0) goto L51
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L51
            goto L6a
        L51:
            java.util.Iterator r7 = r2.iterator()
        L55:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r7.next()
            o0.j r2 = (o0.C0787j) r2
            java.lang.String r2 = r2.f9073f
            boolean r2 = kotlin.jvm.internal.i.a(r2, r6)
            if (r2 == 0) goto L55
            goto L82
        L6a:
            if (r1 != 0) goto L82
            o0.r r7 = r0.f8991o
            if (r7 == 0) goto L82
            java.lang.String r1 = "backStackEntryId"
            kotlin.jvm.internal.i.e(r6, r1)
            java.util.LinkedHashMap r7 = r7.f9110a
            java.lang.Object r6 = r7.remove(r6)
            androidx.lifecycle.m0 r6 = (androidx.lifecycle.m0) r6
            if (r6 == 0) goto L82
            r6.a()
        L82:
            r0.q()
            java.util.ArrayList r6 = r0.m()
            r5.getClass()
            r5.M(r4, r6)
            goto Lad
        L90:
            boolean r6 = r6.f9089d
            if (r6 != 0) goto Lad
            r0.q()
            java.util.ArrayList r6 = L3.j.w0(r2)
            i4.I r7 = r0.h
            r7.getClass()
            r7.M(r4, r6)
            java.util.ArrayList r6 = r0.m()
            r5.getClass()
            r5.M(r4, r6)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0790m.b(o0.j):void");
    }

    public final void c(C0787j c0787j) {
        int iNextIndex;
        ReentrantLock reentrantLock = this.f9086a;
        reentrantLock.lock();
        try {
            ArrayList arrayListW0 = L3.j.w0((Collection) ((i4.I) this.f9090e.f7964a).K());
            ListIterator listIterator = arrayListW0.listIterator(arrayListW0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (kotlin.jvm.internal.i.a(((C0787j) listIterator.previous()).f9073f, c0787j.f9073f)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayListW0.set(iNextIndex, c0787j);
            i4.I i = this.f9087b;
            i.getClass();
            i.M(null, arrayListW0);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(C0787j popUpTo, boolean z4) throws Resources.NotFoundException {
        kotlin.jvm.internal.i.e(popUpTo, "popUpTo");
        C0767B c0767b = this.h;
        N nB = c0767b.f8997u.b(popUpTo.f9069b.f9140a);
        if (!nB.equals(this.f9092g)) {
            Object obj = c0767b.f8998v.get(nB);
            kotlin.jvm.internal.i.b(obj);
            ((C0790m) obj).d(popUpTo, z4);
            return;
        }
        C0791n c0791n = c0767b.f9000x;
        if (c0791n != null) {
            c0791n.invoke(popUpTo);
            e(popUpTo);
            return;
        }
        P0.b bVar = new P0.b(this, popUpTo, z4);
        L3.h hVar = c0767b.f8985g;
        int iIndexOf = hVar.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != hVar.f2347c) {
            c0767b.j(((C0787j) hVar.get(i)).f9069b.f9147l, true, false);
        }
        C0767B.l(c0767b, popUpTo);
        bVar.invoke();
        c0767b.r();
        c0767b.b();
    }

    public final void e(C0787j popUpTo) {
        kotlin.jvm.internal.i.e(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f9086a;
        reentrantLock.lock();
        try {
            i4.I i = this.f9087b;
            Iterable iterable = (Iterable) i.K();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (kotlin.jvm.internal.i.a((C0787j) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            i.getClass();
            i.M(null, arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void f(C0787j popUpTo, boolean z4) {
        Object objPrevious;
        kotlin.jvm.internal.i.e(popUpTo, "popUpTo");
        i4.I i = this.f9088c;
        Iterable iterable = (Iterable) i.K();
        boolean z5 = iterable instanceof Collection;
        i4.x xVar = this.f9090e;
        if (z5 && ((Collection) iterable).isEmpty()) {
            i.M(null, L3.C.l0((Set) i.K(), popUpTo));
            List list = (List) ((i4.I) xVar.f7964a).K();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                C0787j c0787j = (C0787j) objPrevious;
                if (!kotlin.jvm.internal.i.a(c0787j, popUpTo)) {
                    i4.w wVar = xVar.f7964a;
                    if (((List) ((i4.I) wVar).K()).lastIndexOf(c0787j) < ((List) ((i4.I) wVar).K()).lastIndexOf(popUpTo)) {
                        break;
                    }
                }
            }
            C0787j c0787j2 = (C0787j) objPrevious;
            if (c0787j2 != null) {
                i.M(null, L3.C.l0((Set) i.K(), c0787j2));
            }
            d(popUpTo, z4);
        } else {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C0787j) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) ((i4.I) xVar.f7964a).K();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C0787j) it2.next()) == popUpTo) {
                            }
                        }
                    }
                }
            }
        }
        this.h.f9001y.put(popUpTo, Boolean.valueOf(z4));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X3.l, kotlin.jvm.internal.j] */
    public final void g(C0787j backStackEntry) {
        kotlin.jvm.internal.i.e(backStackEntry, "backStackEntry");
        C0767B c0767b = this.h;
        N nB = c0767b.f8997u.b(backStackEntry.f9069b.f9140a);
        if (!nB.equals(this.f9092g)) {
            Object obj = c0767b.f8998v.get(nB);
            if (obj == null) {
                throw new IllegalStateException(B.a.m(new StringBuilder("NavigatorBackStack for "), backStackEntry.f9069b.f9140a, " should already be created").toString());
            }
            ((C0790m) obj).g(backStackEntry);
            return;
        }
        ?? r02 = c0767b.f8999w;
        if (r02 != 0) {
            r02.invoke(backStackEntry);
            a(backStackEntry);
        } else {
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.f9069b + " outside of the call to navigate(). ");
        }
    }

    public final void h(C0787j c0787j) {
        i4.I i = this.f9088c;
        Iterable iterable = (Iterable) i.K();
        boolean z4 = iterable instanceof Collection;
        i4.x xVar = this.f9090e;
        if (!z4 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C0787j) it.next()) == c0787j) {
                    Iterable iterable2 = (Iterable) ((i4.I) xVar.f7964a).K();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C0787j) it2.next()) == c0787j) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C0787j c0787j2 = (C0787j) L3.j.j0((List) ((i4.I) xVar.f7964a).K());
        if (c0787j2 != null) {
            LinkedHashSet linkedHashSetL0 = L3.C.l0((Set) i.K(), c0787j2);
            i.getClass();
            i.M(null, linkedHashSetL0);
        }
        LinkedHashSet linkedHashSetL02 = L3.C.l0((Set) i.K(), c0787j);
        i.getClass();
        i.M(null, linkedHashSetL02);
        g(c0787j);
    }
}
