package h3;

import a.AbstractC0183a;
import com.niyaz.zario.ui.auth.SignupFragment;
import f4.C;
import f4.E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\u.smali */
public final class u extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignupFragment f7763b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SignupFragment signupFragment, O3.d dVar) {
        super(2, dVar);
        this.f7763b = signupFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        u uVar = new u(this.f7763b, dVar);
        uVar.f7762a = obj;
        return uVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        u uVar = (u) create((C) obj, (O3.d) obj2);
        K3.k kVar = K3.k.f2288a;
        uVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        C c5 = (C) this.f7762a;
        SignupFragment signupFragment = this.f7763b;
        E.t(c5, null, null, new o(signupFragment, null), 3);
        E.t(c5, null, null, new p(signupFragment, null), 3);
        E.t(c5, null, null, new q(signupFragment, null), 3);
        E.t(c5, null, null, new r(signupFragment, (O3.d) null), 3);
        E.t(c5, null, null, new s(signupFragment, null), 3);
        E.t(c5, null, null, new t(signupFragment, null), 3);
        return K3.k.f2288a;
    }
}
