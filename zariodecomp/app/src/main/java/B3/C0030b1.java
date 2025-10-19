package B3;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* renamed from: B3.b1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\b1.1.smali */
public final class C0030b1 extends AbstractC0044g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final ReferenceQueue f745f = new ReferenceQueue();

    /* renamed from: g, reason: collision with root package name */
    public static final ConcurrentHashMap f746g = new ConcurrentHashMap();
    public static final Logger h = Logger.getLogger(C0030b1.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public final C0028a1 f747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0030b1(Y0 y02) {
        super(y02);
        ReferenceQueue referenceQueue = f745f;
        ConcurrentHashMap concurrentHashMap = f746g;
        this.f747e = new C0028a1(this, y02, referenceQueue, concurrentHashMap);
    }

    @Override // z3.P
    public final z3.P v() {
        C0028a1 c0028a1 = this.f747e;
        if (!c0028a1.f735e.getAndSet(true)) {
            c0028a1.clear();
        }
        Y0 y02 = this.f812d;
        y02.v();
        return y02;
    }
}
