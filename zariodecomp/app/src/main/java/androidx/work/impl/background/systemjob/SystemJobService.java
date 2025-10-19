package androidx.work.impl.background.systemjob;

import A2.C0009i;
import B3.J;
import J0.t;
import K0.c;
import K0.f;
import K0.r;
import N0.d;
import S0.e;
import S0.j;
import S0.l;
import V0.a;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\impl\background\systemjob\SystemJobService.smali */
public class SystemJobService extends JobService implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f4861e = t.f("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public r f4862a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4863b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final e f4864c = new e(5);

    /* renamed from: d, reason: collision with root package name */
    public l f4865d;

    public static j a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // K0.c
    public final void c(j jVar, boolean z4) {
        JobParameters jobParameters;
        t.d().a(f4861e, jVar.f2862a + " executed on JobScheduler");
        synchronized (this.f4863b) {
            jobParameters = (JobParameters) this.f4863b.remove(jVar);
        }
        this.f4864c.z(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z4);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            r rVarB = r.b(getApplicationContext());
            this.f4862a = rVarB;
            f fVar = rVarB.f2177f;
            this.f4865d = new l(fVar, rVarB.f2175d);
            fVar.a(this);
        } catch (IllegalStateException e5) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e5);
            }
            t.d().g(f4861e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        r rVar = this.f4862a;
        if (rVar != null) {
            rVar.f2177f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f4862a == null) {
            t.d().a(f4861e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            t.d().b(f4861e, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f4863b) {
            try {
                if (this.f4863b.containsKey(jVarA)) {
                    t.d().a(f4861e, "Job is already being executed by SystemJobService: " + jVarA);
                    return false;
                }
                t.d().a(f4861e, "onStartJob for " + jVarA);
                this.f4863b.put(jVarA, jobParameters);
                C0009i c0009i = new C0009i();
                if (N0.c.b(jobParameters) != null) {
                    c0009i.f205c = Arrays.asList(N0.c.b(jobParameters));
                }
                if (N0.c.a(jobParameters) != null) {
                    c0009i.f204b = Arrays.asList(N0.c.a(jobParameters));
                }
                c0009i.f206d = d.a(jobParameters);
                l lVar = this.f4865d;
                ((a) lVar.f2868c).c(new J((f) lVar.f2867b, this.f4864c.C(jVarA), c0009i));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.f4862a == null) {
            t.d().a(f4861e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            t.d().b(f4861e, "WorkSpec id not found!");
            return false;
        }
        t.d().a(f4861e, "onStopJob for " + jVarA);
        synchronized (this.f4863b) {
            this.f4863b.remove(jVarA);
        }
        K0.l lVarZ = this.f4864c.z(jVarA);
        if (lVarZ != null) {
            int iA = Build.VERSION.SDK_INT >= 31 ? N0.e.a(jobParameters) : -512;
            l lVar = this.f4865d;
            lVar.getClass();
            lVar.F(lVarZ, iA);
        }
        f fVar = this.f4862a.f2177f;
        String str = jVarA.f2862a;
        synchronized (fVar.f2144k) {
            zContains = fVar.i.contains(str);
        }
        return !zContains;
    }
}
