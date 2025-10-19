package m3;

import a.AbstractC0183a;
import com.niyaz.zario.worker.UsageMonitoringWorker;
import f4.C;
import i4.InterfaceC0612g;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m3.1\m.smali */
public final class m extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f8874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, O3.d dVar) {
        super(2, dVar);
        this.f8874b = qVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new m(this.f8874b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8873a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            q qVar = this.f8874b;
            InterfaceC0612g interfaceC0612gObserveWorkProgress = qVar.f8899e.observeWorkProgress(UsageMonitoringWorker.WORK_NAME);
            l lVar = new l(qVar);
            this.f8873a = 1;
            if (interfaceC0612gObserveWorkProgress.c(lVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return K3.k.f2288a;
    }
}
