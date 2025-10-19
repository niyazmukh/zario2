package K0;

import A2.C0009i;
import J0.C0108b;
import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import u0.AbstractC0967h;
import u0.C0955C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\u.smali */
public final class u implements Runnable {

    /* renamed from: w, reason: collision with root package name */
    public static final String f2188w = J0.t.f("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    public final Context f2189a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2190b;

    /* renamed from: c, reason: collision with root package name */
    public final C0009i f2191c;

    /* renamed from: d, reason: collision with root package name */
    public final S0.q f2192d;

    /* renamed from: e, reason: collision with root package name */
    public J0.s f2193e;

    /* renamed from: f, reason: collision with root package name */
    public final V0.a f2194f;

    /* renamed from: l, reason: collision with root package name */
    public final C0108b f2196l;

    /* renamed from: m, reason: collision with root package name */
    public final J0.u f2197m;

    /* renamed from: n, reason: collision with root package name */
    public final f f2198n;

    /* renamed from: o, reason: collision with root package name */
    public final WorkDatabase f2199o;

    /* renamed from: p, reason: collision with root package name */
    public final S0.t f2200p;

    /* renamed from: q, reason: collision with root package name */
    public final S0.c f2201q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f2202r;

    /* renamed from: s, reason: collision with root package name */
    public String f2203s;

    /* renamed from: k, reason: collision with root package name */
    public J0.r f2195k = new J0.o();

    /* renamed from: t, reason: collision with root package name */
    public final U0.k f2204t = new U0.k();

    /* renamed from: u, reason: collision with root package name */
    public final U0.k f2205u = new U0.k();

    /* renamed from: v, reason: collision with root package name */
    public volatile int f2206v = -256;

    public u(t tVar) {
        this.f2189a = (Context) tVar.f2181a;
        this.f2194f = (V0.a) tVar.f2183c;
        this.f2198n = (f) tVar.f2182b;
        S0.q qVar = (S0.q) tVar.f2186f;
        this.f2192d = qVar;
        this.f2190b = qVar.f2895a;
        this.f2191c = (C0009i) tVar.h;
        this.f2193e = null;
        C0108b c0108b = (C0108b) tVar.f2184d;
        this.f2196l = c0108b;
        this.f2197m = c0108b.f2026c;
        WorkDatabase workDatabase = (WorkDatabase) tVar.f2185e;
        this.f2199o = workDatabase;
        this.f2200p = workDatabase.v();
        this.f2201q = workDatabase.q();
        this.f2202r = (ArrayList) tVar.f2187g;
    }

    public final void a(J0.r rVar) {
        boolean z4 = rVar instanceof J0.q;
        S0.q qVar = this.f2192d;
        String str = f2188w;
        if (!z4) {
            if (rVar instanceof J0.p) {
                J0.t.d().e(str, "Worker result RETRY for " + this.f2203s);
                c();
                return;
            }
            J0.t.d().e(str, "Worker result FAILURE for " + this.f2203s);
            if (qVar.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        J0.t.d().e(str, "Worker result SUCCESS for " + this.f2203s);
        if (qVar.c()) {
            d();
            return;
        }
        S0.c cVar = this.f2201q;
        String str2 = this.f2190b;
        S0.t tVar = this.f2200p;
        WorkDatabase workDatabase = this.f2199o;
        workDatabase.c();
        try {
            tVar.q(3, str2);
            tVar.p(str2, ((J0.q) this.f2195k).f2061a);
            this.f2197m.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = cVar.d(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (tVar.i(str3) == 5) {
                    C0955C c0955cK = C0955C.k(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        c0955cK.f(1);
                    } else {
                        c0955cK.c(1, str3);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f2847b;
                    workDatabase_Impl.b();
                    Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
                    try {
                        if (cursorF.moveToFirst() && cursorF.getInt(0) != 0) {
                            J0.t.d().e(str, "Setting status to enqueued for " + str3);
                            tVar.q(1, str3);
                            tVar.o(str3, jCurrentTimeMillis);
                        }
                    } finally {
                        cursorF.close();
                        c0955cK.l();
                    }
                }
            }
            workDatabase.o();
            workDatabase.j();
            e(false);
        } catch (Throwable th) {
            workDatabase.j();
            e(false);
            throw th;
        }
    }

    public final void b() {
        if (h()) {
            return;
        }
        this.f2199o.c();
        try {
            int i = this.f2200p.i(this.f2190b);
            S0.n nVarU = this.f2199o.u();
            String str = this.f2190b;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) nVarU.f2872a;
            workDatabase_Impl.b();
            S0.h hVar = (S0.h) nVarU.f2874c;
            z0.i iVarA = hVar.a();
            if (str == null) {
                iVarA.f(1);
            } else {
                iVarA.c(1, str);
            }
            workDatabase_Impl.c();
            try {
                iVarA.e();
                workDatabase_Impl.o();
                if (i == 0) {
                    e(false);
                } else if (i == 2) {
                    a(this.f2195k);
                } else if (!B.a.b(i)) {
                    this.f2206v = -512;
                    c();
                }
                this.f2199o.o();
                this.f2199o.j();
            } finally {
                workDatabase_Impl.j();
                hVar.q(iVarA);
            }
        } catch (Throwable th) {
            this.f2199o.j();
            throw th;
        }
    }

    public final void c() {
        String str = this.f2190b;
        S0.t tVar = this.f2200p;
        WorkDatabase workDatabase = this.f2199o;
        workDatabase.c();
        try {
            tVar.q(1, str);
            this.f2197m.getClass();
            tVar.o(str, System.currentTimeMillis());
            tVar.n(this.f2192d.f2914v, str);
            tVar.m(str, -1L);
            workDatabase.o();
        } finally {
            workDatabase.j();
            e(true);
        }
    }

    public final void d() {
        String str = this.f2190b;
        S0.t tVar = this.f2200p;
        WorkDatabase workDatabase = this.f2199o;
        workDatabase.c();
        try {
            this.f2197m.getClass();
            tVar.o(str, System.currentTimeMillis());
            tVar.q(1, str);
            WorkDatabase_Impl workDatabase_Impl = tVar.f2920a;
            workDatabase_Impl.b();
            S0.h hVar = tVar.f2927j;
            z0.i iVarA = hVar.a();
            if (str == null) {
                iVarA.f(1);
            } else {
                iVarA.c(1, str);
            }
            workDatabase_Impl.c();
            try {
                iVarA.e();
                workDatabase_Impl.o();
                workDatabase_Impl.j();
                hVar.q(iVarA);
                tVar.n(this.f2192d.f2914v, str);
                workDatabase_Impl.b();
                S0.h hVar2 = tVar.f2925f;
                z0.i iVarA2 = hVar2.a();
                if (str == null) {
                    iVarA2.f(1);
                } else {
                    iVarA2.c(1, str);
                }
                workDatabase_Impl.c();
                try {
                    iVarA2.e();
                    workDatabase_Impl.o();
                    workDatabase_Impl.j();
                    hVar2.q(iVarA2);
                    tVar.m(str, -1L);
                    workDatabase.o();
                } catch (Throwable th) {
                    workDatabase_Impl.j();
                    hVar2.q(iVarA2);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase_Impl.j();
                hVar.q(iVarA);
                throw th2;
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.f2199o
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.f2199o     // Catch: java.lang.Throwable -> L40
            S0.t r0 = r0.v()     // Catch: java.lang.Throwable -> L40
            r0.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            u0.C r1 = u0.C0955C.k(r2, r1)     // Catch: java.lang.Throwable -> L40
            androidx.work.impl.WorkDatabase_Impl r0 = r0.f2920a     // Catch: java.lang.Throwable -> L40
            r0.b()     // Catch: java.lang.Throwable -> L40
            android.database.Cursor r0 = u0.AbstractC0967h.f(r0, r1, r2)     // Catch: java.lang.Throwable -> L40
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2d
            r4 = 1
            if (r3 == 0) goto L2f
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            r3 = r4
            goto L30
        L2d:
            r6 = move-exception
            goto L71
        L2f:
            r3 = r2
        L30:
            r0.close()     // Catch: java.lang.Throwable -> L40
            r1.l()     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto L42
            android.content.Context r0 = r5.f2189a     // Catch: java.lang.Throwable -> L40
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            T0.k.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r6 = move-exception
            goto L78
        L42:
            if (r6 == 0) goto L5d
            S0.t r0 = r5.f2200p     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f2190b     // Catch: java.lang.Throwable -> L40
            r0.q(r4, r1)     // Catch: java.lang.Throwable -> L40
            S0.t r0 = r5.f2200p     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f2190b     // Catch: java.lang.Throwable -> L40
            int r2 = r5.f2206v     // Catch: java.lang.Throwable -> L40
            r0.r(r2, r1)     // Catch: java.lang.Throwable -> L40
            S0.t r0 = r5.f2200p     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f2190b     // Catch: java.lang.Throwable -> L40
            r2 = -1
            r0.m(r1, r2)     // Catch: java.lang.Throwable -> L40
        L5d:
            androidx.work.impl.WorkDatabase r0 = r5.f2199o     // Catch: java.lang.Throwable -> L40
            r0.o()     // Catch: java.lang.Throwable -> L40
            androidx.work.impl.WorkDatabase r0 = r5.f2199o
            r0.j()
            U0.k r5 = r5.f2204t
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.j(r6)
            return
        L71:
            r0.close()     // Catch: java.lang.Throwable -> L40
            r1.l()     // Catch: java.lang.Throwable -> L40
            throw r6     // Catch: java.lang.Throwable -> L40
        L78:
            androidx.work.impl.WorkDatabase r5 = r5.f2199o
            r5.j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.u.e(boolean):void");
    }

    public final void f() {
        S0.t tVar = this.f2200p;
        String str = this.f2190b;
        int i = tVar.i(str);
        String str2 = f2188w;
        if (i == 2) {
            J0.t.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        J0.t tVarD = J0.t.d();
        StringBuilder sbO = B.a.o("Status for ", str, " is ");
        sbO.append(B.a.y(i));
        sbO.append(" ; not doing any work");
        tVarD.a(str2, sbO.toString());
        e(false);
    }

    public final void g() {
        String str = this.f2190b;
        WorkDatabase workDatabase = this.f2199o;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                S0.t tVar = this.f2200p;
                if (zIsEmpty) {
                    J0.h hVar = ((J0.o) this.f2195k).f2060a;
                    tVar.n(this.f2192d.f2914v, str);
                    tVar.p(str, hVar);
                    workDatabase.o();
                    return;
                }
                String str2 = (String) linkedList.remove();
                if (tVar.i(str2) != 6) {
                    tVar.q(4, str2);
                }
                linkedList.addAll(this.f2201q.d(str2));
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final boolean h() {
        if (this.f2206v == -256) {
            return false;
        }
        J0.t.d().a(f2188w, "Work interrupted for " + this.f2203s);
        if (this.f2200p.i(this.f2190b) == 0) {
            e(false);
        } else {
            e(!B.a.b(r0));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.u.run():void");
    }
}
