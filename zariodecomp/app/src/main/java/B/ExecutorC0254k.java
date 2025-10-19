package b;

import A2.G;
import A2.RunnableC0005e;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g0.AbstractActivityC0570w;
import java.util.concurrent.Executor;

/* renamed from: b.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\k.smali */
public final class ExecutorC0254k implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f4899b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0570w f4901d;

    /* renamed from: a, reason: collision with root package name */
    public final long f4898a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4900c = false;

    public ExecutorC0254k(AbstractActivityC0570w abstractActivityC0570w) {
        this.f4901d = abstractActivityC0570w;
    }

    public final void a(View view) {
        if (this.f4900c) {
            return;
        }
        this.f4900c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4899b = runnable;
        View decorView = this.f4901d.getWindow().getDecorView();
        if (!this.f4900c) {
            decorView.postOnAnimation(new RunnableC0005e(this, 18));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z4;
        Runnable runnable = this.f4899b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f4898a) {
                this.f4900c = false;
                this.f4901d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f4899b = null;
        G g3 = this.f4901d.f4911n;
        synchronized (g3.f87b) {
            z4 = g3.f86a;
        }
        if (z4) {
            this.f4900c = false;
            this.f4901d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4901d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
