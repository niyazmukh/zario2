package T0;

import A2.RunnableC0012l;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\m.smali */
public final class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3157a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3158b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f3159c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f3160d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f3161e;

    public m(Executor executor) {
        this.f3157a = 2;
        kotlin.jvm.internal.i.e(executor, "executor");
        this.f3161e = executor;
        this.f3159c = new ArrayDeque();
        this.f3158b = new Object();
    }

    public final void a() {
        switch (this.f3157a) {
            case 0:
                Runnable runnable = (Runnable) this.f3159c.poll();
                this.f3160d = runnable;
                if (runnable != null) {
                    ((ExecutorService) this.f3161e).execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.f3158b) {
                    try {
                        Runnable runnable2 = (Runnable) this.f3159c.poll();
                        this.f3160d = runnable2;
                        if (runnable2 != null) {
                            ((o) this.f3161e).execute(runnable2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.f3158b) {
                    Object objPoll = this.f3159c.poll();
                    Runnable runnable3 = (Runnable) objPoll;
                    this.f3160d = runnable3;
                    if (objPoll != null) {
                        this.f3161e.execute(runnable3);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f3157a) {
            case 0:
                synchronized (this.f3158b) {
                    try {
                        this.f3159c.add(new A3.a(11, this, command, false));
                        if (this.f3160d == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                synchronized (this.f3158b) {
                    try {
                        this.f3159c.add(new RunnableC0012l(17, this, command));
                        if (this.f3160d == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                kotlin.jvm.internal.i.e(command, "command");
                synchronized (this.f3158b) {
                    this.f3159c.offer(new RunnableC0012l(24, command, this));
                    if (this.f3160d == null) {
                        a();
                    }
                }
                return;
        }
    }

    public m(ExecutorService executorService) {
        this.f3157a = 0;
        this.f3161e = executorService;
        this.f3159c = new ArrayDeque();
        this.f3158b = new Object();
    }

    public m(o oVar) {
        this.f3157a = 1;
        this.f3158b = new Object();
        this.f3159c = new ArrayDeque();
        this.f3161e = oVar;
    }
}
