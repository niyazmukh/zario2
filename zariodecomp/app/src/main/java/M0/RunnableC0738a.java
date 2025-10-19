package m0;

import X2.k;
import android.os.Looper;
import g1.C0575d;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import m.ThreadFactoryC0736c;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m0.1\a.smali */
public final class RunnableC0738a implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public static final ThreadPoolExecutor f8816l;

    /* renamed from: m, reason: collision with root package name */
    public static HandlerC0741d f8817m;

    /* renamed from: n, reason: collision with root package name */
    public static volatile ThreadPoolExecutor f8818n;

    /* renamed from: a, reason: collision with root package name */
    public final k f8819a;

    /* renamed from: b, reason: collision with root package name */
    public final C0739b f8820b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f8821c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f8822d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f8823e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f8824f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0575d f8825k;

    static {
        ThreadFactoryC0736c threadFactoryC0736c = new ThreadFactoryC0736c(1);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactoryC0736c);
        f8816l = threadPoolExecutor;
        f8818n = threadPoolExecutor;
    }

    public RunnableC0738a(C0575d c0575d) {
        this.f8825k = c0575d;
        k kVar = new k(this, 3);
        this.f8819a = kVar;
        this.f8820b = new C0739b(this, kVar);
        this.f8824f = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        HandlerC0741d handlerC0741d;
        synchronized (RunnableC0738a.class) {
            try {
                if (f8817m == null) {
                    f8817m = new HandlerC0741d(Looper.getMainLooper());
                }
                handlerC0741d = f8817m;
            } catch (Throwable th) {
                throw th;
            }
        }
        handlerC0741d.obtainMessage(1, new C0740c(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8825k.b();
    }
}
