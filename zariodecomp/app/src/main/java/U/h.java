package u;

import java.util.ArrayList;
import r.AbstractC0854a;
import t.C0892c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u.1\h.smali */
public final class h extends d {

    /* renamed from: d0, reason: collision with root package name */
    public float f10349d0 = -1.0f;

    /* renamed from: e0, reason: collision with root package name */
    public int f10350e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public int f10351f0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    public c f10352g0 = this.f10282y;

    /* renamed from: h0, reason: collision with root package name */
    public int f10353h0 = 0;

    public h() {
        this.G.clear();
        this.G.add(this.f10352g0);
        int length = this.f10238F.length;
        for (int i = 0; i < length; i++) {
            this.f10238F[i] = this.f10352g0;
        }
    }

    @Override // u.d
    public final void A(t.e eVar) {
        if (this.f10240I == null) {
            return;
        }
        c cVar = this.f10352g0;
        eVar.getClass();
        int iM = t.e.m(cVar);
        if (this.f10353h0 == 1) {
            this.f10245N = iM;
            this.f10246O = 0;
            v(this.f10240I.i());
            y(0);
            return;
        }
        this.f10245N = 0;
        this.f10246O = iM;
        y(this.f10240I.l());
        v(0);
    }

    public final void B(int i) {
        if (this.f10353h0 == i) {
            return;
        }
        this.f10353h0 = i;
        ArrayList arrayList = this.G;
        arrayList.clear();
        if (this.f10353h0 == 1) {
            this.f10352g0 = this.f10281x;
        } else {
            this.f10352g0 = this.f10282y;
        }
        arrayList.add(this.f10352g0);
        c[] cVarArr = this.f10238F;
        int length = cVarArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            cVarArr[i5] = this.f10352g0;
        }
    }

    @Override // u.d
    public final void a(t.e eVar) {
        e eVar2 = (e) this.f10240I;
        if (eVar2 == null) {
            return;
        }
        c cVarG = eVar2.g(2);
        c cVarG2 = eVar2.g(4);
        d dVar = this.f10240I;
        boolean z4 = dVar != null && dVar.f10262c0[0] == 2;
        if (this.f10353h0 == 0) {
            cVarG = eVar2.g(3);
            cVarG2 = eVar2.g(5);
            d dVar2 = this.f10240I;
            z4 = dVar2 != null && dVar2.f10262c0[1] == 2;
        }
        if (this.f10350e0 != -1) {
            t.i iVarJ = eVar.j(this.f10352g0);
            eVar.e(iVarJ, eVar.j(cVarG), this.f10350e0, 8);
            if (z4) {
                eVar.f(eVar.j(cVarG2), iVarJ, 0, 5);
                return;
            }
            return;
        }
        if (this.f10351f0 != -1) {
            t.i iVarJ2 = eVar.j(this.f10352g0);
            t.i iVarJ3 = eVar.j(cVarG2);
            eVar.e(iVarJ2, iVarJ3, -this.f10351f0, 8);
            if (z4) {
                eVar.f(iVarJ2, eVar.j(cVarG), 0, 5);
                eVar.f(iVarJ3, iVarJ2, 0, 5);
                return;
            }
            return;
        }
        if (this.f10349d0 != -1.0f) {
            t.i iVarJ4 = eVar.j(this.f10352g0);
            t.i iVarJ5 = eVar.j(cVarG2);
            float f2 = this.f10349d0;
            C0892c c0892cK = eVar.k();
            c0892cK.f9832d.f(iVarJ4, -1.0f);
            c0892cK.f9832d.f(iVarJ5, f2);
            eVar.c(c0892cK);
        }
    }

    @Override // u.d
    public final boolean b() {
        return true;
    }

    @Override // u.d
    public final c g(int i) {
        switch (t.h.c(i)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f10353h0 == 1) {
                    return this.f10352g0;
                }
                break;
            case 2:
            case 4:
                if (this.f10353h0 == 0) {
                    return this.f10352g0;
                }
                break;
        }
        throw new AssertionError(AbstractC0854a.d(i));
    }
}
