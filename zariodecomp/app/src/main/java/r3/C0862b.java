package r3;

import S2.u;
import V2.n;
import X3.p;
import a.AbstractC0183a;
import com.niyaz.zario.ui.target.TargetFragment;
import f4.C;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r3.1\b.smali */
public final class C0862b extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TargetFragment f9640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f9641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0862b(TargetFragment targetFragment, n nVar, O3.d dVar) {
        super(2, dVar);
        this.f9640b = targetFragment;
        this.f9641c = nVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0862b(this.f9640b, this.f9641c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0862b) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f9639a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            u uVar = this.f9640b.f6754h0;
            if (uVar == null) {
                kotlin.jvm.internal.i.i("evaluationRepository");
                throw null;
            }
            this.f9639a = 1;
            if (uVar.k(this.f9641c, this) == aVar) {
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
