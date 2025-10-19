package t;

import S0.n;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t.1\e.smali */
public final class e {

    /* renamed from: o, reason: collision with root package name */
    public static int f9834o = 1000;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f9835p = true;

    /* renamed from: b, reason: collision with root package name */
    public final g f9837b;

    /* renamed from: e, reason: collision with root package name */
    public C0892c[] f9840e;

    /* renamed from: k, reason: collision with root package name */
    public final n f9844k;

    /* renamed from: n, reason: collision with root package name */
    public C0892c f9847n;

    /* renamed from: a, reason: collision with root package name */
    public int f9836a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f9838c = 32;

    /* renamed from: d, reason: collision with root package name */
    public int f9839d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9841f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f9842g = new boolean[32];
    public int h = 1;
    public int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f9843j = 32;

    /* renamed from: l, reason: collision with root package name */
    public i[] f9845l = new i[f9834o];

    /* renamed from: m, reason: collision with root package name */
    public int f9846m = 0;

    public e() {
        this.f9840e = null;
        this.f9840e = new C0892c[32];
        q();
        n nVar = new n();
        nVar.f2872a = new L.e();
        nVar.f2873b = new L.e();
        nVar.f2874c = new L.e();
        nVar.f2875d = new i[32];
        this.f9844k = nVar;
        g gVar = new g(nVar);
        gVar.f9850f = new i[128];
        gVar.f9851g = new i[128];
        gVar.h = 0;
        gVar.i = new f(gVar);
        this.f9837b = gVar;
        if (f9835p) {
            this.f9847n = new C0893d(nVar);
        } else {
            this.f9847n = new C0892c(nVar);
        }
    }

    public static int m(Object obj) {
        i iVar = ((u.c) obj).f10232g;
        if (iVar != null) {
            return (int) (iVar.f9857e + 0.5f);
        }
        return 0;
    }

    public final i a(int i) {
        i iVar = (i) ((L.e) this.f9844k.f2874c).a();
        if (iVar == null) {
            iVar = new i(i);
            iVar.f9862l = i;
        } else {
            iVar.c();
            iVar.f9862l = i;
        }
        int i5 = this.f9846m;
        int i6 = f9834o;
        if (i5 >= i6) {
            int i7 = i6 * 2;
            f9834o = i7;
            this.f9845l = (i[]) Arrays.copyOf(this.f9845l, i7);
        }
        i[] iVarArr = this.f9845l;
        int i8 = this.f9846m;
        this.f9846m = i8 + 1;
        iVarArr[i8] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i, float f2, i iVar3, i iVar4, int i5, int i6) {
        C0892c c0892cK = k();
        if (iVar2 == iVar3) {
            c0892cK.f9832d.f(iVar, 1.0f);
            c0892cK.f9832d.f(iVar4, 1.0f);
            c0892cK.f9832d.f(iVar2, -2.0f);
        } else if (f2 == 0.5f) {
            c0892cK.f9832d.f(iVar, 1.0f);
            c0892cK.f9832d.f(iVar2, -1.0f);
            c0892cK.f9832d.f(iVar3, -1.0f);
            c0892cK.f9832d.f(iVar4, 1.0f);
            if (i > 0 || i5 > 0) {
                c0892cK.f9830b = (-i) + i5;
            }
        } else if (f2 <= 0.0f) {
            c0892cK.f9832d.f(iVar, -1.0f);
            c0892cK.f9832d.f(iVar2, 1.0f);
            c0892cK.f9830b = i;
        } else if (f2 >= 1.0f) {
            c0892cK.f9832d.f(iVar4, -1.0f);
            c0892cK.f9832d.f(iVar3, 1.0f);
            c0892cK.f9830b = -i5;
        } else {
            float f3 = 1.0f - f2;
            c0892cK.f9832d.f(iVar, f3 * 1.0f);
            c0892cK.f9832d.f(iVar2, f3 * (-1.0f));
            c0892cK.f9832d.f(iVar3, (-1.0f) * f2);
            c0892cK.f9832d.f(iVar4, 1.0f * f2);
            if (i > 0 || i5 > 0) {
                c0892cK.f9830b = (i5 * f2) + ((-i) * f3);
            }
        }
        if (i6 != 8) {
            c0892cK.a(this, i6);
        }
        c(c0892cK);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(t.C0892c r17) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.c(t.c):void");
    }

    public final void d(i iVar, int i) {
        int i5 = iVar.f9855c;
        if (i5 == -1) {
            iVar.f9857e = i;
            iVar.f9858f = true;
            int i6 = iVar.f9860j;
            for (int i7 = 0; i7 < i6; i7++) {
                iVar.i[i7].g(iVar, false);
            }
            iVar.f9860j = 0;
            return;
        }
        if (i5 == -1) {
            C0892c c0892cK = k();
            c0892cK.f9829a = iVar;
            float f2 = i;
            iVar.f9857e = f2;
            c0892cK.f9830b = f2;
            c0892cK.f9833e = true;
            c(c0892cK);
            return;
        }
        C0892c c0892c = this.f9840e[i5];
        if (c0892c.f9833e) {
            c0892c.f9830b = i;
            return;
        }
        if (c0892c.f9832d.k() == 0) {
            c0892c.f9833e = true;
            c0892c.f9830b = i;
            return;
        }
        C0892c c0892cK2 = k();
        if (i < 0) {
            c0892cK2.f9830b = i * (-1);
            c0892cK2.f9832d.f(iVar, 1.0f);
        } else {
            c0892cK2.f9830b = i;
            c0892cK2.f9832d.f(iVar, -1.0f);
        }
        c(c0892cK2);
    }

    public final void e(i iVar, i iVar2, int i, int i5) {
        boolean z4 = false;
        if (i5 == 8 && iVar2.f9858f && iVar.f9855c == -1) {
            iVar.f9857e = iVar2.f9857e + i;
            iVar.f9858f = true;
            int i6 = iVar.f9860j;
            for (int i7 = 0; i7 < i6; i7++) {
                iVar.i[i7].g(iVar, false);
            }
            iVar.f9860j = 0;
            return;
        }
        C0892c c0892cK = k();
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z4 = true;
            }
            c0892cK.f9830b = i;
        }
        if (z4) {
            c0892cK.f9832d.f(iVar, 1.0f);
            c0892cK.f9832d.f(iVar2, -1.0f);
        } else {
            c0892cK.f9832d.f(iVar, -1.0f);
            c0892cK.f9832d.f(iVar2, 1.0f);
        }
        if (i5 != 8) {
            c0892cK.a(this, i5);
        }
        c(c0892cK);
    }

    public final void f(i iVar, i iVar2, int i, int i5) {
        C0892c c0892cK = k();
        i iVarL = l();
        iVarL.f9856d = 0;
        c0892cK.b(iVar, iVar2, iVarL, i);
        if (i5 != 8) {
            c0892cK.f9832d.f(i(i5), (int) (c0892cK.f9832d.g(iVarL) * (-1.0f)));
        }
        c(c0892cK);
    }

    public final void g(i iVar, i iVar2, int i, int i5) {
        C0892c c0892cK = k();
        i iVarL = l();
        iVarL.f9856d = 0;
        c0892cK.c(iVar, iVar2, iVarL, i);
        if (i5 != 8) {
            c0892cK.f9832d.f(i(i5), (int) (c0892cK.f9832d.g(iVarL) * (-1.0f)));
        }
        c(c0892cK);
    }

    public final void h(C0892c c0892c) {
        boolean z4 = f9835p;
        n nVar = this.f9844k;
        if (z4) {
            C0892c c0892c2 = this.f9840e[this.i];
            if (c0892c2 != null) {
                ((L.e) nVar.f2872a).b(c0892c2);
            }
        } else {
            C0892c c0892c3 = this.f9840e[this.i];
            if (c0892c3 != null) {
                ((L.e) nVar.f2873b).b(c0892c3);
            }
        }
        C0892c[] c0892cArr = this.f9840e;
        int i = this.i;
        c0892cArr[i] = c0892c;
        i iVar = c0892c.f9829a;
        iVar.f9855c = i;
        this.i = i + 1;
        iVar.d(c0892c);
    }

    public final i i(int i) {
        if (this.h + 1 >= this.f9839d) {
            n();
        }
        i iVarA = a(4);
        int i5 = this.f9836a + 1;
        this.f9836a = i5;
        this.h++;
        iVarA.f9854b = i5;
        iVarA.f9856d = i;
        ((i[]) this.f9844k.f2875d)[i5] = iVarA;
        g gVar = this.f9837b;
        gVar.i.f9848a = iVarA;
        float[] fArr = iVarA.h;
        Arrays.fill(fArr, 0.0f);
        fArr[iVarA.f9856d] = 1.0f;
        gVar.i(iVarA);
        return iVarA;
    }

    public final i j(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.f9839d) {
            n();
        }
        if (obj instanceof u.c) {
            u.c cVar = (u.c) obj;
            iVar = cVar.f10232g;
            if (iVar == null) {
                cVar.i();
                iVar = cVar.f10232g;
            }
            int i = iVar.f9854b;
            n nVar = this.f9844k;
            if (i == -1 || i > this.f9836a || ((i[]) nVar.f2875d)[i] == null) {
                if (i != -1) {
                    iVar.c();
                }
                int i5 = this.f9836a + 1;
                this.f9836a = i5;
                this.h++;
                iVar.f9854b = i5;
                iVar.f9862l = 1;
                ((i[]) nVar.f2875d)[i5] = iVar;
            }
        }
        return iVar;
    }

    public final C0892c k() {
        boolean z4 = f9835p;
        n nVar = this.f9844k;
        if (z4) {
            C0892c c0892c = (C0892c) ((L.e) nVar.f2872a).a();
            if (c0892c == null) {
                return new C0893d(nVar);
            }
            c0892c.f9829a = null;
            c0892c.f9832d.clear();
            c0892c.f9830b = 0.0f;
            c0892c.f9833e = false;
            return c0892c;
        }
        C0892c c0892c2 = (C0892c) ((L.e) nVar.f2873b).a();
        if (c0892c2 == null) {
            return new C0892c(nVar);
        }
        c0892c2.f9829a = null;
        c0892c2.f9832d.clear();
        c0892c2.f9830b = 0.0f;
        c0892c2.f9833e = false;
        return c0892c2;
    }

    public final i l() {
        if (this.h + 1 >= this.f9839d) {
            n();
        }
        i iVarA = a(3);
        int i = this.f9836a + 1;
        this.f9836a = i;
        this.h++;
        iVarA.f9854b = i;
        ((i[]) this.f9844k.f2875d)[i] = iVarA;
        return iVarA;
    }

    public final void n() {
        int i = this.f9838c * 2;
        this.f9838c = i;
        this.f9840e = (C0892c[]) Arrays.copyOf(this.f9840e, i);
        n nVar = this.f9844k;
        nVar.f2875d = (i[]) Arrays.copyOf((i[]) nVar.f2875d, this.f9838c);
        int i5 = this.f9838c;
        this.f9842g = new boolean[i5];
        this.f9839d = i5;
        this.f9843j = i5;
    }

    public final void o(g gVar) {
        n nVar;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            C0892c c0892c = this.f9840e[i];
            int i5 = 1;
            if (c0892c.f9829a.f9862l != 1) {
                float f2 = 0.0f;
                if (c0892c.f9830b < 0.0f) {
                    boolean z4 = false;
                    int i6 = 0;
                    while (!z4) {
                        i6 += i5;
                        float f3 = Float.MAX_VALUE;
                        int i7 = -1;
                        int i8 = -1;
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            int i11 = this.i;
                            nVar = this.f9844k;
                            if (i9 >= i11) {
                                break;
                            }
                            C0892c c0892c2 = this.f9840e[i9];
                            if (c0892c2.f9829a.f9862l != i5 && !c0892c2.f9833e && c0892c2.f9830b < f2) {
                                int i12 = i5;
                                while (i12 < this.h) {
                                    i iVar = ((i[]) nVar.f2875d)[i12];
                                    float fG = c0892c2.f9832d.g(iVar);
                                    if (fG > f2) {
                                        for (int i13 = 0; i13 < 9; i13++) {
                                            float f5 = iVar.f9859g[i13] / fG;
                                            if ((f5 < f3 && i13 == i10) || i13 > i10) {
                                                i10 = i13;
                                                f3 = f5;
                                                i7 = i9;
                                                i8 = i12;
                                            }
                                        }
                                    }
                                    i12++;
                                    f2 = 0.0f;
                                }
                            }
                            i9++;
                            f2 = 0.0f;
                            i5 = 1;
                        }
                        if (i7 != -1) {
                            C0892c c0892c3 = this.f9840e[i7];
                            c0892c3.f9829a.f9855c = -1;
                            c0892c3.f(((i[]) nVar.f2875d)[i8]);
                            i iVar2 = c0892c3.f9829a;
                            iVar2.f9855c = i7;
                            iVar2.d(c0892c3);
                        } else {
                            z4 = true;
                        }
                        if (i6 > this.h / 2) {
                            z4 = true;
                        }
                        f2 = 0.0f;
                        i5 = 1;
                    }
                }
            }
            i++;
        }
        p(gVar);
        for (int i14 = 0; i14 < this.i; i14++) {
            C0892c c0892c4 = this.f9840e[i14];
            c0892c4.f9829a.f9857e = c0892c4.f9830b;
        }
    }

    public final void p(C0892c c0892c) {
        for (int i = 0; i < this.h; i++) {
            this.f9842g[i] = false;
        }
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            i5++;
            if (i5 >= this.h * 2) {
                return;
            }
            i iVar = c0892c.f9829a;
            if (iVar != null) {
                this.f9842g[iVar.f9854b] = true;
            }
            i iVarD = c0892c.d(this.f9842g);
            if (iVarD != null) {
                boolean[] zArr = this.f9842g;
                int i6 = iVarD.f9854b;
                if (zArr[i6]) {
                    return;
                } else {
                    zArr[i6] = true;
                }
            }
            if (iVarD != null) {
                float f2 = Float.MAX_VALUE;
                int i7 = -1;
                for (int i8 = 0; i8 < this.i; i8++) {
                    C0892c c0892c2 = this.f9840e[i8];
                    if (c0892c2.f9829a.f9862l != 1 && !c0892c2.f9833e && c0892c2.f9832d.d(iVarD)) {
                        float fG = c0892c2.f9832d.g(iVarD);
                        if (fG < 0.0f) {
                            float f3 = (-c0892c2.f9830b) / fG;
                            if (f3 < f2) {
                                i7 = i8;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i7 > -1) {
                    C0892c c0892c3 = this.f9840e[i7];
                    c0892c3.f9829a.f9855c = -1;
                    c0892c3.f(iVarD);
                    i iVar2 = c0892c3.f9829a;
                    iVar2.f9855c = i7;
                    iVar2.d(c0892c3);
                }
            } else {
                z4 = true;
            }
        }
    }

    public final void q() {
        boolean z4 = f9835p;
        n nVar = this.f9844k;
        int i = 0;
        if (z4) {
            while (true) {
                C0892c[] c0892cArr = this.f9840e;
                if (i >= c0892cArr.length) {
                    return;
                }
                C0892c c0892c = c0892cArr[i];
                if (c0892c != null) {
                    ((L.e) nVar.f2872a).b(c0892c);
                }
                this.f9840e[i] = null;
                i++;
            }
        } else {
            while (true) {
                C0892c[] c0892cArr2 = this.f9840e;
                if (i >= c0892cArr2.length) {
                    return;
                }
                C0892c c0892c2 = c0892cArr2[i];
                if (c0892c2 != null) {
                    ((L.e) nVar.f2873b).b(c0892c2);
                }
                this.f9840e[i] = null;
                i++;
            }
        }
    }

    public final void r() {
        n nVar;
        int i = 0;
        while (true) {
            nVar = this.f9844k;
            i[] iVarArr = (i[]) nVar.f2875d;
            if (i >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.c();
            }
            i++;
        }
        L.e eVar = (L.e) nVar.f2874c;
        i[] iVarArr2 = this.f9845l;
        int length = this.f9846m;
        eVar.getClass();
        if (length > iVarArr2.length) {
            length = iVarArr2.length;
        }
        for (int i5 = 0; i5 < length; i5++) {
            i iVar2 = iVarArr2[i5];
            int i6 = eVar.f2294c;
            Object[] objArr = eVar.f2293b;
            if (i6 < objArr.length) {
                objArr[i6] = iVar2;
                eVar.f2294c = i6 + 1;
            }
        }
        this.f9846m = 0;
        Arrays.fill((i[]) nVar.f2875d, (Object) null);
        this.f9836a = 0;
        g gVar = this.f9837b;
        gVar.h = 0;
        gVar.f9830b = 0.0f;
        this.h = 1;
        for (int i7 = 0; i7 < this.i; i7++) {
            this.f9840e[i7].getClass();
        }
        q();
        this.i = 0;
        if (f9835p) {
            this.f9847n = new C0893d(nVar);
        } else {
            this.f9847n = new C0892c(nVar);
        }
    }
}
