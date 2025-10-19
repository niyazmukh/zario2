package b3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import com.google.android.gms.tasks.Task;
import java.util.Map;

/* renamed from: b3.Q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\Q.smali */
public final class C0293Q extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0294S f5187b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5188c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0293Q(C0294S c0294s, String str, Map map, O3.d dVar) {
        super(1, dVar);
        this.f5187b = c0294s;
        this.f5188c = str;
        this.f5189d = map;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0293Q(this.f5187b, this.f5188c, this.f5189d, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0293Q) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Exception {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5186a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            Task taskC = this.f5187b.f(this.f5188c).c((Map) this.f5189d, w2.B.f10913b);
            kotlin.jvm.internal.i.d(taskC, "set(...)");
            this.f5186a = 1;
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
