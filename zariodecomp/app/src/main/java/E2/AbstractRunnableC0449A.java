package e2;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: e2.A, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\A.smali */
public abstract class AbstractRunnableC0449A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f6853a;

    public AbstractRunnableC0449A() {
        this.f6853a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f6853a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f6853a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e5) {
            a(e5);
        }
    }

    public AbstractRunnableC0449A(TaskCompletionSource taskCompletionSource) {
        this.f6853a = taskCompletionSource;
    }
}
