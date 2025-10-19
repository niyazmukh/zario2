package m3;

import a.AbstractC0183a;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import f4.C;
import i4.I;

/* renamed from: m3.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m3.1\f.smali */
public final class C0752f extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterventionFragment f8863b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0752f(InterventionFragment interventionFragment, O3.d dVar) {
        super(2, dVar);
        this.f8863b = interventionFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0752f(this.f8863b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C0752f) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
        return P3.a.f2678a;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8862a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            throw new B0.c();
        }
        AbstractC0183a.m0(obj);
        InterventionFragment interventionFragment = this.f8863b;
        q qVar = (q) interventionFragment.f6717g0.getValue();
        C0751e c0751e = new C0751e(interventionFragment, 0);
        this.f8862a = 1;
        ((I) qVar.f8901g.f7964a).c(c0751e, this);
        return aVar;
    }
}
