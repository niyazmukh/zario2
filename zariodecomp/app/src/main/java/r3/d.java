package r3;

import X3.p;
import a.AbstractC0183a;
import com.niyaz.zario.ui.target.TargetFragment;
import f4.C;
import i4.I;
import i4.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r3.1\d.smali */
public final class d extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TargetFragment f9646b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TargetFragment targetFragment, O3.d dVar) {
        super(2, dVar);
        this.f9646b = targetFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new d(this.f9646b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((d) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
        return P3.a.f2678a;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f9645a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            throw new B0.c();
        }
        AbstractC0183a.m0(obj);
        TargetFragment targetFragment = this.f9646b;
        x xVar = targetFragment.Z().f9661d;
        U2.a aVar2 = new U2.a(targetFragment, 8);
        this.f9645a = 1;
        ((I) xVar.f7964a).c(aVar2, this);
        return aVar;
    }
}
