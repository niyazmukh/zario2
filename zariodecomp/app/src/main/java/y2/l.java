package y2;

import A2.C0017q;
import A2.RunnableC0005e;
import A2.T;
import B3.C0063m1;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\l.smali */
public final /* synthetic */ class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f11113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0017q f11114b;

    public /* synthetic */ l(o oVar, C0017q c0017q) {
        this.f11113a = oVar;
        this.f11114b = c0017q;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        o oVar = this.f11113a;
        X2.o oVar2 = oVar.f11127e;
        oVar2.getClass();
        T t4 = new T();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        t4.f138f = taskCompletionSource;
        F2.f fVar = oVar.f11126d;
        t4.f133a = fVar;
        t4.f136d = (C0063m1) oVar2.f3848b;
        t4.f137e = this.f11114b;
        t4.f135c = 5;
        F2.p pVar = new F2.p(fVar, F2.e.f1700l, 1000L, 60000L);
        t4.f134b = pVar;
        t4.f135c--;
        pVar.a(new RunnableC0005e(t4, 28));
        return taskCompletionSource.getTask();
    }
}
