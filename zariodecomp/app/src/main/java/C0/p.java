package c0;

import A2.RunnableC0005e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\p.smali */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5379a;

    /* renamed from: b, reason: collision with root package name */
    public final C2.j f5380b;

    /* renamed from: c, reason: collision with root package name */
    public final X1.e f5381c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5382d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f5383e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f5384f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f5385g;
    public p1.b h;

    public p(Context context, C2.j jVar) {
        X1.e eVar = q.f5386d;
        this.f5382d = new Object();
        r1.d.m(context, "Context cannot be null");
        this.f5379a = context.getApplicationContext();
        this.f5380b = jVar;
        this.f5381c = eVar;
    }

    @Override // c0.h
    public final void a(p1.b bVar) {
        synchronized (this.f5382d) {
            this.h = bVar;
        }
        synchronized (this.f5382d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f5384f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0333a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5385g = threadPoolExecutor;
                    this.f5384f = threadPoolExecutor;
                }
                this.f5384f.execute(new RunnableC0005e(this, 23));
            } finally {
            }
        }
    }

    public final void b() {
        synchronized (this.f5382d) {
            try {
                this.h = null;
                Handler handler = this.f5383e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f5383e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5385g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f5384f = null;
                this.f5385g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final J.g c() throws Resources.NotFoundException {
        try {
            X1.e eVar = this.f5381c;
            Context context = this.f5379a;
            C2.j jVar = this.f5380b;
            eVar.getClass();
            E2.j jVarA = J.b.a(context, jVar);
            int i = jVarA.f1459b;
            if (i != 0) {
                throw new RuntimeException(B.a.i("fetchFonts failed (", i, ")"));
            }
            J.g[] gVarArr = (J.g[]) jVarA.f1460c;
            if (gVarArr == null || gVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return gVarArr[0];
        } catch (PackageManager.NameNotFoundException e5) {
            throw new RuntimeException("provider not found", e5);
        }
    }
}
