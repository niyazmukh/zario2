package C3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\t.smali */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final q4.d f1248a;

    /* renamed from: b, reason: collision with root package name */
    public int f1249b;

    /* renamed from: c, reason: collision with root package name */
    public int f1250c;

    public t(q4.d dVar, int i) {
        this.f1248a = dVar;
        this.f1249b = i;
    }

    public final void a(byte[] bArr, int i, int i5) {
        this.f1248a.t(bArr, i, i5);
        this.f1249b -= i5;
        this.f1250c += i5;
    }
}
