package y2;

import A2.C0020u;
import a.AbstractC0183a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import s2.C0870e;

/* renamed from: y2.C, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\C.smali */
public final class C1050C {

    /* renamed from: a, reason: collision with root package name */
    public final v f11063a;

    /* renamed from: b, reason: collision with root package name */
    public int f11064b = 1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11065c;

    /* renamed from: d, reason: collision with root package name */
    public B2.j f11066d;

    /* renamed from: e, reason: collision with root package name */
    public C0870e f11067e;

    /* renamed from: f, reason: collision with root package name */
    public C0870e f11068f;

    /* renamed from: g, reason: collision with root package name */
    public C0870e f11069g;

    public C1050C(v vVar, C0870e c0870e) {
        this.f11063a = vVar;
        this.f11066d = new B2.j(B2.g.f312a, new C0870e(Collections.emptyList(), new B2.i(new G1.d(vVar.c()), 0)));
        this.f11067e = c0870e;
        C0870e c0870e2 = B2.h.f314c;
        this.f11068f = c0870e2;
        this.f11069g = c0870e2;
    }

    public static int b(C1057f c1057f) {
        int iOrdinal = c1057f.f11091a.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 2;
                }
                throw new IllegalArgumentException("Unknown change type: " + c1057f.f11091a);
            }
        }
        return i;
    }

    public final S0.c a(C0020u c0020u, E2.z zVar, boolean z4) {
        List listEmptyList;
        B2.l lVar;
        C1051D c1051d;
        AbstractC0183a.N(!c0020u.f250b, "Cannot apply changes that need a refill", new Object[0]);
        B2.j jVar = this.f11066d;
        this.f11066d = (B2.j) c0020u.f251c;
        this.f11069g = (C0870e) c0020u.f253e;
        h1.i iVar = (h1.i) c0020u.f252d;
        iVar.getClass();
        ArrayList arrayList = new ArrayList(((HashMap) iVar.f7641b).values());
        v vVar = this.f11063a;
        Collections.sort(arrayList, new B2.i(new G1.d(vVar.c()), 1));
        if (zVar != null) {
            Iterator it = zVar.f1517c.iterator();
            while (true) {
                s2.d dVar = (s2.d) it;
                if (!((Iterator) dVar.f9680b).hasNext()) {
                    break;
                }
                this.f11067e = this.f11067e.f((B2.h) dVar.next());
            }
            Iterator it2 = zVar.f1518d.iterator();
            while (true) {
                s2.d dVar2 = (s2.d) it2;
                if (!((Iterator) dVar2.f9680b).hasNext()) {
                    break;
                }
                B2.h hVar = (B2.h) dVar2.next();
                AbstractC0183a.N(this.f11067e.f9681a.f(hVar), "Modified document %s not found in view.", hVar);
            }
            Iterator it3 = zVar.f1519e.iterator();
            while (true) {
                s2.d dVar3 = (s2.d) it3;
                if (!((Iterator) dVar3.f9680b).hasNext()) {
                    break;
                }
                this.f11067e = this.f11067e.h((B2.h) dVar3.next());
            }
            this.f11065c = zVar.f1516b;
        }
        if (!z4 && this.f11065c) {
            C0870e c0870e = this.f11068f;
            this.f11068f = B2.h.f314c;
            Iterator it4 = this.f11066d.f319b.iterator();
            while (true) {
                s2.d dVar4 = (s2.d) it4;
                if (!((Iterator) dVar4.f9680b).hasNext()) {
                    break;
                }
                B2.l lVar2 = (B2.l) dVar4.next();
                B2.h hVar2 = lVar2.f322a;
                if (!this.f11067e.f9681a.f(hVar2) && (lVar = (B2.l) this.f11066d.f318a.g(hVar2)) != null && !lVar.c()) {
                    this.f11068f = this.f11068f.f(lVar2.f322a);
                }
            }
            ArrayList arrayList2 = new ArrayList(this.f11068f.f9681a.size() + c0870e.f9681a.size());
            Iterator it5 = c0870e.iterator();
            while (true) {
                s2.d dVar5 = (s2.d) it5;
                if (!((Iterator) dVar5.f9680b).hasNext()) {
                    break;
                }
                B2.h hVar3 = (B2.h) dVar5.next();
                if (!this.f11068f.f9681a.f(hVar3)) {
                    arrayList2.add(new s(r.f11133b, hVar3));
                }
            }
            Iterator it6 = this.f11068f.iterator();
            while (true) {
                s2.d dVar6 = (s2.d) it6;
                if (!((Iterator) dVar6.f9680b).hasNext()) {
                    break;
                }
                B2.h hVar4 = (B2.h) dVar6.next();
                if (!c0870e.f9681a.f(hVar4)) {
                    arrayList2.add(new s(r.f11132a, hVar4));
                }
            }
            listEmptyList = arrayList2;
        } else {
            listEmptyList = Collections.emptyList();
        }
        int i = (this.f11068f.f9681a.size() == 0 && this.f11065c && !z4) ? 3 : 2;
        boolean z5 = i != this.f11064b;
        this.f11064b = i;
        if (arrayList.size() != 0 || z5) {
            c1051d = new C1051D(vVar, (B2.j) c0020u.f251c, jVar, arrayList, i == 2, (C0870e) c0020u.f253e, z5, false, (zVar == null || zVar.f1515a.isEmpty()) ? false : true);
        } else {
            c1051d = null;
        }
        return new S0.c(13, c1051d, listEmptyList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:
    
        if (r11.c() == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0151 A[PHI: r4
  0x0151: PHI (r4v10 char) = (r4v8 char), (r4v8 char), (r4v18 char), (r4v18 char) binds: [B:79:0x014d, B:80:0x014f, B:66:0x011f, B:63:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final A2.C0020u c(s2.AbstractC0869c r21, A2.C0020u r22) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C1050C.c(s2.c, A2.u):A2.u");
    }
}
