package R0;

import J0.t;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\R0\d.smali */
public abstract class d {
    public static void a(Service service, int i, Notification notification, int i5) {
        try {
            service.startForeground(i, notification, i5);
        } catch (ForegroundServiceStartNotAllowedException e5) {
            t tVarD = t.d();
            String str = SystemForegroundService.f4867f;
            if (tVarD.f2064a <= 5) {
                Log.w(str, "Unable to start foreground service", e5);
            }
        }
    }
}
