package B3;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\l2.smali */
public final class l2 {

    /* renamed from: d, reason: collision with root package name */
    public static final l2 f889d = new l2(new o2(17));

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f890a = new IdentityHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final o2 f891b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledExecutorService f892c;

    public l2(o2 o2Var) {
        this.f891b = o2Var;
    }

    public static Object a(k2 k2Var) {
        Object obj;
        l2 l2Var = f889d;
        synchronized (l2Var) {
            try {
                j2 j2Var = (j2) l2Var.f890a.get(k2Var);
                if (j2Var == null) {
                    j2Var = new j2(k2Var.e());
                    l2Var.f890a.put(k2Var, j2Var);
                }
                ScheduledFuture scheduledFuture = j2Var.f857c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    j2Var.f857c = null;
                }
                j2Var.f856b++;
                obj = j2Var.f855a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static void b(k2 k2Var, Object obj) {
        l2 l2Var = f889d;
        synchronized (l2Var) {
            try {
                j2 j2Var = (j2) l2Var.f890a.get(k2Var);
                if (j2Var == null) {
                    throw new IllegalArgumentException("No cached instance found for " + k2Var);
                }
                S0.f.g("Releasing the wrong instance", obj == j2Var.f855a);
                S0.f.q("Refcount has already reached zero", j2Var.f856b > 0);
                int i = j2Var.f856b - 1;
                j2Var.f856b = i;
                if (i == 0) {
                    S0.f.q("Destroy task already scheduled", j2Var.f857c == null);
                    if (l2Var.f892c == null) {
                        l2Var.f891b.getClass();
                        l2Var.f892c = Executors.newSingleThreadScheduledExecutor(AbstractC0056k0.e("grpc-shared-destroyer-%d"));
                    }
                    j2Var.f857c = l2Var.f892c.schedule(new H0(new RunnableC0029b(l2Var, j2Var, k2Var, obj, 3)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
