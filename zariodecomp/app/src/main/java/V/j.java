package v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v.1\j.smali */
public final class j extends m {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f10541k = new int[2];

    public static void m(int[] iArr, int i, int i5, int i6, int i7, float f2, int i8) {
        int i9 = i5 - i;
        int i10 = i7 - i6;
        if (i8 != -1) {
            if (i8 == 0) {
                iArr[0] = (int) ((i10 * f2) + 0.5f);
                iArr[1] = i10;
                return;
            } else {
                if (i8 != 1) {
                    return;
                }
                iArr[0] = i9;
                iArr[1] = (int) ((i9 * f2) + 0.5f);
                return;
            }
        }
        int i11 = (int) ((i10 * f2) + 0.5f);
        int i12 = (int) ((i9 / f2) + 0.5f);
        if (i11 <= i9) {
            iArr[0] = i11;
            iArr[1] = i10;
        } else if (i12 <= i10) {
            iArr[0] = i9;
            iArr[1] = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0267  */
    @Override // v.InterfaceC0975d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(v.InterfaceC0975d r24) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.j.a(v.d):void");
    }

    @Override // v.m
    public final void d() {
        u.d dVar;
        u.d dVar2;
        u.d dVar3;
        u.d dVar4;
        u.d dVar5 = this.f10547b;
        boolean z4 = dVar5.f10257a;
        g gVar = this.f10550e;
        if (z4) {
            gVar.d(dVar5.l());
        }
        boolean z5 = gVar.f10537j;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z5) {
            u.d dVar6 = this.f10547b;
            int i = dVar6.f10262c0[0];
            this.f10549d = i;
            if (i != 3) {
                if (i == 4 && (((dVar4 = dVar6.f10240I) != null && dVar4.f10262c0[0] == 1) || dVar4.f10262c0[0] == 4)) {
                    int iL = (dVar4.l() - this.f10547b.f10281x.c()) - this.f10547b.f10283z.c();
                    j jVar = dVar4.f10263d;
                    m.b(fVar2, jVar.h, this.f10547b.f10281x.c());
                    m.b(fVar, jVar.i, -this.f10547b.f10283z.c());
                    gVar.d(iL);
                    return;
                }
                if (i == 1) {
                    gVar.d(dVar6.l());
                }
            }
        } else if (this.f10549d == 4 && (((dVar2 = (dVar = this.f10547b).f10240I) != null && dVar2.f10262c0[0] == 1) || dVar2.f10262c0[0] == 4)) {
            m.b(fVar2, dVar2.f10263d.h, dVar.f10281x.c());
            m.b(fVar, dVar2.f10263d.i, -this.f10547b.f10283z.c());
            return;
        }
        if (gVar.f10537j) {
            u.d dVar7 = this.f10547b;
            if (dVar7.f10257a) {
                u.c[] cVarArr = dVar7.f10238F;
                u.c cVar = cVarArr[0];
                u.c cVar2 = cVar.f10229d;
                if (cVar2 != null && cVarArr[1].f10229d != null) {
                    if (dVar7.q()) {
                        fVar2.f10535f = this.f10547b.f10238F[0].c();
                        fVar.f10535f = -this.f10547b.f10238F[1].c();
                        return;
                    }
                    f fVarH = m.h(this.f10547b.f10238F[0]);
                    if (fVarH != null) {
                        m.b(fVar2, fVarH, this.f10547b.f10238F[0].c());
                    }
                    f fVarH2 = m.h(this.f10547b.f10238F[1]);
                    if (fVarH2 != null) {
                        m.b(fVar, fVarH2, -this.f10547b.f10238F[1].c());
                    }
                    fVar2.f10531b = true;
                    fVar.f10531b = true;
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = m.h(cVar);
                    if (fVarH3 != null) {
                        m.b(fVar2, fVarH3, this.f10547b.f10238F[0].c());
                        m.b(fVar, fVar2, gVar.f10536g);
                        return;
                    }
                    return;
                }
                u.c cVar3 = cVarArr[1];
                if (cVar3.f10229d != null) {
                    f fVarH4 = m.h(cVar3);
                    if (fVarH4 != null) {
                        m.b(fVar, fVarH4, -this.f10547b.f10238F[1].c());
                        m.b(fVar2, fVar, -gVar.f10536g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof u.i) || dVar7.f10240I == null || dVar7.g(7).f10229d != null) {
                    return;
                }
                u.d dVar8 = this.f10547b;
                m.b(fVar2, dVar8.f10240I.f10263d.h, dVar8.m());
                m.b(fVar, fVar2, gVar.f10536g);
                return;
            }
        }
        if (this.f10549d == 3) {
            u.d dVar9 = this.f10547b;
            int i5 = dVar9.f10267j;
            if (i5 == 2) {
                u.d dVar10 = dVar9.f10240I;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f10264e.f10550e;
                    gVar.f10539l.add(gVar2);
                    gVar2.f10538k.add(gVar);
                    gVar.f10531b = true;
                    gVar.f10538k.add(fVar2);
                    gVar.f10538k.add(fVar);
                }
            } else if (i5 == 3) {
                if (dVar9.f10268k == 3) {
                    fVar2.f10530a = this;
                    fVar.f10530a = this;
                    l lVar = dVar9.f10264e;
                    lVar.h.f10530a = this;
                    lVar.i.f10530a = this;
                    gVar.f10530a = this;
                    if (dVar9.r()) {
                        gVar.f10539l.add(this.f10547b.f10264e.f10550e);
                        this.f10547b.f10264e.f10550e.f10538k.add(gVar);
                        l lVar2 = this.f10547b.f10264e;
                        lVar2.f10550e.f10530a = this;
                        gVar.f10539l.add(lVar2.h);
                        gVar.f10539l.add(this.f10547b.f10264e.i);
                        this.f10547b.f10264e.h.f10538k.add(gVar);
                        this.f10547b.f10264e.i.f10538k.add(gVar);
                    } else if (this.f10547b.q()) {
                        this.f10547b.f10264e.f10550e.f10539l.add(gVar);
                        gVar.f10538k.add(this.f10547b.f10264e.f10550e);
                    } else {
                        this.f10547b.f10264e.f10550e.f10539l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f10264e.f10550e;
                    gVar.f10539l.add(gVar3);
                    gVar3.f10538k.add(gVar);
                    this.f10547b.f10264e.h.f10538k.add(gVar);
                    this.f10547b.f10264e.i.f10538k.add(gVar);
                    gVar.f10531b = true;
                    gVar.f10538k.add(fVar2);
                    gVar.f10538k.add(fVar);
                    fVar2.f10539l.add(gVar);
                    fVar.f10539l.add(gVar);
                }
            }
        }
        u.d dVar11 = this.f10547b;
        u.c[] cVarArr2 = dVar11.f10238F;
        u.c cVar4 = cVarArr2[0];
        u.c cVar5 = cVar4.f10229d;
        if (cVar5 != null && cVarArr2[1].f10229d != null) {
            if (dVar11.q()) {
                fVar2.f10535f = this.f10547b.f10238F[0].c();
                fVar.f10535f = -this.f10547b.f10238F[1].c();
                return;
            }
            f fVarH5 = m.h(this.f10547b.f10238F[0]);
            f fVarH6 = m.h(this.f10547b.f10238F[1]);
            fVarH5.b(this);
            fVarH6.b(this);
            this.f10553j = 4;
            return;
        }
        if (cVar5 != null) {
            f fVarH7 = m.h(cVar4);
            if (fVarH7 != null) {
                m.b(fVar2, fVarH7, this.f10547b.f10238F[0].c());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        u.c cVar6 = cVarArr2[1];
        if (cVar6.f10229d != null) {
            f fVarH8 = m.h(cVar6);
            if (fVarH8 != null) {
                m.b(fVar, fVarH8, -this.f10547b.f10238F[1].c());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof u.i) || (dVar3 = dVar11.f10240I) == null) {
            return;
        }
        m.b(fVar2, dVar3.f10263d.h, dVar11.m());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // v.m
    public final void e() {
        f fVar = this.h;
        if (fVar.f10537j) {
            this.f10547b.f10245N = fVar.f10536g;
        }
    }

    @Override // v.m
    public final void f() {
        this.f10548c = null;
        this.h.c();
        this.i.c();
        this.f10550e.c();
        this.f10552g = false;
    }

    @Override // v.m
    public final boolean k() {
        return this.f10549d != 3 || this.f10547b.f10267j == 0;
    }

    public final void n() {
        this.f10552g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f10537j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f10537j = false;
        this.f10550e.f10537j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f10547b.f10254W;
    }
}
