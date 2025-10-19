package B3;

import java.util.logging.Level;
import z3.C1088l;
import z3.EnumC1087k;

/* renamed from: B3.p1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\p1.1.smali */
public final class C0071p1 implements z3.L {

    /* renamed from: a, reason: collision with root package name */
    public C1088l f941a = C1088l.a(EnumC1087k.f11344d);

    /* renamed from: b, reason: collision with root package name */
    public C0078s1 f942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0081t1 f943c;

    public C0071p1(C0081t1 c0081t1) {
        this.f943c = c0081t1;
    }

    @Override // z3.L
    public final void a(C1088l c1088l) {
        C0081t1.f976o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{c1088l, this.f942b.f966a});
        this.f941a = c1088l;
        C0081t1 c0081t1 = this.f943c;
        if (c0081t1.h.c() && ((C0078s1) c0081t1.f978g.get(c0081t1.h.a())).f968c == this) {
            c0081t1.j(this.f942b);
        }
    }
}
