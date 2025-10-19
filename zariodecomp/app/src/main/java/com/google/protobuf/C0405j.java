package com.google.protobuf;

/* renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\j.1.smali */
public final class C0405j extends C0407k {

    /* renamed from: e, reason: collision with root package name */
    public final int f6519e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6520f;

    public C0405j(byte[] bArr, int i, int i5) {
        super(bArr);
        AbstractC0409l.j(i, i + i5, bArr.length);
        this.f6519e = i;
        this.f6520f = i5;
    }

    @Override // com.google.protobuf.C0407k, com.google.protobuf.AbstractC0409l
    public final byte h(int i) {
        AbstractC0409l.i(i, this.f6520f);
        return this.f6523d[this.f6519e + i];
    }

    @Override // com.google.protobuf.C0407k, com.google.protobuf.AbstractC0409l
    public final void l(int i, byte[] bArr, int i5, int i6) {
        System.arraycopy(this.f6523d, this.f6519e + i, bArr, i5, i6);
    }

    @Override // com.google.protobuf.C0407k, com.google.protobuf.AbstractC0409l
    public final byte n(int i) {
        return this.f6523d[this.f6519e + i];
    }

    @Override // com.google.protobuf.C0407k, com.google.protobuf.AbstractC0409l
    public final int size() {
        return this.f6520f;
    }

    @Override // com.google.protobuf.C0407k
    public final int y() {
        return this.f6519e;
    }
}
