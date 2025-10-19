package p4;

import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p4\a.smali */
public final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9388a = new a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
