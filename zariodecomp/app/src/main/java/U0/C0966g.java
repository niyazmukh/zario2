package u0;

import K3.k;
import a.AbstractC0183a;
import f4.C0516n;
import java.util.concurrent.Callable;

/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\g.1.smali */
public final class C0966g extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f10407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0516n f10408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0966g(Callable callable, C0516n c0516n, O3.d dVar) {
        super(2, dVar);
        this.f10407a = callable;
        this.f10408b = c0516n;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0966g(this.f10407a, this.f10408b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        C0966g c0966g = (C0966g) create((f4.C) obj, (O3.d) obj2);
        k kVar = k.f2288a;
        c0966g.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        C0516n c0516n = this.f10408b;
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        try {
            c0516n.resumeWith(this.f10407a.call());
        } catch (Throwable th) {
            c0516n.resumeWith(AbstractC0183a.v(th));
        }
        return k.f2288a;
    }
}
