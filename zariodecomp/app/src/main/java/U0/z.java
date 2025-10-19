package u0;

import K3.k;
import a.AbstractC0183a;
import com.niyaz.zario.data.local.AppDatabase_Impl;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\z.smali */
public final class z extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f10474a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f10476c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X3.l f10477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AppDatabase_Impl appDatabase_Impl, X3.l lVar, O3.d dVar) {
        super(2, dVar);
        this.f10476c = appDatabase_Impl;
        this.f10477d = lVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        z zVar = new z(this.f10476c, this.f10477d, dVar);
        zVar.f10475b = obj;
        return zVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        C0959G c0959g;
        P3.a aVar = P3.a.f2678a;
        int i = this.f10474a;
        AppDatabase_Impl appDatabase_Impl = this.f10476c;
        try {
            if (i == 0) {
                AbstractC0183a.m0(obj);
                O3.g gVar = ((f4.C) this.f10475b).e().get(C0959G.f10383c);
                kotlin.jvm.internal.i.b(gVar);
                C0959G c0959g2 = (C0959G) gVar;
                c0959g2.f10385b.incrementAndGet();
                try {
                    appDatabase_Impl.c();
                    try {
                        X3.l lVar = this.f10477d;
                        this.f10475b = c0959g2;
                        this.f10474a = 1;
                        Object objInvoke = lVar.invoke(this);
                        if (objInvoke == aVar) {
                            return aVar;
                        }
                        obj = objInvoke;
                        c0959g = c0959g2;
                    } catch (Throwable th2) {
                        th = th2;
                        appDatabase_Impl.j();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    this = c0959g2;
                    if (this.f10385b.decrementAndGet() >= 0) {
                        throw th;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0959g = (C0959G) this.f10475b;
                try {
                    AbstractC0183a.m0(obj);
                } catch (Throwable th4) {
                    th = th4;
                    appDatabase_Impl.j();
                    throw th;
                }
            }
            appDatabase_Impl.o();
            appDatabase_Impl.j();
            if (c0959g.f10385b.decrementAndGet() >= 0) {
                return obj;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
