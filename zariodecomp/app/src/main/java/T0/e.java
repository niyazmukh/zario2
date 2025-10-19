package T0;

import a.AbstractC0183a;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\e.smali */
public final class e implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3142e = J0.t.f("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f3143f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3144a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.r f3145b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.i f3146c;

    /* renamed from: d, reason: collision with root package name */
    public int f3147d = 0;

    public e(Context context, K0.r rVar) {
        this.f3144a = context.getApplicationContext();
        this.f3145b = rVar;
        this.f3146c = rVar.f2178g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f3143f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.e.a():void");
    }

    public final boolean b() {
        this.f3145b.f2173b.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f3142e;
        if (zIsEmpty) {
            J0.t.d().a(str, "The default process name was not specified.");
            return true;
        }
        int i = l.f3156a;
        Context context = this.f3144a;
        kotlin.jvm.internal.i.e(context, "context");
        boolean zA = kotlin.jvm.internal.i.a(a.f3133a.a(), context.getApplicationInfo().processName);
        J0.t.d().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f3144a;
        String str = f3142e;
        K0.r rVar = this.f3145b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    AbstractC0183a.W(context);
                    J0.t.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e5) {
                        int i = this.f3147d + 1;
                        this.f3147d = i;
                        if (i >= 3) {
                            String str2 = I.n.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            J0.t.d().c(str, str2, e5);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e5);
                            rVar.f2173b.getClass();
                            throw illegalStateException;
                        }
                        long j5 = i * 300;
                        String str3 = "Retrying after " + j5;
                        if (J0.t.d().f2064a <= 3) {
                            Log.d(str, str3, e5);
                        }
                        try {
                            Thread.sleep(this.f3147d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e6) {
                    J0.t.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e6);
                    rVar.f2173b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            rVar.d();
        }
    }
}
