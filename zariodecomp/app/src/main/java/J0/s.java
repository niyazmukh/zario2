package J0;

import B3.I1;
import B3.RunnableC0029b;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import k2.InterfaceFutureC0659b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\s.smali */
public abstract class s {
    private Context mAppContext;
    private volatile int mStopReason = -256;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public s(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f4846f;
    }

    public InterfaceFutureC0659b getForegroundInfoAsync() {
        U0.k kVar = new U0.k();
        kVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f4841a;
    }

    public final h getInputData() {
        return this.mWorkerParams.f4842b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f4844d.f206d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f4845e;
    }

    public final int getStopReason() {
        return this.mStopReason;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f4843c;
    }

    public V0.a getTaskExecutor() {
        return this.mWorkerParams.f4847g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f4844d.f204b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f4844d.f205c;
    }

    public E getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public final boolean isStopped() {
        return this.mStopReason != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final InterfaceFutureC0659b setForegroundAsync(j jVar) {
        T0.s sVar = this.mWorkerParams.f4848j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        sVar.getClass();
        U0.k kVar = new U0.k();
        sVar.f3177a.c(new I1(sVar, kVar, id, jVar, applicationContext, 1));
        return kVar;
    }

    public InterfaceFutureC0659b setProgressAsync(h hVar) {
        T0.t tVar = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        tVar.getClass();
        U0.k kVar = new U0.k();
        tVar.f3182b.c(new RunnableC0029b(tVar, id, hVar, kVar, 4));
        return kVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract InterfaceFutureC0659b startWork();

    public final void stop(int i) {
        this.mStopReason = i;
        onStopped();
    }
}
