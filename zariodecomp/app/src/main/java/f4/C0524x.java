package f4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: f4.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\x.1.smali */
public class C0524x {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7106b = AtomicIntegerFieldUpdater.newUpdater(C0524x.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f7107a;

    public C0524x(Throwable th, boolean z4) {
        this.f7107a = th;
        this._handled$volatile = z4 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f7107a + ']';
    }
}
