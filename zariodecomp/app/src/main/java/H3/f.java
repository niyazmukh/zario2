package h3;

import a2.C0194i;
import androidx.lifecycle.a0;
import com.niyaz.zario.databinding.FragmentLoginBinding;
import com.niyaz.zario.ui.auth.LoginFragment;
import d3.C0445a;
import d3.C0446b;
import f4.E;
import i4.InterfaceC0613h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\f.smali */
public final class f implements InterfaceC0613h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f7737b;

    public /* synthetic */ f(LoginFragment loginFragment, int i) {
        this.f7736a = i;
        this.f7737b = loginFragment;
    }

    @Override // i4.InterfaceC0613h
    public final Object b(Object obj, O3.d dVar) {
        switch (this.f7736a) {
            case 0:
                V2.e eVar = (V2.e) obj;
                if (!(eVar instanceof V2.b)) {
                    boolean z4 = eVar instanceof V2.c;
                    LoginFragment loginFragment = this.f7737b;
                    if (z4) {
                        LoginFragment.Y(loginFragment, true);
                    } else if (eVar instanceof V2.d) {
                        LoginFragment.Y(loginFragment, false);
                        if (loginFragment.w()) {
                            C0446b c0446b = loginFragment.f6674i0;
                            if (c0446b == null) {
                                kotlin.jvm.internal.i.i("permissionsManager");
                                throw null;
                            }
                            C0445a c0445aB = c0446b.b();
                            E.t(a0.g(loginFragment.t()), null, null, new e(c0445aB.f6798a, c0445aB.f6799b, loginFragment, null), 3);
                        }
                    } else {
                        if (!(eVar instanceof V2.a)) {
                            throw new B0.c();
                        }
                        LoginFragment.Y(loginFragment, false);
                        FragmentLoginBinding fragmentLoginBinding = loginFragment.f6671f0;
                        kotlin.jvm.internal.i.b(fragmentLoginBinding);
                        C0194i.f(fragmentLoginBinding.getRoot(), ((V2.a) eVar).f3426a, 0).g();
                    }
                }
                return K3.k.f2288a;
            case 1:
                FragmentLoginBinding fragmentLoginBinding2 = this.f7737b.f6671f0;
                kotlin.jvm.internal.i.b(fragmentLoginBinding2);
                fragmentLoginBinding2.tilEmail.setError((String) obj);
                return K3.k.f2288a;
            default:
                FragmentLoginBinding fragmentLoginBinding3 = this.f7737b.f6671f0;
                kotlin.jvm.internal.i.b(fragmentLoginBinding3);
                fragmentLoginBinding3.tilPassword.setError((String) obj);
                return K3.k.f2288a;
        }
    }
}
