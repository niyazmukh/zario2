package androidx.lifecycle;

import a.AbstractC0183a;
import f4.InterfaceC0506g0;
import java.util.concurrent.CancellationException;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\p.1.smali */
public final class C0237p extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f4665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0237p(q qVar, O3.d dVar) {
        super(2, dVar);
        this.f4665b = qVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0237p c0237p = new C0237p(this.f4665b, dVar);
        c0237p.f4664a = obj;
        return c0237p;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        C0237p c0237p = (C0237p) create((f4.C) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        c0237p.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        f4.C c5 = (f4.C) this.f4664a;
        InterfaceC0240u interfaceC0240u = this.f4665b;
        C0242x c0242x = ((q) interfaceC0240u).a;
        if (c0242x.f4672d.compareTo(EnumC0236o.f4659b) >= 0) {
            c0242x.a(interfaceC0240u);
        } else {
            InterfaceC0506g0 interfaceC0506g0 = (InterfaceC0506g0) c5.e().get(f4.B.f7000b);
            if (interfaceC0506g0 != null) {
                interfaceC0506g0.cancel((CancellationException) null);
            }
        }
        return K3.k.f2288a;
    }
}
