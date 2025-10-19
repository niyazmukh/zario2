package b3;

import a.AbstractC0183a;

/* renamed from: b3.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\e.1.smali */
public final class C0310e extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0316k f5242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0310e(C0316k c0316k, String str, O3.d dVar) {
        super(1, dVar);
        this.f5242b = c0316k;
        this.f5243c = str;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0310e(this.f5242b, this.f5243c, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0310e) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f5241a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            C0294S c0294s = this.f5242b.f5271b;
            this.f5241a = 1;
            obj = c0294s.b(this.f5243c, this);
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
