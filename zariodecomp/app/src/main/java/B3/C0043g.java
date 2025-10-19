package B3;

import E2.AbstractC0101c;

/* renamed from: B3.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\g.1.smali */
public final class C0043g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f809a;

    /* renamed from: b, reason: collision with root package name */
    public long f810b;

    /* renamed from: c, reason: collision with root package name */
    public Object f811c;

    public /* synthetic */ C0043g(Object obj, long j5, int i) {
        this.f809a = i;
        this.f811c = obj;
        this.f810b = j5;
    }

    public void a(int i) {
        if (i < 64) {
            this.f810b &= ~(1 << i);
            return;
        }
        C0043g c0043g = (C0043g) this.f811c;
        if (c0043g != null) {
            c0043g.a(i - 64);
        }
    }

    public int b(int i) {
        C0043g c0043g = (C0043g) this.f811c;
        if (c0043g == null) {
            if (i >= 64) {
                return Long.bitCount(this.f810b);
            }
            return Long.bitCount(((1 << i) - 1) & this.f810b);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.f810b);
        }
        return Long.bitCount(this.f810b) + c0043g.b(i - 64);
    }

    public void c() {
        if (((C0043g) this.f811c) == null) {
            this.f811c = new C0043g();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.f810b) != 0;
        }
        c();
        return ((C0043g) this.f811c).d(i - 64);
    }

    public void e(int i, boolean z4) {
        if (i >= 64) {
            c();
            ((C0043g) this.f811c).e(i - 64, z4);
            return;
        }
        long j5 = this.f810b;
        boolean z5 = (Long.MIN_VALUE & j5) != 0;
        long j6 = (1 << i) - 1;
        this.f810b = ((j5 & (~j6)) << 1) | (j5 & j6);
        if (z4) {
            i(i);
        } else {
            a(i);
        }
        if (z5 || ((C0043g) this.f811c) != null) {
            c();
            ((C0043g) this.f811c).e(0, z5);
        }
    }

    public boolean f(int i) {
        if (i >= 64) {
            c();
            return ((C0043g) this.f811c).f(i - 64);
        }
        long j5 = 1 << i;
        long j6 = this.f810b;
        boolean z4 = (j6 & j5) != 0;
        long j7 = j6 & (~j5);
        this.f810b = j7;
        long j8 = j5 - 1;
        this.f810b = (j7 & j8) | Long.rotateRight((~j8) & j7, 1);
        C0043g c0043g = (C0043g) this.f811c;
        if (c0043g != null) {
            if (c0043g.d(0)) {
                i(63);
            }
            ((C0043g) this.f811c).f(0);
        }
        return z4;
    }

    public void g() {
        this.f810b = 0L;
        C0043g c0043g = (C0043g) this.f811c;
        if (c0043g != null) {
            c0043g.g();
        }
    }

    public void h(Runnable runnable) {
        AbstractC0101c abstractC0101c = (AbstractC0101c) this.f811c;
        abstractC0101c.f1440f.d();
        if (abstractC0101c.i == this.f810b) {
            runnable.run();
        } else {
            p1.b.p(1, abstractC0101c.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f810b |= 1 << i;
        } else {
            c();
            ((C0043g) this.f811c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f809a) {
            case 2:
                if (((C0043g) this.f811c) == null) {
                    return Long.toBinaryString(this.f810b);
                }
                return ((C0043g) this.f811c).toString() + "xx" + Long.toBinaryString(this.f810b);
            default:
                return super.toString();
        }
    }

    public C0043g() {
        this.f809a = 2;
        this.f810b = 0L;
    }
}
