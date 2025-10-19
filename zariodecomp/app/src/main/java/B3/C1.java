package B3;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\C1.smali */
public final class C1 extends AbstractC0037e {

    /* renamed from: a, reason: collision with root package name */
    public int f382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f383b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f384c;

    /* renamed from: d, reason: collision with root package name */
    public int f385d = -1;

    public C1(byte[] bArr, int i, int i5) {
        S0.f.g("offset must be >= 0", i >= 0);
        S0.f.g("length must be >= 0", i5 >= 0);
        int i6 = i5 + i;
        S0.f.g("offset + length exceeds array boundary", i6 <= bArr.length);
        this.f384c = bArr;
        this.f382a = i;
        this.f383b = i6;
    }

    @Override // B3.AbstractC0037e
    public final void e() {
        this.f385d = this.f382a;
    }

    @Override // B3.AbstractC0037e
    public final AbstractC0037e l(int i) {
        a(i);
        int i5 = this.f382a;
        this.f382a = i5 + i;
        return new C1(this.f384c, i5, i);
    }

    @Override // B3.AbstractC0037e
    public final void m(OutputStream outputStream, int i) throws IOException {
        a(i);
        outputStream.write(this.f384c, this.f382a, i);
        this.f382a += i;
    }

    @Override // B3.AbstractC0037e
    public final void n(ByteBuffer byteBuffer) {
        S0.f.l(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        byteBuffer.put(this.f384c, this.f382a, iRemaining);
        this.f382a += iRemaining;
    }

    @Override // B3.AbstractC0037e
    public final void o(byte[] bArr, int i, int i5) {
        System.arraycopy(this.f384c, this.f382a, bArr, i, i5);
        this.f382a += i5;
    }

    @Override // B3.AbstractC0037e
    public final int p() {
        a(1);
        int i = this.f382a;
        this.f382a = i + 1;
        return this.f384c[i] & 255;
    }

    @Override // B3.AbstractC0037e
    public final int q() {
        return this.f383b - this.f382a;
    }

    @Override // B3.AbstractC0037e
    public final void r() {
        int i = this.f385d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.f382a = i;
    }

    @Override // B3.AbstractC0037e
    public final void s(int i) {
        a(i);
        this.f382a += i;
    }
}
