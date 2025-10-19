package o3;

import X3.p;
import a.AbstractC0183a;
import com.niyaz.zario.ui.profile.ProfileFragment;
import f4.C;

/* renamed from: o3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o3.1\b.smali */
public final class C0808b extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f9237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0808b(ProfileFragment profileFragment, O3.d dVar) {
        super(2, dVar);
        this.f9237b = profileFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0808b(this.f9237b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C0808b) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
        return P3.a.f2678a;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f9236a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            throw new B0.c();
        }
        AbstractC0183a.m0(obj);
        ProfileFragment profileFragment = this.f9237b;
        k kVar = (k) profileFragment.f6736g0.getValue();
        U2.a aVar2 = new U2.a(profileFragment, 7);
        this.f9236a = 1;
        kVar.f9268d.c(aVar2, this);
        return aVar;
    }
}
