package h3;

import a2.C0194i;
import com.niyaz.zario.databinding.FragmentSignupBinding;
import com.niyaz.zario.ui.auth.SignupFragment;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\n.smali */
public final class n implements InterfaceC0613h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignupFragment f7751b;

    public /* synthetic */ n(SignupFragment signupFragment, int i) {
        this.f7750a = i;
        this.f7751b = signupFragment;
    }

    @Override // i4.InterfaceC0613h
    public final Object b(Object obj, O3.d dVar) {
        switch (this.f7750a) {
            case 0:
                V2.e eVar = (V2.e) obj;
                if (!(eVar instanceof V2.b)) {
                    boolean z4 = eVar instanceof V2.c;
                    SignupFragment signupFragment = this.f7751b;
                    if (z4) {
                        SignupFragment.Y(signupFragment, true);
                    } else if (eVar instanceof V2.d) {
                        SignupFragment.Y(signupFragment, false);
                        e3.o oVar = signupFragment.f6682h0;
                        if (oVar == null) {
                            kotlin.jvm.internal.i.i("sessionRepository");
                            throw null;
                        }
                        V2.o oVar2 = ((V2.p) oVar.f6945f.b()).f3462b;
                        if ((oVar2 != null ? oVar2.f3456e : null) == V2.f.f3432c) {
                            S0.f.z(signupFragment).h(2131230800, null);
                        } else {
                            S0.f.z(signupFragment).h(2131230802, null);
                        }
                    } else {
                        if (!(eVar instanceof V2.a)) {
                            throw new B0.c();
                        }
                        SignupFragment.Y(signupFragment, false);
                        FragmentSignupBinding fragmentSignupBinding = signupFragment.f6680f0;
                        kotlin.jvm.internal.i.b(fragmentSignupBinding);
                        C0194i.f(fragmentSignupBinding.getRoot(), ((V2.a) eVar).f3426a, 0).g();
                    }
                }
                return K3.k.f2288a;
            case 1:
                FragmentSignupBinding fragmentSignupBinding2 = this.f7751b.f6680f0;
                kotlin.jvm.internal.i.b(fragmentSignupBinding2);
                fragmentSignupBinding2.tilYearOfBirth.setError((String) obj);
                return K3.k.f2288a;
            case 2:
                FragmentSignupBinding fragmentSignupBinding3 = this.f7751b.f6680f0;
                kotlin.jvm.internal.i.b(fragmentSignupBinding3);
                fragmentSignupBinding3.tilGender.setError((String) obj);
                return K3.k.f2288a;
            case 3:
                FragmentSignupBinding fragmentSignupBinding4 = this.f7751b.f6680f0;
                kotlin.jvm.internal.i.b(fragmentSignupBinding4);
                fragmentSignupBinding4.tilEmail.setError((String) obj);
                return K3.k.f2288a;
            case 4:
                FragmentSignupBinding fragmentSignupBinding5 = this.f7751b.f6680f0;
                kotlin.jvm.internal.i.b(fragmentSignupBinding5);
                fragmentSignupBinding5.tilPassword.setError((String) obj);
                return K3.k.f2288a;
            default:
                FragmentSignupBinding fragmentSignupBinding6 = this.f7751b.f6680f0;
                kotlin.jvm.internal.i.b(fragmentSignupBinding6);
                fragmentSignupBinding6.tilConfirmPassword.setError((String) obj);
                return K3.k.f2288a;
        }
    }
}
