package q4;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q4\c.smali */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9511a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final n f9512b;

    /* renamed from: c, reason: collision with root package name */
    public final Closeable f9513c;

    public c(InputStream inputStream, n nVar) {
        this.f9513c = inputStream;
        this.f9512b = nVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f9511a) {
            case 0:
                c cVar = (c) this.f9513c;
                n nVar = this.f9512b;
                try {
                    cVar.close();
                    if (nVar.q0()) {
                        throw nVar.r0(null);
                    }
                    return;
                } catch (IOException e5) {
                    if (!nVar.q0()) {
                        throw e5;
                    }
                    throw nVar.r0(e5);
                } finally {
                    nVar.q0();
                }
            default:
                ((InputStream) this.f9513c).close();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    @Override // q4.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(q4.d r6, long r7) {
        /*
            r5 = this;
            java.io.Closeable r0 = r5.f9513c
            r1 = 1
            q4.n r2 = r5.f9512b
            int r5 = r5.f9511a
            switch(r5) {
                case 0: goto L8f;
                default: goto La;
            }
        La:
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 != 0) goto L11
            goto L52
        L11:
            if (r5 < 0) goto L77
            r2.l0()     // Catch: java.lang.AssertionError -> L41
            q4.j r5 = r6.s(r1)     // Catch: java.lang.AssertionError -> L41
            int r2 = r5.f9529c     // Catch: java.lang.AssertionError -> L41
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.lang.AssertionError -> L41
            long r7 = java.lang.Math.min(r7, r2)     // Catch: java.lang.AssertionError -> L41
            int r7 = (int) r7     // Catch: java.lang.AssertionError -> L41
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.AssertionError -> L41
            byte[] r8 = r5.f9527a     // Catch: java.lang.AssertionError -> L41
            int r2 = r5.f9529c     // Catch: java.lang.AssertionError -> L41
            int r7 = r0.read(r8, r2, r7)     // Catch: java.lang.AssertionError -> L41
            r8 = -1
            if (r7 != r8) goto L46
            int r7 = r5.f9528b     // Catch: java.lang.AssertionError -> L41
            int r8 = r5.f9529c     // Catch: java.lang.AssertionError -> L41
            if (r7 != r8) goto L43
            q4.j r7 = r5.a()     // Catch: java.lang.AssertionError -> L41
            r6.f9514a = r7     // Catch: java.lang.AssertionError -> L41
            q4.k.a(r5)     // Catch: java.lang.AssertionError -> L41
            goto L43
        L41:
            r5 = move-exception
            goto L53
        L43:
            r3 = -1
            goto L52
        L46:
            int r8 = r5.f9529c     // Catch: java.lang.AssertionError -> L41
            int r8 = r8 + r7
            r5.f9529c = r8     // Catch: java.lang.AssertionError -> L41
            long r2 = r6.f9515b     // Catch: java.lang.AssertionError -> L41
            long r7 = (long) r7     // Catch: java.lang.AssertionError -> L41
            long r2 = r2 + r7
            r6.f9515b = r2     // Catch: java.lang.AssertionError -> L41
            r3 = r7
        L52:
            return r3
        L53:
            int r6 = q4.g.f9520a
            java.lang.Throwable r6 = r5.getCause()
            r7 = 0
            if (r6 == 0) goto L6d
            java.lang.String r6 = r5.getMessage()
            if (r6 == 0) goto L69
            java.lang.String r8 = "getsockname failed"
            boolean r6 = e4.m.l0(r6, r8)
            goto L6a
        L69:
            r6 = r7
        L6a:
            if (r6 == 0) goto L6d
            goto L6e
        L6d:
            r1 = r7
        L6e:
            if (r1 == 0) goto L76
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            throw r6
        L76:
            throw r5
        L77:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "byteCount < 0: "
            r5.<init>(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L8f:
            q4.c r0 = (q4.c) r0
            long r5 = r0.h(r6, r7)     // Catch: java.lang.Throwable -> La2 java.io.IOException -> La4
            boolean r7 = r2.q0()
            if (r7 != 0) goto L9c
            return r5
        L9c:
            r5 = 0
            java.io.IOException r5 = r2.r0(r5)
            throw r5
        La2:
            r5 = move-exception
            goto Lb1
        La4:
            r5 = move-exception
            boolean r6 = r2.q0()     // Catch: java.lang.Throwable -> La2
            if (r6 != 0) goto Lac
            goto Lb0
        Lac:
            java.io.IOException r5 = r2.r0(r5)     // Catch: java.lang.Throwable -> La2
        Lb0:
            throw r5     // Catch: java.lang.Throwable -> La2
        Lb1:
            r2.q0()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.c.h(q4.d, long):long");
    }

    public final String toString() {
        switch (this.f9511a) {
            case 0:
                return "AsyncTimeout.source(" + ((c) this.f9513c) + ')';
            default:
                return "source(" + ((InputStream) this.f9513c) + ')';
        }
    }

    public c(n nVar, c cVar) {
        this.f9512b = nVar;
        this.f9513c = cVar;
    }
}
