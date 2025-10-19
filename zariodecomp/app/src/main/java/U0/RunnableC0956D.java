package u0;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: u0.D, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\D.smali */
public final /* synthetic */ class RunnableC0956D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0957E f10372b;

    public /* synthetic */ RunnableC0956D(C0957E c0957e, int i) {
        this.f10371a = i;
        this.f10372b = c0957e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        boolean z4;
        Executor executor;
        switch (this.f10371a) {
            case 0:
                C0957E this$0 = this.f10372b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (this$0.f10380s.compareAndSet(false, true)) {
                    s sVar = this$0.f10373l.f10463e;
                    sVar.getClass();
                    C0962c observer = this$0.f10377p;
                    kotlin.jvm.internal.i.e(observer, "observer");
                    sVar.a(new r(sVar, observer));
                }
                do {
                    AtomicBoolean atomicBoolean2 = this$0.f10379r;
                    boolean zCompareAndSet = atomicBoolean2.compareAndSet(false, true);
                    atomicBoolean = this$0.f10378q;
                    if (zCompareAndSet) {
                        Object objCall = null;
                        z4 = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                try {
                                    objCall = this$0.f10376o.call();
                                    z4 = true;
                                } catch (Exception e5) {
                                    throw new RuntimeException("Exception while computing database live data.", e5);
                                }
                            } finally {
                                atomicBoolean2.set(false);
                            }
                        }
                        if (z4) {
                            this$0.h(objCall);
                        }
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            default:
                C0957E this$02 = this.f10372b;
                kotlin.jvm.internal.i.e(this$02, "this$0");
                boolean z5 = this$02.f4579c > 0;
                if (this$02.f10378q.compareAndSet(false, true) && z5) {
                    boolean z6 = this$02.f10375n;
                    x xVar = this$02.f10373l;
                    if (z6) {
                        executor = xVar.f10461c;
                        if (executor == null) {
                            kotlin.jvm.internal.i.i("internalTransactionExecutor");
                            throw null;
                        }
                    } else {
                        executor = xVar.f10460b;
                        if (executor == null) {
                            kotlin.jvm.internal.i.i("internalQueryExecutor");
                            throw null;
                        }
                    }
                    executor.execute(this$02.f10381t);
                    return;
                }
                return;
        }
    }
}
