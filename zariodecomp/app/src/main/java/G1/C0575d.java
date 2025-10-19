package g1;

import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l0.C0726a;
import m0.RunnableC0738a;

/* renamed from: g1.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g1.1\d.smali */
public final class C0575d {

    /* renamed from: a, reason: collision with root package name */
    public C0726a f7579a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7580b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7581c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7582d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7583e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f7584f;

    /* renamed from: g, reason: collision with root package name */
    public volatile RunnableC0738a f7585g;
    public volatile RunnableC0738a h;
    public final Semaphore i;

    /* renamed from: j, reason: collision with root package name */
    public final Set f7586j;

    public C0575d(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = RunnableC0738a.f8816l;
        this.f7580b = false;
        this.f7581c = false;
        this.f7582d = true;
        this.f7583e = false;
        signInHubActivity.getApplicationContext();
        this.f7584f = threadPoolExecutor;
        this.i = new Semaphore(0);
        this.f7586j = set;
    }

    public final void a() {
        if (this.f7585g != null) {
            if (!this.f7580b) {
                this.f7583e = true;
            }
            if (this.h != null) {
                this.f7585g.getClass();
                this.f7585g = null;
                return;
            }
            this.f7585g.getClass();
            RunnableC0738a runnableC0738a = this.f7585g;
            runnableC0738a.f8822d.set(true);
            if (runnableC0738a.f8820b.cancel(false)) {
                this.h = this.f7585g;
            }
            this.f7585g = null;
        }
    }

    public final void b() {
        if (this.h != null || this.f7585g == null) {
            return;
        }
        this.f7585g.getClass();
        RunnableC0738a runnableC0738a = this.f7585g;
        ThreadPoolExecutor threadPoolExecutor = this.f7584f;
        if (runnableC0738a.f8821c == 1) {
            runnableC0738a.f8821c = 2;
            runnableC0738a.f8819a.getClass();
            threadPoolExecutor.execute(runnableC0738a.f8820b);
        } else {
            int iC = t.h.c(runnableC0738a.f8821c);
            if (iC == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iC == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public final void c() throws InterruptedException {
        Iterator it = this.f7586j.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e5) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e5);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        p1.b.g(this, sb);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
