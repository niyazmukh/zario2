package R0;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\R0\b.smali */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Notification f2833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2834c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f2835d;

    public b(SystemForegroundService systemForegroundService, int i, Notification notification, int i5) {
        this.f2835d = systemForegroundService;
        this.f2832a = i;
        this.f2833b = notification;
        this.f2834c = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        int i5 = this.f2834c;
        Notification notification = this.f2833b;
        int i6 = this.f2832a;
        SystemForegroundService systemForegroundService = this.f2835d;
        if (i >= 31) {
            d.a(systemForegroundService, i6, notification, i5);
        } else {
            c.a(systemForegroundService, i6, notification, i5);
        }
    }
}
