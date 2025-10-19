package X2;

import S0.s;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X2\i.smali */
public final class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2.d f3835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f3836c;

    public /* synthetic */ i(o oVar, Y2.d dVar, int i) {
        this.f3834a = i;
        this.f3836c = oVar;
        this.f3835b = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [S0.b, S1.o] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        AppDatabase_Impl appDatabase_Impl;
        switch (this.f3834a) {
            case 0:
                o oVar = this.f3836c;
                appDatabase_Impl = (AppDatabase_Impl) oVar.f3847a;
                appDatabase_Impl.c();
                try {
                    ?? r02 = (S0.b) oVar.f3849c;
                    Y2.d dVar = this.f3835b;
                    z0.i iVarA = r02.a();
                    try {
                        r02.v(iVarA, dVar);
                        long jA = iVarA.a();
                        r02.q(iVarA);
                        Long lValueOf = Long.valueOf(jA);
                        appDatabase_Impl.o();
                        return lValueOf;
                    } catch (Throwable th) {
                        r02.q(iVarA);
                        throw th;
                    }
                } finally {
                }
            case 1:
                o oVar2 = this.f3836c;
                appDatabase_Impl = (AppDatabase_Impl) oVar2.f3847a;
                appDatabase_Impl.c();
                try {
                    ((s) oVar2.f3852f).w(this.f3835b);
                    appDatabase_Impl.o();
                    appDatabase_Impl.j();
                    return K3.k.f2288a;
                } finally {
                }
            default:
                o oVar3 = this.f3836c;
                appDatabase_Impl = (AppDatabase_Impl) oVar3.f3847a;
                appDatabase_Impl.c();
                try {
                    ((s) oVar3.h).w(this.f3835b);
                    appDatabase_Impl.o();
                    appDatabase_Impl.j();
                    return K3.k.f2288a;
                } finally {
                }
        }
    }
}
