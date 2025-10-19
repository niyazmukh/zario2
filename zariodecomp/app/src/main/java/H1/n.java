package h1;

import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h1.1\n.smali */
public final class n extends m {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7651b;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f7651b = bArr;
    }

    @Override // h1.m
    public final byte[] a() {
        return this.f7651b;
    }
}
