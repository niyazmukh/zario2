package w3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w3.1\e.smali */
public final class e extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final l f10986a;

    public e(l recorder) {
        kotlin.jvm.internal.i.e(recorder, "recorder");
        this.f10986a = recorder;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        u3.c cVar;
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -2128145023) {
            if (iHashCode != -1454123155) {
                if (iHashCode != 823795052 || !action.equals("android.intent.action.USER_PRESENT")) {
                    return;
                } else {
                    cVar = u3.c.f10490c;
                }
            } else if (!action.equals("android.intent.action.SCREEN_ON")) {
                return;
            } else {
                cVar = u3.c.f10488a;
            }
        } else if (!action.equals("android.intent.action.SCREEN_OFF")) {
            return;
        } else {
            cVar = u3.c.f10489b;
        }
        this.f10986a.c(new u3.f(System.currentTimeMillis(), u3.b.f10484a, cVar));
    }
}
