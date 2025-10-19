package N0;

import J0.C0108b;
import J0.C0110d;
import J0.C0111e;
import J0.t;
import K0.h;
import S0.g;
import S0.i;
import S0.j;
import S0.q;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N0\b.smali */
public final class b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final String f2549f = t.f("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f2550a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f2551b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2552c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f2553d;

    /* renamed from: e, reason: collision with root package name */
    public final C0108b f2554e;

    public b(Context context, WorkDatabase workDatabase, C0108b c0108b) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context, c0108b.f2026c);
        this.f2550a = context;
        this.f2551b = jobScheduler;
        this.f2552c = aVar;
        this.f2553d = workDatabase;
        this.f2554e = c0108b;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            t.d().c(f2549f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            t.d().c(f2549f, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // K0.h
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.f2550a;
        JobScheduler jobScheduler = this.f2551b;
        ArrayList arrayListC = c(context, jobScheduler);
        if (arrayListC == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                j jVarF = f(jobInfo);
                if (jVarF != null && str.equals(jVarF.f2862a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b(jobScheduler, ((Integer) it2.next()).intValue());
        }
        i iVarS = this.f2553d.s();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarS.f2858a;
        workDatabase_Impl.b();
        S0.h hVar = (S0.h) iVarS.f2861d;
        z0.i iVarA = hVar.a();
        if (str == null) {
            iVarA.f(1);
        } else {
            iVarA.c(1, str);
        }
        workDatabase_Impl.c();
        try {
            iVarA.e();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.j();
            hVar.q(iVarA);
        }
    }

    @Override // K0.h
    public final void d(q... qVarArr) {
        int iIntValue;
        C0108b c0108b = this.f2554e;
        WorkDatabase workDatabase = this.f2553d;
        final g1.i iVar = new g1.i(workDatabase);
        for (q qVar : qVarArr) {
            workDatabase.c();
            try {
                q qVarK = workDatabase.v().k(qVar.f2895a);
                String str = f2549f;
                String str2 = qVar.f2895a;
                if (qVarK == null) {
                    t.d().g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (qVarK.f2896b != 1) {
                    t.d().g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    j jVarR = p1.b.r(qVar);
                    g gVarO = workDatabase.s().o(jVarR);
                    if (gVarO != null) {
                        iIntValue = gVarO.f2856c;
                    } else {
                        c0108b.getClass();
                        final int i = c0108b.h;
                        Object objN = ((WorkDatabase) iVar.f7594b).n(new Callable() { // from class: T0.f
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                g1.i this$0 = iVar;
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                WorkDatabase workDatabase2 = (WorkDatabase) this$0.f7594b;
                                Long lR = workDatabase2.r().r("next_job_scheduler_id");
                                int i5 = 0;
                                int iLongValue = lR != null ? (int) lR.longValue() : 0;
                                workDatabase2.r().t(new S0.d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i) {
                                    workDatabase2.r().t(new S0.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i5 = iLongValue;
                                }
                                return Integer.valueOf(i5);
                            }
                        });
                        kotlin.jvm.internal.i.d(objN, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objN).intValue();
                    }
                    if (gVarO == null) {
                        workDatabase.s().p(new g(jVarR.f2862a, jVarR.f2863b, iIntValue));
                    }
                    g(qVar, iIntValue);
                    workDatabase.o();
                }
            } finally {
                workDatabase.j();
            }
        }
    }

    @Override // K0.h
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(q qVar, int i) {
        int i5;
        JobScheduler jobScheduler = this.f2551b;
        a aVar = this.f2552c;
        aVar.getClass();
        C0111e c0111e = qVar.f2902j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = qVar.f2895a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", qVar.f2912t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", qVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, aVar.f2547a).setRequiresCharging(c0111e.f2037b);
        boolean z4 = c0111e.f2038c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z4).setExtras(persistableBundle);
        int i6 = Build.VERSION.SDK_INT;
        int i7 = c0111e.f2036a;
        if (i6 < 30 || i7 != 6) {
            int iC = t.h.c(i7);
            if (iC == 0) {
                i5 = 0;
            } else if (iC == 1) {
                i5 = 1;
            } else if (iC != 2) {
                i5 = 3;
                if (iC != 3) {
                    i5 = 4;
                    if (iC != 4) {
                        t.d().a(a.f2546c, "API version too low. Cannot convert network type value ".concat(B.a.x(i7)));
                        i5 = 1;
                    }
                }
            } else {
                i5 = 2;
            }
            extras.setRequiredNetworkType(i5);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z4) {
            extras.setBackoffCriteria(qVar.f2905m, qVar.f2904l == 2 ? 0 : 1);
        }
        long jA = qVar.a();
        aVar.f2548b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!qVar.f2909q) {
            extras.setImportantWhileForeground(true);
        }
        Set<C0110d> set = c0111e.h;
        if (!set.isEmpty()) {
            for (C0110d c0110d : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(c0110d.f2034a, c0110d.f2035b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c0111e.f2041f);
            extras.setTriggerContentMaxDelay(c0111e.f2042g);
        }
        extras.setPersisted(false);
        int i8 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(c0111e.f2039d);
        extras.setRequiresStorageNotLow(c0111e.f2040e);
        byte b5 = qVar.f2903k > 0;
        byte b6 = jMax > 0;
        if (i8 >= 31 && qVar.f2909q && b5 == false && b6 == false) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        String str2 = f2549f;
        t.d().a(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                t.d().g(str2, "Unable to schedule work ID " + str);
                if (qVar.f2909q && qVar.f2910r == 1) {
                    qVar.f2909q = false;
                    t.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(qVar, i);
                }
            }
        } catch (IllegalStateException e5) {
            ArrayList arrayListC = c(this.f2550a, jobScheduler);
            String str3 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(arrayListC != null ? arrayListC.size() : 0), Integer.valueOf(this.f2553d.v().h().size()), Integer.valueOf(this.f2554e.f2031j));
            t.d().b(str2, str3);
            throw new IllegalStateException(str3, e5);
        } catch (Throwable th) {
            t.d().c(str2, "Unable to schedule " + qVar, th);
        }
    }
}
