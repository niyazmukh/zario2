package J0;

import a.AbstractC0183a;
import androidx.work.CoroutineWorker;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\f.smali */
public final class f extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public n f2043a;

    /* renamed from: b, reason: collision with root package name */
    public int f2044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f2045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f2046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, CoroutineWorker coroutineWorker, O3.d dVar) {
        super(2, dVar);
        this.f2045c = nVar;
        this.f2046d = coroutineWorker;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new f(this.f2045c, this.f2046d, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        P3.a aVar = P3.a.f2678a;
        int i = this.f2044b;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            n nVar2 = this.f2045c;
            this.f2043a = nVar2;
            this.f2044b = 1;
            Object foregroundInfo = this.f2046d.getForegroundInfo(this);
            if (foregroundInfo == aVar) {
                return aVar;
            }
            obj = foregroundInfo;
            nVar = nVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.f2043a;
            AbstractC0183a.m0(obj);
        }
        nVar.a.j(obj);
        return K3.k.f2288a;
    }
}
