package q4;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q4\b.smali */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9508a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final n f9509b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9510c;

    public b(OutputStream outputStream, n nVar) {
        this.f9510c = outputStream;
        this.f9509b = nVar;
    }

    @Override // q4.m
    public final void b(d dVar, long j5) {
        switch (this.f9508a) {
            case 0:
                r1.d.n(dVar.f9515b, 0L, j5);
                while (true) {
                    long j6 = 0;
                    if (j5 <= 0) {
                        return;
                    }
                    j jVar = dVar.f9514a;
                    kotlin.jvm.internal.i.b(jVar);
                    while (true) {
                        if (j6 < 65536) {
                            j6 += jVar.f9529c - jVar.f9528b;
                            if (j6 >= j5) {
                                j6 = j5;
                            } else {
                                jVar = jVar.f9532f;
                                kotlin.jvm.internal.i.b(jVar);
                            }
                        }
                    }
                    b bVar = (b) this.f9510c;
                    n nVar = this.f9509b;
                    try {
                        bVar.b(dVar, j6);
                        if (nVar.q0()) {
                            throw nVar.r0(null);
                        }
                        j5 -= j6;
                    } catch (IOException e5) {
                        if (!nVar.q0()) {
                            throw e5;
                        }
                        throw nVar.r0(e5);
                    } finally {
                        nVar.q0();
                    }
                }
            default:
                r1.d.n(dVar.f9515b, 0L, j5);
                while (j5 > 0) {
                    this.f9509b.l0();
                    j jVar2 = dVar.f9514a;
                    kotlin.jvm.internal.i.b(jVar2);
                    int iMin = (int) Math.min(j5, jVar2.f9529c - jVar2.f9528b);
                    ((OutputStream) this.f9510c).write(jVar2.f9527a, jVar2.f9528b, iMin);
                    int i = jVar2.f9528b + iMin;
                    jVar2.f9528b = i;
                    long j7 = iMin;
                    j5 -= j7;
                    dVar.f9515b -= j7;
                    if (i == jVar2.f9529c) {
                        dVar.f9514a = jVar2.a();
                        k.a(jVar2);
                    }
                }
                return;
        }
    }

    @Override // q4.m, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f9508a) {
            case 0:
                b bVar = (b) this.f9510c;
                n nVar = this.f9509b;
                try {
                    bVar.close();
                    if (nVar.q0()) {
                        throw nVar.r0(null);
                    }
                    return;
                } catch (IOException e5) {
                    if (!nVar.q0()) {
                        throw e5;
                    }
                    throw nVar.r0(e5);
                } finally {
                    nVar.q0();
                }
            default:
                ((OutputStream) this.f9510c).close();
                return;
        }
    }

    @Override // q4.m, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f9508a) {
            case 0:
                b bVar = (b) this.f9510c;
                n nVar = this.f9509b;
                try {
                    bVar.flush();
                    if (nVar.q0()) {
                        throw nVar.r0(null);
                    }
                    return;
                } catch (IOException e5) {
                    if (!nVar.q0()) {
                        throw e5;
                    }
                    throw nVar.r0(e5);
                } finally {
                    nVar.q0();
                }
            default:
                ((OutputStream) this.f9510c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f9508a) {
            case 0:
                return "AsyncTimeout.sink(" + ((b) this.f9510c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f9510c) + ')';
        }
    }

    public b(n nVar, b bVar) {
        this.f9509b = nVar;
        this.f9510c = bVar;
    }
}
