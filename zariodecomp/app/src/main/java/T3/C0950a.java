package t3;

import K3.k;
import O3.d;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import f4.C;
import i4.B;
import u3.h;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t3.1\a.smali */
public final class C0950a extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f10204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f10205c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950a(b bVar, h hVar, d dVar) {
        super(2, dVar);
        this.f10204b = bVar;
        this.f10205c = hVar;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new C0950a(this.f10204b, this.f10205c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0950a) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f10203a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            B b5 = this.f10204b.f10207b;
            this.f10203a = 1;
            if (b5.b(this.f10205c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return k.f2288a;
    }
}
