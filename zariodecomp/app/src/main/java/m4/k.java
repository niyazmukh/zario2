package m4;

import java.util.concurrent.TimeUnit;
import k4.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m4\k.smali */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8936a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f8937b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8938c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8939d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f8940e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f8941f;

    static {
        String property;
        int i = u.f8410a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f8936a = property;
        f8937b = k4.a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i5 = u.f8410a;
        if (i5 < 2) {
            i5 = 2;
        }
        f8938c = k4.a.l("kotlinx.coroutines.scheduler.core.pool.size", i5, 1, 0, 8);
        f8939d = k4.a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f8940e = TimeUnit.SECONDS.toNanos(k4.a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f8941f = g.f8931a;
    }
}
