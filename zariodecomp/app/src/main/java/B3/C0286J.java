package b3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;

/* renamed from: b3.J, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\J.smali */
public final class C0286J extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0294S f5152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5153c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0286J(C0294S c0294s, String str, int i, O3.d dVar) {
        super(1, dVar);
        this.f5152b = c0294s;
        this.f5153c = str;
        this.f5154d = i;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0286J(this.f5152b, this.f5153c, this.f5154d, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0286J) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Exception {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5151a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            Task taskC = this.f5152b.f(this.f5153c).c(L3.x.b0(new K3.e("goalSuccessStreak", new Integer(this.f5154d))), w2.B.f10913b);
            kotlin.jvm.internal.i.d(taskC, "set(...)");
            this.f5151a = 1;
            obj = AbstractC0156x.e(taskC, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return obj;
    }
}
