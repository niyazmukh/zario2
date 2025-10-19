package t2;

import K3.k;
import L3.t;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;
import i4.InterfaceC0612g;

/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t2.1\d.smali */
public final class C0945d extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0949h f10188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0945d(C0949h c0949h, O3.d dVar) {
        super(2, dVar);
        this.f10188b = c0949h;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0945d(this.f10188b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0945d) create((C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f10187a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            InterfaceC0612g interfaceC0612gP = this.f10188b.f10202c.p();
            this.f10187a = 1;
            obj = i4.C.j(interfaceC0612gP, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        a0.b bVar = (a0.b) obj;
        return bVar != null ? bVar.a() : t.f2352a;
    }
}
