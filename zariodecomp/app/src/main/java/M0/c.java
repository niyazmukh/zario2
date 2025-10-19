package M0;

import J0.C0111e;
import J0.t;
import J0.u;
import K0.l;
import S0.j;
import S0.q;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M0\c.smali */
public final class c implements K0.c {

    /* renamed from: f, reason: collision with root package name */
    public static final String f2438f = t.f("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f2439a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2440b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f2441c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final u f2442d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.e f2443e;

    public c(Context context, u uVar, S0.e eVar) {
        this.f2439a = context;
        this.f2442d = uVar;
        this.f2443e = eVar;
    }

    public static j b(Intent intent) {
        return new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2862a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f2863b);
    }

    public final void a(Intent intent, int i, i iVar) {
        List<l> listA;
        String action = intent.getAction();
        int i5 = 1;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            t.d().a(f2438f, "Handling constraints changed " + intent);
            e eVar = new e(this.f2439a, this.f2442d, i, iVar);
            ArrayList arrayListH = iVar.f2474e.f2174c.v().h();
            String str = d.f2444a;
            Iterator it = arrayListH.iterator();
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            while (it.hasNext()) {
                C0111e c0111e = ((q) it.next()).f2902j;
                z4 |= c0111e.f2039d;
                z5 |= c0111e.f2037b;
                z6 |= c0111e.f2040e;
                z7 |= c0111e.f2036a != 1;
                if (z4 && z5 && z6 && z7) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f4856a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = eVar.f2446a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z5).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z7);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(arrayListH.size());
            eVar.f2447b.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayListH.iterator();
            while (it2.hasNext()) {
                q qVar = (q) it2.next();
                if (jCurrentTimeMillis >= qVar.a() && (!qVar.b() || eVar.f2449d.v(qVar))) {
                    arrayList.add(qVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                q qVar2 = (q) it3.next();
                String str3 = qVar2.f2895a;
                j jVarR = p1.b.r(qVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, jVarR);
                t.d().a(e.f2445e, B.a.l("Creating a delay_met command for workSpec with id (", str3, ")"));
                ((V0.b) ((S0.i) iVar.f2471b).f2861d).execute(new F1.b(iVar, intent3, eVar.f2448c, i5));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            t.d().a(f2438f, "Handling reschedule " + intent + ", " + i);
            iVar.f2474e.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            t.d().b(f2438f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            j jVarB = b(intent);
            String str4 = f2438f;
            t.d().a(str4, "Handling schedule work for " + jVarB);
            WorkDatabase workDatabase = iVar.f2474e.f2174c;
            workDatabase.c();
            try {
                q qVarK = workDatabase.v().k(jVarB.f2862a);
                if (qVarK == null) {
                    t.d().g(str4, "Skipping scheduling " + jVarB + " because it's no longer in the DB");
                } else if (B.a.b(qVarK.f2896b)) {
                    t.d().g(str4, "Skipping scheduling " + jVarB + "because it is finished.");
                } else {
                    long jA = qVarK.a();
                    boolean zB = qVarK.b();
                    Context context2 = this.f2439a;
                    if (zB) {
                        t.d().a(str4, "Opportunistically setting an alarm for " + jVarB + "at " + jA);
                        b.b(context2, workDatabase, jVarB, jA);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((V0.b) ((S0.i) iVar.f2471b).f2861d).execute(new F1.b(iVar, intent4, i, i5));
                    } else {
                        t.d().a(str4, "Setting up Alarms for " + jVarB + "at " + jA);
                        b.b(context2, workDatabase, jVarB, jA);
                    }
                    workDatabase.o();
                }
                return;
            } finally {
                workDatabase.j();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f2441c) {
                try {
                    j jVarB2 = b(intent);
                    t tVarD = t.d();
                    String str5 = f2438f;
                    tVarD.a(str5, "Handing delay met for " + jVarB2);
                    if (this.f2440b.containsKey(jVarB2)) {
                        t.d().a(str5, "WorkSpec " + jVarB2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        g gVar = new g(this.f2439a, i, iVar, this.f2443e.C(jVarB2));
                        this.f2440b.put(jVarB2, gVar);
                        gVar.e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                t.d().g(f2438f, "Ignoring intent " + intent);
                return;
            }
            j jVarB3 = b(intent);
            boolean z8 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            t.d().a(f2438f, "Handling onExecutionCompleted " + intent + ", " + i);
            c(jVarB3, z8);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        S0.e eVar2 = this.f2443e;
        if (zContainsKey) {
            int i6 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            l lVarZ = eVar2.z(new j(string, i6));
            listA = arrayList2;
            if (lVarZ != null) {
                arrayList2.add(lVarZ);
                listA = arrayList2;
            }
        } else {
            listA = eVar2.A(string);
        }
        for (l workSpecId : listA) {
            t.d().a(f2438f, AbstractC0854a.b("Handing stopWork work for ", string));
            S0.l lVar = iVar.f2479n;
            lVar.getClass();
            kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
            lVar.F(workSpecId, -512);
            WorkDatabase workDatabase2 = iVar.f2474e.f2174c;
            String str6 = b.f2437a;
            S0.i iVarS = workDatabase2.s();
            j jVar = workSpecId.f2156a;
            S0.g gVarO = iVarS.o(jVar);
            if (gVarO != null) {
                b.a(this.f2439a, jVar, gVarO.f2856c);
                t.d().a(b.f2437a, "Removing SystemIdInfo for workSpecId (" + jVar + ")");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarS.f2858a;
                workDatabase_Impl.b();
                S0.h hVar = (S0.h) iVarS.f2860c;
                z0.i iVarA = hVar.a();
                String str7 = jVar.f2862a;
                if (str7 == null) {
                    iVarA.f(1);
                } else {
                    iVarA.c(1, str7);
                }
                iVarA.d(2, jVar.f2863b);
                workDatabase_Impl.c();
                try {
                    iVarA.e();
                    workDatabase_Impl.o();
                } finally {
                    workDatabase_Impl.j();
                    hVar.q(iVarA);
                }
            }
            iVar.c(jVar, false);
        }
    }

    @Override // K0.c
    public final void c(j jVar, boolean z4) {
        synchronized (this.f2441c) {
            try {
                g gVar = (g) this.f2440b.remove(jVar);
                this.f2443e.z(jVar);
                if (gVar != null) {
                    gVar.f(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
