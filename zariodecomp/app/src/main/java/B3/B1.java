package B3;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\B1.smali */
public final class B1 extends InputStream implements z3.G {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0037e f380a;

    @Override // java.io.InputStream
    public final int available() {
        return this.f380a.q();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f380a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f380a.e();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f380a.k();
    }

    @Override // java.io.InputStream
    public final int read() {
        AbstractC0037e abstractC0037e = this.f380a;
        if (abstractC0037e.q() == 0) {
            return -1;
        }
        return abstractC0037e.p();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f380a.r();
    }

    @Override // java.io.InputStream
    public final long skip(long j5) {
        AbstractC0037e abstractC0037e = this.f380a;
        int iMin = (int) Math.min(abstractC0037e.q(), j5);
        abstractC0037e.s(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) {
        AbstractC0037e abstractC0037e = this.f380a;
        if (abstractC0037e.q() == 0) {
            return -1;
        }
        int iMin = Math.min(abstractC0037e.q(), i5);
        abstractC0037e.o(bArr, i, iMin);
        return iMin;
    }
}
