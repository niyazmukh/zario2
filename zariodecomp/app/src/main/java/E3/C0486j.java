package e3;

import X3.p;
import a.AbstractC0183a;
import android.util.Log;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import f4.C;
import u0.AbstractC0953A;

/* renamed from: e3.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e3.1\j.smali */
public final class C0486j extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6920a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f6922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0486j(o oVar, O3.d dVar) {
        super(2, dVar);
        this.f6922c = oVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0486j c0486j = new C0486j(this.f6922c, dVar);
        c0486j.f6921b = obj;
        return c0486j;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0486j) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        Object objV;
        P3.a aVar = P3.a.f2678a;
        int i = this.f6920a;
        try {
            if (i == 0) {
                AbstractC0183a.m0(obj);
                X2.g gVar = this.f6922c.f6941b;
                this.f6920a = 1;
                X2.o oVar = (X2.o) gVar;
                oVar.getClass();
                if (AbstractC0953A.e((AppDatabase_Impl) oVar.f3847a, new G2.i(oVar, 1), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0183a.m0(obj);
            }
            objV = K3.k.f2288a;
        } catch (Throwable th) {
            objV = AbstractC0183a.v(th);
        }
        Throwable thA = K3.g.a(objV);
        if (thA != null) {
            Log.w("UserSessionRepository", "Failed to clear remote sync backlog on logout", thA);
        }
        return new K3.g(objV);
    }
}
