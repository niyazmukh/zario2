package m3;

import a.AbstractC0183a;
import android.util.Log;
import f4.C;
import s3.J;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m3.1\k.smali */
public final class k extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f8871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, O3.d dVar) {
        super(2, dVar);
        this.f8871b = qVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new k(this.f8871b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8870a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            U2.l lVar = this.f8871b.f8898d;
            this.f8870a = 1;
            obj = lVar.d(true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        long j5 = ((J) obj).f9732d;
        Log.d("InterventionViewModel", "getCurrentUsage() -> totalUsageMs=" + j5 + " (" + (j5 / 60000) + "min)");
        return new Long(j5);
    }
}
