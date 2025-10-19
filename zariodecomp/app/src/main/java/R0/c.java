package R0;

import android.app.Notification;
import android.app.Service;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\R0\c.smali */
public abstract class c {
    public static void a(Service service, int i, Notification notification, int i5) {
        service.startForeground(i, notification, i5);
    }
}
