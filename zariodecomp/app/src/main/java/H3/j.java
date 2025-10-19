package h3;

import a.AbstractC0183a;
import com.niyaz.zario.ui.auth.LoginFragment;
import f4.C;
import f4.E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\j.smali */
public final class j extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f7745b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(LoginFragment loginFragment, O3.d dVar) {
        super(2, dVar);
        this.f7745b = loginFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        j jVar = new j(this.f7745b, dVar);
        jVar.f7744a = obj;
        return jVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((C) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        jVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        C c5 = (C) this.f7744a;
        LoginFragment loginFragment = this.f7745b;
        E.t(c5, null, null, new g(loginFragment, null), 3);
        E.t(c5, null, null, new h(loginFragment, null), 3);
        E.t(c5, null, null, new i(loginFragment, null), 3);
        return K3.k.f2288a;
    }
}
