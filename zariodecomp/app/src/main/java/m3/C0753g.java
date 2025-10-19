package m3;

import a.AbstractC0183a;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import f4.C;

/* renamed from: m3.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m3.1\g.smali */
public final class C0753g extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterventionFragment f8865b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0753g(InterventionFragment interventionFragment, O3.d dVar) {
        super(2, dVar);
        this.f8865b = interventionFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0753g(this.f8865b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C0753g) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
        return P3.a.f2678a;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8864a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            throw new B0.c();
        }
        AbstractC0183a.m0(obj);
        InterventionFragment interventionFragment = this.f8865b;
        e3.o oVar = interventionFragment.f6718h0;
        if (oVar == null) {
            kotlin.jvm.internal.i.i("sessionRepository");
            throw null;
        }
        C0751e c0751e = new C0751e(interventionFragment, 1);
        this.f8864a = 1;
        oVar.f6945f.c(c0751e, this);
        return aVar;
    }
}
