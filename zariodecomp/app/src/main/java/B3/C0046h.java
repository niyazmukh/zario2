package B3;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* renamed from: B3.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\h.1.smali */
public final class C0046h {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f815c = Logger.getLogger(C0046h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final String f816a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f817b;

    public C0046h(long j5) {
        AtomicLong atomicLong = new AtomicLong();
        this.f817b = atomicLong;
        S0.f.g("value must be positive", j5 > 0);
        this.f816a = "keepalive time nanos";
        atomicLong.set(j5);
    }
}
