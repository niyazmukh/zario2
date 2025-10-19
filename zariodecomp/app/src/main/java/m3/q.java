package m3;

import S2.u;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.f0;
import com.niyaz.zario.worker.MonitoringWorkScheduler;
import com.niyaz.zario.worker.WorkProgressRepository;
import f4.A0;
import f4.E;
import f4.N;
import i4.C;
import i4.I;
import i4.x;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.concurrent.CancellationException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m3.1\q.smali */
public final class q extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8895a;

    /* renamed from: b, reason: collision with root package name */
    public final u f8896b;

    /* renamed from: c, reason: collision with root package name */
    public final MonitoringWorkScheduler f8897c;

    /* renamed from: d, reason: collision with root package name */
    public final U2.l f8898d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkProgressRepository f8899e;

    /* renamed from: f, reason: collision with root package name */
    public final I f8900f;

    /* renamed from: g, reason: collision with root package name */
    public final x f8901g;
    public A0 h;

    public q(Context context, u repository, MonitoringWorkScheduler monitoringWorkScheduler, U2.l usageStatsRepository, WorkProgressRepository workProgressRepository) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(repository, "repository");
        kotlin.jvm.internal.i.e(monitoringWorkScheduler, "monitoringWorkScheduler");
        kotlin.jvm.internal.i.e(usageStatsRepository, "usageStatsRepository");
        kotlin.jvm.internal.i.e(workProgressRepository, "workProgressRepository");
        this.f8895a = context;
        this.f8896b = repository;
        this.f8897c = monitoringWorkScheduler;
        this.f8898d = usageStatsRepository;
        this.f8899e = workProgressRepository;
        I iB = C.b(V2.k.a);
        this.f8900f = iB;
        this.f8901g = new x(iB);
        d();
    }

    public static final Object b(q qVar, Q3.j jVar) {
        qVar.getClass();
        m4.e eVar = N.f7027a;
        return E.B(m4.d.f8928c, new k(qVar, null), jVar);
    }

    public static V2.h c(q qVar, V2.n nVar, long j5, Long l4, int i) {
        Long l5 = (i & 8) != 0 ? null : l4;
        qVar.getClass();
        Long l6 = nVar.f3451e;
        long jLongValue = l5 != null ? l5.longValue() : Math.max(0L, System.currentTimeMillis() - (l6 != null ? l6.longValue() : LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        LocalDate localDateNow = LocalDate.now();
        LocalTime localTime = LocalTime.MAX;
        long jMax = Math.max(0L, localDateNow.atTime(localTime).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - jCurrentTimeMillis);
        long j6 = nVar.f3447a;
        float f2 = j6 > 0 ? (j5 / j6) * 100.0f : 0.0f;
        long epochMilli = LocalDate.now().atTime(localTime).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        return new V2.h(nVar, j5, jLongValue, jMax, f2, epochMilli > 0 ? ((l5 != null ? l5.longValue() : Math.max(0L, System.currentTimeMillis() - LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli())) / epochMilli) * 100.0f : 0.0f);
    }

    public final void d() {
        E.t(a0.h(this), null, null, new o(this, null), 3);
    }

    @Override // androidx.lifecycle.f0
    public final void onCleared() {
        Log.d("InterventionViewModel", "ViewModel cleared");
        A0 a02 = this.h;
        if (a02 != null) {
            a02.cancel((CancellationException) null);
        }
    }
}
