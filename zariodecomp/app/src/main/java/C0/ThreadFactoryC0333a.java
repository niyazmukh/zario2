package c0;

import java.util.concurrent.ThreadFactory;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\a.smali */
public final /* synthetic */ class ThreadFactoryC0333a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5346a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f5346a);
        thread.setPriority(10);
        return thread;
    }
}
