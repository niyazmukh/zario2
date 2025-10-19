package h3;

import a.AbstractC0183a;
import com.niyaz.zario.ui.auth.SignupFragment;
import f4.C;
import i4.I;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\q.smali */
public final class q extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignupFragment f7757b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(SignupFragment signupFragment, O3.d dVar) {
        super(2, dVar);
        this.f7757b = signupFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new q(this.f7757b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((q) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
        return P3.a.f2678a;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f7756a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            throw new B0.c();
        }
        AbstractC0183a.m0(obj);
        SignupFragment signupFragment = this.f7757b;
        c cVarA0 = signupFragment.a0();
        n nVar = new n(signupFragment, 2);
        this.f7756a = 1;
        ((I) cVarA0.f7729o.f7964a).c(nVar, this);
        return aVar;
    }
}
