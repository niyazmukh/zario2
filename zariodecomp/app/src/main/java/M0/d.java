package M0;

import J0.t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M0\d.smali */
public abstract class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2444a = t.f("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        t.d().a(f2444a, "onReceive : " + intent);
        String str = c.f2438f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
