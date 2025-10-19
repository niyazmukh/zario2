package k2;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k2.1\c.smali */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f8301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f8303c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f8304d;

    public c(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f8301a = threadFactory;
        this.f8302b = str;
        this.f8303c = atomicLong;
        this.f8304d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f8301a.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        String str = this.f8302b;
        if (str != null) {
            AtomicLong atomicLong = this.f8303c;
            Objects.requireNonNull(atomicLong);
            threadNewThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.f8304d;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        return threadNewThread;
    }
}
