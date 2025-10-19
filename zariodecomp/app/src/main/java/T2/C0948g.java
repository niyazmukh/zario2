package t2;

import K3.k;
import N2.AbstractC0156x;
import Q3.j;
import W.InterfaceC0167i;
import X3.p;
import a.AbstractC0183a;
import f4.C;

/* renamed from: t2.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t2.1\g.smali */
public final class C0948g extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0949h f10196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.d f10197c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f10198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0948g(C0949h c0949h, a0.d dVar, Long l4, O3.d dVar2) {
        super(2, dVar2);
        this.f10196b = c0949h;
        this.f10197c = dVar;
        this.f10198d = l4;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0948g(this.f10196b, this.f10197c, this.f10198d, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0948g) create((C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f10195a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            InterfaceC0167i interfaceC0167i = this.f10196b.f10202c;
            C0947f c0947f = new C0947f(this.f10197c, this.f10198d, null);
            this.f10195a = 1;
            obj = AbstractC0156x.B(interfaceC0167i, c0947f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return obj;
    }
}
