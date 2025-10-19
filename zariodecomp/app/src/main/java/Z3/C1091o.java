package z3;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: z3.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\o.1.smali */
public class C1091o {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f11372a = Logger.getLogger(C1091o.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final C1091o f11373b = new C1091o();

    public static C1091o b() {
        ((q0) AbstractC1089m.f11365a).getClass();
        C1091o c1091o = (C1091o) q0.f11390b.get();
        C1091o c1091o2 = f11373b;
        if (c1091o == null) {
            c1091o = c1091o2;
        }
        return c1091o == null ? c1091o2 : c1091o;
    }

    public final C1091o a() {
        ((q0) AbstractC1089m.f11365a).getClass();
        ThreadLocal threadLocal = q0.f11390b;
        C1091o c1091o = (C1091o) threadLocal.get();
        C1091o c1091o2 = f11373b;
        if (c1091o == null) {
            c1091o = c1091o2;
        }
        threadLocal.set(this);
        return c1091o == null ? c1091o2 : c1091o;
    }

    public final void c(C1091o c1091o) {
        if (c1091o == null) {
            throw new NullPointerException("toAttach");
        }
        ((q0) AbstractC1089m.f11365a).getClass();
        ThreadLocal threadLocal = q0.f11390b;
        C1091o c1091o2 = (C1091o) threadLocal.get();
        C1091o c1091o3 = f11373b;
        if (c1091o2 == null) {
            c1091o2 = c1091o3;
        }
        if (c1091o2 != this) {
            q0.f11389a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c1091o != c1091o3) {
            threadLocal.set(c1091o);
        } else {
            threadLocal.set(null);
        }
    }
}
