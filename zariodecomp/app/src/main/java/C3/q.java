package C3;

import B3.AbstractC0037e;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\q.smali */
public final class q extends AbstractC0037e {

    /* renamed from: a, reason: collision with root package name */
    public final q4.d f1246a;

    public q(q4.d dVar) {
        this.f1246a = dVar;
    }

    @Override // B3.AbstractC0037e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        q4.d dVar = this.f1246a;
        dVar.p(dVar.f9515b);
    }

    @Override // B3.AbstractC0037e
    public final AbstractC0037e l(int i) {
        q4.d dVar = new q4.d();
        dVar.b(this.f1246a, i);
        return new q(dVar);
    }

    @Override // B3.AbstractC0037e
    public final void m(OutputStream out, int i) throws IOException {
        long j5 = i;
        q4.d dVar = this.f1246a;
        dVar.getClass();
        kotlin.jvm.internal.i.e(out, "out");
        r1.d.n(dVar.f9515b, 0L, j5);
        q4.j jVar = dVar.f9514a;
        while (j5 > 0) {
            kotlin.jvm.internal.i.b(jVar);
            int iMin = (int) Math.min(j5, jVar.f9529c - jVar.f9528b);
            out.write(jVar.f9527a, jVar.f9528b, iMin);
            int i5 = jVar.f9528b + iMin;
            jVar.f9528b = i5;
            long j6 = iMin;
            dVar.f9515b -= j6;
            j5 -= j6;
            if (i5 == jVar.f9529c) {
                q4.j jVarA = jVar.a();
                dVar.f9514a = jVarA;
                q4.k.a(jVar);
                jVar = jVarA;
            }
        }
    }

    @Override // B3.AbstractC0037e
    public final void n(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // B3.AbstractC0037e
    public final void o(byte[] bArr, int i, int i5) {
        while (i5 > 0) {
            int iK = this.f1246a.k(bArr, i, i5);
            if (iK == -1) {
                throw new IndexOutOfBoundsException(B.a.i("EOF trying to read ", i5, " bytes"));
            }
            i5 -= iK;
            i += iK;
        }
    }

    @Override // B3.AbstractC0037e
    public final int p() {
        try {
            return this.f1246a.l() & 255;
        } catch (EOFException e5) {
            throw new IndexOutOfBoundsException(e5.getMessage());
        }
    }

    @Override // B3.AbstractC0037e
    public final int q() {
        return (int) this.f1246a.f9515b;
    }

    @Override // B3.AbstractC0037e
    public final void s(int i) {
        try {
            this.f1246a.p(i);
        } catch (EOFException e5) {
            throw new IndexOutOfBoundsException(e5.getMessage());
        }
    }
}
