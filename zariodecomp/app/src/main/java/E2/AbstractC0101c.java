package E2;

import A2.C0009i;
import A2.C0011k;
import A2.C0017q;
import B3.C0043g;
import B3.N;
import C.d;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.AbstractC0388a;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import z3.AbstractC1081e;
import z3.j0;
import z3.k0;

/* renamed from: E2.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\c.1.smali */
public abstract class AbstractC0101c {

    /* renamed from: m, reason: collision with root package name */
    public static final long f1430m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f1431n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f1432o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f1433p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f1434q;

    /* renamed from: a, reason: collision with root package name */
    public C0009i f1435a;

    /* renamed from: b, reason: collision with root package name */
    public C0009i f1436b;

    /* renamed from: c, reason: collision with root package name */
    public final q f1437c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.F f1438d;

    /* renamed from: f, reason: collision with root package name */
    public final F2.f f1440f;

    /* renamed from: g, reason: collision with root package name */
    public final F2.e f1441g;

    /* renamed from: j, reason: collision with root package name */
    public o f1442j;

    /* renamed from: k, reason: collision with root package name */
    public final F2.p f1443k;

    /* renamed from: l, reason: collision with root package name */
    public final y f1444l;
    public x h = x.f1508a;
    public long i = 0;

    /* renamed from: e, reason: collision with root package name */
    public final N f1439e = new N(this, 14);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f1430m = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f1431n = timeUnit2.toMillis(1L);
        f1432o = timeUnit2.toMillis(1L);
        f1433p = timeUnit.toMillis(10L);
        f1434q = timeUnit.toMillis(10L);
    }

    public AbstractC0101c(q qVar, com.google.android.gms.common.api.internal.F f2, F2.f fVar, F2.e eVar, F2.e eVar2, y yVar) {
        this.f1437c = qVar;
        this.f1438d = f2;
        this.f1440f = fVar;
        this.f1441g = eVar2;
        this.f1444l = yVar;
        this.f1443k = new F2.p(fVar, eVar, f1430m, f1431n);
    }

    public final void a(x xVar, k0 k0Var) {
        AbstractC0183a.N(d(), "Only started streams should be closed.", new Object[0]);
        x xVar2 = x.f1512e;
        AbstractC0183a.N(xVar == xVar2 || k0Var.e(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f1440f.d();
        HashSet hashSet = C0106i.f1454d;
        j0 j0Var = k0Var.f11358a;
        Throwable th = k0Var.f11360c;
        if (th instanceof SSLHandshakeException) {
            th.getMessage().contains("no ciphers available");
        }
        C0009i c0009i = this.f1436b;
        if (c0009i != null) {
            c0009i.w();
            this.f1436b = null;
        }
        C0009i c0009i2 = this.f1435a;
        if (c0009i2 != null) {
            c0009i2.w();
            this.f1435a = null;
        }
        F2.p pVar = this.f1443k;
        C0009i c0009i3 = pVar.h;
        if (c0009i3 != null) {
            c0009i3.w();
            pVar.h = null;
        }
        this.i++;
        j0 j0Var2 = j0.OK;
        j0 j0Var3 = k0Var.f11358a;
        if (j0Var3 == j0Var2) {
            pVar.f1732f = 0L;
        } else if (j0Var3 == j0.RESOURCE_EXHAUSTED) {
            p1.b.p(1, getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            pVar.f1732f = pVar.f1731e;
        } else if (j0Var3 == j0.UNAUTHENTICATED && this.h != x.f1511d) {
            q qVar = this.f1437c;
            qVar.f1483b.j();
            synchronized (qVar.f1484c) {
            }
        } else if (j0Var3 == j0.UNAVAILABLE) {
            Throwable th2 = k0Var.f11360c;
            if ((th2 instanceof UnknownHostException) || (th2 instanceof ConnectException)) {
                pVar.f1731e = f1434q;
            }
        }
        if (xVar != xVar2) {
            p1.b.p(1, getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            h();
        }
        if (this.f1442j != null) {
            if (k0Var.e()) {
                p1.b.p(1, getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                try {
                    this.f1442j.b();
                } catch (IllegalStateException e5) {
                    p1.b.p(1, getClass().getSimpleName(), "(%x) Closing stream client-side result in exception: [%s]", Integer.valueOf(System.identityHashCode(this)), e5);
                }
            }
            this.f1442j = null;
        }
        this.h = xVar;
        this.f1444l.b(k0Var);
    }

    public final void b() {
        AbstractC0183a.N(!d(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f1440f.d();
        this.h = x.f1508a;
        this.f1443k.f1732f = 0L;
    }

    public final boolean c() {
        this.f1440f.d();
        x xVar = this.h;
        return xVar == x.f1510c || xVar == x.f1511d;
    }

    public final boolean d() {
        this.f1440f.d();
        x xVar = this.h;
        return xVar == x.f1509b || xVar == x.f1513f || c();
    }

    public abstract void e(AbstractC0388a abstractC0388a);

    public abstract void f(AbstractC0388a abstractC0388a);

    public void g() {
        this.f1440f.d();
        AbstractC0183a.N(this.f1442j == null, "Last call still set", new Object[0]);
        AbstractC0183a.N(this.f1436b == null, "Idle timer still set", new Object[0]);
        x xVar = this.h;
        x xVar2 = x.f1512e;
        if (xVar == xVar2) {
            AbstractC0183a.N(xVar == xVar2, "Should only perform backoff in an error state", new Object[0]);
            this.h = x.f1513f;
            this.f1443k.a(new RunnableC0100a(this, 0));
            return;
        }
        AbstractC0183a.N(xVar == x.f1508a, "Already started", new Object[0]);
        d dVar = new d(this, new C0043g(this, this.i, 1));
        AbstractC1081e[] abstractC1081eArr = {null};
        q qVar = this.f1437c;
        t tVar = qVar.f1485d;
        Task taskContinueWithTask = tVar.f1493a.continueWithTask(tVar.f1494b.f1704a, new C0011k(3, tVar, this.f1438d));
        taskContinueWithTask.addOnCompleteListener(qVar.f1482a.f1704a, new C0017q(qVar, abstractC1081eArr, dVar, 3));
        this.f1442j = new o(qVar, abstractC1081eArr, taskContinueWithTask);
        this.h = x.f1509b;
    }

    public void h() {
    }

    public final void i(com.google.protobuf.E e5) {
        this.f1440f.d();
        p1.b.p(1, getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), e5);
        C0009i c0009i = this.f1436b;
        if (c0009i != null) {
            c0009i.w();
            this.f1436b = null;
        }
        this.f1442j.d(e5);
    }
}
