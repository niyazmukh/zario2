package i2;

import java.io.OutputStream;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i2.1\f.smali */
public final class f extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i5) {
        bArr.getClass();
        S0.f.n(i, i5 + i, bArr.length);
    }
}
