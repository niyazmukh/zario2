package e2;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: e2.C, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\C.smali */
public final class C0451C extends AbstractRunnableC0449A {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6855k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractRunnableC0449A f6856l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0457e f6857m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0451C(C0457e c0457e, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AbstractRunnableC0449A abstractRunnableC0449A) {
        super(taskCompletionSource);
        this.f6857m = c0457e;
        this.f6855k = taskCompletionSource2;
        this.f6856l = abstractRunnableC0449A;
    }

    @Override // e2.AbstractRunnableC0449A
    public final void b() {
        synchronized (this.f6857m.f6871f) {
            try {
                C0457e c0457e = this.f6857m;
                TaskCompletionSource taskCompletionSource = this.f6855k;
                c0457e.f6870e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new S0.l(8, c0457e, taskCompletionSource));
                if (this.f6857m.f6875l.getAndIncrement() > 0) {
                    this.f6857m.f6867b.b("Already connected to the service.", new Object[0]);
                }
                C0457e.b(this.f6857m, this.f6856l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
