package h3;

import a.AbstractC0183a;
import androidx.lifecycle.a0;
import com.niyaz.zario.ui.auth.LoginFragment;
import f4.C;
import g0.S;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\k.smali */
public final class k extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f7747b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LoginFragment loginFragment, O3.d dVar) {
        super(2, dVar);
        this.f7747b = loginFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new k(this.f7747b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f7746a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            LoginFragment loginFragment = this.f7747b;
            S sT = loginFragment.t();
            j jVar = new j(loginFragment, null);
            this.f7746a = 1;
            if (a0.j(sT, jVar, this) == aVar) {
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
