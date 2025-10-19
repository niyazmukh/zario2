package o3;

import X3.p;
import a.AbstractC0183a;
import androidx.lifecycle.a0;
import com.niyaz.zario.ui.profile.ProfileFragment;
import f4.C;
import g0.S;

/* renamed from: o3.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o3.1\c.smali */
public final class C0809c extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f9239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0809c(ProfileFragment profileFragment, O3.d dVar) {
        super(2, dVar);
        this.f9239b = profileFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0809c(this.f9239b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0809c) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f9238a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            ProfileFragment profileFragment = this.f9239b;
            S sT = profileFragment.t();
            C0808b c0808b = new C0808b(profileFragment, null);
            this.f9238a = 1;
            if (a0.j(sT, c0808b, this) == aVar) {
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
