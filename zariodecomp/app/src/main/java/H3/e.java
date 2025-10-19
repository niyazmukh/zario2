package h3;

import a.AbstractC0183a;
import com.niyaz.zario.ui.auth.LoginFragment;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\e.smali */
public final class e extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7734c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f7735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z4, boolean z5, LoginFragment loginFragment, O3.d dVar) {
        super(2, dVar);
        this.f7733b = z4;
        this.f7734c = z5;
        this.f7735d = loginFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new e(this.f7733b, this.f7734c, this.f7735d, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f7732a;
        LoginFragment loginFragment = this.f7735d;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            if (!this.f7733b || !this.f7734c) {
                S0.f.z(loginFragment).h(2131230790, null);
                return K3.k.f2288a;
            }
            S2.u uVar = loginFragment.f6673h0;
            if (uVar == null) {
                kotlin.jvm.internal.i.i("evaluationRepository");
                throw null;
            }
            this.f7732a = 1;
            obj = uVar.e(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            S0.f.z(loginFragment).h(2131230789, null);
        } else {
            S0.f.z(loginFragment).h(2131230792, null);
        }
        return K3.k.f2288a;
    }
}
