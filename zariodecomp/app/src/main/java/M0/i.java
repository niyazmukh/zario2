package M0;

import J0.t;
import K0.r;
import S0.j;
import S0.l;
import T0.p;
import T0.w;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M0\i.smali */
public final class i implements K0.c {

    /* renamed from: o, reason: collision with root package name */
    public static final String f2469o = t.f("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f2470a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.a f2471b;

    /* renamed from: c, reason: collision with root package name */
    public final w f2472c;

    /* renamed from: d, reason: collision with root package name */
    public final K0.f f2473d;

    /* renamed from: e, reason: collision with root package name */
    public final r f2474e;

    /* renamed from: f, reason: collision with root package name */
    public final c f2475f;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2476k;

    /* renamed from: l, reason: collision with root package name */
    public Intent f2477l;

    /* renamed from: m, reason: collision with root package name */
    public SystemAlarmService f2478m;

    /* renamed from: n, reason: collision with root package name */
    public final l f2479n;

    public i(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f2470a = applicationContext;
        S0.e eVar = new S0.e(5);
        r rVarB = r.b(systemAlarmService);
        this.f2474e = rVarB;
        this.f2475f = new c(applicationContext, rVarB.f2173b.f2026c, eVar);
        this.f2472c = new w(rVarB.f2173b.f2029f);
        K0.f fVar = rVarB.f2177f;
        this.f2473d = fVar;
        V0.a aVar = rVarB.f2175d;
        this.f2471b = aVar;
        this.f2479n = new l(fVar, aVar);
        fVar.a(this);
        this.f2476k = new ArrayList();
        this.f2477l = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i) {
        t tVarD = t.d();
        String str = f2469o;
        tVarD.a(str, "Adding command " + intent + " (" + i + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            t.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f2476k) {
                try {
                    Iterator it = this.f2476k.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f2476k) {
            try {
                boolean zIsEmpty = this.f2476k.isEmpty();
                this.f2476k.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // K0.c
    public final void c(j jVar, boolean z4) {
        V0.b bVar = (V0.b) ((S0.i) this.f2471b).f2861d;
        String str = c.f2438f;
        Intent intent = new Intent(this.f2470a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z4);
        c.d(intent, jVar);
        bVar.execute(new F1.b(this, intent, 0, 1));
    }

    public final void d() {
        b();
        PowerManager.WakeLock wakeLockA = p.a(this.f2470a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f2474e.f2175d.c(new h(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
