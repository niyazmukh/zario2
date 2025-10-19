package j4;

import a.AbstractC0183a;
import h4.v;

/* renamed from: j4.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\e.1.smali */
public final class C0635e extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8077a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0636f f8079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0635e(AbstractC0636f abstractC0636f, O3.d dVar) {
        super(2, dVar);
        this.f8079c = abstractC0636f;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0635e c0635e = new C0635e(this.f8079c, dVar);
        c0635e.f8078b = obj;
        return c0635e;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0635e) create((v) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8077a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            v vVar = (v) this.f8078b;
            this.f8077a = 1;
            if (this.f8079c.b(vVar, this) == aVar) {
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
