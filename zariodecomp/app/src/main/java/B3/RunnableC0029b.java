package B3;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import f4.C0516n;
import java.util.UUID;
import k.C0646e;
import k.ViewOnKeyListenerC0647f;

/* renamed from: B3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\b.1.smali */
public final class RunnableC0029b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f742c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f744e;

    public RunnableC0029b(O3.i iVar, C0516n c0516n, AppDatabase_Impl appDatabase_Impl, u0.z zVar) {
        this.f740a = 6;
        this.f741b = iVar;
        this.f742c = c0516n;
        this.f743d = appDatabase_Impl;
        this.f744e = zVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        S0.q qVarK;
        switch (this.f740a) {
            case 0:
                ((AbstractC0031c) this.f744e).b((z3.k0) this.f741b, (EnumC0094y) this.f742c, (z3.a0) this.f743d);
                return;
            case 1:
                ((V) this.f744e).f570a.p((z3.k0) this.f741b, (EnumC0094y) this.f742c, (z3.a0) this.f743d);
                return;
            case 2:
                N0 n02 = (N0) this.f744e;
                n02.f495z = true;
                n02.f490u.p((z3.k0) this.f741b, (EnumC0094y) this.f742c, (z3.a0) this.f743d);
                return;
            case 3:
                synchronized (((l2) this.f744e)) {
                    try {
                        if (((j2) this.f741b).f856b == 0) {
                            try {
                                ((k2) this.f742c).f(this.f743d);
                                ((l2) this.f744e).f890a.remove((k2) this.f742c);
                                if (((l2) this.f744e).f890a.isEmpty()) {
                                    ((l2) this.f744e).f892c.shutdown();
                                    ((l2) this.f744e).f892c = null;
                                }
                            } catch (Throwable th) {
                                ((l2) this.f744e).f890a.remove((k2) this.f742c);
                                if (((l2) this.f744e).f890a.isEmpty()) {
                                    ((l2) this.f744e).f892c.shutdown();
                                    ((l2) this.f744e).f892c = null;
                                }
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                U0.k kVar = (U0.k) this.f743d;
                UUID uuid = (UUID) this.f741b;
                String string = uuid.toString();
                J0.t tVarD = J0.t.d();
                String str = T0.t.f3180c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                J0.h hVar = (J0.h) this.f742c;
                sb.append(hVar);
                sb.append(")");
                tVarD.a(str, sb.toString());
                T0.t tVar = (T0.t) this.f744e;
                WorkDatabase workDatabase = tVar.f3181a;
                WorkDatabase workDatabase2 = tVar.f3181a;
                workDatabase.c();
                try {
                    qVarK = workDatabase2.v().k(string);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (qVarK == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (qVarK.f2896b == 2) {
                    S0.m mVar = new S0.m(string, hVar);
                    S0.n nVarU = workDatabase2.u();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) nVarU.f2872a;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((S0.b) nVarU.f2873b).y(mVar);
                        workDatabase_Impl.o();
                        workDatabase_Impl.j();
                    } catch (Throwable th2) {
                        workDatabase_Impl.j();
                        throw th2;
                    }
                } else {
                    J0.t.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                }
                kVar.j(null);
                workDatabase2.o();
                return;
            case 5:
                C0646e c0646e = (C0646e) this.f741b;
                if (c0646e != null) {
                    K2.c cVar = (K2.c) this.f744e;
                    ((ViewOnKeyListenerC0647f) cVar.b).f8181D = true;
                    c0646e.f8176b.c(false);
                    ((ViewOnKeyListenerC0647f) cVar.b).f8181D = false;
                }
                k.n nVar = (k.n) this.f742c;
                if (nVar.isEnabled() && nVar.hasSubMenu()) {
                    ((k.l) this.f743d).q(nVar, null, 4);
                    return;
                }
                return;
            default:
                C0516n c0516n = (C0516n) this.f742c;
                try {
                    f4.E.x(((O3.i) this.f741b).minusKey(O3.e.f2660a), new u0.y((AppDatabase_Impl) this.f743d, c0516n, (u0.z) this.f744e, null));
                    return;
                } catch (Throwable th3) {
                    c0516n.n(th3);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC0029b(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f740a = i;
        this.f744e = obj;
        this.f741b = obj2;
        this.f742c = obj3;
        this.f743d = obj4;
    }
}
