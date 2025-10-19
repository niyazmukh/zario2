package androidx.work;

import A2.RunnableC0005e;
import J0.g;
import J0.h;
import J0.j;
import J0.n;
import J0.s;
import O3.d;
import S0.f;
import T0.m;
import U0.a;
import U0.k;
import android.content.Context;
import f4.A;
import f4.C0510i0;
import f4.C0516n;
import f4.E;
import f4.InterfaceC0522v;
import f4.N;
import f4.t0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k2.InterfaceFutureC0659b;
import k4.c;
import kotlin.jvm.internal.i;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\CoroutineWorker.smali */
public abstract class CoroutineWorker extends s {
    private final A coroutineContext;
    private final k future;
    private final InterfaceC0522v job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        i.e(appContext, "appContext");
        i.e(params, "params");
        this.job = E.c();
        k kVar = new k();
        this.future = kVar;
        kVar.a(new RunnableC0005e(this, 11), (m) ((S0.i) getTaskExecutor()).f2858a);
        this.coroutineContext = N.f7027a;
    }

    public static void a(CoroutineWorker this$0) {
        i.e(this$0, "this$0");
        if (this$0.future.f3290a instanceof a) {
            ((t0) this$0.job).cancel((CancellationException) null);
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(d dVar);

    public A getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(d dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // J0.s
    public final InterfaceFutureC0659b getForegroundInfoAsync() {
        C0510i0 c0510i0C = E.c();
        A coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        c cVarB = E.b(f.U(coroutineContext, c0510i0C));
        n nVar = new n(c0510i0C);
        E.t(cVarB, null, null, new J0.f(nVar, this, null), 3);
        return nVar;
    }

    public final k getFuture$work_runtime_release() {
        return this.future;
    }

    public final InterfaceC0522v getJob$work_runtime_release() {
        return this.job;
    }

    @Override // J0.s
    public final void onStopped() {
        this.future.cancel(false);
    }

    public final Object setForeground(j jVar, d dVar) throws Throwable {
        InterfaceFutureC0659b foregroundAsync = setForegroundAsync(jVar);
        i.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e5) {
                Throwable cause = e5.getCause();
                if (cause == null) {
                    throw e5;
                }
                throw cause;
            }
        } else {
            C0516n c0516n = new C0516n(1, b.x(dVar));
            c0516n.s();
            foregroundAsync.a(new A3.a(4, c0516n, foregroundAsync, false), J0.i.f2052a);
            c0516n.u(new J0.m(foregroundAsync, 1));
            Object objR = c0516n.r();
            if (objR == P3.a.f2678a) {
                return objR;
            }
        }
        return K3.k.f2288a;
    }

    public final Object setProgress(h hVar, d dVar) throws Throwable {
        InterfaceFutureC0659b progressAsync = setProgressAsync(hVar);
        i.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e5) {
                Throwable cause = e5.getCause();
                if (cause == null) {
                    throw e5;
                }
                throw cause;
            }
        } else {
            C0516n c0516n = new C0516n(1, b.x(dVar));
            c0516n.s();
            progressAsync.a(new A3.a(4, c0516n, progressAsync, false), J0.i.f2052a);
            c0516n.u(new J0.m(progressAsync, 1));
            Object objR = c0516n.r();
            if (objR == P3.a.f2678a) {
                return objR;
            }
        }
        return K3.k.f2288a;
    }

    @Override // J0.s
    public final InterfaceFutureC0659b startWork() {
        A coroutineContext = getCoroutineContext();
        InterfaceC0522v interfaceC0522v = this.job;
        coroutineContext.getClass();
        E.t(E.b(f.U(coroutineContext, interfaceC0522v)), null, null, new g(this, null), 3);
        return this.future;
    }
}
