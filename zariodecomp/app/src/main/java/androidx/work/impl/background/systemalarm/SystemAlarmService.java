package androidx.work.impl.background.systemalarm;

import J0.t;
import M0.i;
import T0.p;
import T0.q;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.y;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\impl\background\systemalarm\SystemAlarmService.smali */
public class SystemAlarmService extends y {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4858d = t.f("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public i f4859b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4860c;

    public final void a() {
        this.f4860c = true;
        t.d().a(f4858d, "All commands completed in dispatcher");
        String str = p.f3167a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (q.f3168a) {
            linkedHashMap.putAll(q.f3169b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                t.d().g(p.f3167a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        i iVar = new i(this);
        this.f4859b = iVar;
        if (iVar.f2478m != null) {
            t.d().b(i.f2469o, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            iVar.f2478m = this;
        }
        this.f4860c = false;
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f4860c = true;
        i iVar = this.f4859b;
        iVar.getClass();
        t.d().a(i.f2469o, "Destroying SystemAlarmDispatcher");
        iVar.f2473d.e(iVar);
        iVar.f2478m = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i5) {
        super.onStartCommand(intent, i, i5);
        if (this.f4860c) {
            t.d().e(f4858d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            i iVar = this.f4859b;
            iVar.getClass();
            t tVarD = t.d();
            String str = i.f2469o;
            tVarD.a(str, "Destroying SystemAlarmDispatcher");
            iVar.f2473d.e(iVar);
            iVar.f2478m = null;
            i iVar2 = new i(this);
            this.f4859b = iVar2;
            if (iVar2.f2478m != null) {
                t.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                iVar2.f2478m = this;
            }
            this.f4860c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4859b.a(intent, i5);
        return 3;
    }
}
