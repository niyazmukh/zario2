package A2;

import java.util.concurrent.TimeUnit;

/* renamed from: A2.y, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\y.1.smali */
public final class C0024y {

    /* renamed from: c, reason: collision with root package name */
    public static final long f258c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f259d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f260a;

    /* renamed from: b, reason: collision with root package name */
    public final C0021v f261b;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f258c = timeUnit.toMillis(1L);
        f259d = timeUnit.toMillis(5L);
    }

    public C0024y(Q q5, C0021v c0021v) {
        this.f260a = q5;
        this.f261b = c0021v;
    }
}
