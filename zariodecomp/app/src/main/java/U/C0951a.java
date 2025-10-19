package u;

import t.C0892c;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u.1\a.smali */
public final class C0951a extends i {

    /* renamed from: f0, reason: collision with root package name */
    public int f10208f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f10209g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f10210h0;

    @Override // u.d
    public final void a(t.e eVar) {
        boolean z4;
        int i;
        int i5;
        c[] cVarArr = this.f10238F;
        c cVar = this.f10281x;
        cVarArr[0] = cVar;
        c cVar2 = this.f10282y;
        int i6 = 2;
        cVarArr[2] = cVar2;
        c cVar3 = this.f10283z;
        cVarArr[1] = cVar3;
        c cVar4 = this.f10233A;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.f10232g = eVar.j(cVar5);
        }
        int i7 = this.f10208f0;
        if (i7 < 0 || i7 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i7];
        for (int i8 = 0; i8 < this.f10355e0; i8++) {
            d dVar = this.f10354d0[i8];
            if ((this.f10209g0 || dVar.b()) && ((((i5 = this.f10208f0) == 0 || i5 == 1) && dVar.f10262c0[0] == 3 && dVar.f10281x.f10229d != null && dVar.f10283z.f10229d != null) || ((i5 == 2 || i5 == 3) && dVar.f10262c0[1] == 3 && dVar.f10282y.f10229d != null && dVar.f10233A.f10229d != null))) {
                z4 = true;
                break;
            }
        }
        z4 = false;
        boolean z5 = cVar.e() || cVar3.e();
        boolean z6 = cVar2.e() || cVar4.e();
        int i9 = (z4 || !(((i = this.f10208f0) == 0 && z5) || ((i == 2 && z6) || ((i == 1 && z5) || (i == 3 && z6))))) ? 4 : 5;
        int i10 = 0;
        while (i10 < this.f10355e0) {
            d dVar2 = this.f10354d0[i10];
            if (this.f10209g0 || dVar2.b()) {
                t.i iVarJ = eVar.j(dVar2.f10238F[this.f10208f0]);
                int i11 = this.f10208f0;
                c cVar7 = dVar2.f10238F[i11];
                cVar7.f10232g = iVarJ;
                c cVar8 = cVar7.f10229d;
                int i12 = (cVar8 == null || cVar8.f10227b != this) ? 0 : cVar7.f10230e;
                if (i11 == 0 || i11 == i6) {
                    t.i iVar = cVar6.f10232g;
                    int i13 = this.f10210h0 - i12;
                    C0892c c0892cK = eVar.k();
                    t.i iVarL = eVar.l();
                    iVarL.f9856d = 0;
                    c0892cK.c(iVar, iVarJ, iVarL, i13);
                    eVar.c(c0892cK);
                } else {
                    t.i iVar2 = cVar6.f10232g;
                    int i14 = this.f10210h0 + i12;
                    C0892c c0892cK2 = eVar.k();
                    t.i iVarL2 = eVar.l();
                    iVarL2.f9856d = 0;
                    c0892cK2.b(iVar2, iVarJ, iVarL2, i14);
                    eVar.c(c0892cK2);
                }
                eVar.e(cVar6.f10232g, iVarJ, this.f10210h0 + i12, i9);
            }
            i10++;
            i6 = 2;
        }
        int i15 = this.f10208f0;
        if (i15 == 0) {
            eVar.e(cVar3.f10232g, cVar.f10232g, 0, 8);
            eVar.e(cVar.f10232g, this.f10240I.f10283z.f10232g, 0, 4);
            eVar.e(cVar.f10232g, this.f10240I.f10281x.f10232g, 0, 0);
            return;
        }
        if (i15 == 1) {
            eVar.e(cVar.f10232g, cVar3.f10232g, 0, 8);
            eVar.e(cVar.f10232g, this.f10240I.f10281x.f10232g, 0, 4);
            eVar.e(cVar.f10232g, this.f10240I.f10283z.f10232g, 0, 0);
        } else if (i15 == 2) {
            eVar.e(cVar4.f10232g, cVar2.f10232g, 0, 8);
            eVar.e(cVar2.f10232g, this.f10240I.f10233A.f10232g, 0, 4);
            eVar.e(cVar2.f10232g, this.f10240I.f10282y.f10232g, 0, 0);
        } else if (i15 == 3) {
            eVar.e(cVar2.f10232g, cVar4.f10232g, 0, 8);
            eVar.e(cVar2.f10232g, this.f10240I.f10282y.f10232g, 0, 4);
            eVar.e(cVar2.f10232g, this.f10240I.f10233A.f10232g, 0, 0);
        }
    }

    @Override // u.d
    public final boolean b() {
        return true;
    }

    @Override // u.d
    public final String toString() {
        String strM = B.a.m(new StringBuilder("[Barrier] "), this.f10254W, " {");
        for (int i = 0; i < this.f10355e0; i++) {
            d dVar = this.f10354d0[i];
            if (i > 0) {
                strM = B.a.k(strM, ", ");
            }
            StringBuilder sbB = t.h.b(strM);
            sbB.append(dVar.f10254W);
            strM = sbB.toString();
        }
        return B.a.k(strM, "}");
    }
}
