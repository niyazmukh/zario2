package B3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import z3.AbstractC1083g;

/* renamed from: B3.h1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\h1.1.smali */
public final class C0048h1 extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final int f818a;

    /* renamed from: b, reason: collision with root package name */
    public final m2 f819b;

    /* renamed from: c, reason: collision with root package name */
    public long f820c;

    /* renamed from: d, reason: collision with root package name */
    public long f821d;

    /* renamed from: e, reason: collision with root package name */
    public long f822e;

    public C0048h1(InputStream inputStream, int i, m2 m2Var) {
        super(inputStream);
        this.f822e = -1L;
        this.f818a = i;
        this.f819b = m2Var;
    }

    public final void a() {
        long j5 = this.f821d;
        long j6 = this.f820c;
        if (j5 > j6) {
            long j7 = j5 - j6;
            for (AbstractC1083g abstractC1083g : this.f819b.f910a) {
                abstractC1083g.f(j7);
            }
            this.f820c = this.f821d;
        }
    }

    public final void e() {
        long j5 = this.f821d;
        int i = this.f818a;
        if (j5 <= i) {
            return;
        }
        throw new z3.m0(z3.k0.f11352k.g("Decompressed gRPC message exceeds maximum size " + i));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f822e = this.f821d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f821d++;
        }
        e();
        a();
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f822e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f821d = this.f822e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j5);
        this.f821d += jSkip;
        e();
        a();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        int i6 = ((FilterInputStream) this).in.read(bArr, i, i5);
        if (i6 != -1) {
            this.f821d += i6;
        }
        e();
        a();
        return i6;
    }
}
