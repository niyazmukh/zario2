package androidx.work;

import A3.a;
import B3.N;
import J0.q;
import J0.s;
import U0.k;
import android.content.Context;
import k2.InterfaceFutureC0659b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\Worker.smali */
public abstract class Worker extends s {

    /* renamed from: a, reason: collision with root package name */
    public k f4840a;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract q a();

    @Override // J0.s
    public final InterfaceFutureC0659b getForegroundInfoAsync() {
        k kVar = new k();
        getBackgroundExecutor().execute(new a(5, this, kVar));
        return kVar;
    }

    @Override // J0.s
    public final InterfaceFutureC0659b startWork() {
        this.f4840a = new k();
        getBackgroundExecutor().execute(new N(this, 16));
        return this.f4840a;
    }
}
