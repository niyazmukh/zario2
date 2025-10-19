package b3;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\a.1.smali */
public final class C0302a implements InterfaceC0296U {
    public final void a(Context context, C0309d0 c0309d0) {
        Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel("minutes_sync_alerts") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("minutes_sync_alerts", context.getString(2131886448), 3);
            notificationChannel.setDescription(context.getString(2131886447));
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Object systemService2 = context.getSystemService("notification");
        kotlin.jvm.internal.i.c(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        A.k kVar = new A.k(context, "minutes_sync_alerts");
        kVar.f23o.icon = 2131623936;
        kVar.f15e = A.k.b(context.getString(2131886450));
        kVar.f16f = A.k.b(context.getString(2131886449));
        S0.c cVar = new S0.c(1);
        cVar.f2848c = A.k.b(context.getString(2131886449));
        kVar.d(cVar);
        kVar.h = 0;
        kVar.c(false);
        Notification notificationA = kVar.a();
        kotlin.jvm.internal.i.d(notificationA, "build(...)");
        ((NotificationManager) systemService2).notify(2002, notificationA);
    }
}
