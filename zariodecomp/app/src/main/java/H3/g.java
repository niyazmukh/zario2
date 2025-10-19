package h3;

import a.AbstractC0183a;
import com.niyaz.zario.ui.auth.LoginFragment;
import f4.C;
import i4.I;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\g.smali */
public final class g extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f7739b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LoginFragment loginFragment, O3.d dVar) {
        super(2, dVar);
        this.f7739b = loginFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new g(this.f7739b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((g) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
        return P3.a.f2678a;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f7738a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            throw new B0.c();
        }
        AbstractC0183a.m0(obj);
        LoginFragment loginFragment = this.f7739b;
        c cVar = (c) loginFragment.f6672g0.getValue();
        f fVar = new f(loginFragment, 0);
        this.f7738a = 1;
        ((I) cVar.f7721e.f7964a).c(fVar, this);
        return aVar;
    }
}
