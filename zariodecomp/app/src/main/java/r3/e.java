package r3;

import X3.p;
import a.AbstractC0183a;
import androidx.lifecycle.a0;
import com.niyaz.zario.ui.target.TargetFragment;
import f4.C;
import g0.S;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r3.1\e.smali */
public final class e extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TargetFragment f9648b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TargetFragment targetFragment, O3.d dVar) {
        super(2, dVar);
        this.f9648b = targetFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new e(this.f9648b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f9647a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            TargetFragment targetFragment = this.f9648b;
            S sT = targetFragment.t();
            d dVar = new d(targetFragment, null);
            this.f9647a = 1;
            if (a0.j(sT, dVar, this) == aVar) {
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
