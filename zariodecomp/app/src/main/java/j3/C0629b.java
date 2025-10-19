package j3;

import X3.p;
import a.AbstractC0183a;
import com.niyaz.zario.ui.flexstakes.FlexStakesFragment;
import f4.C;
import i4.I;

/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j3.1\b.smali */
public final class C0629b extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f8043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlexStakesFragment f8044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0629b(FlexStakesFragment flexStakesFragment, O3.d dVar) {
        super(2, dVar);
        this.f8044b = flexStakesFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0629b(this.f8044b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C0629b) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
        return P3.a.f2678a;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8043a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            throw new B0.c();
        }
        AbstractC0183a.m0(obj);
        FlexStakesFragment flexStakesFragment = this.f8044b;
        l lVar = (l) flexStakesFragment.f6698g0.getValue();
        U2.a aVar2 = new U2.a(flexStakesFragment, 4);
        this.f8043a = 1;
        ((I) lVar.f8060d.f7964a).c(aVar2, this);
        return aVar;
    }
}
