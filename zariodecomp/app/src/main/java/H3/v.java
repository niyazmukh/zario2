package h3;

import a.AbstractC0183a;
import androidx.lifecycle.a0;
import com.niyaz.zario.ui.auth.SignupFragment;
import f4.C;
import g0.S;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\v.smali */
public final class v extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignupFragment f7765b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SignupFragment signupFragment, O3.d dVar) {
        super(2, dVar);
        this.f7765b = signupFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new v(this.f7765b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f7764a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            SignupFragment signupFragment = this.f7765b;
            S sT = signupFragment.t();
            u uVar = new u(signupFragment, null);
            this.f7764a = 1;
            if (a0.j(sT, uVar, this) == aVar) {
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
