package k3;

import a.AbstractC0183a;
import androidx.lifecycle.a0;
import com.niyaz.zario.ui.history.HistoryFragment;
import f4.C;
import g0.S;

/* renamed from: k3.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\e.smali */
public final class C0664e extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f8312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HistoryFragment f8313b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0664e(HistoryFragment historyFragment, O3.d dVar) {
        super(2, dVar);
        this.f8313b = historyFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0664e(this.f8313b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0664e) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8312a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            HistoryFragment historyFragment = this.f8313b;
            S sT = historyFragment.t();
            C0663d c0663d = new C0663d(historyFragment, null);
            this.f8312a = 1;
            if (a0.j(sT, c0663d, this) == aVar) {
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
