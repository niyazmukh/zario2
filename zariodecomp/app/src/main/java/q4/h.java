package q4;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q4\h.smali */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final m f9521a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9522b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f9523c;

    public h(m mVar) {
        this.f9521a = mVar;
    }

    public final void a() {
        if (this.f9523c) {
            throw new IllegalStateException("closed");
        }
        d dVar = this.f9522b;
        long jA = dVar.a();
        if (jA > 0) {
            this.f9521a.b(dVar, jA);
        }
    }

    @Override // q4.m
    public final void b(d source, long j5) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f9523c) {
            throw new IllegalStateException("closed");
        }
        this.f9522b.b(source, j5);
        a();
    }

    @Override // q4.m, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        m mVar = this.f9521a;
        if (this.f9523c) {
            return;
        }
        try {
            d dVar = this.f9522b;
            long j5 = dVar.f9515b;
            if (j5 > 0) {
                mVar.b(dVar, j5);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            mVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f9523c = true;
        if (th != null) {
            throw th;
        }
    }

    public final e e(byte[] source) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f9523c) {
            throw new IllegalStateException("closed");
        }
        this.f9522b.t(source, 0, source.length);
        a();
        return this;
    }

    @Override // q4.m, java.io.Flushable
    public final void flush() {
        if (this.f9523c) {
            throw new IllegalStateException("closed");
        }
        d dVar = this.f9522b;
        long j5 = dVar.f9515b;
        m mVar = this.f9521a;
        if (j5 > 0) {
            mVar.b(dVar, j5);
        }
        mVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f9523c;
    }

    public final e k(int i) {
        if (this.f9523c) {
            throw new IllegalStateException("closed");
        }
        this.f9522b.u(i);
        a();
        return this;
    }

    public final e l(int i) {
        if (this.f9523c) {
            throw new IllegalStateException("closed");
        }
        d dVar = this.f9522b;
        j jVarS = dVar.s(4);
        int i5 = jVarS.f9529c;
        byte[] bArr = jVarS.f9527a;
        bArr[i5] = (byte) ((i >>> 24) & 255);
        bArr[i5 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i5 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i5 + 3] = (byte) (i & 255);
        jVarS.f9529c = i5 + 4;
        dVar.f9515b += 4;
        a();
        return this;
    }

    public final e m(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        if (this.f9523c) {
            throw new IllegalStateException("closed");
        }
        this.f9522b.w(string);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f9521a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f9523c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f9522b.write(source);
        a();
        return iWrite;
    }
}
