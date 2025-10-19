package androidx.work.impl.workers;

import J0.C0111e;
import J0.h;
import J0.q;
import K0.r;
import S0.l;
import S0.t;
import S0.v;
import W0.b;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import r1.d;
import u0.AbstractC0967h;
import u0.C0955C;
import z2.C1071b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\impl\workers\DiagnosticsWorker.smali */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        i.e(context, "context");
        i.e(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final q a() throws Throwable {
        C0955C c0955c;
        int iG;
        int iG2;
        int iG3;
        int iG4;
        int iG5;
        int iG6;
        int iG7;
        int iG8;
        int iG9;
        int iG10;
        int iG11;
        int iG12;
        int iG13;
        int iG14;
        S0.i iVar;
        l lVar;
        v vVar;
        int i;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        r rVarB = r.b(getApplicationContext());
        i.d(rVarB, "getInstance(applicationContext)");
        WorkDatabase workDatabase = rVarB.f2174c;
        i.d(workDatabase, "workManager.workDatabase");
        t tVarV = workDatabase.v();
        l lVarT = workDatabase.t();
        v vVarW = workDatabase.w();
        S0.i iVarS = workDatabase.s();
        rVarB.f2173b.f2026c.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        tVarV.getClass();
        C0955C c0955cK = C0955C.k(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        c0955cK.d(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = tVarV.f2920a;
        workDatabase_Impl.b();
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            iG = C1071b.g(cursorF, "id");
            iG2 = C1071b.g(cursorF, "state");
            iG3 = C1071b.g(cursorF, "worker_class_name");
            iG4 = C1071b.g(cursorF, "input_merger_class_name");
            iG5 = C1071b.g(cursorF, "input");
            iG6 = C1071b.g(cursorF, "output");
            iG7 = C1071b.g(cursorF, "initial_delay");
            iG8 = C1071b.g(cursorF, "interval_duration");
            iG9 = C1071b.g(cursorF, "flex_duration");
            iG10 = C1071b.g(cursorF, "run_attempt_count");
            iG11 = C1071b.g(cursorF, "backoff_policy");
            iG12 = C1071b.g(cursorF, "backoff_delay_duration");
            iG13 = C1071b.g(cursorF, "last_enqueue_time");
            iG14 = C1071b.g(cursorF, "minimum_retention_duration");
            c0955c = c0955cK;
        } catch (Throwable th) {
            th = th;
            c0955c = c0955cK;
        }
        try {
            int iG15 = C1071b.g(cursorF, "schedule_requested_at");
            int iG16 = C1071b.g(cursorF, "run_in_foreground");
            int iG17 = C1071b.g(cursorF, "out_of_quota_policy");
            int iG18 = C1071b.g(cursorF, "period_count");
            int iG19 = C1071b.g(cursorF, "generation");
            int iG20 = C1071b.g(cursorF, "next_schedule_time_override");
            int iG21 = C1071b.g(cursorF, "next_schedule_time_override_generation");
            int iG22 = C1071b.g(cursorF, "stop_reason");
            int iG23 = C1071b.g(cursorF, "required_network_type");
            int iG24 = C1071b.g(cursorF, "requires_charging");
            int iG25 = C1071b.g(cursorF, "requires_device_idle");
            int iG26 = C1071b.g(cursorF, "requires_battery_not_low");
            int iG27 = C1071b.g(cursorF, "requires_storage_not_low");
            int iG28 = C1071b.g(cursorF, "trigger_content_update_delay");
            int iG29 = C1071b.g(cursorF, "trigger_max_content_delay");
            int iG30 = C1071b.g(cursorF, "content_uri_triggers");
            int i9 = iG14;
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                byte[] blob = null;
                String string = cursorF.isNull(iG) ? null : cursorF.getString(iG);
                int I4 = d.I(cursorF.getInt(iG2));
                String string2 = cursorF.isNull(iG3) ? null : cursorF.getString(iG3);
                String string3 = cursorF.isNull(iG4) ? null : cursorF.getString(iG4);
                h hVarA = h.a(cursorF.isNull(iG5) ? null : cursorF.getBlob(iG5));
                h hVarA2 = h.a(cursorF.isNull(iG6) ? null : cursorF.getBlob(iG6));
                long j5 = cursorF.getLong(iG7);
                long j6 = cursorF.getLong(iG8);
                long j7 = cursorF.getLong(iG9);
                int i10 = cursorF.getInt(iG10);
                int iF = d.F(cursorF.getInt(iG11));
                long j8 = cursorF.getLong(iG12);
                long j9 = cursorF.getLong(iG13);
                int i11 = i9;
                long j10 = cursorF.getLong(i11);
                int i12 = iG;
                int i13 = iG15;
                long j11 = cursorF.getLong(i13);
                iG15 = i13;
                int i14 = iG16;
                if (cursorF.getInt(i14) != 0) {
                    iG16 = i14;
                    i = iG17;
                    z4 = true;
                } else {
                    iG16 = i14;
                    i = iG17;
                    z4 = false;
                }
                int iH = d.H(cursorF.getInt(i));
                iG17 = i;
                int i15 = iG18;
                int i16 = cursorF.getInt(i15);
                iG18 = i15;
                int i17 = iG19;
                int i18 = cursorF.getInt(i17);
                iG19 = i17;
                int i19 = iG20;
                long j12 = cursorF.getLong(i19);
                iG20 = i19;
                int i20 = iG21;
                int i21 = cursorF.getInt(i20);
                iG21 = i20;
                int i22 = iG22;
                int i23 = cursorF.getInt(i22);
                iG22 = i22;
                int i24 = iG23;
                int iG31 = d.G(cursorF.getInt(i24));
                iG23 = i24;
                int i25 = iG24;
                if (cursorF.getInt(i25) != 0) {
                    iG24 = i25;
                    i5 = iG25;
                    z5 = true;
                } else {
                    iG24 = i25;
                    i5 = iG25;
                    z5 = false;
                }
                if (cursorF.getInt(i5) != 0) {
                    iG25 = i5;
                    i6 = iG26;
                    z6 = true;
                } else {
                    iG25 = i5;
                    i6 = iG26;
                    z6 = false;
                }
                if (cursorF.getInt(i6) != 0) {
                    iG26 = i6;
                    i7 = iG27;
                    z7 = true;
                } else {
                    iG26 = i6;
                    i7 = iG27;
                    z7 = false;
                }
                if (cursorF.getInt(i7) != 0) {
                    iG27 = i7;
                    i8 = iG28;
                    z8 = true;
                } else {
                    iG27 = i7;
                    i8 = iG28;
                    z8 = false;
                }
                long j13 = cursorF.getLong(i8);
                iG28 = i8;
                int i26 = iG29;
                long j14 = cursorF.getLong(i26);
                iG29 = i26;
                int i27 = iG30;
                if (!cursorF.isNull(i27)) {
                    blob = cursorF.getBlob(i27);
                }
                iG30 = i27;
                arrayList.add(new S0.q(string, I4, string2, string3, hVarA, hVarA2, j5, j6, j7, new C0111e(iG31, z5, z6, z7, z8, j13, j14, d.j(blob)), i10, iF, j8, j9, j10, j11, z4, iH, i16, i18, j12, i21, i23));
                iG = i12;
                i9 = i11;
            }
            cursorF.close();
            c0955c.l();
            ArrayList arrayListG = tVarV.g();
            ArrayList arrayListD = tVarV.d();
            if (arrayList.isEmpty()) {
                iVar = iVarS;
                lVar = lVarT;
                vVar = vVarW;
            } else {
                J0.t tVarD = J0.t.d();
                String str = b.f3691a;
                tVarD.e(str, "Recently completed work:\n\n");
                iVar = iVarS;
                lVar = lVarT;
                vVar = vVarW;
                J0.t.d().e(str, b.a(lVar, vVar, iVar, arrayList));
            }
            if (!arrayListG.isEmpty()) {
                J0.t tVarD2 = J0.t.d();
                String str2 = b.f3691a;
                tVarD2.e(str2, "Running work:\n\n");
                J0.t.d().e(str2, b.a(lVar, vVar, iVar, arrayListG));
            }
            if (!arrayListD.isEmpty()) {
                J0.t tVarD3 = J0.t.d();
                String str3 = b.f3691a;
                tVarD3.e(str3, "Enqueued work:\n\n");
                J0.t.d().e(str3, b.a(lVar, vVar, iVar, arrayListD));
            }
            return J0.r.a();
        } catch (Throwable th2) {
            th = th2;
            cursorF.close();
            c0955c.l();
            throw th;
        }
    }
}
