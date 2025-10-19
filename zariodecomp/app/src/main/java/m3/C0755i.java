package m3;

import a.AbstractC0183a;
import androidx.lifecycle.a0;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import f4.C;
import g0.S;

/* renamed from: m3.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m3.1\i.smali */
public final class C0755i extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterventionFragment f8869b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0755i(InterventionFragment interventionFragment, O3.d dVar) {
        super(2, dVar);
        this.f8869b = interventionFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0755i(this.f8869b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0755i) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8868a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            InterventionFragment interventionFragment = this.f8869b;
            S sT = interventionFragment.t();
            C0754h c0754h = new C0754h(interventionFragment, null);
            this.f8868a = 1;
            if (a0.j(sT, c0754h, this) == aVar) {
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
