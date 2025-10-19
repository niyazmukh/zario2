package W;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\B.smali */
public final class B extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f3471a;

    /* renamed from: b, reason: collision with root package name */
    public int f3472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f3473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(O o5, O3.d dVar) {
        super(1, dVar);
        this.f3473c = o5;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new B(this.f3473c, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((B) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        j0 b0Var;
        P3.a aVar = P3.a.f2678a;
        int i = this.f3472b;
        O o5 = this.f3473c;
        try {
        } catch (Throwable th2) {
            i0 i0VarF = o5.f();
            this.f3471a = th2;
            this.f3472b = 2;
            Integer numA = i0VarF.a();
            if (numA == aVar) {
                return aVar;
            }
            obj = numA;
            th = th2;
        }
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f3472b = 1;
            obj = O.e(o5, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f3471a;
                AbstractC0183a.m0(obj);
                b0Var = new b0(((Number) obj).intValue(), th);
                return new K3.e(b0Var, Boolean.TRUE);
            }
            AbstractC0183a.m0(obj);
        }
        b0Var = (j0) obj;
        return new K3.e(b0Var, Boolean.TRUE);
    }
}
