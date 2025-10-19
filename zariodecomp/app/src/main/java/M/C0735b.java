package m;

import a.AbstractC0183a;
import android.os.Handler;
import android.os.Looper;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m.1\b.smali */
public final class C0735b extends AbstractC0183a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0735b f8808b;

    /* renamed from: c, reason: collision with root package name */
    public static final ExecutorC0734a f8809c = new ExecutorC0734a(0);

    /* renamed from: a, reason: collision with root package name */
    public final C0737d f8810a = new C0737d();

    public static C0735b q0() {
        if (f8808b != null) {
            return f8808b;
        }
        synchronized (C0735b.class) {
            try {
                if (f8808b == null) {
                    f8808b = new C0735b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8808b;
    }

    public final void r0(Runnable runnable) {
        C0737d c0737d = this.f8810a;
        if (c0737d.f8815c == null) {
            synchronized (c0737d.f8813a) {
                try {
                    if (c0737d.f8815c == null) {
                        c0737d.f8815c = Handler.createAsync(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c0737d.f8815c.post(runnable);
    }
}
