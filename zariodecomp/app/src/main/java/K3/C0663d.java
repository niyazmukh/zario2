package k3;

import a.AbstractC0183a;
import com.niyaz.zario.ui.history.HistoryFragment;
import f4.C;
import i4.I;

/* renamed from: k3.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\d.smali */
public final class C0663d extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HistoryFragment f8311b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0663d(HistoryFragment historyFragment, O3.d dVar) {
        super(2, dVar);
        this.f8311b = historyFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0663d(this.f8311b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C0663d) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
        return P3.a.f2678a;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8310a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            throw new B0.c();
        }
        AbstractC0183a.m0(obj);
        HistoryFragment historyFragment = this.f8311b;
        u uVar = (u) historyFragment.f6705g0.getValue();
        U2.a aVar2 = new U2.a(historyFragment, 5);
        this.f8310a = 1;
        ((I) uVar.h.f7964a).c(aVar2, this);
        return aVar;
    }
}
