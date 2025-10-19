package j4;

import a.AbstractC0183a;
import i4.InterfaceC0612g;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\r.smali */
public final class r extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0612g[] f8111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8112c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f8113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.g f8114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC0612g[] interfaceC0612gArr, int i, AtomicInteger atomicInteger, h4.g gVar, O3.d dVar) {
        super(2, dVar);
        this.f8111b = interfaceC0612gArr;
        this.f8112c = i;
        this.f8113d = atomicInteger;
        this.f8114e = gVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new r(this.f8111b, this.f8112c, this.f8113d, this.f8114e, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8110a;
        AtomicInteger atomicInteger = this.f8113d;
        h4.g gVar = this.f8114e;
        try {
            if (i == 0) {
                AbstractC0183a.m0(obj);
                InterfaceC0612g[] interfaceC0612gArr = this.f8111b;
                int i5 = this.f8112c;
                InterfaceC0612g interfaceC0612g = interfaceC0612gArr[i5];
                q qVar = new q(gVar, i5);
                this.f8110a = 1;
                if (interfaceC0612g.c(qVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0183a.m0(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                gVar.k(null, false);
            }
            return K3.k.f2288a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                gVar.k(null, false);
            }
        }
    }
}
