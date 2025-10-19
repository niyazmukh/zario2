package v;

import java.util.Iterator;
import u.C0951a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v.1\i.smali */
public final class i extends m {
    @Override // v.InterfaceC0975d
    public final void a(InterfaceC0975d interfaceC0975d) {
        C0951a c0951a = (C0951a) this.f10547b;
        int i = c0951a.f10208f0;
        f fVar = this.h;
        Iterator it = fVar.f10539l.iterator();
        int i5 = 0;
        int i6 = -1;
        while (it.hasNext()) {
            int i7 = ((f) it.next()).f10536g;
            if (i6 == -1 || i7 < i6) {
                i6 = i7;
            }
            if (i5 < i7) {
                i5 = i7;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i6 + c0951a.f10210h0);
        } else {
            fVar.d(i5 + c0951a.f10210h0);
        }
    }

    @Override // v.m
    public final void d() {
        u.d dVar = this.f10547b;
        if (dVar instanceof C0951a) {
            f fVar = this.h;
            fVar.f10531b = true;
            C0951a c0951a = (C0951a) dVar;
            int i = c0951a.f10208f0;
            boolean z4 = c0951a.f10209g0;
            int i5 = 0;
            if (i == 0) {
                fVar.f10534e = 4;
                while (i5 < c0951a.f10355e0) {
                    u.d dVar2 = c0951a.f10354d0[i5];
                    if (z4 || dVar2.f10253V != 8) {
                        f fVar2 = dVar2.f10263d.h;
                        fVar2.f10538k.add(fVar);
                        fVar.f10539l.add(fVar2);
                    }
                    i5++;
                }
                m(this.f10547b.f10263d.h);
                m(this.f10547b.f10263d.i);
                return;
            }
            if (i == 1) {
                fVar.f10534e = 5;
                while (i5 < c0951a.f10355e0) {
                    u.d dVar3 = c0951a.f10354d0[i5];
                    if (z4 || dVar3.f10253V != 8) {
                        f fVar3 = dVar3.f10263d.i;
                        fVar3.f10538k.add(fVar);
                        fVar.f10539l.add(fVar3);
                    }
                    i5++;
                }
                m(this.f10547b.f10263d.h);
                m(this.f10547b.f10263d.i);
                return;
            }
            if (i == 2) {
                fVar.f10534e = 6;
                while (i5 < c0951a.f10355e0) {
                    u.d dVar4 = c0951a.f10354d0[i5];
                    if (z4 || dVar4.f10253V != 8) {
                        f fVar4 = dVar4.f10264e.h;
                        fVar4.f10538k.add(fVar);
                        fVar.f10539l.add(fVar4);
                    }
                    i5++;
                }
                m(this.f10547b.f10264e.h);
                m(this.f10547b.f10264e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.f10534e = 7;
            while (i5 < c0951a.f10355e0) {
                u.d dVar5 = c0951a.f10354d0[i5];
                if (z4 || dVar5.f10253V != 8) {
                    f fVar5 = dVar5.f10264e.i;
                    fVar5.f10538k.add(fVar);
                    fVar.f10539l.add(fVar5);
                }
                i5++;
            }
            m(this.f10547b.f10264e.h);
            m(this.f10547b.f10264e.i);
        }
    }

    @Override // v.m
    public final void e() {
        u.d dVar = this.f10547b;
        if (dVar instanceof C0951a) {
            int i = ((C0951a) dVar).f10208f0;
            f fVar = this.h;
            if (i == 0 || i == 1) {
                dVar.f10245N = fVar.f10536g;
            } else {
                dVar.f10246O = fVar.f10536g;
            }
        }
    }

    @Override // v.m
    public final void f() {
        this.f10548c = null;
        this.h.c();
    }

    @Override // v.m
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f10538k.add(fVar);
        fVar.f10539l.add(fVar2);
    }
}
