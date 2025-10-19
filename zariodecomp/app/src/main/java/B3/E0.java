package B3;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import k2.EnumC0658a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\E0.smali */
public final class E0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f398b;

    public /* synthetic */ E0(G0 g02, int i) {
        this.f397a = i;
        this.f398b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G0 g02;
        boolean z4;
        long jNextLong;
        boolean z5 = false;
        boolean z6 = true;
        switch (this.f397a) {
            case 0:
                synchronized (this.f398b) {
                    g02 = this.f398b;
                    if (g02.f416d != 6) {
                        g02.f416d = 6;
                        z5 = true;
                    }
                }
                if (z5) {
                    h1.i iVar = g02.f415c;
                    iVar.getClass();
                    ((C3.m) iVar.f7641b).d(z3.k0.f11355n.g("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            default:
                synchronized (this.f398b) {
                    try {
                        G0 g03 = this.f398b;
                        g03.f418f = null;
                        int i = g03.f416d;
                        if (i == 2) {
                            g03.f416d = 4;
                            g03.f417e = g03.f413a.schedule(g03.f419g, g03.f420j, TimeUnit.NANOSECONDS);
                            z4 = true;
                        } else {
                            if (i == 3) {
                                ScheduledExecutorService scheduledExecutorService = g03.f413a;
                                H0 h02 = g03.h;
                                long j5 = g03.i;
                                Q1 q12 = g03.f414b;
                                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                g03.f418f = scheduledExecutorService.schedule(h02, j5 - q12.a(timeUnit), timeUnit);
                                this.f398b.f416d = 2;
                            }
                            z4 = false;
                        }
                    } finally {
                    }
                }
                if (z4) {
                    h1.i iVar2 = this.f398b.f415c;
                    iVar2.getClass();
                    F0 f02 = new F0(iVar2);
                    C3.m mVar = (C3.m) iVar2.f7641b;
                    EnumC0658a enumC0658a = EnumC0658a.f8299a;
                    synchronized (mVar.f1214k) {
                        try {
                            if (mVar.i == null) {
                                throw new IllegalStateException();
                            }
                            if (mVar.f1228y) {
                                z3.l0 l0VarM = mVar.m();
                                Logger logger = C0070p0.f934g;
                                try {
                                    enumC0658a.execute(new RunnableC0067o0(f02, l0VarM));
                                } catch (Throwable th) {
                                    C0070p0.f934g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                                }
                                return;
                            }
                            C0070p0 c0070p0 = mVar.f1227x;
                            if (c0070p0 != null) {
                                jNextLong = 0;
                                z6 = false;
                            } else {
                                jNextLong = mVar.f1209d.nextLong();
                                mVar.f1210e.getClass();
                                Q1 q13 = new Q1(2);
                                q13.b();
                                C0070p0 c0070p02 = new C0070p0(jNextLong, q13);
                                mVar.f1227x = c0070p02;
                                mVar.f1202L.getClass();
                                c0070p0 = c0070p02;
                            }
                            if (z6) {
                                mVar.i.k((int) (jNextLong >>> 32), (int) jNextLong, false);
                            }
                            synchronized (c0070p0) {
                                try {
                                    if (!c0070p0.f938d) {
                                        c0070p0.f937c.put(f02, enumC0658a);
                                        return;
                                    }
                                    z3.l0 l0Var = c0070p0.f939e;
                                    RunnableC0067o0 runnableC0067o0 = l0Var != null ? new RunnableC0067o0(f02, l0Var) : new RunnableC0067o0(f02, c0070p0.f940f);
                                    try {
                                        enumC0658a.execute(runnableC0067o0);
                                        return;
                                    } catch (Throwable th2) {
                                        C0070p0.f934g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                                        return;
                                    }
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
