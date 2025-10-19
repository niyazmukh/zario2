package A2;

import java.util.HashMap;
import java.util.Iterator;
import s2.C0870e;
import y2.C1048A;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\C.smali */
public final class C implements f0 {

    /* renamed from: c, reason: collision with root package name */
    public int f80c;

    /* renamed from: f, reason: collision with root package name */
    public final B f83f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f78a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final S0.c f79b = new S0.c(2);

    /* renamed from: d, reason: collision with root package name */
    public B2.o f81d = B2.o.f333b;

    /* renamed from: e, reason: collision with root package name */
    public long f82e = 0;

    public C(B b5) {
        this.f83f = b5;
    }

    @Override // A2.f0
    public final g0 a(C1048A c1048a) {
        return (g0) this.f78a.get(c1048a);
    }

    @Override // A2.f0
    public final void b(C0870e c0870e, int i) {
        S0.c cVar = this.f79b;
        cVar.getClass();
        Iterator it = c0870e.iterator();
        while (true) {
            s2.d dVar = (s2.d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                break;
            }
            C0003c c0003c = new C0003c((B2.h) dVar.next(), i);
            cVar.f2847b = ((C0870e) cVar.f2847b).f(c0003c);
            cVar.f2848c = ((C0870e) cVar.f2848c).f(c0003c);
        }
        I i5 = this.f83f.f77g;
        Iterator it2 = c0870e.iterator();
        while (true) {
            s2.d dVar2 = (s2.d) it2;
            if (!((Iterator) dVar2.f9680b).hasNext()) {
                return;
            } else {
                i5.k((B2.h) dVar2.next());
            }
        }
    }

    @Override // A2.f0
    public final C0870e c(int i) {
        return this.f79b.p(i);
    }

    @Override // A2.f0
    public final B2.o d() {
        return this.f81d;
    }

    @Override // A2.f0
    public final void e(C0870e c0870e, int i) {
        S0.c cVar = this.f79b;
        cVar.getClass();
        Iterator it = c0870e.iterator();
        while (true) {
            s2.d dVar = (s2.d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                break;
            }
            C0003c c0003c = new C0003c((B2.h) dVar.next(), i);
            cVar.f2847b = ((C0870e) cVar.f2847b).h(c0003c);
            cVar.f2848c = ((C0870e) cVar.f2848c).h(c0003c);
        }
        I i5 = this.f83f.f77g;
        Iterator it2 = c0870e.iterator();
        while (true) {
            s2.d dVar2 = (s2.d) it2;
            if (!((Iterator) dVar2.f9680b).hasNext()) {
                return;
            } else {
                i5.m((B2.h) dVar2.next());
            }
        }
    }

    @Override // A2.f0
    public final void f(B2.o oVar) {
        this.f81d = oVar;
    }

    @Override // A2.f0
    public final void g(g0 g0Var) {
        this.f78a.put(g0Var.f193a, g0Var);
        int i = this.f80c;
        int i5 = g0Var.f194b;
        if (i5 > i) {
            this.f80c = i5;
        }
        long j5 = this.f82e;
        long j6 = g0Var.f195c;
        if (j6 > j5) {
            this.f82e = j6;
        }
    }

    @Override // A2.f0
    public final int h() {
        return this.f80c;
    }

    @Override // A2.f0
    public final void i(g0 g0Var) {
        g(g0Var);
    }
}
