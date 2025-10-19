package B3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
import z3.AbstractC1073B;
import z3.AbstractC1080d;
import z3.AbstractC1081e;
import z3.C1079c;
import z3.C1091o;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\V0.smali */
public final class V0 extends AbstractC1080d {

    /* renamed from: e, reason: collision with root package name */
    public final String f574e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y0 f576g;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f573d = new AtomicReference(Y0.f617m0);

    /* renamed from: f, reason: collision with root package name */
    public final S0 f575f = new S0(this);

    public V0(Y0 y02, String str) {
        this.f576g = y02;
        S0.f.l(str, "authority");
        this.f574e = str;
    }

    @Override // z3.AbstractC1080d
    public final AbstractC1081e n(com.google.android.gms.common.api.internal.F f2, C1079c c1079c) {
        AtomicReference atomicReference = this.f573d;
        Object obj = atomicReference.get();
        J0 j02 = Y0.f617m0;
        if (obj != j02) {
            return s(f2, c1079c);
        }
        Y0 y02 = this.f576g;
        y02.f659p.execute(new T0(this, 2));
        if (atomicReference.get() != j02) {
            return s(f2, c1079c);
        }
        if (y02.f627J.get()) {
            return new L(2);
        }
        U0 u02 = new U0(this, C1091o.b(), f2, c1079c);
        y02.f659p.execute(new I(this, u02));
        return u02;
    }

    public final AbstractC1081e s(com.google.android.gms.common.api.internal.F f2, C1079c c1079c) {
        AbstractC1073B abstractC1073B = (AbstractC1073B) this.f573d.get();
        S0 s02 = this.f575f;
        if (abstractC1073B == null) {
            return s02.n(f2, c1079c);
        }
        if (!(abstractC1073B instanceof C0036d1)) {
            return new O0(abstractC1073B, s02, this.f576g.f654k, f2, c1079c);
        }
        C0039e1 c0039e1 = ((C0036d1) abstractC1073B).f790b;
        c0039e1.getClass();
        C0033c1 c0033c1 = (C0033c1) c0039e1.f796b.get((String) f2.f5569d);
        if (c0033c1 == null) {
            c0033c1 = (C0033c1) c0039e1.f797c.get((String) f2.f5570e);
        }
        if (c0033c1 == null) {
            c0033c1 = c0039e1.f795a;
        }
        if (c0033c1 != null) {
            c1079c = c1079c.c(C0033c1.f771g, c0033c1);
        }
        return s02.n(f2, c1079c);
    }

    public final void t(AbstractC1073B abstractC1073B) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.f573d;
        AbstractC1073B abstractC1073B2 = (AbstractC1073B) atomicReference.get();
        atomicReference.set(abstractC1073B);
        if (abstractC1073B2 != Y0.f617m0 || (linkedHashSet = this.f576g.f623E) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).i();
        }
    }
}
