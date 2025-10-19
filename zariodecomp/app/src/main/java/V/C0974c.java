package v;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v.1\c.smali */
public final class C0974c extends m {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f10521k;

    /* renamed from: l, reason: collision with root package name */
    public int f10522l;

    public C0974c(u.d dVar, int i) {
        u.d dVar2;
        super(dVar);
        this.f10521k = new ArrayList();
        this.f10551f = i;
        u.d dVar3 = this.f10547b;
        u.d dVarK = dVar3.k(i);
        while (true) {
            u.d dVar4 = dVarK;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            } else {
                dVarK = dVar3.k(this.f10551f);
            }
        }
        this.f10547b = dVar2;
        int i5 = this.f10551f;
        m mVar = i5 == 0 ? dVar2.f10263d : i5 == 1 ? dVar2.f10264e : null;
        ArrayList arrayList = this.f10521k;
        arrayList.add(mVar);
        u.d dVarJ = dVar2.j(this.f10551f);
        while (dVarJ != null) {
            int i6 = this.f10551f;
            arrayList.add(i6 == 0 ? dVarJ.f10263d : i6 == 1 ? dVarJ.f10264e : null);
            dVarJ = dVarJ.j(this.f10551f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar2 = (m) it.next();
            int i7 = this.f10551f;
            if (i7 == 0) {
                mVar2.f10547b.f10259b = this;
            } else if (i7 == 1) {
                mVar2.f10547b.f10261c = this;
            }
        }
        if (this.f10551f == 0 && ((u.e) this.f10547b.f10240I).f10288h0 && arrayList.size() > 1) {
            this.f10547b = ((m) arrayList.get(arrayList.size() - 1)).f10547b;
        }
        this.f10522l = this.f10551f == 0 ? this.f10547b.X : this.f10547b.f10255Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01c2 A[PHI: r2 r25
  0x01c2: PHI (r2v43 int) = (r2v39 int), (r2v48 int) binds: [B:120:0x01c0, B:111:0x01a0] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r25v1 float) = (r25v0 float), (r25v3 float) binds: [B:120:0x01c0, B:111:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    @Override // v.InterfaceC0975d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(v.InterfaceC0975d r27) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0974c.a(v.d):void");
    }

    @Override // v.m
    public final void d() {
        ArrayList arrayList = this.f10521k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        u.d dVar = ((m) arrayList.get(0)).f10547b;
        u.d dVar2 = ((m) arrayList.get(size - 1)).f10547b;
        int i = this.f10551f;
        f fVar = this.i;
        f fVar2 = this.h;
        if (i == 0) {
            u.c cVar = dVar.f10281x;
            u.c cVar2 = dVar2.f10283z;
            f fVarI = m.i(cVar, 0);
            int iC = cVar.c();
            u.d dVarM = m();
            if (dVarM != null) {
                iC = dVarM.f10281x.c();
            }
            if (fVarI != null) {
                m.b(fVar2, fVarI, iC);
            }
            f fVarI2 = m.i(cVar2, 0);
            int iC2 = cVar2.c();
            u.d dVarN = n();
            if (dVarN != null) {
                iC2 = dVarN.f10283z.c();
            }
            if (fVarI2 != null) {
                m.b(fVar, fVarI2, -iC2);
            }
        } else {
            u.c cVar3 = dVar.f10282y;
            u.c cVar4 = dVar2.f10233A;
            f fVarI3 = m.i(cVar3, 1);
            int iC3 = cVar3.c();
            u.d dVarM2 = m();
            if (dVarM2 != null) {
                iC3 = dVarM2.f10282y.c();
            }
            if (fVarI3 != null) {
                m.b(fVar2, fVarI3, iC3);
            }
            f fVarI4 = m.i(cVar4, 1);
            int iC4 = cVar4.c();
            u.d dVarN2 = n();
            if (dVarN2 != null) {
                iC4 = dVarN2.f10233A.c();
            }
            if (fVarI4 != null) {
                m.b(fVar, fVarI4, -iC4);
            }
        }
        fVar2.f10530a = this;
        fVar.f10530a = this;
    }

    @Override // v.m
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10521k;
            if (i >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // v.m
    public final void f() {
        this.f10548c = null;
        Iterator it = this.f10521k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // v.m
    public final long j() {
        ArrayList arrayList = this.f10521k;
        int size = arrayList.size();
        long j5 = 0;
        for (int i = 0; i < size; i++) {
            j5 = r4.i.f10535f + ((m) arrayList.get(i)).j() + j5 + r4.h.f10535f;
        }
        return j5;
    }

    @Override // v.m
    public final boolean k() {
        ArrayList arrayList = this.f10521k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((m) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final u.d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10521k;
            if (i >= arrayList.size()) {
                return null;
            }
            u.d dVar = ((m) arrayList.get(i)).f10547b;
            if (dVar.f10253V != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final u.d n() {
        ArrayList arrayList = this.f10521k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u.d dVar = ((m) arrayList.get(size)).f10547b;
            if (dVar.f10253V != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f10551f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f10521k.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            strConcat = B.a.k(B.a.k(strConcat, "<") + mVar, "> ");
        }
        return strConcat;
    }
}
