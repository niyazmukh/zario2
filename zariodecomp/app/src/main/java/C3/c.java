package C3;

import B3.N;
import B3.f2;
import java.io.IOException;
import java.net.Socket;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\c.smali */
public final class c implements q4.m {

    /* renamed from: c, reason: collision with root package name */
    public final f2 f1113c;

    /* renamed from: d, reason: collision with root package name */
    public final m f1114d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1115e;

    /* renamed from: m, reason: collision with root package name */
    public q4.b f1119m;

    /* renamed from: n, reason: collision with root package name */
    public Socket f1120n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1121o;

    /* renamed from: p, reason: collision with root package name */
    public int f1122p;

    /* renamed from: q, reason: collision with root package name */
    public int f1123q;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1111a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final q4.d f1112b = new q4.d();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1116f = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1117k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1118l = false;

    public c(f2 f2Var, m mVar) {
        S0.f.l(f2Var, "executor");
        this.f1113c = f2Var;
        this.f1114d = mVar;
        this.f1115e = 10000;
    }

    public final void a(q4.b bVar, Socket socket) {
        S0.f.q("AsyncSink's becomeConnected should only be called once.", this.f1119m == null);
        this.f1119m = bVar;
        this.f1120n = socket;
    }

    @Override // q4.m
    public final void b(q4.d dVar, long j5) throws IOException {
        if (this.f1118l) {
            throw new IOException("closed");
        }
        J3.b.c();
        try {
            synchronized (this.f1111a) {
                try {
                    this.f1112b.b(dVar, j5);
                    int i = this.f1123q + this.f1122p;
                    this.f1123q = i;
                    boolean z4 = false;
                    this.f1122p = 0;
                    if (this.f1121o || i <= this.f1115e) {
                        if (!this.f1116f && !this.f1117k && this.f1112b.a() > 0) {
                            this.f1116f = true;
                        }
                        J3.b.f2098a.getClass();
                        return;
                    }
                    this.f1121o = true;
                    z4 = true;
                    if (!z4) {
                        this.f1113c.execute(new a(this, 0));
                        J3.b.f2098a.getClass();
                    } else {
                        try {
                            this.f1120n.close();
                        } catch (IOException e5) {
                            this.f1114d.p(e5);
                        }
                        J3.b.f2098a.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // q4.m, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1118l) {
            return;
        }
        this.f1118l = true;
        this.f1113c.execute(new N(this, 11));
    }

    @Override // q4.m, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f1118l) {
            throw new IOException("closed");
        }
        J3.b.c();
        try {
            synchronized (this.f1111a) {
                if (this.f1117k) {
                    J3.b.f2098a.getClass();
                    return;
                }
                this.f1117k = true;
                this.f1113c.execute(new a(this, 1));
                J3.b.f2098a.getClass();
            }
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
