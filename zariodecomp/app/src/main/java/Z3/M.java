package z3;

import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\M.smali */
public abstract class M {

    /* renamed from: b, reason: collision with root package name */
    public static final C1077a f11253b = new C1077a("internal:health-checking-config");

    /* renamed from: c, reason: collision with root package name */
    public static final C1084h f11254c = new C1084h(5);

    /* renamed from: d, reason: collision with root package name */
    public static final C1077a f11255d = new C1077a("internal:has-health-check-producer-listener");

    /* renamed from: e, reason: collision with root package name */
    public static final C1077a f11256e = new C1077a("io.grpc.IS_PETIOLE_POLICY");

    /* renamed from: a, reason: collision with root package name */
    public int f11257a;

    public k0 a(J j5) {
        List list = j5.f11250a;
        if (!list.isEmpty() || b()) {
            int i = this.f11257a;
            this.f11257a = i + 1;
            if (i == 0) {
                d(j5);
            }
            this.f11257a = 0;
            return k0.f11348e;
        }
        k0 k0VarG = k0.f11355n.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + j5.f11251b);
        c(k0VarG);
        return k0VarG;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(k0 k0Var);

    public void d(J j5) {
        int i = this.f11257a;
        this.f11257a = i + 1;
        if (i == 0) {
            a(j5);
        }
        this.f11257a = 0;
    }

    public void e() {
    }

    public abstract void f();
}
