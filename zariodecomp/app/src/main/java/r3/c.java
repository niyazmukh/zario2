package r3;

import V2.n;
import X3.p;
import a.AbstractC0183a;
import android.util.Log;
import com.niyaz.zario.ui.target.TargetFragment;
import f4.A;
import f4.C;
import f4.E;
import f4.N;
import u0.AbstractC0953A;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r3.1\c.smali */
public final class c extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TargetFragment f9643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f9644c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TargetFragment targetFragment, n nVar, O3.d dVar) {
        super(2, dVar);
        this.f9643b = targetFragment;
        this.f9644c = nVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new c(this.f9643b, this.f9644c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f9642a;
        TargetFragment targetFragment = this.f9643b;
        try {
            if (i == 0) {
                AbstractC0183a.m0(obj);
                m4.e eVar = N.f7027a;
                A a5 = m4.d.f8928c;
                C0862b c0862b = new C0862b(targetFragment, this.f9644c, null);
                this.f9642a = 1;
                if (E.B(a5, c0862b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0183a.m0(obj);
            }
            AbstractC0953A.b(S0.f.z(targetFragment), 2131230809);
        } catch (Exception e5) {
            Log.e("TargetFragment", "Failed to save screen-time plan", e5);
            String strR = targetFragment.r(2131886220);
            kotlin.jvm.internal.i.d(strR, "getString(...)");
            targetFragment.b0(strR);
        }
        return K3.k.f2288a;
    }
}
