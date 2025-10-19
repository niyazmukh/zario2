package E3;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import q4.i;
import q4.o;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E3\f.smali */
public final class f implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i f1556a;

    /* renamed from: b, reason: collision with root package name */
    public int f1557b;

    /* renamed from: c, reason: collision with root package name */
    public byte f1558c;

    /* renamed from: d, reason: collision with root package name */
    public int f1559d;

    /* renamed from: e, reason: collision with root package name */
    public int f1560e;

    /* renamed from: f, reason: collision with root package name */
    public short f1561f;

    public f(i iVar) {
        this.f1556a = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // q4.o
    public final long h(q4.d dVar, long j5) throws IOException {
        int i;
        int iK;
        do {
            int i5 = this.f1560e;
            i iVar = this.f1556a;
            if (i5 != 0) {
                long jH = iVar.h(dVar, Math.min(j5, i5));
                if (jH == -1) {
                    return -1L;
                }
                this.f1560e -= (int) jH;
                return jH;
            }
            iVar.m(this.f1561f);
            this.f1561f = (short) 0;
            if ((this.f1558c & 4) != 0) {
                return -1L;
            }
            i = this.f1559d;
            int iA = j.a(iVar);
            this.f1560e = iA;
            this.f1557b = iA;
            byte bA = (byte) (iVar.a() & 255);
            this.f1558c = (byte) (iVar.a() & 255);
            Logger logger = j.f1568a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(g.a(true, this.f1559d, this.f1557b, bA, this.f1558c));
            }
            iK = iVar.k() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            this.f1559d = iK;
            if (bA != 9) {
                j.c("%s != TYPE_CONTINUATION", Byte.valueOf(bA));
                throw null;
            }
        } while (iK == i);
        j.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }
}
