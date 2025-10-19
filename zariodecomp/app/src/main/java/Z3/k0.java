package z3;

import A2.C0020u;
import N2.AbstractC0156x;
import g2.AbstractC0584g;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\k0.smali */
public final class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final List f11347d;

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f11348e;

    /* renamed from: f, reason: collision with root package name */
    public static final k0 f11349f;

    /* renamed from: g, reason: collision with root package name */
    public static final k0 f11350g;
    public static final k0 h;
    public static final k0 i;

    /* renamed from: j, reason: collision with root package name */
    public static final k0 f11351j;

    /* renamed from: k, reason: collision with root package name */
    public static final k0 f11352k;

    /* renamed from: l, reason: collision with root package name */
    public static final k0 f11353l;

    /* renamed from: m, reason: collision with root package name */
    public static final k0 f11354m;

    /* renamed from: n, reason: collision with root package name */
    public static final k0 f11355n;

    /* renamed from: o, reason: collision with root package name */
    public static final Y f11356o;

    /* renamed from: p, reason: collision with root package name */
    public static final Y f11357p;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f11358a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11359b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f11360c;

    static {
        TreeMap treeMap = new TreeMap();
        for (j0 j0Var : j0.values()) {
            k0 k0Var = (k0) treeMap.put(Integer.valueOf(j0Var.f11339a), new k0(j0Var, null, null));
            if (k0Var != null) {
                throw new IllegalStateException("Code value duplication between " + k0Var.f11358a.name() + " & " + j0Var.name());
            }
        }
        f11347d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f11348e = j0.OK.a();
        f11349f = j0.CANCELLED.a();
        f11350g = j0.UNKNOWN.a();
        j0.INVALID_ARGUMENT.a();
        h = j0.DEADLINE_EXCEEDED.a();
        j0.NOT_FOUND.a();
        j0.ALREADY_EXISTS.a();
        i = j0.PERMISSION_DENIED.a();
        f11351j = j0.UNAUTHENTICATED.a();
        f11352k = j0.RESOURCE_EXHAUSTED.a();
        f11353l = j0.FAILED_PRECONDITION.a();
        j0.ABORTED.a();
        j0.OUT_OF_RANGE.a();
        j0.UNIMPLEMENTED.a();
        f11354m = j0.INTERNAL.a();
        f11355n = j0.UNAVAILABLE.a();
        j0.DATA_LOSS.a();
        f11356o = new Y("grpc-status", false, new C1084h(10));
        f11357p = new Y("grpc-message", false, new C1084h(1));
    }

    public k0(j0 j0Var, String str, Throwable th) {
        S0.f.l(j0Var, "code");
        this.f11358a = j0Var;
        this.f11359b = str;
        this.f11360c = th;
    }

    public static String b(k0 k0Var) {
        String str = k0Var.f11359b;
        j0 j0Var = k0Var.f11358a;
        if (str == null) {
            return j0Var.toString();
        }
        return j0Var + ": " + k0Var.f11359b;
    }

    public static k0 c(int i5) {
        if (i5 >= 0) {
            List list = f11347d;
            if (i5 < list.size()) {
                return (k0) list.get(i5);
            }
        }
        return f11350g.g("Unknown code " + i5);
    }

    public static k0 d(Throwable th) {
        S0.f.l(th, "t");
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof l0) {
                return ((l0) cause).f11363a;
            }
            if (cause instanceof m0) {
                return ((m0) cause).f11366a;
            }
        }
        return f11350g.f(th);
    }

    public final k0 a(String str) {
        if (str == null) {
            return this;
        }
        Throwable th = this.f11360c;
        j0 j0Var = this.f11358a;
        String str2 = this.f11359b;
        if (str2 == null) {
            return new k0(j0Var, str, th);
        }
        return new k0(j0Var, str2 + "\n" + str, th);
    }

    public final boolean e() {
        return j0.OK == this.f11358a;
    }

    public final k0 f(Throwable th) {
        return AbstractC0156x.F(this.f11360c, th) ? this : new k0(this.f11358a, this.f11359b, th);
    }

    public final k0 g(String str) {
        return AbstractC0156x.F(this.f11359b, str) ? this : new k0(this.f11358a, str, this.f11360c);
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f11358a.name(), "code");
        c0020uX.a(this.f11359b, "description");
        Throwable th = this.f11360c;
        Object string = th;
        if (th != null) {
            Object obj = AbstractC0584g.f7604a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        c0020uX.a(string, "cause");
        return c0020uX.toString();
    }
}
