package b3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;
import w2.C1025b;

/* renamed from: b3.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\z.1.smali */
public final class C0331z extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.h f5337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0331z(w2.h hVar, O3.d dVar) {
        super(1, dVar);
        this.f5337b = hVar;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0331z(this.f5337b, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0331z) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Exception {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5336a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            w2.h hVar = this.f5337b;
            B2.h hVar2 = hVar.f10932b;
            hVar2.getClass();
            Task taskA = new C1025b((B2.n) hVar2.f315a.a(B2.n.l("hourly_usage")), hVar.f10931a).a();
            kotlin.jvm.internal.i.d(taskA, "get(...)");
            this.f5336a = 1;
            obj = AbstractC0156x.e(taskA, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return ((w2.z) obj).f();
    }
}
