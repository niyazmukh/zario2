package M0;

import E2.r;
import J0.t;
import S0.j;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M0\b.smali */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2437a = t.f("Alarms");

    public static void a(Context context, j jVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f2438f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.d(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        t.d().a(f2437a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, j jVar, long j5) {
        S0.i iVarS = workDatabase.s();
        S0.g gVarO = iVarS.o(jVar);
        if (gVarO != null) {
            int i = gVarO.f2856c;
            a(context, jVar, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f2438f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.d(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j5, service);
                return;
            }
            return;
        }
        Object objN = workDatabase.n(new r(new g1.i(workDatabase), 2));
        kotlin.jvm.internal.i.d(objN, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objN).intValue();
        iVarS.p(new S0.g(jVar.f2862a, jVar.f2863b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f2438f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.d(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j5, service2);
        }
    }
}
