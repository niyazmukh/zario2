package q4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q4\l.smali */
public final class l extends f {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f9537e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f9538f;

    public l(byte[][] bArr, int[] iArr) {
        super(f.f9516d.f9517a);
        this.f9537e = bArr;
        this.f9538f = iArr;
    }

    @Override // q4.f
    public final String a() {
        throw null;
    }

    @Override // q4.f
    public final int b() {
        return this.f9538f[this.f9537e.length - 1];
    }

    @Override // q4.f
    public final String c() {
        return new f(j()).c();
    }

    @Override // q4.f
    public final byte[] d() {
        return j();
    }

    @Override // q4.f
    public final byte e(int i) {
        byte[][] bArr = this.f9537e;
        int length = bArr.length - 1;
        int[] iArr = this.f9538f;
        r1.d.n(iArr[length], i, 1L);
        int iA = r4.b.a(this, i);
        return bArr[iA][(i - (iA == 0 ? 0 : iArr[iA - 1])) + iArr[bArr.length + iA]];
    }

    @Override // q4.f
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.b() == b() && h(fVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // q4.f
    public final boolean g(int i, byte[] other, int i5, int i6) {
        kotlin.jvm.internal.i.e(other, "other");
        if (i < 0 || i > b() - i6 || i5 < 0 || i5 > other.length - i6) {
            return false;
        }
        int i7 = i6 + i;
        int iA = r4.b.a(this, i);
        while (i < i7) {
            int[] iArr = this.f9538f;
            int i8 = iA == 0 ? 0 : iArr[iA - 1];
            int i9 = iArr[iA] - i8;
            byte[][] bArr = this.f9537e;
            int i10 = iArr[bArr.length + iA];
            int iMin = Math.min(i7, i9 + i8) - i;
            if (!r1.d.g(bArr[iA], (i - i8) + i10, other, i5, iMin)) {
                return false;
            }
            i5 += iMin;
            i += iMin;
            iA++;
        }
        return true;
    }

    @Override // q4.f
    public final boolean h(f other, int i) {
        kotlin.jvm.internal.i.e(other, "other");
        if (b() - i < 0) {
            return false;
        }
        int iA = r4.b.a(this, 0);
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            int[] iArr = this.f9538f;
            int i7 = iA == 0 ? 0 : iArr[iA - 1];
            int i8 = iArr[iA] - i7;
            byte[][] bArr = this.f9537e;
            int i9 = iArr[bArr.length + iA];
            int iMin = Math.min(i, i8 + i7) - i5;
            if (!other.g(i6, bArr[iA], (i5 - i7) + i9, iMin)) {
                return false;
            }
            i6 += iMin;
            i5 += iMin;
            iA++;
        }
        return true;
    }

    @Override // q4.f
    public final int hashCode() {
        int i = this.f9518b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f9537e;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.f9538f;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            byte[] bArr2 = bArr[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr2[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        this.f9518b = i6;
        return i6;
    }

    @Override // q4.f
    public final f i() {
        return new f(j()).i();
    }

    @Override // q4.f
    public final byte[] j() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f9537e;
        int length = bArr2.length;
        int i = 0;
        int i5 = 0;
        int i6 = 0;
        while (i < length) {
            int[] iArr = this.f9538f;
            int i7 = iArr[length + i];
            int i8 = iArr[i];
            int i9 = i8 - i5;
            L3.i.s0(bArr2[i], i6, bArr, i7, i7 + i9);
            i6 += i9;
            i++;
            i5 = i8;
        }
        return bArr;
    }

    @Override // q4.f
    public final void l(d buffer, int i) {
        kotlin.jvm.internal.i.e(buffer, "buffer");
        int iA = r4.b.a(this, 0);
        int i5 = 0;
        while (i5 < i) {
            int[] iArr = this.f9538f;
            int i6 = iA == 0 ? 0 : iArr[iA - 1];
            int i7 = iArr[iA] - i6;
            byte[][] bArr = this.f9537e;
            int i8 = iArr[bArr.length + iA];
            int iMin = Math.min(i, i7 + i6) - i5;
            int i9 = (i5 - i6) + i8;
            j jVar = new j(bArr[iA], i9, i9 + iMin, true);
            j jVar2 = buffer.f9514a;
            if (jVar2 == null) {
                jVar.f9533g = jVar;
                jVar.f9532f = jVar;
                buffer.f9514a = jVar;
            } else {
                j jVar3 = jVar2.f9533g;
                kotlin.jvm.internal.i.b(jVar3);
                jVar3.b(jVar);
            }
            i5 += iMin;
            iA++;
        }
        buffer.f9515b += i;
    }

    @Override // q4.f
    public final String toString() {
        return new f(j()).toString();
    }
}
