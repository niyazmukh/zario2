package A;

import android.app.Notification;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A\v.smali */
public abstract class v {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z4) {
        return builder.setAuthenticationRequired(z4);
    }

    public static Notification.Builder b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
