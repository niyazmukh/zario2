package androidx.work.impl.workers;

import A2.RunnableC0005e;
import J0.s;
import J0.t;
import O0.b;
import O0.c;
import O0.e;
import S0.q;
import U0.k;
import W0.a;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import k2.InterfaceFutureC0659b;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\impl\workers\ConstraintTrackingWorker.smali */
public final class ConstraintTrackingWorker extends s implements e {

    /* renamed from: a, reason: collision with root package name */
    public final WorkerParameters f4873a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4874b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f4875c;

    /* renamed from: d, reason: collision with root package name */
    public final k f4876d;

    /* renamed from: e, reason: collision with root package name */
    public s f4877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        i.e(appContext, "appContext");
        i.e(workerParameters, "workerParameters");
        this.f4873a = workerParameters;
        this.f4874b = new Object();
        this.f4876d = new k();
    }

    @Override // O0.e
    public final void b(q qVar, c state) {
        i.e(state, "state");
        t.d().a(a.f3690a, "Constraints changed for " + qVar);
        if (state instanceof b) {
            synchronized (this.f4874b) {
                this.f4875c = true;
            }
        }
    }

    @Override // J0.s
    public final void onStopped() {
        s sVar = this.f4877e;
        if (sVar == null || sVar.isStopped()) {
            return;
        }
        sVar.stop(Build.VERSION.SDK_INT >= 31 ? getStopReason() : 0);
    }

    @Override // J0.s
    public final InterfaceFutureC0659b startWork() {
        getBackgroundExecutor().execute(new RunnableC0005e(this, 13));
        k future = this.f4876d;
        i.d(future, "future");
        return future;
    }
}
