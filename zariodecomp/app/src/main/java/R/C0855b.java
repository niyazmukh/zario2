package r;

import java.util.concurrent.CancellationException;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r.1\b.smali */
public final class C0855b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0855b f9543c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0855b f9544d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9545a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f9546b;

    static {
        if (h.f9557d) {
            f9544d = null;
            f9543c = null;
        } else {
            f9544d = new C0855b(false, null);
            f9543c = new C0855b(true, null);
        }
    }

    public C0855b(boolean z4, CancellationException cancellationException) {
        this.f9545a = z4;
        this.f9546b = cancellationException;
    }
}
