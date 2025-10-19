package B3;

import z3.AbstractC1083g;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\P1.smali */
public final class P1 extends AbstractC1083g {

    /* renamed from: b, reason: collision with root package name */
    public final V1 f511b;

    /* renamed from: c, reason: collision with root package name */
    public long f512c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N0 f513d;

    public P1(N0 n02, V1 v12) {
        this.f513d = n02;
        this.f511b = v12;
    }

    @Override // z3.AbstractC1083g
    public final void l(long j5) {
        if (this.f513d.f484o.f543f != null) {
            return;
        }
        synchronized (this.f513d.i) {
            try {
                if (this.f513d.f484o.f543f == null) {
                    V1 v12 = this.f511b;
                    if (!v12.f578b) {
                        long j6 = this.f512c + j5;
                        this.f512c = j6;
                        N0 n02 = this.f513d;
                        long j7 = n02.f489t;
                        if (j6 <= j7) {
                            return;
                        }
                        if (j6 > n02.f480k) {
                            v12.f579c = true;
                        } else {
                            long jAddAndGet = n02.f479j.f825a.addAndGet(j6 - j7);
                            N0 n03 = this.f513d;
                            n03.f489t = this.f512c;
                            if (jAddAndGet > n03.f481l) {
                                this.f511b.f579c = true;
                            }
                        }
                        V1 v13 = this.f511b;
                        I1 i1O = v13.f579c ? this.f513d.o(v13) : null;
                        if (i1O != null) {
                            i1O.run();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
