package u0;

import K3.k;
import a.AbstractC0183a;
import java.util.concurrent.Callable;

/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\f.1.smali */
public final class C0965f extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f10406a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0965f(Callable callable, O3.d dVar) {
        super(2, dVar);
        this.f10406a = callable;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0965f(this.f10406a, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0965f) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        return this.f10406a.call();
    }
}
