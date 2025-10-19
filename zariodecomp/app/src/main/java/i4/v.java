package i4;

import Q3.j;
import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\v.smali */
public final class v extends j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0612g f7961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f7962c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(InterfaceC0612g interfaceC0612g, I i, Object obj, O3.d dVar) {
        super(2, dVar);
        this.f7961b = interfaceC0612g;
        this.f7962c = i;
        this.f7963d = obj;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new v(this.f7961b, this.f7962c, this.f7963d, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f7960a;
        InterfaceC0612g interfaceC0612g = this.f7961b;
        I i5 = this.f7962c;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f7960a = 1;
            if (interfaceC0612g.c(i5, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            AbstractC0183a.m0(obj);
        } else if (i != 2) {
            if (i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        } else {
            AbstractC0183a.m0(obj);
            this.f7960a = 3;
            if (interfaceC0612g.c(i5, this) == aVar) {
                return aVar;
            }
        }
        return K3.k.f2288a;
    }
}
