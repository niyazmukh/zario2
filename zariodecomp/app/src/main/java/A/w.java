package A;

import android.app.NotificationManager;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A\w.smali */
public abstract class w {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static int b(NotificationManager notificationManager) {
        return notificationManager.getImportance();
    }
}
