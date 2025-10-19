package l2;

import E2.G;
import f4.E;
import java.util.concurrent.Executor;
import m2.InterfaceC0744a;
import m2.InterfaceC0745c;
import m2.InterfaceC0746d;
import q2.q;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l2\g.smali */
public final class g implements q2.d {

    /* renamed from: b, reason: collision with root package name */
    public static final g f8778b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f8779c = new g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final g f8780d = new g(2);

    /* renamed from: e, reason: collision with root package name */
    public static final g f8781e = new g(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8782a;

    public /* synthetic */ g(int i) {
        this.f8782a = i;
    }

    public static final void b(int i, long j5) {
        if (i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(B.a.g(i, "Timestamp nanoseconds out of range: ").toString());
        }
        if (-62135596800L > j5 || j5 >= 253402300800L) {
            throw new IllegalArgumentException(("Timestamp seconds out of range: " + j5).toString());
        }
    }

    @Override // q2.d
    public Object a(G g3) {
        switch (this.f8782a) {
            case 0:
                Object objC = g3.c(new q(InterfaceC0744a.class, Executor.class));
                kotlin.jvm.internal.i.d(objC, "get(...)");
                return E.k((Executor) objC);
            case 1:
                Object objC2 = g3.c(new q(InterfaceC0745c.class, Executor.class));
                kotlin.jvm.internal.i.d(objC2, "get(...)");
                return E.k((Executor) objC2);
            case 2:
                Object objC3 = g3.c(new q(m2.b.class, Executor.class));
                kotlin.jvm.internal.i.d(objC3, "get(...)");
                return E.k((Executor) objC3);
            default:
                Object objC4 = g3.c(new q(InterfaceC0746d.class, Executor.class));
                kotlin.jvm.internal.i.d(objC4, "get(...)");
                return E.k((Executor) objC4);
        }
    }
}
