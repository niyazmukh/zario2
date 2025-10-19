package J;

import java.util.concurrent.ThreadFactory;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J\i.smali */
public final class i implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public String f2009a;

    /* renamed from: b, reason: collision with root package name */
    public int f2010b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new h(runnable, this.f2009a, this.f2010b);
    }
}
