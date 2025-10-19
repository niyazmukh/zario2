package f4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: f4.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\o.1.smali */
public final class C0517o extends C0524x {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7087c = AtomicIntegerFieldUpdater.newUpdater(C0517o.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0517o(C0516n c0516n, Throwable th, boolean z4) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0516n + " was cancelled normally");
        }
        super(th, z4);
        this._resumed$volatile = 0;
    }
}
