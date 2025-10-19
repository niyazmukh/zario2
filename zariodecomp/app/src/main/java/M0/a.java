package M0;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M0\a.smali */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i, long j5, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j5, pendingIntent);
    }
}
