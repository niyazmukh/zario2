package W;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\C.smali */
public final class C extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f3474a;

    /* renamed from: b, reason: collision with root package name */
    public int f3475b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f3476c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f3477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3478e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(O o5, int i, O3.d dVar) {
        super(2, dVar);
        this.f3477d = o5;
        this.f3478e = i;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C c5 = new C(this.f3477d, this.f3478e, dVar);
        c5.f3476c = ((Boolean) obj).booleanValue();
        return c5;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C) create(bool, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        Throwable th;
        boolean z4;
        j0 b0Var;
        boolean z5;
        boolean z6;
        P3.a aVar = P3.a.f2678a;
        boolean z7 = this.f3475b;
        O o5 = this.f3477d;
        try {
        } catch (Throwable th2) {
            if (z7 != 0) {
                i0 i0VarF = o5.f();
                this.f3474a = th2;
                this.f3476c = z7;
                this.f3475b = 2;
                Integer numA = i0VarF.a();
                if (numA == aVar) {
                    return aVar;
                }
                z4 = z7 ? 1 : 0;
                obj = numA;
                th = th2;
            } else {
                iIntValue = this.f3478e;
                th = th2;
                z6 = z7;
            }
        }
        if (z7 == 0) {
            AbstractC0183a.m0(obj);
            boolean z8 = this.f3476c;
            this.f3476c = z8;
            this.f3475b = 1;
            obj = O.e(o5, z8, this);
            z7 = z8;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z7 != 1) {
                if (z7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = this.f3476c;
                th = this.f3474a;
                AbstractC0183a.m0(obj);
                iIntValue = ((Number) obj).intValue();
                z6 = z4;
                b0Var = new b0(iIntValue, th);
                z5 = z6;
                return new K3.e(b0Var, Boolean.valueOf(z5));
            }
            boolean z9 = this.f3476c;
            AbstractC0183a.m0(obj);
            z7 = z9;
        }
        b0Var = (j0) obj;
        z5 = z7;
        return new K3.e(b0Var, Boolean.valueOf(z5));
    }
}
