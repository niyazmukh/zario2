package q4;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q4\d.smali */
public final class d implements o, ReadableByteChannel, e, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public j f9514a;

    /* renamed from: b, reason: collision with root package name */
    public long f9515b;

    public final long a() {
        long j5 = this.f9515b;
        if (j5 == 0) {
            return 0L;
        }
        j jVar = this.f9514a;
        kotlin.jvm.internal.i.b(jVar);
        j jVar2 = jVar.f9533g;
        kotlin.jvm.internal.i.b(jVar2);
        if (jVar2.f9529c < 8192 && jVar2.f9531e) {
            j5 -= r2 - jVar2.f9528b;
        }
        return j5;
    }

    @Override // q4.m
    public final void b(d source, long j5) {
        j jVarB;
        kotlin.jvm.internal.i.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        r1.d.n(source.f9515b, 0L, j5);
        while (j5 > 0) {
            j jVar = source.f9514a;
            kotlin.jvm.internal.i.b(jVar);
            int i = jVar.f9529c;
            j jVar2 = source.f9514a;
            kotlin.jvm.internal.i.b(jVar2);
            long j6 = i - jVar2.f9528b;
            int i5 = 0;
            if (j5 < j6) {
                j jVar3 = this.f9514a;
                j jVar4 = jVar3 != null ? jVar3.f9533g : null;
                if (jVar4 != null && jVar4.f9531e) {
                    if ((jVar4.f9529c + j5) - (jVar4.f9530d ? 0 : jVar4.f9528b) <= 8192) {
                        j jVar5 = source.f9514a;
                        kotlin.jvm.internal.i.b(jVar5);
                        jVar5.d(jVar4, (int) j5);
                        source.f9515b -= j5;
                        this.f9515b += j5;
                        return;
                    }
                }
                j jVar6 = source.f9514a;
                kotlin.jvm.internal.i.b(jVar6);
                int i6 = (int) j5;
                if (i6 <= 0 || i6 > jVar6.f9529c - jVar6.f9528b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i6 >= 1024) {
                    jVarB = jVar6.c();
                } else {
                    jVarB = k.b();
                    int i7 = jVar6.f9528b;
                    L3.i.s0(jVar6.f9527a, 0, jVarB.f9527a, i7, i7 + i6);
                }
                jVarB.f9529c = jVarB.f9528b + i6;
                jVar6.f9528b += i6;
                j jVar7 = jVar6.f9533g;
                kotlin.jvm.internal.i.b(jVar7);
                jVar7.b(jVarB);
                source.f9514a = jVarB;
            }
            j jVar8 = source.f9514a;
            kotlin.jvm.internal.i.b(jVar8);
            long j7 = jVar8.f9529c - jVar8.f9528b;
            source.f9514a = jVar8.a();
            j jVar9 = this.f9514a;
            if (jVar9 == null) {
                this.f9514a = jVar8;
                jVar8.f9533g = jVar8;
                jVar8.f9532f = jVar8;
            } else {
                j jVar10 = jVar9.f9533g;
                kotlin.jvm.internal.i.b(jVar10);
                jVar10.b(jVar8);
                j jVar11 = jVar8.f9533g;
                if (jVar11 == jVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.i.b(jVar11);
                if (jVar11.f9531e) {
                    int i8 = jVar8.f9529c - jVar8.f9528b;
                    j jVar12 = jVar8.f9533g;
                    kotlin.jvm.internal.i.b(jVar12);
                    int i9 = 8192 - jVar12.f9529c;
                    j jVar13 = jVar8.f9533g;
                    kotlin.jvm.internal.i.b(jVar13);
                    if (!jVar13.f9530d) {
                        j jVar14 = jVar8.f9533g;
                        kotlin.jvm.internal.i.b(jVar14);
                        i5 = jVar14.f9528b;
                    }
                    if (i8 <= i9 + i5) {
                        j jVar15 = jVar8.f9533g;
                        kotlin.jvm.internal.i.b(jVar15);
                        jVar8.d(jVar15, i8);
                        jVar8.a();
                        k.a(jVar8);
                    }
                }
            }
            source.f9515b -= j7;
            this.f9515b += j7;
            j5 -= j7;
        }
    }

    public final Object clone() {
        d dVar = new d();
        if (this.f9515b != 0) {
            j jVar = this.f9514a;
            kotlin.jvm.internal.i.b(jVar);
            j jVarC = jVar.c();
            dVar.f9514a = jVarC;
            jVarC.f9533g = jVarC;
            jVarC.f9532f = jVarC;
            for (j jVar2 = jVar.f9532f; jVar2 != jVar; jVar2 = jVar2.f9532f) {
                j jVar3 = jVarC.f9533g;
                kotlin.jvm.internal.i.b(jVar3);
                kotlin.jvm.internal.i.b(jVar2);
                jVar3.b(jVar2.c());
            }
            dVar.f9515b = this.f9515b;
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, q4.m
    public final void close() {
    }

    public final byte e(long j5) {
        r1.d.n(this.f9515b, j5, 1L);
        j jVar = this.f9514a;
        if (jVar == null) {
            kotlin.jvm.internal.i.b(null);
            throw null;
        }
        long j6 = this.f9515b;
        if (j6 - j5 < j5) {
            while (j6 > j5) {
                jVar = jVar.f9533g;
                kotlin.jvm.internal.i.b(jVar);
                j6 -= jVar.f9529c - jVar.f9528b;
            }
            return jVar.f9527a[(int) ((jVar.f9528b + j5) - j6)];
        }
        long j7 = 0;
        while (true) {
            int i = jVar.f9529c;
            int i5 = jVar.f9528b;
            long j8 = (i - i5) + j7;
            if (j8 > j5) {
                return jVar.f9527a[(int) ((i5 + j5) - j7)];
            }
            jVar = jVar.f9532f;
            kotlin.jvm.internal.i.b(jVar);
            j7 = j8;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                long j5 = this.f9515b;
                d dVar = (d) obj;
                if (j5 == dVar.f9515b) {
                    if (j5 != 0) {
                        j jVar = this.f9514a;
                        kotlin.jvm.internal.i.b(jVar);
                        j jVar2 = dVar.f9514a;
                        kotlin.jvm.internal.i.b(jVar2);
                        int i = jVar.f9528b;
                        int i5 = jVar2.f9528b;
                        long j6 = 0;
                        while (j6 < this.f9515b) {
                            long jMin = Math.min(jVar.f9529c - i, jVar2.f9529c - i5);
                            long j7 = 0;
                            while (j7 < jMin) {
                                int i6 = i + 1;
                                byte b5 = jVar.f9527a[i];
                                int i7 = i5 + 1;
                                if (b5 == jVar2.f9527a[i5]) {
                                    j7++;
                                    i5 = i7;
                                    i = i6;
                                }
                            }
                            if (i == jVar.f9529c) {
                                j jVar3 = jVar.f9532f;
                                kotlin.jvm.internal.i.b(jVar3);
                                i = jVar3.f9528b;
                                jVar = jVar3;
                            }
                            if (i5 == jVar2.f9529c) {
                                jVar2 = jVar2.f9532f;
                                kotlin.jvm.internal.i.b(jVar2);
                                i5 = jVar2.f9528b;
                            }
                            j6 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // q4.m, java.io.Flushable
    public final void flush() {
    }

    @Override // q4.o
    public final long h(d dVar, long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        long j6 = this.f9515b;
        if (j6 == 0) {
            return -1L;
        }
        if (j5 > j6) {
            j5 = j6;
        }
        dVar.b(this, j5);
        return j5;
    }

    public final int hashCode() {
        j jVar = this.f9514a;
        if (jVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i5 = jVar.f9529c;
            for (int i6 = jVar.f9528b; i6 < i5; i6++) {
                i = (i * 31) + jVar.f9527a[i6];
            }
            jVar = jVar.f9532f;
            kotlin.jvm.internal.i.b(jVar);
        } while (jVar != this.f9514a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final int k(byte[] sink, int i, int i5) {
        kotlin.jvm.internal.i.e(sink, "sink");
        r1.d.n(sink.length, i, i5);
        j jVar = this.f9514a;
        if (jVar == null) {
            return -1;
        }
        int iMin = Math.min(i5, jVar.f9529c - jVar.f9528b);
        int i6 = jVar.f9528b;
        L3.i.s0(jVar.f9527a, i, sink, i6, i6 + iMin);
        int i7 = jVar.f9528b + iMin;
        jVar.f9528b = i7;
        this.f9515b -= iMin;
        if (i7 == jVar.f9529c) {
            this.f9514a = jVar.a();
            k.a(jVar);
        }
        return iMin;
    }

    public final byte l() throws EOFException {
        if (this.f9515b == 0) {
            throw new EOFException();
        }
        j jVar = this.f9514a;
        kotlin.jvm.internal.i.b(jVar);
        int i = jVar.f9528b;
        int i5 = jVar.f9529c;
        int i6 = i + 1;
        byte b5 = jVar.f9527a[i];
        this.f9515b--;
        if (i6 == i5) {
            this.f9514a = jVar.a();
            k.a(jVar);
        } else {
            jVar.f9528b = i6;
        }
        return b5;
    }

    public final byte[] m(long j5) throws EOFException {
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j5).toString());
        }
        if (this.f9515b < j5) {
            throw new EOFException();
        }
        int i = (int) j5;
        byte[] bArr = new byte[i];
        int i5 = 0;
        while (i5 < i) {
            int iK = k(bArr, i5, i - i5);
            if (iK == -1) {
                throw new EOFException();
            }
            i5 += iK;
        }
        return bArr;
    }

    public final f n(long j5) throws EOFException {
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j5).toString());
        }
        if (this.f9515b < j5) {
            throw new EOFException();
        }
        if (j5 < 4096) {
            return new f(m(j5));
        }
        f fVarR = r((int) j5);
        p(j5);
        return fVarR;
    }

    public final String o(long j5, Charset charset) throws EOFException {
        kotlin.jvm.internal.i.e(charset, "charset");
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j5).toString());
        }
        if (this.f9515b < j5) {
            throw new EOFException();
        }
        if (j5 == 0) {
            return "";
        }
        j jVar = this.f9514a;
        kotlin.jvm.internal.i.b(jVar);
        int i = jVar.f9528b;
        if (i + j5 > jVar.f9529c) {
            return new String(m(j5), charset);
        }
        int i5 = (int) j5;
        String str = new String(jVar.f9527a, i, i5, charset);
        int i6 = jVar.f9528b + i5;
        jVar.f9528b = i6;
        this.f9515b -= j5;
        if (i6 == jVar.f9529c) {
            this.f9514a = jVar.a();
            k.a(jVar);
        }
        return str;
    }

    public final void p(long j5) throws EOFException {
        while (j5 > 0) {
            j jVar = this.f9514a;
            if (jVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j5, jVar.f9529c - jVar.f9528b);
            long j6 = iMin;
            this.f9515b -= j6;
            j5 -= j6;
            int i = jVar.f9528b + iMin;
            jVar.f9528b = i;
            if (i == jVar.f9529c) {
                this.f9514a = jVar.a();
                k.a(jVar);
            }
        }
    }

    public final f q() {
        long j5 = this.f9515b;
        if (j5 <= 2147483647L) {
            return r((int) j5);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f9515b).toString());
    }

    public final f r(int i) {
        if (i == 0) {
            return f.f9516d;
        }
        r1.d.n(this.f9515b, 0L, i);
        j jVar = this.f9514a;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i) {
            kotlin.jvm.internal.i.b(jVar);
            int i8 = jVar.f9529c;
            int i9 = jVar.f9528b;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            jVar = jVar.f9532f;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        j jVar2 = this.f9514a;
        int i10 = 0;
        while (i5 < i) {
            kotlin.jvm.internal.i.b(jVar2);
            bArr[i10] = jVar2.f9527a;
            i5 += jVar2.f9529c - jVar2.f9528b;
            iArr[i10] = Math.min(i5, i);
            iArr[i10 + i7] = jVar2.f9528b;
            jVar2.f9530d = true;
            i10++;
            jVar2 = jVar2.f9532f;
        }
        return new l(bArr, iArr);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        j jVar = this.f9514a;
        if (jVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), jVar.f9529c - jVar.f9528b);
        sink.put(jVar.f9527a, jVar.f9528b, iMin);
        int i = jVar.f9528b + iMin;
        jVar.f9528b = i;
        this.f9515b -= iMin;
        if (i == jVar.f9529c) {
            this.f9514a = jVar.a();
            k.a(jVar);
        }
        return iMin;
    }

    public final j s(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        j jVar = this.f9514a;
        if (jVar == null) {
            j jVarB = k.b();
            this.f9514a = jVarB;
            jVarB.f9533g = jVarB;
            jVarB.f9532f = jVarB;
            return jVarB;
        }
        j jVar2 = jVar.f9533g;
        kotlin.jvm.internal.i.b(jVar2);
        if (jVar2.f9529c + i <= 8192 && jVar2.f9531e) {
            return jVar2;
        }
        j jVarB2 = k.b();
        jVar2.b(jVarB2);
        return jVarB2;
    }

    public final void t(byte[] source, int i, int i5) {
        kotlin.jvm.internal.i.e(source, "source");
        long j5 = i5;
        r1.d.n(source.length, i, j5);
        int i6 = i5 + i;
        while (i < i6) {
            j jVarS = s(1);
            int iMin = Math.min(i6 - i, 8192 - jVarS.f9529c);
            int i7 = i + iMin;
            L3.i.s0(source, jVarS.f9529c, jVarS.f9527a, i, i7);
            jVarS.f9529c += iMin;
            i = i7;
        }
        this.f9515b += j5;
    }

    public final String toString() {
        return q().toString();
    }

    public final void u(int i) {
        j jVarS = s(1);
        int i5 = jVarS.f9529c;
        jVarS.f9529c = i5 + 1;
        jVarS.f9527a[i5] = (byte) i;
        this.f9515b++;
    }

    public final void v(int i, String string) {
        char cCharAt;
        kotlin.jvm.internal.i.e(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(B.a.i("endIndex < beginIndex: ", i, " < 0").toString());
        }
        if (i > string.length()) {
            StringBuilder sbN = B.a.n("endIndex > string.length: ", i, " > ");
            sbN.append(string.length());
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        int i5 = 0;
        while (i5 < i) {
            char cCharAt2 = string.charAt(i5);
            if (cCharAt2 < 128) {
                j jVarS = s(1);
                int i6 = jVarS.f9529c - i5;
                int iMin = Math.min(i, 8192 - i6);
                int i7 = i5 + 1;
                byte[] bArr = jVarS.f9527a;
                bArr[i5 + i6] = (byte) cCharAt2;
                while (true) {
                    i5 = i7;
                    if (i5 >= iMin || (cCharAt = string.charAt(i5)) >= 128) {
                        break;
                    }
                    i7 = i5 + 1;
                    bArr[i5 + i6] = (byte) cCharAt;
                }
                int i8 = jVarS.f9529c;
                int i9 = (i6 + i5) - i8;
                jVarS.f9529c = i8 + i9;
                this.f9515b += i9;
            } else {
                if (cCharAt2 < 2048) {
                    j jVarS2 = s(2);
                    int i10 = jVarS2.f9529c;
                    byte[] bArr2 = jVarS2.f9527a;
                    bArr2[i10] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i10 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    jVarS2.f9529c = i10 + 2;
                    this.f9515b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    j jVarS3 = s(3);
                    int i11 = jVarS3.f9529c;
                    byte[] bArr3 = jVarS3.f9527a;
                    bArr3[i11] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i11 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i11 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    jVarS3.f9529c = i11 + 3;
                    this.f9515b += 3;
                } else {
                    int i12 = i5 + 1;
                    char cCharAt3 = i12 < i ? string.charAt(i12) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        u(63);
                        i5 = i12;
                    } else {
                        int i13 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        j jVarS4 = s(4);
                        int i14 = jVarS4.f9529c;
                        byte[] bArr4 = jVarS4.f9527a;
                        bArr4[i14] = (byte) ((i13 >> 18) | 240);
                        bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                        bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                        bArr4[i14 + 3] = (byte) ((i13 & 63) | 128);
                        jVarS4.f9529c = i14 + 4;
                        this.f9515b += 4;
                        i5 += 2;
                    }
                }
                i5++;
            }
        }
    }

    public final void w(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        v(string.length(), string);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            j jVarS = s(1);
            int iMin = Math.min(i, 8192 - jVarS.f9529c);
            source.get(jVarS.f9527a, jVarS.f9529c, iMin);
            i -= iMin;
            jVarS.f9529c += iMin;
        }
        this.f9515b += iRemaining;
        return iRemaining;
    }
}
