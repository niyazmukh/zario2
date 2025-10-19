package T0;

import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\o.smali */
public final class o implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3166a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3166a) {
            case 0:
                runnable.run();
                break;
            default:
                new Thread(runnable).start();
                break;
        }
    }
}
