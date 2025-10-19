package B3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: B3.k1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\k1.1.smali */
public final class C0057k1 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f874a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f875b;

    public C0057k1(FileOutputStream fileOutputStream) {
        this.f875b = fileOutputStream;
    }

    private final void a() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f874a) {
            case 1:
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        switch (this.f874a) {
            case 1:
                ((FileOutputStream) this.f875b).flush();
                break;
            default:
                super.flush();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.f874a) {
            case 0:
                write(new byte[]{(byte) i}, 0, 1);
                break;
            default:
                ((FileOutputStream) this.f875b).write(i);
                break;
        }
    }

    public C0057k1(C0060l1 c0060l1) {
        this.f875b = c0060l1;
    }

    @Override // java.io.OutputStream
    public void write(byte[] b5) throws IOException {
        switch (this.f874a) {
            case 1:
                kotlin.jvm.internal.i.e(b5, "b");
                ((FileOutputStream) this.f875b).write(b5);
                break;
            default:
                super.write(b5);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i, int i5) {
        switch (this.f874a) {
            case 0:
                ((C0060l1) this.f875b).h(bytes, i, i5);
                break;
            default:
                kotlin.jvm.internal.i.e(bytes, "bytes");
                ((FileOutputStream) this.f875b).write(bytes, i, i5);
                break;
        }
    }
}
