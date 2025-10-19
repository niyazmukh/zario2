package q4;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q4\i.smali */
public final class i implements o, ReadableByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public final o f9524a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9525b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f9526c;

    public i(o oVar) {
        this.f9524a = oVar;
    }

    public final byte a() throws EOFException {
        l(1L);
        return this.f9525b.l();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f9526c) {
            return;
        }
        this.f9526c = true;
        this.f9524a.close();
        d dVar = this.f9525b;
        dVar.p(dVar.f9515b);
    }

    public final f e(long j5) throws EOFException {
        l(j5);
        return this.f9525b.n(j5);
    }

    @Override // q4.o
    public final long h(d dVar, long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        if (this.f9526c) {
            throw new IllegalStateException("closed");
        }
        d dVar2 = this.f9525b;
        if (dVar2.f9515b == 0 && this.f9524a.h(dVar2, 8192L) == -1) {
            return -1L;
        }
        return dVar2.h(dVar, Math.min(j5, dVar2.f9515b));
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f9526c;
    }

    public final int k() throws EOFException {
        l(4L);
        d dVar = this.f9525b;
        if (dVar.f9515b < 4) {
            throw new EOFException();
        }
        j jVar = dVar.f9514a;
        kotlin.jvm.internal.i.b(jVar);
        int i = jVar.f9528b;
        int i5 = jVar.f9529c;
        if (i5 - i < 4) {
            return (dVar.l() & 255) | ((dVar.l() & 255) << 24) | ((dVar.l() & 255) << 16) | ((dVar.l() & 255) << 8);
        }
        byte[] bArr = jVar.f9527a;
        int i6 = i + 3;
        int i7 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i8 = i + 4;
        int i9 = i7 | (bArr[i6] & 255);
        dVar.f9515b -= 4;
        if (i8 == i5) {
            dVar.f9514a = jVar.a();
            k.a(jVar);
        } else {
            jVar.f9528b = i8;
        }
        return i9;
    }

    public final void l(long j5) throws EOFException {
        d dVar;
        if (j5 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        if (this.f9526c) {
            throw new IllegalStateException("closed");
        }
        do {
            dVar = this.f9525b;
            if (dVar.f9515b >= j5) {
                return;
            }
        } while (this.f9524a.h(dVar, 8192L) != -1);
        throw new EOFException();
    }

    public final void m(long j5) throws EOFException {
        if (this.f9526c) {
            throw new IllegalStateException("closed");
        }
        while (j5 > 0) {
            d dVar = this.f9525b;
            if (dVar.f9515b == 0 && this.f9524a.h(dVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j5, dVar.f9515b);
            dVar.p(jMin);
            j5 -= jMin;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        d dVar = this.f9525b;
        if (dVar.f9515b == 0 && this.f9524a.h(dVar, 8192L) == -1) {
            return -1;
        }
        return dVar.read(sink);
    }

    public final String toString() {
        return "buffer(" + this.f9524a + ')';
    }
}
