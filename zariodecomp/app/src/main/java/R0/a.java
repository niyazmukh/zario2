package R0;

import B3.RunnableC0040f;
import J0.t;
import K0.f;
import K0.l;
import K0.r;
import O0.e;
import S0.j;
import S0.q;
import T0.n;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import f4.InterfaceC0506g0;
import h1.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\R0\a.smali */
public final class a implements e, K0.c {

    /* renamed from: n, reason: collision with root package name */
    public static final String f2822n = t.f("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final r f2823a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.a f2824b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2825c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public j f2826d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f2827e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f2828f;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f2829k;

    /* renamed from: l, reason: collision with root package name */
    public final i f2830l;

    /* renamed from: m, reason: collision with root package name */
    public SystemForegroundService f2831m;

    public a(Context context) {
        r rVarB = r.b(context);
        this.f2823a = rVarB;
        this.f2824b = rVarB.f2175d;
        this.f2826d = null;
        this.f2827e = new LinkedHashMap();
        this.f2829k = new HashMap();
        this.f2828f = new HashMap();
        this.f2830l = new i(rVarB.f2179j);
        rVarB.f2177f.a(this);
    }

    public static Intent a(Context context, j jVar, J0.j jVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", jVar2.f2054a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar2.f2055b);
        intent.putExtra("KEY_NOTIFICATION", jVar2.f2056c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2862a);
        intent.putExtra("KEY_GENERATION", jVar.f2863b);
        return intent;
    }

    public static Intent d(Context context, j jVar, J0.j jVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2862a);
        intent.putExtra("KEY_GENERATION", jVar.f2863b);
        intent.putExtra("KEY_NOTIFICATION_ID", jVar2.f2054a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar2.f2055b);
        intent.putExtra("KEY_NOTIFICATION", jVar2.f2056c);
        return intent;
    }

    @Override // O0.e
    public final void b(q qVar, O0.c cVar) {
        if (cVar instanceof O0.b) {
            t.d().a(f2822n, "Constraints unmet for WorkSpec " + qVar.f2895a);
            j jVarR = p1.b.r(qVar);
            r rVar = this.f2823a;
            rVar.getClass();
            l lVar = new l(jVarR);
            f processor = rVar.f2177f;
            kotlin.jvm.internal.i.e(processor, "processor");
            rVar.f2175d.c(new n(processor, lVar, true, -512));
        }
    }

    @Override // K0.c
    public final void c(j jVar, boolean z4) {
        Map.Entry entry;
        synchronized (this.f2825c) {
            try {
                InterfaceC0506g0 interfaceC0506g0 = ((q) this.f2828f.remove(jVar)) != null ? (InterfaceC0506g0) this.f2829k.remove(jVar) : null;
                if (interfaceC0506g0 != null) {
                    interfaceC0506g0.cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        J0.j jVar2 = (J0.j) this.f2827e.remove(jVar);
        if (jVar.equals(this.f2826d)) {
            if (this.f2827e.size() > 0) {
                Iterator it = this.f2827e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f2826d = (j) entry.getKey();
                if (this.f2831m != null) {
                    J0.j jVar3 = (J0.j) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f2831m;
                    systemForegroundService.f4868b.post(new b(systemForegroundService, jVar3.f2054a, jVar3.f2056c, jVar3.f2055b));
                    SystemForegroundService systemForegroundService2 = this.f2831m;
                    systemForegroundService2.f4868b.post(new RunnableC0040f(systemForegroundService2, jVar3.f2054a, 3));
                }
            } else {
                this.f2826d = null;
            }
        }
        SystemForegroundService systemForegroundService3 = this.f2831m;
        if (jVar2 == null || systemForegroundService3 == null) {
            return;
        }
        t.d().a(f2822n, "Removing Notification (id: " + jVar2.f2054a + ", workSpecId: " + jVar + ", notificationType: " + jVar2.f2055b);
        systemForegroundService3.f4868b.post(new RunnableC0040f(systemForegroundService3, jVar2.f2054a, 3));
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        t.d().a(f2822n, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f2831m == null) {
            return;
        }
        J0.j jVar2 = new J0.j(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f2827e;
        linkedHashMap.put(jVar, jVar2);
        if (this.f2826d == null) {
            this.f2826d = jVar;
            SystemForegroundService systemForegroundService = this.f2831m;
            systemForegroundService.f4868b.post(new b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f2831m;
        systemForegroundService2.f4868b.post(new F1.b(systemForegroundService2, intExtra, notification, 2));
        if (intExtra2 != 0) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                i |= ((J0.j) ((Map.Entry) it.next()).getValue()).f2055b;
            }
            J0.j jVar3 = (J0.j) linkedHashMap.get(this.f2826d);
            if (jVar3 != null) {
                SystemForegroundService systemForegroundService3 = this.f2831m;
                systemForegroundService3.f4868b.post(new b(systemForegroundService3, jVar3.f2054a, jVar3.f2056c, i));
            }
        }
    }

    public final void f() {
        this.f2831m = null;
        synchronized (this.f2825c) {
            try {
                Iterator it = this.f2829k.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC0506g0) it.next()).cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2823a.f2177f.e(this);
    }
}
