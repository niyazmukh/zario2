package B3;

import java.util.concurrent.atomic.AtomicBoolean;
import z3.AbstractC1083g;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\m2.smali */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1083g[] f910a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f911b = new AtomicBoolean(false);

    static {
        new m2(new AbstractC1083g[0]);
    }

    public m2(AbstractC1083g[] abstractC1083gArr) {
        this.f910a = abstractC1083gArr;
    }

    public final void a(long j5) {
        for (AbstractC1083g abstractC1083g : this.f910a) {
            abstractC1083g.g(j5);
        }
    }
}
