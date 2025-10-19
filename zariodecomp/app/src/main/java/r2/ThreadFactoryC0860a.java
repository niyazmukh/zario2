package r2;

import A2.RunnableC0012l;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r2.1\a.smali */
public final class ThreadFactoryC0860a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f9608e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f9609a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f9610b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9611c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f9612d;

    public ThreadFactoryC0860a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f9610b = str;
        this.f9611c = i;
        this.f9612d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f9608e.newThread(new RunnableC0012l(22, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f9610b + " Thread #" + this.f9609a.getAndIncrement());
        return threadNewThread;
    }
}
