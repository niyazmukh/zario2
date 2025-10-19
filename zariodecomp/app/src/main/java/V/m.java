package v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v.1\m.smali */
public abstract class m implements InterfaceC0975d {

    /* renamed from: a, reason: collision with root package name */
    public int f10546a;

    /* renamed from: b, reason: collision with root package name */
    public u.d f10547b;

    /* renamed from: c, reason: collision with root package name */
    public k f10548c;

    /* renamed from: d, reason: collision with root package name */
    public int f10549d;

    /* renamed from: e, reason: collision with root package name */
    public final g f10550e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f10551f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10552g = false;
    public final f h = new f(this);
    public final f i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f10553j = 1;

    public m(u.d dVar) {
        this.f10547b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f10539l.add(fVar2);
        fVar.f10535f = i;
        fVar2.f10538k.add(fVar);
    }

    public static f h(u.c cVar) {
        u.c cVar2 = cVar.f10229d;
        if (cVar2 == null) {
            return null;
        }
        int iC = t.h.c(cVar2.f10228c);
        u.d dVar = cVar2.f10227b;
        if (iC == 1) {
            return dVar.f10263d.h;
        }
        if (iC == 2) {
            return dVar.f10264e.h;
        }
        if (iC == 3) {
            return dVar.f10263d.i;
        }
        if (iC == 4) {
            return dVar.f10264e.i;
        }
        if (iC != 5) {
            return null;
        }
        return dVar.f10264e.f10544k;
    }

    public static f i(u.c cVar, int i) {
        u.c cVar2 = cVar.f10229d;
        if (cVar2 == null) {
            return null;
        }
        u.d dVar = cVar2.f10227b;
        m mVar = i == 0 ? dVar.f10263d : dVar.f10264e;
        int iC = t.h.c(cVar2.f10228c);
        if (iC == 1 || iC == 2) {
            return mVar.h;
        }
        if (iC == 3 || iC == 4) {
            return mVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f10539l.add(fVar2);
        fVar.f10539l.add(this.f10550e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.f10538k.add(fVar);
        gVar.f10538k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i5) {
        int iMax;
        if (i5 == 0) {
            u.d dVar = this.f10547b;
            int i6 = dVar.f10271n;
            iMax = Math.max(dVar.f10270m, i);
            if (i6 > 0) {
                iMax = Math.min(i6, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            u.d dVar2 = this.f10547b;
            int i7 = dVar2.f10274q;
            iMax = Math.max(dVar2.f10273p, i);
            if (i7 > 0) {
                iMax = Math.min(i7, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public long j() {
        if (this.f10550e.f10537j) {
            return r2.f10536g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(u.c cVar, u.c cVar2, int i) {
        f fVarH = h(cVar);
        f fVarH2 = h(cVar2);
        if (fVarH.f10537j && fVarH2.f10537j) {
            int iC = cVar.c() + fVarH.f10536g;
            int iC2 = fVarH2.f10536g - cVar2.c();
            int i5 = iC2 - iC;
            g gVar = this.f10550e;
            if (!gVar.f10537j && this.f10549d == 3) {
                int i6 = this.f10546a;
                if (i6 == 0) {
                    gVar.d(g(i5, i));
                } else if (i6 == 1) {
                    gVar.d(Math.min(g(gVar.f10540m, i), i5));
                } else if (i6 == 2) {
                    u.d dVar = this.f10547b;
                    u.d dVar2 = dVar.f10240I;
                    if (dVar2 != null) {
                        if ((i == 0 ? dVar2.f10263d : dVar2.f10264e).f10550e.f10537j) {
                            gVar.d(g((int) ((r6.f10536g * (i == 0 ? dVar.f10272o : dVar.f10275r)) + 0.5f), i));
                        }
                    }
                } else if (i6 == 3) {
                    u.d dVar3 = this.f10547b;
                    m mVar = dVar3.f10263d;
                    int i7 = mVar.f10549d;
                    m mVar2 = dVar3.f10264e;
                    if (i7 != 3 || mVar.f10546a != 3 || mVar2.f10549d != 3 || mVar2.f10546a != 3) {
                        if (i == 0) {
                            mVar = mVar2;
                        }
                        if (mVar.f10550e.f10537j) {
                            float f2 = dVar3.f10243L;
                            gVar.d(i == 1 ? (int) ((r6.f10536g / f2) + 0.5f) : (int) ((f2 * r6.f10536g) + 0.5f));
                        }
                    }
                }
            }
            if (gVar.f10537j) {
                int i8 = gVar.f10536g;
                f fVar = this.i;
                f fVar2 = this.h;
                if (i8 == i5) {
                    fVar2.d(iC);
                    fVar.d(iC2);
                    return;
                }
                u.d dVar4 = this.f10547b;
                float f3 = i == 0 ? dVar4.f10250S : dVar4.f10251T;
                if (fVarH == fVarH2) {
                    iC = fVarH.f10536g;
                    iC2 = fVarH2.f10536g;
                    f3 = 0.5f;
                }
                fVar2.d((int) ((((iC2 - iC) - i8) * f3) + iC + 0.5f));
                fVar.d(fVar2.f10536g + gVar.f10536g);
            }
        }
    }
}
