package m0;

import X2.k;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m0.1\b.smali */
public final class C0739b extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC0738a f8826a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0739b(RunnableC0738a runnableC0738a, k kVar) {
        super(kVar);
        this.f8826a = runnableC0738a;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        RunnableC0738a runnableC0738a = this.f8826a;
        try {
            Object obj = get();
            if (runnableC0738a.f8823e.get()) {
                return;
            }
            runnableC0738a.a(obj);
        } catch (InterruptedException e5) {
            Log.w("AsyncTask", e5);
        } catch (CancellationException unused) {
            if (runnableC0738a.f8823e.get()) {
                return;
            }
            runnableC0738a.a(null);
        } catch (ExecutionException e6) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e6.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
