package O0;

import X3.q;
import a.AbstractC0183a;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O0\h.smali */
public final class h extends Q3.j implements q {

    /* renamed from: a, reason: collision with root package name */
    public int f2621a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ InterfaceC0613h f2622b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f2623c;

    public final Object c(Object obj, Object obj2, Object obj3) {
        h hVar = new h(3, (O3.d) obj3);
        hVar.f2622b = (InterfaceC0613h) obj;
        hVar.f2623c = (Object[]) obj2;
        return hVar.invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        c cVar2;
        P3.a aVar = P3.a.f2678a;
        int i = this.f2621a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            InterfaceC0613h interfaceC0613h = this.f2622b;
            c[] cVarArr = (c[]) this.f2623c;
            int length = cVarArr.length;
            int i5 = 0;
            while (true) {
                cVar = a.f2612a;
                if (i5 >= length) {
                    cVar2 = null;
                    break;
                }
                cVar2 = cVarArr[i5];
                if (!kotlin.jvm.internal.i.a(cVar2, cVar)) {
                    break;
                }
                i5++;
            }
            if (cVar2 != null) {
                cVar = cVar2;
            }
            this.f2621a = 1;
            if (interfaceC0613h.b(cVar, this) == aVar) {
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
