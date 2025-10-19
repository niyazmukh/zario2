package F2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\b.smali */
public final class b extends ScheduledThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1686a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, c cVar) {
        super(1, cVar);
        this.f1686a = dVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) throws ExecutionException, InterruptedException {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            try {
                if (future.isDone()) {
                    future.get();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException unused2) {
            } catch (ExecutionException e5) {
                th = e5.getCause();
            }
        }
        if (th != null) {
            this.f1686a.f1692c.c(th);
        }
    }
}
