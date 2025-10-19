package W;

import android.os.Bundle;
import android.os.CancellationSignal;
import f4.A0;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import o0.C0767B;
import o0.C0769D;
import o0.C0770E;
import o0.C0779b;
import o0.C0787j;
import o0.C0790m;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\d0.smali */
public final class d0 extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, Object obj, Object obj2) {
        super(1);
        this.f3583a = i;
        this.f3584b = obj;
        this.f3585c = obj2;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        K3.k kVar;
        o0.N n5;
        o0.x xVarC;
        K3.k kVar2 = K3.k.f2288a;
        Object obj2 = this.f3585c;
        Object obj3 = this.f3584b;
        switch (this.f3583a) {
            case 0:
                Throwable th = (Throwable) obj;
                ((J0.m) obj3).invoke(th);
                S0.i iVar = (S0.i) obj2;
                ((h4.g) iVar.f2860c).k(th, false);
                do {
                    Object objB = ((h4.g) iVar.f2860c).b();
                    if (objB instanceof h4.m) {
                        objB = null;
                    }
                    if (objB != null) {
                        K.f3512a.invoke(objB, th);
                        kVar = kVar2;
                    } else {
                        kVar = null;
                    }
                } while (kVar != null);
                return kVar2;
            case 1:
                C0770E navOptions = (C0770E) obj;
                kotlin.jvm.internal.i.e(navOptions, "$this$navOptions");
                M.q qVar = navOptions.f9013a;
                qVar.f2418a = 0;
                qVar.f2419b = 0;
                o0.x xVar = (o0.x) obj3;
                if (xVar instanceof o0.z) {
                    int i = o0.x.f9139n;
                    Iterator it = d4.g.l0(xVar, C0779b.f9048k).iterator();
                    while (true) {
                        C0767B c0767b = (C0767B) obj2;
                        if (it.hasNext()) {
                            o0.x xVar2 = (o0.x) it.next();
                            o0.x xVarE = c0767b.e();
                            if (kotlin.jvm.internal.i.a(xVar2, xVarE != null ? xVarE.f9141b : null)) {
                            }
                        } else {
                            int i5 = o0.z.f9152r;
                            o0.z zVar = c0767b.f8981c;
                            if (zVar == null) {
                                throw new IllegalStateException("You must call setGraph() before calling getGraph()");
                            }
                            navOptions.f9016d = S0.f.A(zVar).f9147l;
                            navOptions.f9017e = true;
                        }
                    }
                }
                return kVar2;
            case 2:
                C0787j backStackEntry = (C0787j) obj;
                kotlin.jvm.internal.i.e(backStackEntry, "backStackEntry");
                o0.x xVar3 = backStackEntry.f9069b;
                if (xVar3 == null) {
                    xVar3 = null;
                }
                if (xVar3 == null || (xVarC = (n5 = (o0.N) obj3).c(xVar3, backStackEntry.c(), (C0769D) obj2)) == null) {
                    return null;
                }
                if (xVarC.equals(xVar3)) {
                    return backStackEntry;
                }
                C0790m c0790mB = n5.b();
                Bundle bundleG = xVarC.g(backStackEntry.c());
                C0767B c0767b2 = c0790mB.h;
                return J3.c.a(c0767b2.f8979a, xVarC, bundleG, c0767b2.f(), c0767b2.f8991o);
            default:
                ((CancellationSignal) obj3).cancel();
                ((A0) obj2).cancel((CancellationException) null);
                return kVar2;
        }
    }
}
