package j3;

import X3.p;
import a.AbstractC0183a;
import androidx.lifecycle.a0;
import com.niyaz.zario.ui.flexstakes.FlexStakesFragment;
import f4.C;
import g0.S;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j3.1\d.smali */
public final class d extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f8047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlexStakesFragment f8048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FlexStakesFragment flexStakesFragment, O3.d dVar) {
        super(2, dVar);
        this.f8048b = flexStakesFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new d(this.f8048b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8047a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            FlexStakesFragment flexStakesFragment = this.f8048b;
            S sT = flexStakesFragment.t();
            C0630c c0630c = new C0630c(flexStakesFragment, null);
            this.f8047a = 1;
            if (a0.j(sT, c0630c, this) == aVar) {
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
