package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\f.1.smali */
public final class C0203f extends C0204g {

    /* renamed from: e, reason: collision with root package name */
    public final int f4490e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4491f;

    public C0203f(byte[] bArr, int i, int i5) {
        super(bArr);
        C0204g.g(i, i + i5, bArr.length);
        this.f4490e = i;
        this.f4491f = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.C0204g
    public final byte f(int i) {
        int i5 = this.f4491f;
        if (((i5 - (i + 1)) | i) >= 0) {
            return this.f4496b[this.f4490e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(B.a.g(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(B.a.h("Index > length: ", i, i5, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0204g
    public final void i(byte[] bArr, int i) {
        System.arraycopy(this.f4496b, this.f4490e, bArr, 0, i);
    }

    @Override // androidx.datastore.preferences.protobuf.C0204g
    public final int j() {
        return this.f4490e;
    }

    @Override // androidx.datastore.preferences.protobuf.C0204g
    public final byte k(int i) {
        return this.f4496b[this.f4490e + i];
    }

    @Override // androidx.datastore.preferences.protobuf.C0204g
    public final int size() {
        return this.f4491f;
    }
}
