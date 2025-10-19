package A;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A\x.smali */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f25a;

    static {
        new HashSet();
    }

    public x(Context context) {
        this.f25a = (NotificationManager) context.getSystemService("notification");
    }
}
