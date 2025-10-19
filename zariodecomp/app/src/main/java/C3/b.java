package C3;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\b.smali */
public final class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final E3.i f1109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f1110b;

    public b(c cVar, E3.i iVar) {
        this.f1110b = cVar;
        this.f1109a = iVar;
    }

    public final void a(E2.j jVar) {
        this.f1110b.f1122p++;
        E3.i iVar = this.f1109a;
        synchronized (iVar) {
            if (iVar.e) {
                throw new IOException("closed");
            }
            int i = iVar.d;
            if ((jVar.f1459b & 32) != 0) {
                i = ((int[]) jVar.f1460c)[5];
            }
            iVar.d = i;
            iVar.a(0, 0, (byte) 4, (byte) 1);
            iVar.a.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1109a.close();
    }

    public final void e() {
        E3.i iVar = this.f1109a;
        synchronized (iVar) {
            try {
                if (iVar.e) {
                    throw new IOException("closed");
                }
                Logger logger = E3.j.f1568a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + E3.j.f1569b.c());
                }
                iVar.a.e(E3.j.f1569b.j());
                iVar.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        E3.i iVar = this.f1109a;
        synchronized (iVar) {
            if (iVar.e) {
                throw new IOException("closed");
            }
            iVar.a.flush();
        }
    }

    public final void k(E3.a aVar, byte[] bArr) {
        E3.i iVar = this.f1109a;
        synchronized (iVar) {
            try {
                if (iVar.e) {
                    throw new IOException("closed");
                }
                if (aVar.f1533a == -1) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                iVar.a(0, bArr.length + 8, (byte) 7, (byte) 0);
                iVar.a.l(0);
                iVar.a.l(aVar.f1533a);
                if (bArr.length > 0) {
                    iVar.a.e(bArr);
                }
                iVar.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(int i, int i5, boolean z4) {
        if (z4) {
            this.f1110b.f1122p++;
        }
        E3.i iVar = this.f1109a;
        synchronized (iVar) {
            if (iVar.e) {
                throw new IOException("closed");
            }
            iVar.a(0, 8, (byte) 6, z4 ? (byte) 1 : (byte) 0);
            iVar.a.l(i);
            iVar.a.l(i5);
            iVar.a.flush();
        }
    }

    public final void m(int i, E3.a aVar) {
        this.f1110b.f1122p++;
        E3.i iVar = this.f1109a;
        synchronized (iVar) {
            if (iVar.e) {
                throw new IOException("closed");
            }
            if (aVar.f1533a == -1) {
                throw new IllegalArgumentException();
            }
            iVar.a(i, 4, (byte) 3, (byte) 0);
            iVar.a.l(aVar.f1533a);
            iVar.a.flush();
        }
    }

    public final void n(E2.j jVar) {
        E3.i iVar = this.f1109a;
        synchronized (iVar) {
            try {
                if (iVar.e) {
                    throw new IOException("closed");
                }
                int i = 0;
                iVar.a(0, Integer.bitCount(jVar.f1459b) * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (jVar.b(i)) {
                        int i5 = i == 4 ? 3 : i == 7 ? 4 : i;
                        q4.h hVar = iVar.a;
                        if (hVar.f9523c) {
                            throw new IllegalStateException("closed");
                        }
                        q4.d dVar = hVar.f9522b;
                        q4.j jVarS = dVar.s(2);
                        int i6 = jVarS.f9529c;
                        byte[] bArr = jVarS.f9527a;
                        bArr[i6] = (byte) ((i5 >>> 8) & 255);
                        bArr[i6 + 1] = (byte) (i5 & 255);
                        jVarS.f9529c = i6 + 2;
                        dVar.f9515b += 2;
                        hVar.a();
                        iVar.a.l(((int[]) jVar.f1460c)[i]);
                    }
                    i++;
                }
                iVar.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(int i, long j5) {
        E3.i iVar = this.f1109a;
        synchronized (iVar) {
            if (iVar.e) {
                throw new IOException("closed");
            }
            if (j5 == 0 || j5 > 2147483647L) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j5);
            }
            iVar.a(i, 4, (byte) 8, (byte) 0);
            iVar.a.l((int) j5);
            iVar.a.flush();
        }
    }
}
