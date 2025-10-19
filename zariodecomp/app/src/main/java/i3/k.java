package I3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import z3.C1088l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\k.smali */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public n f1950a;

    /* renamed from: d, reason: collision with root package name */
    public Long f1953d;

    /* renamed from: e, reason: collision with root package name */
    public int f1954e;

    /* renamed from: b, reason: collision with root package name */
    public volatile S0.l f1951b = new S0.l();

    /* renamed from: c, reason: collision with root package name */
    public S0.l f1952c = new S0.l();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f1955f = new HashSet();

    public k(n nVar) {
        this.f1950a = nVar;
    }

    public final void a(r rVar) {
        if (d() && !rVar.f1975c) {
            rVar.r();
        } else if (!d() && rVar.f1975c) {
            rVar.f1975c = false;
            C1088l c1088l = rVar.f1976d;
            if (c1088l != null) {
                rVar.f1977e.a(c1088l);
                rVar.f1978f.m(2, "Subchannel unejected: {0}", rVar);
            }
        }
        rVar.f1974b = this;
        this.f1955f.add(rVar);
    }

    public final void b(long j5) {
        this.f1953d = Long.valueOf(j5);
        this.f1954e++;
        Iterator it = this.f1955f.iterator();
        while (it.hasNext()) {
            ((r) it.next()).r();
        }
    }

    public final long c() {
        return ((AtomicLong) this.f1952c.f2868c).get() + ((AtomicLong) this.f1952c.f2867b).get();
    }

    public final boolean d() {
        return this.f1953d != null;
    }

    public final void e() {
        S0.f.q("not currently ejected", this.f1953d != null);
        this.f1953d = null;
        Iterator it = this.f1955f.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            rVar.f1975c = false;
            C1088l c1088l = rVar.f1976d;
            if (c1088l != null) {
                rVar.f1977e.a(c1088l);
                rVar.f1978f.m(2, "Subchannel unejected: {0}", rVar);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f1955f + '}';
    }
}
