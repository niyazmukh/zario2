package q3;

import K3.k;
import O3.d;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import com.niyaz.zario.ui.splash.SplashFragment;
import f4.C;
import f4.E;
import f4.N;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q3.1\b.smali */
public final class C0852b extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashFragment f9506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0852b(SplashFragment splashFragment, d dVar) {
        super(2, dVar);
        this.f9506b = splashFragment;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new C0852b(this.f9506b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0852b) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f9505a;
        k kVar = k.f2288a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f9505a = 1;
            SplashFragment splashFragment = this.f9506b;
            splashFragment.getClass();
            Object objB = E.B(N.f7027a, new C0851a(splashFragment, null), this);
            if (objB != aVar) {
                objB = kVar;
            }
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return kVar;
    }
}
