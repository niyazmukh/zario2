package u;

import A2.C0009i;
import S0.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v.C0973b;
import v.C0974c;
import v.C0976e;
import v.l;
import v.m;
import w.C1009f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u.1\e.smali */
public final class e extends d {

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f10284d0 = new ArrayList();

    /* renamed from: e0, reason: collision with root package name */
    public final C0009i f10285e0 = new C0009i(this);

    /* renamed from: f0, reason: collision with root package name */
    public final C0976e f10286f0;

    /* renamed from: g0, reason: collision with root package name */
    public C1009f f10287g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f10288h0;

    /* renamed from: i0, reason: collision with root package name */
    public final t.e f10289i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f10290j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f10291k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f10292l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f10293m0;

    /* renamed from: n0, reason: collision with root package name */
    public C0952b[] f10294n0;

    /* renamed from: o0, reason: collision with root package name */
    public C0952b[] f10295o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f10296p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f10297q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f10298r0;

    public e() {
        C0976e c0976e = new C0976e();
        c0976e.f10524b = true;
        c0976e.f10525c = true;
        c0976e.f10527e = new ArrayList();
        new ArrayList();
        c0976e.f10528f = null;
        c0976e.f10529g = new C0973b();
        c0976e.h = new ArrayList();
        c0976e.f10523a = this;
        c0976e.f10526d = this;
        this.f10286f0 = c0976e;
        this.f10287g0 = null;
        this.f10288h0 = false;
        this.f10289i0 = new t.e();
        this.f10292l0 = 0;
        this.f10293m0 = 0;
        this.f10294n0 = new C0952b[4];
        this.f10295o0 = new C0952b[4];
        this.f10296p0 = 263;
        this.f10297q0 = false;
        this.f10298r0 = false;
    }

    public final void B(d dVar, int i) {
        if (i == 0) {
            int i5 = this.f10292l0 + 1;
            C0952b[] c0952bArr = this.f10295o0;
            if (i5 >= c0952bArr.length) {
                this.f10295o0 = (C0952b[]) Arrays.copyOf(c0952bArr, c0952bArr.length * 2);
            }
            C0952b[] c0952bArr2 = this.f10295o0;
            int i6 = this.f10292l0;
            c0952bArr2[i6] = new C0952b(dVar, 0, this.f10288h0);
            this.f10292l0 = i6 + 1;
            return;
        }
        if (i == 1) {
            int i7 = this.f10293m0 + 1;
            C0952b[] c0952bArr3 = this.f10294n0;
            if (i7 >= c0952bArr3.length) {
                this.f10294n0 = (C0952b[]) Arrays.copyOf(c0952bArr3, c0952bArr3.length * 2);
            }
            C0952b[] c0952bArr4 = this.f10294n0;
            int i8 = this.f10293m0;
            c0952bArr4[i8] = new C0952b(dVar, 1, this.f10288h0);
            this.f10293m0 = i8 + 1;
        }
    }

    public final void C(t.e eVar) {
        a(eVar);
        int size = this.f10284d0.size();
        boolean z4 = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f10284d0.get(i);
            boolean[] zArr = dVar.f10239H;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C0951a) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i5 = 0; i5 < size; i5++) {
                d dVar2 = (d) this.f10284d0.get(i5);
                if (dVar2 instanceof C0951a) {
                    C0951a c0951a = (C0951a) dVar2;
                    for (int i6 = 0; i6 < c0951a.f10355e0; i6++) {
                        d dVar3 = c0951a.f10354d0[i6];
                        int i7 = c0951a.f10208f0;
                        if (i7 == 0 || i7 == 1) {
                            dVar3.f10239H[0] = true;
                        } else if (i7 == 2 || i7 == 3) {
                            dVar3.f10239H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            d dVar4 = (d) this.f10284d0.get(i8);
            dVar4.getClass();
            if ((dVar4 instanceof g) || (dVar4 instanceof h)) {
                dVar4.a(eVar);
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            d dVar5 = (d) this.f10284d0.get(i9);
            if (dVar5 instanceof e) {
                int[] iArr = dVar5.f10262c0;
                int i10 = iArr[0];
                int i11 = iArr[1];
                if (i10 == 2) {
                    dVar5.w(1);
                }
                if (i11 == 2) {
                    dVar5.x(1);
                }
                dVar5.a(eVar);
                if (i10 == 2) {
                    dVar5.w(i10);
                }
                if (i11 == 2) {
                    dVar5.x(i11);
                }
            } else {
                dVar5.h = -1;
                dVar5.i = -1;
                int[] iArr2 = this.f10262c0;
                int i12 = iArr2[0];
                int[] iArr3 = dVar5.f10262c0;
                if (i12 != 2 && iArr3[0] == 4) {
                    c cVar = dVar5.f10281x;
                    int i13 = cVar.f10230e;
                    int iL = l();
                    c cVar2 = dVar5.f10283z;
                    int i14 = iL - cVar2.f10230e;
                    cVar.f10232g = eVar.j(cVar);
                    cVar2.f10232g = eVar.j(cVar2);
                    eVar.d(cVar.f10232g, i13);
                    eVar.d(cVar2.f10232g, i14);
                    dVar5.h = 2;
                    dVar5.f10245N = i13;
                    int i15 = i14 - i13;
                    dVar5.f10241J = i15;
                    int i16 = dVar5.f10248Q;
                    if (i15 < i16) {
                        dVar5.f10241J = i16;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    c cVar3 = dVar5.f10282y;
                    int i17 = cVar3.f10230e;
                    int i18 = i();
                    c cVar4 = dVar5.f10233A;
                    int i19 = i18 - cVar4.f10230e;
                    cVar3.f10232g = eVar.j(cVar3);
                    cVar4.f10232g = eVar.j(cVar4);
                    eVar.d(cVar3.f10232g, i17);
                    eVar.d(cVar4.f10232g, i19);
                    if (dVar5.f10247P > 0 || dVar5.f10253V == 8) {
                        c cVar5 = dVar5.f10234B;
                        t.i iVarJ = eVar.j(cVar5);
                        cVar5.f10232g = iVarJ;
                        eVar.d(iVarJ, dVar5.f10247P + i17);
                    }
                    dVar5.i = 2;
                    dVar5.f10246O = i17;
                    int i20 = i19 - i17;
                    dVar5.f10242K = i20;
                    int i21 = dVar5.f10249R;
                    if (i20 < i21) {
                        dVar5.f10242K = i21;
                    }
                }
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    dVar5.a(eVar);
                }
            }
        }
        if (this.f10292l0 > 0) {
            j.a(this, eVar, 0);
        }
        if (this.f10293m0 > 0) {
            j.a(this, eVar, 1);
        }
    }

    public final boolean D(int i, boolean z4) {
        boolean z5;
        boolean z6;
        C0976e c0976e = this.f10286f0;
        e eVar = c0976e.f10523a;
        boolean z7 = false;
        int iH = eVar.h(0);
        int iH2 = eVar.h(1);
        int iM = eVar.m();
        int iN = eVar.n();
        ArrayList arrayList = c0976e.f10527e;
        l lVar = eVar.f10264e;
        v.j jVar = eVar.f10263d;
        if (z4 && (iH == 2 || iH2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z6 = z4;
                    break;
                }
                m mVar = (m) it.next();
                if (mVar.f10551f == i && !mVar.k()) {
                    z6 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z6 && iH == 2) {
                    eVar.w(1);
                    eVar.y(c0976e.d(eVar, 0));
                    jVar.f10550e.d(eVar.l());
                }
            } else if (z6 && iH2 == 2) {
                eVar.x(1);
                eVar.v(c0976e.d(eVar, 1));
                lVar.f10550e.d(eVar.i());
            }
        }
        int[] iArr = eVar.f10262c0;
        if (i == 0) {
            int i5 = iArr[0];
            if (i5 == 1 || i5 == 4) {
                int iL = eVar.l() + iM;
                jVar.i.d(iL);
                jVar.f10550e.d(iL - iM);
                z5 = true;
            }
            z5 = false;
        } else {
            int i6 = iArr[1];
            if (i6 == 1 || i6 == 4) {
                int i7 = eVar.i() + iN;
                lVar.i.d(i7);
                lVar.f10550e.d(i7 - iN);
                z5 = true;
            }
            z5 = false;
        }
        c0976e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            if (mVar2.f10551f == i && (mVar2.f10547b != eVar || mVar2.f10552g)) {
                mVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z7 = true;
                break;
            }
            m mVar3 = (m) it3.next();
            if (mVar3.f10551f == i && (z5 || mVar3.f10547b != eVar)) {
                if (!mVar3.h.f10537j || !mVar3.i.f10537j || (!(mVar3 instanceof C0974c) && !mVar3.f10550e.f10537j)) {
                    break;
                }
            }
        }
        eVar.w(iH);
        eVar.x(iH2);
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.E():void");
    }

    @Override // u.d
    public final void s() {
        this.f10289i0.r();
        this.f10290j0 = 0;
        this.f10291k0 = 0;
        this.f10284d0.clear();
        super.s();
    }

    @Override // u.d
    public final void u(n nVar) {
        super.u(nVar);
        int size = this.f10284d0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f10284d0.get(i)).u(nVar);
        }
    }

    @Override // u.d
    public final void z(boolean z4, boolean z5) {
        super.z(z4, z5);
        int size = this.f10284d0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f10284d0.get(i)).z(z4, z5);
        }
    }
}
