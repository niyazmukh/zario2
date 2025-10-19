package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.C1009f;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v.1\e.smali */
public final class C0976e {

    /* renamed from: a, reason: collision with root package name */
    public u.e f10523a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10524b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10525c;

    /* renamed from: d, reason: collision with root package name */
    public u.e f10526d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f10527e;

    /* renamed from: f, reason: collision with root package name */
    public C1009f f10528f;

    /* renamed from: g, reason: collision with root package name */
    public C0973b f10529g;
    public ArrayList h;

    public final void a(f fVar, int i, ArrayList arrayList, k kVar) {
        m mVar = fVar.f10533d;
        if (mVar.f10548c == null) {
            u.e eVar = this.f10523a;
            if (mVar == eVar.f10263d || mVar == eVar.f10264e) {
                return;
            }
            if (kVar == null) {
                kVar = new k();
                kVar.f10542a = null;
                kVar.f10543b = new ArrayList();
                kVar.f10542a = mVar;
                arrayList.add(kVar);
            }
            mVar.f10548c = kVar;
            kVar.f10543b.add(mVar);
            f fVar2 = mVar.h;
            Iterator it = fVar2.f10538k.iterator();
            while (it.hasNext()) {
                InterfaceC0975d interfaceC0975d = (InterfaceC0975d) it.next();
                if (interfaceC0975d instanceof f) {
                    a((f) interfaceC0975d, i, arrayList, kVar);
                }
            }
            f fVar3 = mVar.i;
            Iterator it2 = fVar3.f10538k.iterator();
            while (it2.hasNext()) {
                InterfaceC0975d interfaceC0975d2 = (InterfaceC0975d) it2.next();
                if (interfaceC0975d2 instanceof f) {
                    a((f) interfaceC0975d2, i, arrayList, kVar);
                }
            }
            if (i == 1 && (mVar instanceof l)) {
                Iterator it3 = ((l) mVar).f10544k.f10538k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0975d interfaceC0975d3 = (InterfaceC0975d) it3.next();
                    if (interfaceC0975d3 instanceof f) {
                        a((f) interfaceC0975d3, i, arrayList, kVar);
                    }
                }
            }
            Iterator it4 = fVar2.f10539l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i, arrayList, kVar);
            }
            Iterator it5 = fVar3.f10539l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i, arrayList, kVar);
            }
            if (i == 1 && (mVar instanceof l)) {
                Iterator it6 = ((l) mVar).f10544k.f10539l.iterator();
                while (it6.hasNext()) {
                    a((f) it6.next(), i, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(u.e r20) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0976e.b(u.e):void");
    }

    public final void c() {
        ArrayList arrayList = this.f10527e;
        arrayList.clear();
        u.e eVar = this.f10526d;
        eVar.f10263d.f();
        l lVar = eVar.f10264e;
        lVar.f();
        arrayList.add(eVar.f10263d);
        arrayList.add(lVar);
        Iterator it = eVar.f10284d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            u.d dVar = (u.d) it.next();
            if (dVar instanceof u.h) {
                h hVar = new h(dVar);
                dVar.f10263d.f();
                dVar.f10264e.f();
                hVar.f10551f = ((u.h) dVar).f10353h0;
                arrayList.add(hVar);
            } else {
                if (dVar.q()) {
                    if (dVar.f10259b == null) {
                        dVar.f10259b = new C0974c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f10259b);
                } else {
                    arrayList.add(dVar.f10263d);
                }
                if (dVar.r()) {
                    if (dVar.f10261c == null) {
                        dVar.f10261c = new C0974c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f10261c);
                } else {
                    arrayList.add(dVar.f10264e);
                }
                if (dVar instanceof u.i) {
                    arrayList.add(new i(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f10547b != eVar) {
                mVar.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        u.e eVar2 = this.f10523a;
        e(eVar2.f10263d, 0, arrayList2);
        e(eVar2.f10264e, 1, arrayList2);
        this.f10524b = false;
    }

    public final int d(u.e eVar, int i) {
        ArrayList arrayList;
        int i5;
        long jMax;
        float f2;
        u.e eVar2 = eVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j5 = 0;
        int i6 = 0;
        long jMax2 = 0;
        while (i6 < size) {
            m mVar = ((k) arrayList2.get(i6)).f10542a;
            if (!(mVar instanceof C0974c) ? !(i != 0 ? (mVar instanceof l) : (mVar instanceof j)) : ((C0974c) mVar).f10551f != i) {
                f fVar = (i == 0 ? eVar2.f10263d : eVar2.f10264e).h;
                f fVar2 = (i == 0 ? eVar2.f10263d : eVar2.f10264e).i;
                boolean zContains = mVar.h.f10539l.contains(fVar);
                f fVar3 = mVar.i;
                boolean zContains2 = fVar3.f10539l.contains(fVar2);
                long j6 = mVar.j();
                f fVar4 = mVar.h;
                if (zContains && zContains2) {
                    long jB = k.b(fVar4, j5);
                    arrayList = arrayList2;
                    long jA = k.a(fVar3, j5);
                    long j7 = jB - j6;
                    int i7 = fVar3.f10535f;
                    i5 = i6;
                    if (j7 >= (-i7)) {
                        j7 += i7;
                    }
                    long j8 = fVar4.f10535f;
                    long j9 = ((-jA) - j6) - j8;
                    if (j9 >= j8) {
                        j9 -= j8;
                    }
                    u.d dVar = mVar.f10547b;
                    if (i == 0) {
                        f2 = dVar.f10250S;
                    } else if (i == 1) {
                        f2 = dVar.f10251T;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j7 / (1.0f - f2)) + (j9 / f2)) : 0L;
                    jMax = (fVar4.f10535f + ((((long) ((f3 * f2) + 0.5f)) + j6) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - fVar3.f10535f;
                } else {
                    arrayList = arrayList2;
                    i5 = i6;
                    jMax = zContains ? Math.max(k.b(fVar4, fVar4.f10535f), fVar4.f10535f + j6) : zContains2 ? Math.max(-k.a(fVar3, fVar3.f10535f), (-fVar3.f10535f) + j6) : (mVar.j() + fVar4.f10535f) - fVar3.f10535f;
                }
            } else {
                arrayList = arrayList2;
                jMax = j5;
                i5 = i6;
            }
            jMax2 = Math.max(jMax2, jMax);
            i6 = i5 + 1;
            arrayList2 = arrayList;
            eVar2 = eVar;
            j5 = 0;
        }
        return (int) jMax2;
    }

    public final void e(m mVar, int i, ArrayList arrayList) {
        f fVar;
        Iterator it = mVar.h.f10538k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = mVar.i;
            if (!zHasNext) {
                break;
            }
            InterfaceC0975d interfaceC0975d = (InterfaceC0975d) it.next();
            if (interfaceC0975d instanceof f) {
                a((f) interfaceC0975d, i, arrayList, null);
            } else if (interfaceC0975d instanceof m) {
                a(((m) interfaceC0975d).h, i, arrayList, null);
            }
        }
        Iterator it2 = fVar.f10538k.iterator();
        while (it2.hasNext()) {
            InterfaceC0975d interfaceC0975d2 = (InterfaceC0975d) it2.next();
            if (interfaceC0975d2 instanceof f) {
                a((f) interfaceC0975d2, i, arrayList, null);
            } else if (interfaceC0975d2 instanceof m) {
                a(((m) interfaceC0975d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((l) mVar).f10544k.f10538k.iterator();
            while (it3.hasNext()) {
                InterfaceC0975d interfaceC0975d3 = (InterfaceC0975d) it3.next();
                if (interfaceC0975d3 instanceof f) {
                    a((f) interfaceC0975d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i5, int i6, int i7, u.d dVar) {
        C0973b c0973b = this.f10529g;
        c0973b.f10513a = i;
        c0973b.f10514b = i6;
        c0973b.f10515c = i5;
        c0973b.f10516d = i7;
        this.f10528f.a(dVar, c0973b);
        dVar.y(c0973b.f10517e);
        dVar.v(c0973b.f10518f);
        dVar.f10280w = c0973b.h;
        int i8 = c0973b.f10519g;
        dVar.f10247P = i8;
        dVar.f10280w = i8 > 0;
    }

    public final void g() {
        C0972a c0972a;
        Iterator it = this.f10523a.f10284d0.iterator();
        while (it.hasNext()) {
            u.d dVar = (u.d) it.next();
            if (!dVar.f10257a) {
                int[] iArr = dVar.f10262c0;
                boolean z4 = false;
                int i = iArr[0];
                int i5 = iArr[1];
                int i6 = dVar.f10267j;
                int i7 = dVar.f10268k;
                boolean z5 = i == 2 || (i == 3 && i6 == 1);
                if (i5 == 2 || (i5 == 3 && i7 == 1)) {
                    z4 = true;
                }
                j jVar = dVar.f10263d;
                g gVar = jVar.f10550e;
                boolean z6 = gVar.f10537j;
                l lVar = dVar.f10264e;
                g gVar2 = lVar.f10550e;
                boolean z7 = gVar2.f10537j;
                if (z6 && z7) {
                    f(1, gVar.f10536g, 1, gVar2.f10536g, dVar);
                    dVar.f10257a = true;
                } else if (z6 && z4) {
                    f(1, gVar.f10536g, 2, gVar2.f10536g, dVar);
                    if (i5 == 3) {
                        lVar.f10550e.f10540m = dVar.i();
                    } else {
                        lVar.f10550e.d(dVar.i());
                        dVar.f10257a = true;
                    }
                } else if (z7 && z5) {
                    f(2, gVar.f10536g, 1, gVar2.f10536g, dVar);
                    if (i == 3) {
                        jVar.f10550e.f10540m = dVar.l();
                    } else {
                        jVar.f10550e.d(dVar.l());
                        dVar.f10257a = true;
                    }
                }
                if (dVar.f10257a && (c0972a = lVar.f10545l) != null) {
                    c0972a.d(dVar.f10247P);
                }
            }
        }
    }
}
