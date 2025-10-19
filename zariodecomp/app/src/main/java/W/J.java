package W;

import a.AbstractC0183a;
import f4.C0521u;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\J.smali */
public final class J extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f3508a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f3510c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q3.j f3511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(O o5, X3.p pVar, O3.d dVar) {
        super(2, dVar);
        this.f3510c = o5;
        this.f3511d = (Q3.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        J j5 = new J(this.f3510c, this.f3511d, dVar);
        j5.f3509b = obj;
        return j5;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Q3.j, X3.p] */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f3508a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            f4.C c5 = (f4.C) this.f3509b;
            C0521u c0521uA = f4.E.a();
            O o5 = this.f3510c;
            a0 a0Var = new a0(this.f3511d, c0521uA, o5.f3534l.s(), c5.e());
            S0.i iVar = o5.f3538p;
            Object objC = ((h4.g) iVar.f2860c).c(a0Var);
            if (objC instanceof h4.l) {
                h4.l lVar = objC instanceof h4.l ? (h4.l) objC : null;
                Throwable th = lVar != null ? lVar.f7815a : null;
                if (th == null) {
                    throw new h4.q("Channel was closed normally");
                }
                throw th;
            }
            if (objC instanceof h4.m) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((K2.c) iVar.f2861d).b).getAndIncrement() == 0) {
                f4.E.t((f4.C) iVar.f2858a, null, null, new e0(iVar, null), 3);
            }
            this.f3508a = 1;
            obj = c0521uA.k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return obj;
    }
}
