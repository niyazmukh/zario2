package t2;

import K3.k;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;
import i4.InterfaceC0612g;

/* renamed from: t2.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t2.1\e.smali */
public final class C0946e extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0949h f10190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.d f10191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0946e(C0949h c0949h, a0.d dVar, O3.d dVar2) {
        super(2, dVar2);
        this.f10190b = c0949h;
        this.f10191c = dVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0946e(this.f10190b, this.f10191c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0946e) create((C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        P3.a aVar = P3.a.f2678a;
        int i = this.f10189a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            InterfaceC0612g interfaceC0612gP = this.f10190b.f10202c.p();
            this.f10189a = 1;
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
        if (bVar == null || (objC = bVar.c(this.f10191c)) == null) {
            return -1L;
        }
        return objC;
    }
}
