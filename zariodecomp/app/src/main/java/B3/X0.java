package B3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.C1075D;
import z3.C1078b;
import z3.C1100z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\X0.smali */
public final class X0 extends AbstractC1098w {

    /* renamed from: a, reason: collision with root package name */
    public final z3.H f595a;

    /* renamed from: b, reason: collision with root package name */
    public final C1075D f596b;

    /* renamed from: c, reason: collision with root package name */
    public final C0069p f597c;

    /* renamed from: d, reason: collision with root package name */
    public final r f598d;

    /* renamed from: e, reason: collision with root package name */
    public List f599e;

    /* renamed from: f, reason: collision with root package name */
    public A0 f600f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f601g;
    public boolean h;
    public S0.l i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Y0 f602j;

    public X0(Y0 y02, z3.H h) {
        this.f602j = y02;
        List list = h.f11242b;
        this.f599e = list;
        y02.getClass();
        this.f595a = h;
        C1075D c1075d = new C1075D("Subchannel", y02.f666w.f574e, C1075D.f11233d.incrementAndGet());
        this.f596b = c1075d;
        o2 o2Var = y02.f658o;
        r rVar = new r(c1075d, o2Var.c(), "Subchannel for " + list);
        this.f598d = rVar;
        this.f597c = new C0069p(rVar, o2Var);
    }

    @Override // z3.AbstractC1098w
    public final List b() {
        this.f602j.f659p.d();
        S0.f.q("not started", this.f601g);
        return this.f599e;
    }

    @Override // z3.AbstractC1098w
    public final C1078b c() {
        return this.f595a.f11243c;
    }

    @Override // z3.AbstractC1098w
    public final AbstractC1080d d() {
        return this.f597c;
    }

    @Override // z3.AbstractC1098w
    public final Object e() {
        S0.f.q("Subchannel is not started", this.f601g);
        return this.f600f;
    }

    @Override // z3.AbstractC1098w
    public final void l() {
        this.f602j.f659p.d();
        S0.f.q("not started", this.f601g);
        A0 a02 = this.f600f;
        if (a02.f368v != null) {
            return;
        }
        a02.f357k.execute(new s0(a02, 1));
    }

    @Override // z3.AbstractC1098w
    public final void m() {
        S0.l lVar;
        Y0 y02 = this.f602j;
        y02.f659p.d();
        if (this.f600f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!y02.f629L || (lVar = this.i) == null) {
                return;
            }
            lVar.i();
            this.i = null;
        }
        if (!y02.f629L) {
            this.i = y02.f659p.c(new H0(new N(this, 5)), 5L, TimeUnit.SECONDS, y02.i.f924a.f1137d);
            return;
        }
        A0 a02 = this.f600f;
        z3.k0 k0Var = Y0.f614j0;
        a02.getClass();
        a02.f357k.execute(new RunnableC0080t0(a02, k0Var, 0));
    }

    @Override // z3.AbstractC1098w
    public final void o(z3.L l4) {
        Y0 y02 = this.f602j;
        y02.f659p.d();
        S0.f.q("already started", !this.f601g);
        S0.f.q("already shutdown", !this.h);
        S0.f.q("Channel is being terminated", !y02.f629L);
        this.f601g = true;
        List list = this.f595a.f11242b;
        String str = y02.f666w.f574e;
        C0066o c0066o = y02.i;
        ScheduledExecutorService scheduledExecutorService = c0066o.f924a.f1137d;
        q2 q2Var = new q2(3, this, l4);
        y02.f632O.getClass();
        A0 a02 = new A0(list, str, y02.f665v, c0066o, scheduledExecutorService, y02.f662s, y02.f659p, q2Var, y02.f636S, new S0.i(2), this.f598d, this.f596b, this.f597c, y02.f667x);
        y02.f634Q.b(new C1100z("Child Subchannel started", z3.y.a, y02.f658o.c(), a02));
        this.f600f = a02;
        y02.f622D.add(a02);
    }

    @Override // z3.AbstractC1098w
    public final void p(List list) {
        this.f602j.f659p.d();
        this.f599e = list;
        A0 a02 = this.f600f;
        a02.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S0.f.l(it.next(), "newAddressGroups contains null entry");
        }
        S0.f.g("newAddressGroups is empty", !list.isEmpty());
        a02.f357k.execute(new I(14, a02, Collections.unmodifiableList(new ArrayList(list))));
    }

    public final String toString() {
        return this.f596b.toString();
    }
}
