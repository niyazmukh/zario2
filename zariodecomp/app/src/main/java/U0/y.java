package u0;

import K3.k;
import a.AbstractC0183a;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import f4.C0516n;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\y.smali */
public final class y extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f10469a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f10471c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0516n f10472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f10473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AppDatabase_Impl appDatabase_Impl, C0516n c0516n, z zVar, O3.d dVar) {
        super(2, dVar);
        this.f10471c = appDatabase_Impl;
        this.f10472d = c0516n;
        this.f10473e = zVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        y yVar = new y(this.f10471c, this.f10472d, this.f10473e, dVar);
        yVar.f10470b = obj;
        return yVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        O3.d dVar;
        P3.a aVar = P3.a.f2678a;
        int i = this.f10469a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            O3.g gVar = ((f4.C) this.f10470b).e().get(O3.e.f2660a);
            kotlin.jvm.internal.i.b(gVar);
            O3.f fVar = (O3.f) gVar;
            C0959G c0959g = new C0959G(fVar);
            O3.i iVarPlus = S0.f.U((O3.a) fVar, c0959g).plus(new k4.v(Integer.valueOf(System.identityHashCode(c0959g)), this.f10471c.f10466j));
            C0516n c0516n = this.f10472d;
            this.f10470b = c0516n;
            this.f10469a = 1;
            obj = f4.E.B(iVarPlus, this.f10473e, this);
            if (obj == aVar) {
                return aVar;
            }
            dVar = c0516n;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (O3.d) this.f10470b;
            AbstractC0183a.m0(obj);
        }
        dVar.resumeWith(obj);
        return k.f2288a;
    }
}
