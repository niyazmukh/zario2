package B3;

import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import z3.AbstractC1076E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\o2.smali */
public final class o2 implements C, k2, z3.W, z3.Z {

    /* renamed from: b, reason: collision with root package name */
    public static final o2 f930b = new o2(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f931a;

    public /* synthetic */ o2(int i) {
        this.f931a = i;
    }

    public static C0032c0 d() {
        C0032c0 c0032c0 = new C0032c0();
        c0032c0.f766a = new Random();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        c0032c0.f767b = TimeUnit.MINUTES.toNanos(2L);
        c0032c0.f768c = 1.6d;
        c0032c0.f769d = 0.2d;
        c0032c0.f770e = nanos;
        return c0032c0;
    }

    @Override // z3.Z
    /* renamed from: a, reason: collision with other method in class */
    public byte[] mo0a(Object obj) {
        switch (this.f931a) {
            case 11:
                return (byte[]) obj;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // B3.C
    public int b(AbstractC0037e abstractC0037e, int i, Object obj, int i5) {
        switch (this.f931a) {
            case 2:
                break;
            case 3:
                abstractC0037e.s(i);
                break;
            case 4:
                abstractC0037e.o((byte[]) obj, i5, i);
                break;
            case 5:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + i);
                abstractC0037e.n(byteBuffer);
                byteBuffer.limit(iLimit);
                break;
            default:
                abstractC0037e.m((OutputStream) obj, i);
                break;
        }
        return 0;
    }

    public long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // B3.k2
    public Object e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f931a) {
            case 8:
                return Executors.newCachedThreadPool(AbstractC0056k0.e("grpc-default-executor-%d"));
            default:
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, AbstractC0056k0.e("grpc-timer-%d"));
                try {
                    scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e5) {
                    throw e5;
                } catch (Exception e6) {
                    throw new RuntimeException(e6);
                }
                return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    @Override // B3.k2
    public void f(Object obj) {
        switch (this.f931a) {
            case 8:
                ((ExecutorService) ((Executor) obj)).shutdown();
                break;
            default:
                ((ScheduledExecutorService) obj).shutdown();
                break;
        }
    }

    @Override // z3.W
    public Object g(String str) throws NumberFormatException {
        S0.f.g("empty timeout", str.length() > 0);
        S0.f.g("bad timeout format", str.length() <= 9);
        long j5 = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j5));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j5));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j5));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j5));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j5));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j5);
        }
        throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
    }

    @Override // z3.Z
    public Object h(byte[] bArr) {
        switch (this.f931a) {
            case 11:
                return bArr;
            default:
                if (bArr.length < 3) {
                    throw new NumberFormatException("Malformed status code ".concat(new String(bArr, AbstractC1076E.f11237a)));
                }
                return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
        }
    }

    public String toString() {
        switch (this.f931a) {
            case 8:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    @Override // z3.W
    public String a(Object obj) {
        Long l4 = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l4.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l4.longValue() < 100000000) {
            return l4 + "n";
        }
        if (l4.longValue() < 100000000000L) {
            return timeUnit.toMicros(l4.longValue()) + "u";
        }
        if (l4.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l4.longValue()) + "m";
        }
        if (l4.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l4.longValue()) + "S";
        }
        if (l4.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l4.longValue()) + "M";
        }
        return timeUnit.toHours(l4.longValue()) + "H";
    }
}
