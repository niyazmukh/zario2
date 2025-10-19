package q4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q4\j.smali */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9527a;

    /* renamed from: b, reason: collision with root package name */
    public int f9528b;

    /* renamed from: c, reason: collision with root package name */
    public int f9529c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9530d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9531e;

    /* renamed from: f, reason: collision with root package name */
    public j f9532f;

    /* renamed from: g, reason: collision with root package name */
    public j f9533g;

    public j() {
        this.f9527a = new byte[8192];
        this.f9531e = true;
        this.f9530d = false;
    }

    public final j a() {
        j jVar = this.f9532f;
        if (jVar == this) {
            jVar = null;
        }
        j jVar2 = this.f9533g;
        kotlin.jvm.internal.i.b(jVar2);
        jVar2.f9532f = this.f9532f;
        j jVar3 = this.f9532f;
        kotlin.jvm.internal.i.b(jVar3);
        jVar3.f9533g = this.f9533g;
        this.f9532f = null;
        this.f9533g = null;
        return jVar;
    }

    public final void b(j segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        segment.f9533g = this;
        segment.f9532f = this.f9532f;
        j jVar = this.f9532f;
        kotlin.jvm.internal.i.b(jVar);
        jVar.f9533g = segment;
        this.f9532f = segment;
    }

    public final j c() {
        this.f9530d = true;
        return new j(this.f9527a, this.f9528b, this.f9529c, true);
    }

    public final void d(j sink, int i) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (!sink.f9531e) {
            throw new IllegalStateException("only owner can write");
        }
        int i5 = sink.f9529c;
        int i6 = i5 + i;
        byte[] bArr = sink.f9527a;
        if (i6 > 8192) {
            if (sink.f9530d) {
                throw new IllegalArgumentException();
            }
            int i7 = sink.f9528b;
            if (i6 - i7 > 8192) {
                throw new IllegalArgumentException();
            }
            L3.i.s0(bArr, 0, bArr, i7, i5);
            sink.f9529c -= sink.f9528b;
            sink.f9528b = 0;
        }
        int i8 = sink.f9529c;
        int i9 = this.f9528b;
        L3.i.s0(this.f9527a, i8, bArr, i9, i9 + i);
        sink.f9529c += i;
        this.f9528b += i;
    }

    public j(byte[] data, int i, int i5, boolean z4) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f9527a = data;
        this.f9528b = i;
        this.f9529c = i5;
        this.f9530d = z4;
        this.f9531e = false;
    }
}
