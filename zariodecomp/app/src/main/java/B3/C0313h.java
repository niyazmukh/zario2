package b3;

import a.AbstractC0183a;
import java.util.Map;

/* renamed from: b3.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\h.1.smali */
public final class C0313h extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0316k f5257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R2.a f5259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0313h(C0316k c0316k, String str, R2.a aVar, O3.d dVar) {
        super(1, dVar);
        this.f5257b = c0316k;
        this.f5258c = str;
        this.f5259d = aVar;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0313h(this.f5257b, this.f5258c, this.f5259d, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0313h) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5256a;
        K3.k kVar = K3.k.f2288a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            C0294S c0294s = this.f5257b.f5271b;
            R2.a aVar2 = this.f5259d;
            Map mapC0 = L3.x.c0(new K3.e("email", aVar2.f2836a), new K3.e("yearOfBirth", aVar2.f2838c), new K3.e("gender", aVar2.f2839d), new K3.e("condition", aVar2.f2840e.name()), new K3.e("pointsBalance", 100), new K3.e("flexibleReward", 5), new K3.e("flexiblePenalty", 20), new K3.e("hasSetFlexibleStakes", Boolean.FALSE), new K3.e("goalSuccessStreak", 0));
            this.f5256a = 1;
            c0294s.getClass();
            Object objU = p1.b.U(new C0293Q(c0294s, this.f5258c, mapC0, null), this);
            if (objU != aVar) {
                objU = kVar;
            }
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return kVar;
    }
}
