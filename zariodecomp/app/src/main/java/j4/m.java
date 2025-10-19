package j4;

import a.AbstractC0183a;
import i4.InterfaceC0612g;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\m.smali */
public final class m extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8100a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f8102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0613h f8103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC0613h interfaceC0613h, O3.d dVar) {
        super(2, dVar);
        this.f8102c = nVar;
        this.f8103d = interfaceC0613h;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        m mVar = new m(this.f8102c, this.f8103d, dVar);
        mVar.f8101b = obj;
        return mVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8100a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            f4.C c5 = (f4.C) this.f8101b;
            kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r();
            n nVar = this.f8102c;
            InterfaceC0612g interfaceC0612g = nVar.f8086d;
            l lVar = new l(rVar, c5, nVar, this.f8103d);
            this.f8100a = 1;
            if (interfaceC0612g.c(lVar, this) == aVar) {
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
