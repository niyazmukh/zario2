package G3;

import com.google.protobuf.AbstractC0388a;
import com.google.protobuf.AbstractC0422s;
import com.google.protobuf.C0419q;
import com.google.protobuf.E;
import com.google.protobuf.InterfaceC0410l0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;
import z3.G;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G3\a.smali */
public final class a extends InputStream implements G {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0388a f1867a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0410l0 f1868b;

    /* renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f1869c;

    public a(AbstractC0388a abstractC0388a, InterfaceC0410l0 interfaceC0410l0) {
        this.f1867a = abstractC0388a;
        this.f1868b = interfaceC0410l0;
    }

    @Override // java.io.InputStream
    public final int available() {
        AbstractC0388a abstractC0388a = this.f1867a;
        if (abstractC0388a != null) {
            return ((E) abstractC0388a).c(null);
        }
        ByteArrayInputStream byteArrayInputStream = this.f1869c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f1867a != null) {
            this.f1869c = new ByteArrayInputStream(this.f1867a.d());
            this.f1867a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f1869c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) {
        AbstractC0388a abstractC0388a = this.f1867a;
        if (abstractC0388a != null) {
            int iC = ((E) abstractC0388a).c(null);
            if (iC == 0) {
                this.f1867a = null;
                this.f1869c = null;
                return -1;
            }
            if (i5 >= iC) {
                Logger logger = AbstractC0422s.f6578d;
                C0419q c0419q = new C0419q(bArr, i, iC);
                this.f1867a.e(c0419q);
                if (c0419q.P0() == 0) {
                    this.f1867a = null;
                    this.f1869c = null;
                    return iC;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            this.f1869c = new ByteArrayInputStream(this.f1867a.d());
            this.f1867a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f1869c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i5);
        }
        return -1;
    }
}
