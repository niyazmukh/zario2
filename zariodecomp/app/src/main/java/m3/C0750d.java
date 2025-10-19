package m3;

import K0.r;
import a.AbstractC0183a;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import com.niyaz.zario.worker.UsageMonitoringWorker;
import f4.C;
import u0.AbstractC0953A;

/* renamed from: m3.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m3.1\d.smali */
public final class C0750d extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterventionFragment f8859b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0750d(InterventionFragment interventionFragment, O3.d dVar) {
        super(2, dVar);
        this.f8859b = interventionFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0750d(this.f8859b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0750d) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8858a;
        InterventionFragment interventionFragment = this.f8859b;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            r.b(interventionFragment.S()).a(UsageMonitoringWorker.WORK_NAME);
            e3.o oVar = interventionFragment.f6718h0;
            if (oVar == null) {
                kotlin.jvm.internal.i.i("sessionRepository");
                throw null;
            }
            this.f8858a = 1;
            if (oVar.c(this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        AbstractC0953A.b(S0.f.z(interventionFragment), 2131230786);
        return K3.k.f2288a;
    }
}
