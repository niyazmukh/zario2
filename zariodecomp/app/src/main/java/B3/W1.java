package B3;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\W1.smali */
public final class W1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f589a;

    /* renamed from: b, reason: collision with root package name */
    public final int f590b;

    /* renamed from: c, reason: collision with root package name */
    public final int f591c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f592d;

    public W1(float f2, float f3) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f592d = atomicInteger;
        this.f591c = (int) (f3 * 1000.0f);
        int i = (int) (f2 * 1000.0f);
        this.f589a = i;
        this.f590b = i / 2;
        atomicInteger.set(i);
    }

    public final boolean a() {
        AtomicInteger atomicInteger;
        int i;
        int i5;
        do {
            atomicInteger = this.f592d;
            i = atomicInteger.get();
            if (i == 0) {
                return false;
            }
            i5 = i - 1000;
        } while (!atomicInteger.compareAndSet(i, Math.max(i5, 0)));
        return i5 > this.f590b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W1)) {
            return false;
        }
        W1 w12 = (W1) obj;
        return this.f589a == w12.f589a && this.f591c == w12.f591c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f589a), Integer.valueOf(this.f591c)});
    }
}
