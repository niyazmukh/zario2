package v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v.1\l.smali */
public final class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public f f10544k;

    /* renamed from: l, reason: collision with root package name */
    public C0972a f10545l;

    @Override // v.InterfaceC0975d
    public final void a(InterfaceC0975d interfaceC0975d) {
        float f2;
        float f3;
        float f5;
        int i;
        if (t.h.c(this.f10553j) == 3) {
            u.d dVar = this.f10547b;
            l(dVar.f10282y, dVar.f10233A, 1);
            return;
        }
        g gVar = this.f10550e;
        if (gVar.f10532c && !gVar.f10537j && this.f10549d == 3) {
            u.d dVar2 = this.f10547b;
            int i5 = dVar2.f10268k;
            if (i5 == 2) {
                u.d dVar3 = dVar2.f10240I;
                if (dVar3 != null) {
                    if (dVar3.f10264e.f10550e.f10537j) {
                        gVar.d((int) ((r5.f10536g * dVar2.f10275r) + 0.5f));
                    }
                }
            } else if (i5 == 3) {
                g gVar2 = dVar2.f10263d.f10550e;
                if (gVar2.f10537j) {
                    int i6 = dVar2.f10244M;
                    if (i6 == -1) {
                        f2 = gVar2.f10536g;
                        f3 = dVar2.f10243L;
                    } else if (i6 == 0) {
                        f5 = gVar2.f10536g * dVar2.f10243L;
                        i = (int) (f5 + 0.5f);
                        gVar.d(i);
                    } else if (i6 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = gVar2.f10536g;
                        f3 = dVar2.f10243L;
                    }
                    f5 = f2 / f3;
                    i = (int) (f5 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.h;
        if (fVar.f10532c) {
            f fVar2 = this.i;
            if (fVar2.f10532c) {
                if (fVar.f10537j && fVar2.f10537j && gVar.f10537j) {
                    return;
                }
                if (!gVar.f10537j && this.f10549d == 3) {
                    u.d dVar4 = this.f10547b;
                    if (dVar4.f10267j == 0 && !dVar4.r()) {
                        f fVar3 = (f) fVar.f10539l.get(0);
                        f fVar4 = (f) fVar2.f10539l.get(0);
                        int i7 = fVar3.f10536g + fVar.f10535f;
                        int i8 = fVar4.f10536g + fVar2.f10535f;
                        fVar.d(i7);
                        fVar2.d(i8);
                        gVar.d(i8 - i7);
                        return;
                    }
                }
                if (!gVar.f10537j && this.f10549d == 3 && this.f10546a == 1 && fVar.f10539l.size() > 0 && fVar2.f10539l.size() > 0) {
                    f fVar5 = (f) fVar.f10539l.get(0);
                    int i9 = (((f) fVar2.f10539l.get(0)).f10536g + fVar2.f10535f) - (fVar5.f10536g + fVar.f10535f);
                    int i10 = gVar.f10540m;
                    if (i9 < i10) {
                        gVar.d(i9);
                    } else {
                        gVar.d(i10);
                    }
                }
                if (gVar.f10537j && fVar.f10539l.size() > 0 && fVar2.f10539l.size() > 0) {
                    f fVar6 = (f) fVar.f10539l.get(0);
                    f fVar7 = (f) fVar2.f10539l.get(0);
                    int i11 = fVar6.f10536g;
                    int i12 = fVar.f10535f + i11;
                    int i13 = fVar7.f10536g;
                    int i14 = fVar2.f10535f + i13;
                    float f6 = this.f10547b.f10251T;
                    if (fVar6 == fVar7) {
                        f6 = 0.5f;
                    } else {
                        i11 = i12;
                        i13 = i14;
                    }
                    fVar.d((int) ((((i13 - i11) - gVar.f10536g) * f6) + i11 + 0.5f));
                    fVar2.d(fVar.f10536g + gVar.f10536g);
                }
            }
        }
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
            gVar.d(dVar5.i());
        }
        boolean z5 = gVar.f10537j;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z5) {
            u.d dVar6 = this.f10547b;
            this.f10549d = dVar6.f10262c0[1];
            if (dVar6.f10280w) {
                this.f10545l = new C0972a(this);
            }
            int i = this.f10549d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f10547b.f10240I) != null && dVar4.f10262c0[1] == 1) {
                    int i5 = (dVar4.i() - this.f10547b.f10282y.c()) - this.f10547b.f10233A.c();
                    l lVar = dVar4.f10264e;
                    m.b(fVar2, lVar.h, this.f10547b.f10282y.c());
                    m.b(fVar, lVar.i, -this.f10547b.f10233A.c());
                    gVar.d(i5);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.f10547b.i());
                }
            }
        } else if (this.f10549d == 4 && (dVar2 = (dVar = this.f10547b).f10240I) != null && dVar2.f10262c0[1] == 1) {
            l lVar2 = dVar2.f10264e;
            m.b(fVar2, lVar2.h, dVar.f10282y.c());
            m.b(fVar, lVar2.i, -this.f10547b.f10233A.c());
            return;
        }
        boolean z6 = gVar.f10537j;
        f fVar3 = this.f10544k;
        if (z6) {
            u.d dVar7 = this.f10547b;
            if (dVar7.f10257a) {
                u.c[] cVarArr = dVar7.f10238F;
                u.c cVar = cVarArr[2];
                u.c cVar2 = cVar.f10229d;
                if (cVar2 != null && cVarArr[3].f10229d != null) {
                    if (dVar7.r()) {
                        fVar2.f10535f = this.f10547b.f10238F[2].c();
                        fVar.f10535f = -this.f10547b.f10238F[3].c();
                    } else {
                        f fVarH = m.h(this.f10547b.f10238F[2]);
                        if (fVarH != null) {
                            m.b(fVar2, fVarH, this.f10547b.f10238F[2].c());
                        }
                        f fVarH2 = m.h(this.f10547b.f10238F[3]);
                        if (fVarH2 != null) {
                            m.b(fVar, fVarH2, -this.f10547b.f10238F[3].c());
                        }
                        fVar2.f10531b = true;
                        fVar.f10531b = true;
                    }
                    u.d dVar8 = this.f10547b;
                    if (dVar8.f10280w) {
                        m.b(fVar3, fVar2, dVar8.f10247P);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = m.h(cVar);
                    if (fVarH3 != null) {
                        m.b(fVar2, fVarH3, this.f10547b.f10238F[2].c());
                        m.b(fVar, fVar2, gVar.f10536g);
                        u.d dVar9 = this.f10547b;
                        if (dVar9.f10280w) {
                            m.b(fVar3, fVar2, dVar9.f10247P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                u.c cVar3 = cVarArr[3];
                if (cVar3.f10229d != null) {
                    f fVarH4 = m.h(cVar3);
                    if (fVarH4 != null) {
                        m.b(fVar, fVarH4, -this.f10547b.f10238F[3].c());
                        m.b(fVar2, fVar, -gVar.f10536g);
                    }
                    u.d dVar10 = this.f10547b;
                    if (dVar10.f10280w) {
                        m.b(fVar3, fVar2, dVar10.f10247P);
                        return;
                    }
                    return;
                }
                u.c cVar4 = cVarArr[4];
                if (cVar4.f10229d != null) {
                    f fVarH5 = m.h(cVar4);
                    if (fVarH5 != null) {
                        m.b(fVar3, fVarH5, 0);
                        m.b(fVar2, fVar3, -this.f10547b.f10247P);
                        m.b(fVar, fVar2, gVar.f10536g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof u.i) || dVar7.f10240I == null || dVar7.g(7).f10229d != null) {
                    return;
                }
                u.d dVar11 = this.f10547b;
                m.b(fVar2, dVar11.f10240I.f10264e.h, dVar11.n());
                m.b(fVar, fVar2, gVar.f10536g);
                u.d dVar12 = this.f10547b;
                if (dVar12.f10280w) {
                    m.b(fVar3, fVar2, dVar12.f10247P);
                    return;
                }
                return;
            }
        }
        if (z6 || this.f10549d != 3) {
            gVar.b(this);
        } else {
            u.d dVar13 = this.f10547b;
            int i6 = dVar13.f10268k;
            if (i6 == 2) {
                u.d dVar14 = dVar13.f10240I;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f10264e.f10550e;
                    gVar.f10539l.add(gVar2);
                    gVar2.f10538k.add(gVar);
                    gVar.f10531b = true;
                    gVar.f10538k.add(fVar2);
                    gVar.f10538k.add(fVar);
                }
            } else if (i6 == 3 && !dVar13.r()) {
                u.d dVar15 = this.f10547b;
                if (dVar15.f10267j != 3) {
                    g gVar3 = dVar15.f10263d.f10550e;
                    gVar.f10539l.add(gVar3);
                    gVar3.f10538k.add(gVar);
                    gVar.f10531b = true;
                    gVar.f10538k.add(fVar2);
                    gVar.f10538k.add(fVar);
                }
            }
        }
        u.d dVar16 = this.f10547b;
        u.c[] cVarArr2 = dVar16.f10238F;
        u.c cVar5 = cVarArr2[2];
        u.c cVar6 = cVar5.f10229d;
        if (cVar6 != null && cVarArr2[3].f10229d != null) {
            if (dVar16.r()) {
                fVar2.f10535f = this.f10547b.f10238F[2].c();
                fVar.f10535f = -this.f10547b.f10238F[3].c();
            } else {
                f fVarH6 = m.h(this.f10547b.f10238F[2]);
                f fVarH7 = m.h(this.f10547b.f10238F[3]);
                fVarH6.b(this);
                fVarH7.b(this);
                this.f10553j = 4;
            }
            if (this.f10547b.f10280w) {
                c(fVar3, fVar2, 1, this.f10545l);
            }
        } else if (cVar6 != null) {
            f fVarH8 = m.h(cVar5);
            if (fVarH8 != null) {
                m.b(fVar2, fVarH8, this.f10547b.f10238F[2].c());
                c(fVar, fVar2, 1, gVar);
                if (this.f10547b.f10280w) {
                    c(fVar3, fVar2, 1, this.f10545l);
                }
                if (this.f10549d == 3) {
                    u.d dVar17 = this.f10547b;
                    if (dVar17.f10243L > 0.0f) {
                        j jVar = dVar17.f10263d;
                        if (jVar.f10549d == 3) {
                            jVar.f10550e.f10538k.add(gVar);
                            gVar.f10539l.add(this.f10547b.f10263d.f10550e);
                            gVar.f10530a = this;
                        }
                    }
                }
            }
        } else {
            u.c cVar7 = cVarArr2[3];
            if (cVar7.f10229d != null) {
                f fVarH9 = m.h(cVar7);
                if (fVarH9 != null) {
                    m.b(fVar, fVarH9, -this.f10547b.f10238F[3].c());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f10547b.f10280w) {
                        c(fVar3, fVar2, 1, this.f10545l);
                    }
                }
            } else {
                u.c cVar8 = cVarArr2[4];
                if (cVar8.f10229d != null) {
                    f fVarH10 = m.h(cVar8);
                    if (fVarH10 != null) {
                        m.b(fVar3, fVarH10, 0);
                        c(fVar2, fVar3, -1, this.f10545l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof u.i) && (dVar3 = dVar16.f10240I) != null) {
                    m.b(fVar2, dVar3.f10264e.h, dVar16.n());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f10547b.f10280w) {
                        c(fVar3, fVar2, 1, this.f10545l);
                    }
                    if (this.f10549d == 3) {
                        u.d dVar18 = this.f10547b;
                        if (dVar18.f10243L > 0.0f) {
                            j jVar2 = dVar18.f10263d;
                            if (jVar2.f10549d == 3) {
                                jVar2.f10550e.f10538k.add(gVar);
                                gVar.f10539l.add(this.f10547b.f10263d.f10550e);
                                gVar.f10530a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f10539l.size() == 0) {
            gVar.f10532c = true;
        }
    }

    @Override // v.m
    public final void e() {
        f fVar = this.h;
        if (fVar.f10537j) {
            this.f10547b.f10246O = fVar.f10536g;
        }
    }

    @Override // v.m
    public final void f() {
        this.f10548c = null;
        this.h.c();
        this.i.c();
        this.f10544k.c();
        this.f10550e.c();
        this.f10552g = false;
    }

    @Override // v.m
    public final boolean k() {
        return this.f10549d != 3 || this.f10547b.f10268k == 0;
    }

    public final void m() {
        this.f10552g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f10537j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f10537j = false;
        f fVar3 = this.f10544k;
        fVar3.c();
        fVar3.f10537j = false;
        this.f10550e.f10537j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f10547b.f10254W;
    }
}
