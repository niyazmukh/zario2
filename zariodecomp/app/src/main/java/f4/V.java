package f4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\V.smali */
public abstract class V implements Runnable, Comparable, P {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f7035a;

    /* renamed from: b, reason: collision with root package name */
    public int f7036b = -1;

    public V(long j5) {
        this.f7035a = j5;
    }

    @Override // f4.P
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                h1.i iVar = E.f7009b;
                if (obj == iVar) {
                    return;
                }
                W w4 = obj instanceof W ? (W) obj : null;
                if (w4 != null) {
                    synchronized (w4) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof k4.x ? (k4.x) obj2 : null) != null) {
                            w4.b(this.f7036b);
                        }
                    }
                }
                this._heap = iVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j5, W w4, X x3) {
        synchronized (this) {
            if (this._heap == E.f7009b) {
                return 2;
            }
            synchronized (w4) {
                try {
                    V[] vArr = w4.f8416a;
                    V v4 = vArr != null ? vArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X.f7038k;
                    x3.getClass();
                    if (X.f7040m.get(x3) != 0) {
                        return 1;
                    }
                    if (v4 == null) {
                        w4.f7037c = j5;
                    } else {
                        long j6 = v4.f7035a;
                        if (j6 - j5 < 0) {
                            j5 = j6;
                        }
                        if (j5 - w4.f7037c > 0) {
                            w4.f7037c = j5;
                        }
                    }
                    long j7 = this.f7035a;
                    long j8 = w4.f7037c;
                    if (j7 - j8 < 0) {
                        this.f7035a = j8;
                    }
                    w4.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j5 = this.f7035a - ((V) obj).f7035a;
        if (j5 > 0) {
            return 1;
        }
        return j5 < 0 ? -1 : 0;
    }

    public final void d(W w4) {
        if (this._heap == E.f7009b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = w4;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f7035a + ']';
    }
}
