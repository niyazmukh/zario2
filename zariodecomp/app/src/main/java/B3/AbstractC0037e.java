package B3;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: B3.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\e.1.smali */
public abstract class AbstractC0037e implements Closeable {
    public final void a(int i) {
        if (q() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void e() {
    }

    public boolean k() {
        return this instanceof C1;
    }

    public abstract AbstractC0037e l(int i);

    public abstract void m(OutputStream outputStream, int i);

    public abstract void n(ByteBuffer byteBuffer);

    public abstract void o(byte[] bArr, int i, int i5);

    public abstract int p();

    public abstract int q();

    public void r() {
        throw new UnsupportedOperationException();
    }

    public abstract void s(int i);
}
