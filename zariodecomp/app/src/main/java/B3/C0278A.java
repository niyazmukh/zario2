package b3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;

/* renamed from: b3.A, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\A.smali */
public final class C0278A extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f5119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0278A(kotlin.jvm.internal.r rVar, O3.d dVar) {
        super(1, dVar);
        this.f5119b = rVar;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0278A(this.f5119b, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0278A) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Exception {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5118a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            Task taskA = ((w2.x) this.f5119b.f8431a).a();
            kotlin.jvm.internal.i.d(taskA, "get(...)");
            this.f5118a = 1;
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
