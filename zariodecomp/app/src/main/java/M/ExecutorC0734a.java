package m;

import java.util.concurrent.Executor;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m.1\a.smali */
public final /* synthetic */ class ExecutorC0734a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8807a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f8807a) {
            case 0:
                C0735b.q0().f8810a.f8814b.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
