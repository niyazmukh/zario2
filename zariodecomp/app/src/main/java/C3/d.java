package C3;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\d.smali */
public final class d implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f1124d = Logger.getLogger(m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final m f1125a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1126b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.c f1127c = new S0.c(Level.FINE);

    public d(m mVar, b bVar) {
        this.f1125a = mVar;
        this.f1126b = bVar;
    }

    public final void a(boolean z4, int i, q4.d dVar, int i5) {
        dVar.getClass();
        this.f1127c.g(2, i, dVar, i5, z4);
        try {
            E3.i iVar = this.f1126b.f1109a;
            synchronized (iVar) {
                if (iVar.e) {
                    throw new IOException("closed");
                }
                iVar.a(i, i5, (byte) 0, z4 ? (byte) 1 : (byte) 0);
                if (i5 > 0) {
                    iVar.a.b(dVar, i5);
                }
            }
        } catch (IOException e5) {
            this.f1125a.p(e5);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f1126b.close();
        } catch (IOException e5) {
            f1124d.log(e5.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e5);
        }
    }

    public final void e(E3.a aVar, byte[] bArr) {
        b bVar = this.f1126b;
        this.f1127c.h(2, 0, aVar, q4.f.f(bArr));
        try {
            bVar.k(aVar, bArr);
            bVar.flush();
        } catch (IOException e5) {
            this.f1125a.p(e5);
        }
    }

    public final void flush() {
        try {
            this.f1126b.flush();
        } catch (IOException e5) {
            this.f1125a.p(e5);
        }
    }

    public final void k(int i, int i5, boolean z4) {
        S0.c cVar = this.f1127c;
        if (z4) {
            long j5 = (4294967295L & i5) | (i << 32);
            if (cVar.f()) {
                ((Logger) cVar.f2847b).log((Level) cVar.f2848c, "OUTBOUND PING: ack=true bytes=" + j5);
            }
        } else {
            cVar.i(2, (4294967295L & i5) | (i << 32));
        }
        try {
            this.f1126b.l(i, i5, z4);
        } catch (IOException e5) {
            this.f1125a.p(e5);
        }
    }

    public final void l(int i, E3.a aVar) {
        this.f1127c.j(2, i, aVar);
        try {
            this.f1126b.m(i, aVar);
        } catch (IOException e5) {
            this.f1125a.p(e5);
        }
    }

    public final void m(int i, long j5) {
        this.f1127c.m(2, i, j5);
        try {
            this.f1126b.o(i, j5);
        } catch (IOException e5) {
            this.f1125a.p(e5);
        }
    }
}
