package J0;

import a.AbstractC0183a;
import androidx.work.CoroutineWorker;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\g.smali */
public final class g extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f2047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f2048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CoroutineWorker coroutineWorker, O3.d dVar) {
        super(2, dVar);
        this.f2048b = coroutineWorker;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new g(this.f2048b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f2047a;
        CoroutineWorker coroutineWorker = this.f2048b;
        try {
            if (i == 0) {
                AbstractC0183a.m0(obj);
                this.f2047a = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0183a.m0(obj);
            }
            coroutineWorker.getFuture$work_runtime_release().j((r) obj);
        } catch (Throwable th) {
            coroutineWorker.getFuture$work_runtime_release().k(th);
        }
        return K3.k.f2288a;
    }
}
