package S0;

import J0.C0111e;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import u0.AbstractC0967h;
import u0.C0955C;
import z2.C1071b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\t.smali */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f2920a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2921b;

    /* renamed from: c, reason: collision with root package name */
    public final h f2922c;

    /* renamed from: d, reason: collision with root package name */
    public final h f2923d;

    /* renamed from: e, reason: collision with root package name */
    public final h f2924e;

    /* renamed from: f, reason: collision with root package name */
    public final h f2925f;

    /* renamed from: g, reason: collision with root package name */
    public final h f2926g;
    public final h h;
    public final h i;

    /* renamed from: j, reason: collision with root package name */
    public final h f2927j;

    /* renamed from: k, reason: collision with root package name */
    public final h f2928k;

    /* renamed from: l, reason: collision with root package name */
    public final h f2929l;

    /* renamed from: m, reason: collision with root package name */
    public final h f2930m;

    /* renamed from: n, reason: collision with root package name */
    public final h f2931n;

    public t(WorkDatabase_Impl workDatabase_Impl) {
        this.f2920a = workDatabase_Impl;
        this.f2921b = new b(workDatabase_Impl, 5);
        new s(workDatabase_Impl, 0);
        this.f2922c = new h(workDatabase_Impl, 12);
        this.f2923d = new h(workDatabase_Impl, 13);
        this.f2924e = new h(workDatabase_Impl, 14);
        this.f2925f = new h(workDatabase_Impl, 15);
        this.f2926g = new h(workDatabase_Impl, 16);
        this.h = new h(workDatabase_Impl, 17);
        this.i = new h(workDatabase_Impl, 18);
        this.f2927j = new h(workDatabase_Impl, 4);
        new h(workDatabase_Impl, 5);
        this.f2928k = new h(workDatabase_Impl, 6);
        this.f2929l = new h(workDatabase_Impl, 7);
        this.f2930m = new h(workDatabase_Impl, 8);
        new h(workDatabase_Impl, 9);
        new h(workDatabase_Impl, 10);
        this.f2931n = new h(workDatabase_Impl, 11);
    }

    public final void a(HashMap map) {
        int i;
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap map2 = new HashMap(999);
            loop0: while (true) {
                i = 0;
                for (String str : setKeySet) {
                    map2.put(str, (ArrayList) map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                a(map2);
                map2 = new HashMap(999);
            }
            if (i > 0) {
                a(map2);
                return;
            }
            return;
        }
        StringBuilder sbB = t.h.b("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        u0.o.a(size, sbB);
        sbB.append(")");
        C0955C c0955cK = C0955C.k(size, sbB.toString());
        int i5 = 1;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                c0955cK.f(i5);
            } else {
                c0955cK.c(i5, str2);
            }
            i5++;
        }
        Cursor cursorF = AbstractC0967h.f(this.f2920a, c0955cK, false);
        try {
            int iF = C1071b.f(cursorF, "work_spec_id");
            if (iF == -1) {
                return;
            }
            while (cursorF.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorF.getString(iF));
                if (arrayList != null) {
                    arrayList.add(J0.h.a(cursorF.isNull(0) ? null : cursorF.getBlob(0)));
                }
            }
        } finally {
            cursorF.close();
        }
    }

    public final void b(HashMap map) {
        int i;
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap map2 = new HashMap(999);
            loop0: while (true) {
                i = 0;
                for (String str : setKeySet) {
                    map2.put(str, (ArrayList) map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                b(map2);
                map2 = new HashMap(999);
            }
            if (i > 0) {
                b(map2);
                return;
            }
            return;
        }
        StringBuilder sbB = t.h.b("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        u0.o.a(size, sbB);
        sbB.append(")");
        C0955C c0955cK = C0955C.k(size, sbB.toString());
        int i5 = 1;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                c0955cK.f(i5);
            } else {
                c0955cK.c(i5, str2);
            }
            i5++;
        }
        Cursor cursorF = AbstractC0967h.f(this.f2920a, c0955cK, false);
        try {
            int iF = C1071b.f(cursorF, "work_spec_id");
            if (iF == -1) {
                return;
            }
            while (cursorF.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorF.getString(iF));
                if (arrayList != null) {
                    arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
                }
            }
        } finally {
            cursorF.close();
        }
    }

    public final void c(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        h hVar = this.f2922c;
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
        } finally {
            workDatabase_Impl.j();
            hVar.q(iVarA);
        }
    }

    public final ArrayList d() throws Throwable {
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
        C0955C c0955cK = C0955C.k(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        c0955cK.d(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
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
                int I4 = r1.d.I(cursorF.getInt(iG2));
                String string2 = cursorF.isNull(iG3) ? null : cursorF.getString(iG3);
                String string3 = cursorF.isNull(iG4) ? null : cursorF.getString(iG4);
                J0.h hVarA = J0.h.a(cursorF.isNull(iG5) ? null : cursorF.getBlob(iG5));
                J0.h hVarA2 = J0.h.a(cursorF.isNull(iG6) ? null : cursorF.getBlob(iG6));
                long j5 = cursorF.getLong(iG7);
                long j6 = cursorF.getLong(iG8);
                long j7 = cursorF.getLong(iG9);
                int i10 = cursorF.getInt(iG10);
                int iF = r1.d.F(cursorF.getInt(iG11));
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
                int iH = r1.d.H(cursorF.getInt(i));
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
                int iG31 = r1.d.G(cursorF.getInt(i24));
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
                arrayList.add(new q(string, I4, string2, string3, hVarA, hVarA2, j5, j6, j7, new C0111e(iG31, z5, z6, z7, z8, j13, j14, r1.d.j(blob)), i10, iF, j8, j9, j10, j11, z4, iH, i16, i18, j12, i21, i23));
                iG = i12;
                i9 = i11;
            }
            cursorF.close();
            c0955c.l();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorF.close();
            c0955c.l();
            throw th;
        }
    }

    public final ArrayList e(int i) throws Throwable {
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
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        C0955C c0955cK = C0955C.k(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        c0955cK.d(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
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
            int i10 = iG14;
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                byte[] blob = null;
                String string = cursorF.isNull(iG) ? null : cursorF.getString(iG);
                int I4 = r1.d.I(cursorF.getInt(iG2));
                String string2 = cursorF.isNull(iG3) ? null : cursorF.getString(iG3);
                String string3 = cursorF.isNull(iG4) ? null : cursorF.getString(iG4);
                J0.h hVarA = J0.h.a(cursorF.isNull(iG5) ? null : cursorF.getBlob(iG5));
                J0.h hVarA2 = J0.h.a(cursorF.isNull(iG6) ? null : cursorF.getBlob(iG6));
                long j5 = cursorF.getLong(iG7);
                long j6 = cursorF.getLong(iG8);
                long j7 = cursorF.getLong(iG9);
                int i11 = cursorF.getInt(iG10);
                int iF = r1.d.F(cursorF.getInt(iG11));
                long j8 = cursorF.getLong(iG12);
                long j9 = cursorF.getLong(iG13);
                int i12 = i10;
                long j10 = cursorF.getLong(i12);
                int i13 = iG;
                int i14 = iG15;
                long j11 = cursorF.getLong(i14);
                iG15 = i14;
                int i15 = iG16;
                if (cursorF.getInt(i15) != 0) {
                    iG16 = i15;
                    i5 = iG17;
                    z4 = true;
                } else {
                    iG16 = i15;
                    i5 = iG17;
                    z4 = false;
                }
                int iH = r1.d.H(cursorF.getInt(i5));
                iG17 = i5;
                int i16 = iG18;
                int i17 = cursorF.getInt(i16);
                iG18 = i16;
                int i18 = iG19;
                int i19 = cursorF.getInt(i18);
                iG19 = i18;
                int i20 = iG20;
                long j12 = cursorF.getLong(i20);
                iG20 = i20;
                int i21 = iG21;
                int i22 = cursorF.getInt(i21);
                iG21 = i21;
                int i23 = iG22;
                int i24 = cursorF.getInt(i23);
                iG22 = i23;
                int i25 = iG23;
                int iG31 = r1.d.G(cursorF.getInt(i25));
                iG23 = i25;
                int i26 = iG24;
                if (cursorF.getInt(i26) != 0) {
                    iG24 = i26;
                    i6 = iG25;
                    z5 = true;
                } else {
                    iG24 = i26;
                    i6 = iG25;
                    z5 = false;
                }
                if (cursorF.getInt(i6) != 0) {
                    iG25 = i6;
                    i7 = iG26;
                    z6 = true;
                } else {
                    iG25 = i6;
                    i7 = iG26;
                    z6 = false;
                }
                if (cursorF.getInt(i7) != 0) {
                    iG26 = i7;
                    i8 = iG27;
                    z7 = true;
                } else {
                    iG26 = i7;
                    i8 = iG27;
                    z7 = false;
                }
                if (cursorF.getInt(i8) != 0) {
                    iG27 = i8;
                    i9 = iG28;
                    z8 = true;
                } else {
                    iG27 = i8;
                    i9 = iG28;
                    z8 = false;
                }
                long j13 = cursorF.getLong(i9);
                iG28 = i9;
                int i27 = iG29;
                long j14 = cursorF.getLong(i27);
                iG29 = i27;
                int i28 = iG30;
                if (!cursorF.isNull(i28)) {
                    blob = cursorF.getBlob(i28);
                }
                iG30 = i28;
                arrayList.add(new q(string, I4, string2, string3, hVarA, hVarA2, j5, j6, j7, new C0111e(iG31, z5, z6, z7, z8, j13, j14, r1.d.j(blob)), i11, iF, j8, j9, j10, j11, z4, iH, i17, i19, j12, i22, i24));
                iG = i13;
                i10 = i12;
            }
            cursorF.close();
            c0955c.l();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorF.close();
            c0955c.l();
            throw th;
        }
    }

    public final ArrayList f() throws Throwable {
        C0955C c0955c;
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
        C0955C c0955cK = C0955C.k(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            int iG = C1071b.g(cursorF, "id");
            int iG2 = C1071b.g(cursorF, "state");
            int iG3 = C1071b.g(cursorF, "worker_class_name");
            int iG4 = C1071b.g(cursorF, "input_merger_class_name");
            int iG5 = C1071b.g(cursorF, "input");
            int iG6 = C1071b.g(cursorF, "output");
            int iG7 = C1071b.g(cursorF, "initial_delay");
            int iG8 = C1071b.g(cursorF, "interval_duration");
            int iG9 = C1071b.g(cursorF, "flex_duration");
            int iG10 = C1071b.g(cursorF, "run_attempt_count");
            int iG11 = C1071b.g(cursorF, "backoff_policy");
            int iG12 = C1071b.g(cursorF, "backoff_delay_duration");
            int iG13 = C1071b.g(cursorF, "last_enqueue_time");
            int iG14 = C1071b.g(cursorF, "minimum_retention_duration");
            c0955c = c0955cK;
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
                    int I4 = r1.d.I(cursorF.getInt(iG2));
                    String string2 = cursorF.isNull(iG3) ? null : cursorF.getString(iG3);
                    String string3 = cursorF.isNull(iG4) ? null : cursorF.getString(iG4);
                    J0.h hVarA = J0.h.a(cursorF.isNull(iG5) ? null : cursorF.getBlob(iG5));
                    J0.h hVarA2 = J0.h.a(cursorF.isNull(iG6) ? null : cursorF.getBlob(iG6));
                    long j5 = cursorF.getLong(iG7);
                    long j6 = cursorF.getLong(iG8);
                    long j7 = cursorF.getLong(iG9);
                    int i10 = cursorF.getInt(iG10);
                    int iF = r1.d.F(cursorF.getInt(iG11));
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
                    int iH = r1.d.H(cursorF.getInt(i));
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
                    int iG31 = r1.d.G(cursorF.getInt(i24));
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
                    arrayList.add(new q(string, I4, string2, string3, hVarA, hVarA2, j5, j6, j7, new C0111e(iG31, z5, z6, z7, z8, j13, j14, r1.d.j(blob)), i10, iF, j8, j9, j10, j11, z4, iH, i16, i18, j12, i21, i23));
                    iG = i12;
                    i9 = i11;
                }
                cursorF.close();
                c0955c.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorF.close();
                c0955c.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0955c = c0955cK;
        }
    }

    public final ArrayList g() throws Throwable {
        C0955C c0955c;
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
        C0955C c0955cK = C0955C.k(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            int iG = C1071b.g(cursorF, "id");
            int iG2 = C1071b.g(cursorF, "state");
            int iG3 = C1071b.g(cursorF, "worker_class_name");
            int iG4 = C1071b.g(cursorF, "input_merger_class_name");
            int iG5 = C1071b.g(cursorF, "input");
            int iG6 = C1071b.g(cursorF, "output");
            int iG7 = C1071b.g(cursorF, "initial_delay");
            int iG8 = C1071b.g(cursorF, "interval_duration");
            int iG9 = C1071b.g(cursorF, "flex_duration");
            int iG10 = C1071b.g(cursorF, "run_attempt_count");
            int iG11 = C1071b.g(cursorF, "backoff_policy");
            int iG12 = C1071b.g(cursorF, "backoff_delay_duration");
            int iG13 = C1071b.g(cursorF, "last_enqueue_time");
            int iG14 = C1071b.g(cursorF, "minimum_retention_duration");
            c0955c = c0955cK;
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
                    int I4 = r1.d.I(cursorF.getInt(iG2));
                    String string2 = cursorF.isNull(iG3) ? null : cursorF.getString(iG3);
                    String string3 = cursorF.isNull(iG4) ? null : cursorF.getString(iG4);
                    J0.h hVarA = J0.h.a(cursorF.isNull(iG5) ? null : cursorF.getBlob(iG5));
                    J0.h hVarA2 = J0.h.a(cursorF.isNull(iG6) ? null : cursorF.getBlob(iG6));
                    long j5 = cursorF.getLong(iG7);
                    long j6 = cursorF.getLong(iG8);
                    long j7 = cursorF.getLong(iG9);
                    int i10 = cursorF.getInt(iG10);
                    int iF = r1.d.F(cursorF.getInt(iG11));
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
                    int iH = r1.d.H(cursorF.getInt(i));
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
                    int iG31 = r1.d.G(cursorF.getInt(i24));
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
                    arrayList.add(new q(string, I4, string2, string3, hVarA, hVarA2, j5, j6, j7, new C0111e(iG31, z5, z6, z7, z8, j13, j14, r1.d.j(blob)), i10, iF, j8, j9, j10, j11, z4, iH, i16, i18, j12, i21, i23));
                    iG = i12;
                    i9 = i11;
                }
                cursorF.close();
                c0955c.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorF.close();
                c0955c.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0955c = c0955cK;
        }
    }

    public final ArrayList h() {
        C0955C c0955c;
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
        C0955C c0955cK = C0955C.k(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            int iG = C1071b.g(cursorF, "id");
            int iG2 = C1071b.g(cursorF, "state");
            int iG3 = C1071b.g(cursorF, "worker_class_name");
            int iG4 = C1071b.g(cursorF, "input_merger_class_name");
            int iG5 = C1071b.g(cursorF, "input");
            int iG6 = C1071b.g(cursorF, "output");
            int iG7 = C1071b.g(cursorF, "initial_delay");
            int iG8 = C1071b.g(cursorF, "interval_duration");
            int iG9 = C1071b.g(cursorF, "flex_duration");
            int iG10 = C1071b.g(cursorF, "run_attempt_count");
            int iG11 = C1071b.g(cursorF, "backoff_policy");
            int iG12 = C1071b.g(cursorF, "backoff_delay_duration");
            int iG13 = C1071b.g(cursorF, "last_enqueue_time");
            int iG14 = C1071b.g(cursorF, "minimum_retention_duration");
            c0955c = c0955cK;
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
                    int I4 = r1.d.I(cursorF.getInt(iG2));
                    String string2 = cursorF.isNull(iG3) ? null : cursorF.getString(iG3);
                    String string3 = cursorF.isNull(iG4) ? null : cursorF.getString(iG4);
                    J0.h hVarA = J0.h.a(cursorF.isNull(iG5) ? null : cursorF.getBlob(iG5));
                    J0.h hVarA2 = J0.h.a(cursorF.isNull(iG6) ? null : cursorF.getBlob(iG6));
                    long j5 = cursorF.getLong(iG7);
                    long j6 = cursorF.getLong(iG8);
                    long j7 = cursorF.getLong(iG9);
                    int i10 = cursorF.getInt(iG10);
                    int iF = r1.d.F(cursorF.getInt(iG11));
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
                    int iH = r1.d.H(cursorF.getInt(i));
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
                    int iG31 = r1.d.G(cursorF.getInt(i24));
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
                    arrayList.add(new q(string, I4, string2, string3, hVarA, hVarA2, j5, j6, j7, new C0111e(iG31, z5, z6, z7, z8, j13, j14, r1.d.j(blob)), i10, iF, j8, j9, j10, j11, z4, iH, i16, i18, j12, i21, i23));
                    iG = i12;
                    i9 = i11;
                }
                cursorF.close();
                c0955c.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorF.close();
                c0955c.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0955c = c0955cK;
        }
    }

    public final int i(String str) {
        C0955C c0955cK = C0955C.k(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            c0955cK.f(1);
        } else {
            c0955cK.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        int I4 = 0;
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            if (cursorF.moveToFirst()) {
                Integer numValueOf = cursorF.isNull(0) ? null : Integer.valueOf(cursorF.getInt(0));
                if (numValueOf != null) {
                    I4 = r1.d.I(numValueOf.intValue());
                }
            }
            return I4;
        } finally {
            cursorF.close();
            c0955cK.l();
        }
    }

    public final ArrayList j(String str) {
        C0955C c0955cK = C0955C.k(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c0955cK.f(1);
        } else {
            c0955cK.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            return arrayList;
        } finally {
            cursorF.close();
            c0955cK.l();
        }
    }

    public final q k(String str) {
        C0955C c0955c;
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
        C0955C c0955cK = C0955C.k(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            c0955cK.f(1);
        } else {
            c0955cK.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            int iG = C1071b.g(cursorF, "id");
            int iG2 = C1071b.g(cursorF, "state");
            int iG3 = C1071b.g(cursorF, "worker_class_name");
            int iG4 = C1071b.g(cursorF, "input_merger_class_name");
            int iG5 = C1071b.g(cursorF, "input");
            int iG6 = C1071b.g(cursorF, "output");
            int iG7 = C1071b.g(cursorF, "initial_delay");
            int iG8 = C1071b.g(cursorF, "interval_duration");
            int iG9 = C1071b.g(cursorF, "flex_duration");
            int iG10 = C1071b.g(cursorF, "run_attempt_count");
            int iG11 = C1071b.g(cursorF, "backoff_policy");
            int iG12 = C1071b.g(cursorF, "backoff_delay_duration");
            int iG13 = C1071b.g(cursorF, "last_enqueue_time");
            int iG14 = C1071b.g(cursorF, "minimum_retention_duration");
            c0955c = c0955cK;
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
                q qVar = null;
                byte[] blob = null;
                if (cursorF.moveToFirst()) {
                    String string = cursorF.isNull(iG) ? null : cursorF.getString(iG);
                    int I4 = r1.d.I(cursorF.getInt(iG2));
                    String string2 = cursorF.isNull(iG3) ? null : cursorF.getString(iG3);
                    String string3 = cursorF.isNull(iG4) ? null : cursorF.getString(iG4);
                    J0.h hVarA = J0.h.a(cursorF.isNull(iG5) ? null : cursorF.getBlob(iG5));
                    J0.h hVarA2 = J0.h.a(cursorF.isNull(iG6) ? null : cursorF.getBlob(iG6));
                    long j5 = cursorF.getLong(iG7);
                    long j6 = cursorF.getLong(iG8);
                    long j7 = cursorF.getLong(iG9);
                    int i9 = cursorF.getInt(iG10);
                    int iF = r1.d.F(cursorF.getInt(iG11));
                    long j8 = cursorF.getLong(iG12);
                    long j9 = cursorF.getLong(iG13);
                    long j10 = cursorF.getLong(iG14);
                    long j11 = cursorF.getLong(iG15);
                    if (cursorF.getInt(iG16) != 0) {
                        i = iG17;
                        z4 = true;
                    } else {
                        i = iG17;
                        z4 = false;
                    }
                    int iH = r1.d.H(cursorF.getInt(i));
                    int i10 = cursorF.getInt(iG18);
                    int i11 = cursorF.getInt(iG19);
                    long j12 = cursorF.getLong(iG20);
                    int i12 = cursorF.getInt(iG21);
                    int i13 = cursorF.getInt(iG22);
                    int iG31 = r1.d.G(cursorF.getInt(iG23));
                    if (cursorF.getInt(iG24) != 0) {
                        i5 = iG25;
                        z5 = true;
                    } else {
                        i5 = iG25;
                        z5 = false;
                    }
                    if (cursorF.getInt(i5) != 0) {
                        i6 = iG26;
                        z6 = true;
                    } else {
                        i6 = iG26;
                        z6 = false;
                    }
                    if (cursorF.getInt(i6) != 0) {
                        i7 = iG27;
                        z7 = true;
                    } else {
                        i7 = iG27;
                        z7 = false;
                    }
                    if (cursorF.getInt(i7) != 0) {
                        i8 = iG28;
                        z8 = true;
                    } else {
                        i8 = iG28;
                        z8 = false;
                    }
                    long j13 = cursorF.getLong(i8);
                    long j14 = cursorF.getLong(iG29);
                    if (!cursorF.isNull(iG30)) {
                        blob = cursorF.getBlob(iG30);
                    }
                    qVar = new q(string, I4, string2, string3, hVarA, hVarA2, j5, j6, j7, new C0111e(iG31, z5, z6, z7, z8, j13, j14, r1.d.j(blob)), i9, iF, j8, j9, j10, j11, z4, iH, i10, i11, j12, i12, i13);
                }
                cursorF.close();
                c0955c.l();
                return qVar;
            } catch (Throwable th) {
                th = th;
                cursorF.close();
                c0955c.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0955c = c0955cK;
        }
    }

    public final ArrayList l(String str) {
        C0955C c0955cK = C0955C.k(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c0955cK.f(1);
        } else {
            c0955cK.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                String id = cursorF.isNull(0) ? null : cursorF.getString(0);
                int I4 = r1.d.I(cursorF.getInt(1));
                kotlin.jvm.internal.i.e(id, "id");
                o oVar = new o();
                oVar.f2876a = id;
                oVar.f2877b = I4;
                arrayList.add(oVar);
            }
            return arrayList;
        } finally {
            cursorF.close();
            c0955cK.l();
        }
    }

    public final void m(String str, long j5) {
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        h hVar = this.f2929l;
        z0.i iVarA = hVar.a();
        iVarA.d(1, j5);
        if (str == null) {
            iVarA.f(2);
        } else {
            iVarA.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            iVarA.e();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.j();
            hVar.q(iVarA);
        }
    }

    public final void n(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        h hVar = this.f2928k;
        z0.i iVarA = hVar.a();
        if (str == null) {
            iVarA.f(1);
        } else {
            iVarA.c(1, str);
        }
        iVarA.d(2, i);
        workDatabase_Impl.c();
        try {
            iVarA.e();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.j();
            hVar.q(iVarA);
        }
    }

    public final void o(String str, long j5) {
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        h hVar = this.h;
        z0.i iVarA = hVar.a();
        iVarA.d(1, j5);
        if (str == null) {
            iVarA.f(2);
        } else {
            iVarA.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            iVarA.e();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.j();
            hVar.q(iVarA);
        }
    }

    public final void p(String str, J0.h hVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        h hVar2 = this.f2926g;
        z0.i iVarA = hVar2.a();
        byte[] bArrB = J0.h.b(hVar);
        if (bArrB == null) {
            iVarA.f(1);
        } else {
            iVarA.j(bArrB, 1);
        }
        if (str == null) {
            iVarA.f(2);
        } else {
            iVarA.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            iVarA.e();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.j();
            hVar2.q(iVarA);
        }
    }

    public final void q(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        h hVar = this.f2923d;
        z0.i iVarA = hVar.a();
        iVarA.d(1, r1.d.U(i));
        if (str == null) {
            iVarA.f(2);
        } else {
            iVarA.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            iVarA.e();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.j();
            hVar.q(iVarA);
        }
    }

    public final void r(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f2920a;
        workDatabase_Impl.b();
        h hVar = this.f2931n;
        z0.i iVarA = hVar.a();
        iVarA.d(1, i);
        if (str == null) {
            iVarA.f(2);
        } else {
            iVarA.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            iVarA.e();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.j();
            hVar.q(iVarA);
        }
    }
}
