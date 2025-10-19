package B3;

import A2.C0020u;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import z3.AbstractC1080d;
import z3.C1072A;
import z3.C1075D;
import z3.C1078b;
import z3.C1088l;
import z3.C1094s;
import z3.C1099x;
import z3.EnumC1087k;
import z3.InterfaceC1074C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\A0.smali */
public final class A0 implements InterfaceC1074C {

    /* renamed from: a, reason: collision with root package name */
    public final C1075D f349a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350b;

    /* renamed from: c, reason: collision with root package name */
    public final o2 f351c;

    /* renamed from: d, reason: collision with root package name */
    public final q2 f352d;

    /* renamed from: e, reason: collision with root package name */
    public final C0066o f353e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f354f;

    /* renamed from: g, reason: collision with root package name */
    public final C1072A f355g;
    public final S0.i h;
    public final AbstractC1080d i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f356j;

    /* renamed from: k, reason: collision with root package name */
    public final z3.p0 f357k;

    /* renamed from: l, reason: collision with root package name */
    public final C0092x0 f358l;

    /* renamed from: m, reason: collision with root package name */
    public volatile List f359m;

    /* renamed from: n, reason: collision with root package name */
    public C0032c0 f360n;

    /* renamed from: o, reason: collision with root package name */
    public final Q1 f361o;

    /* renamed from: p, reason: collision with root package name */
    public S0.l f362p;

    /* renamed from: q, reason: collision with root package name */
    public S0.l f363q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0045g1 f364r;

    /* renamed from: u, reason: collision with root package name */
    public C0089w0 f367u;

    /* renamed from: v, reason: collision with root package name */
    public volatile E f368v;

    /* renamed from: x, reason: collision with root package name */
    public z3.k0 f370x;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f365s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final C0075r0 f366t = new C0075r0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public volatile C1088l f369w = C1088l.a(EnumC1087k.f11344d);

    public A0(List list, String str, o2 o2Var, C0066o c0066o, ScheduledExecutorService scheduledExecutorService, o2 o2Var2, z3.p0 p0Var, q2 q2Var, C1072A c1072a, S0.i iVar, r rVar, C1075D c1075d, AbstractC1080d abstractC1080d, ArrayList arrayList) {
        S0.f.l(list, "addressGroups");
        S0.f.g("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S0.f.l(it.next(), "addressGroups contains null entry");
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f359m = listUnmodifiableList;
        C0092x0 c0092x0 = new C0092x0();
        c0092x0.f1017a = listUnmodifiableList;
        this.f358l = c0092x0;
        this.f350b = str;
        this.f351c = o2Var;
        this.f353e = c0066o;
        this.f354f = scheduledExecutorService;
        o2Var2.getClass();
        this.f361o = new Q1(2);
        this.f357k = p0Var;
        this.f352d = q2Var;
        this.f355g = c1072a;
        this.h = iVar;
        S0.f.l(rVar, "channelTracer");
        S0.f.l(c1075d, "logId");
        this.f349a = c1075d;
        S0.f.l(abstractC1080d, "channelLogger");
        this.i = abstractC1080d;
        this.f356j = arrayList;
    }

    public static void g(A0 a02, EnumC1087k enumC1087k) {
        a02.f357k.d();
        a02.i(C1088l.a(enumC1087k));
    }

    public static void h(A0 a02) {
        SocketAddress socketAddress;
        C1099x c1099x;
        z3.p0 p0Var = a02.f357k;
        p0Var.d();
        S0.f.q("Should have no reconnectTask scheduled", a02.f362p == null);
        C0092x0 c0092x0 = a02.f358l;
        if (c0092x0.f1018b == 0 && c0092x0.f1019c == 0) {
            Q1 q12 = a02.f361o;
            q12.f521b = false;
            q12.b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((C1094s) c0092x0.f1017a.get(c0092x0.f1018b)).f11399a.get(c0092x0.f1019c);
        if (socketAddress2 instanceof C1099x) {
            c1099x = (C1099x) socketAddress2;
            socketAddress = c1099x.f11404b;
        } else {
            socketAddress = socketAddress2;
            c1099x = null;
        }
        C1078b c1078b = ((C1094s) c0092x0.f1017a.get(c0092x0.f1018b)).f11400b;
        String str = (String) c1078b.f11280a.get(C1094s.f11398d);
        B b5 = new B();
        b5.f377a = "unknown-authority";
        b5.f378b = C1078b.f11279b;
        if (str == null) {
            str = a02.f350b;
        }
        S0.f.l(str, "authority");
        b5.f377a = str;
        b5.f378b = c1078b;
        b5.f379c = c1099x;
        C0098z0 c0098z0 = new C0098z0();
        c0098z0.f1030d = a02.f349a;
        C0066o c0066o = a02.f353e;
        C3.f fVar = c0066o.f924a;
        if (fVar.f1147r) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        C0046h c0046h = fVar.f1143n;
        long j5 = c0046h.f817b.get();
        C3.m mVar = new C3.m(fVar, (InetSocketAddress) socketAddress, b5.f377a, b5.f378b, b5.f379c, new N(new C0043g(c0046h, j5, 0), 12));
        if (fVar.f1142m) {
            mVar.G = true;
            mVar.f1198H = j5;
            mVar.f1199I = fVar.f1144o;
        }
        C0089w0 c0089w0 = new C0089w0(new C0064n(c0066o, mVar, b5.f377a), a02.h);
        c0098z0.f1030d = c0089w0.c();
        a02.f367u = c0089w0;
        a02.f365s.add(c0089w0);
        A2.G g3 = new A2.G();
        g3.f88c = a02;
        g3.f86a = false;
        g3.f87b = c0089w0;
        Runnable runnableA = c0089w0.a(g3);
        if (runnableA != null) {
            p0Var.b(runnableA);
        }
        a02.i.m(2, "Started transport {0}", c0098z0.f1030d);
    }

    public static String j(z3.k0 k0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(k0Var.f11358a);
        String str = k0Var.f11359b;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        Throwable th = k0Var.f11360c;
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // z3.InterfaceC1074C
    public final C1075D c() {
        return this.f349a;
    }

    public final void i(C1088l c1088l) {
        this.f357k.d();
        if (this.f369w.f11361a != c1088l.f11361a) {
            S0.f.q("Cannot transition out of SHUTDOWN to " + c1088l, this.f369w.f11361a != EnumC1087k.f11345e);
            this.f369w = c1088l;
            ((z3.L) this.f352d.f952b).a(c1088l);
        }
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.b("logId", this.f349a.f11236c);
        c0020uX.a(this.f359m, "addressGroups");
        return c0020uX.toString();
    }
}
