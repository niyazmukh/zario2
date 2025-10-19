package v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v.1\h.smali */
public final class h extends m {
    @Override // v.InterfaceC0975d
    public final void a(InterfaceC0975d interfaceC0975d) {
        f fVar = this.h;
        if (fVar.f10532c && !fVar.f10537j) {
            fVar.d((int) ((((f) fVar.f10539l.get(0)).f10536g * ((u.h) this.f10547b).f10349d0) + 0.5f));
        }
    }

    @Override // v.m
    public final void d() {
        u.d dVar = this.f10547b;
        u.h hVar = (u.h) dVar;
        int i = hVar.f10350e0;
        int i5 = hVar.f10351f0;
        int i6 = hVar.f10353h0;
        f fVar = this.h;
        if (i6 == 1) {
            if (i != -1) {
                fVar.f10539l.add(dVar.f10240I.f10263d.h);
                this.f10547b.f10240I.f10263d.h.f10538k.add(fVar);
                fVar.f10535f = i;
            } else if (i5 != -1) {
                fVar.f10539l.add(dVar.f10240I.f10263d.i);
                this.f10547b.f10240I.f10263d.i.f10538k.add(fVar);
                fVar.f10535f = -i5;
            } else {
                fVar.f10531b = true;
                fVar.f10539l.add(dVar.f10240I.f10263d.i);
                this.f10547b.f10240I.f10263d.i.f10538k.add(fVar);
            }
            m(this.f10547b.f10263d.h);
            m(this.f10547b.f10263d.i);
            return;
        }
        if (i != -1) {
            fVar.f10539l.add(dVar.f10240I.f10264e.h);
            this.f10547b.f10240I.f10264e.h.f10538k.add(fVar);
            fVar.f10535f = i;
        } else if (i5 != -1) {
            fVar.f10539l.add(dVar.f10240I.f10264e.i);
            this.f10547b.f10240I.f10264e.i.f10538k.add(fVar);
            fVar.f10535f = -i5;
        } else {
            fVar.f10531b = true;
            fVar.f10539l.add(dVar.f10240I.f10264e.i);
            this.f10547b.f10240I.f10264e.i.f10538k.add(fVar);
        }
        m(this.f10547b.f10264e.h);
        m(this.f10547b.f10264e.i);
    }

    @Override // v.m
    public final void e() {
        u.d dVar = this.f10547b;
        int i = ((u.h) dVar).f10353h0;
        f fVar = this.h;
        if (i == 1) {
            dVar.f10245N = fVar.f10536g;
        } else {
            dVar.f10246O = fVar.f10536g;
        }
    }

    @Override // v.m
    public final void f() {
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
