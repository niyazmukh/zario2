package B3;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* renamed from: B3.a1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\a1.1.smali */
public final class C0028a1 extends WeakReference {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f729f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* renamed from: g, reason: collision with root package name */
    public static final RuntimeException f730g;

    /* renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f731a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f732b;

    /* renamed from: c, reason: collision with root package name */
    public final String f733c;

    /* renamed from: d, reason: collision with root package name */
    public final SoftReference f734d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f735e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f730g = runtimeException;
    }

    public C0028a1(C0030b1 c0030b1, Y0 y02, ReferenceQueue referenceQueue, ConcurrentHashMap concurrentHashMap) {
        super(c0030b1, referenceQueue);
        this.f735e = new AtomicBoolean();
        this.f734d = new SoftReference(f729f ? new RuntimeException("ManagedChannel allocation site") : f730g);
        this.f733c = y02.toString();
        this.f731a = referenceQueue;
        this.f732b = concurrentHashMap;
        concurrentHashMap.put(this, this);
        a(referenceQueue);
    }

    public static void a(ReferenceQueue referenceQueue) {
        while (true) {
            C0028a1 c0028a1 = (C0028a1) referenceQueue.poll();
            if (c0028a1 == null) {
                return;
            }
            SoftReference softReference = c0028a1.f734d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            c0028a1.f732b.remove(c0028a1);
            softReference.clear();
            if (!c0028a1.f735e.get()) {
                Level level = Level.SEVERE;
                Logger logger = C0030b1.h;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{c0028a1.f733c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.f732b.remove(this);
        this.f734d.clear();
        a(this.f731a);
    }
}
