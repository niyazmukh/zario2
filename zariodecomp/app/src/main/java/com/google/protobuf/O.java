package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\O.smali */
public final class O extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f6438a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f6439b;

    /* renamed from: c, reason: collision with root package name */
    public int f6440c;

    /* renamed from: d, reason: collision with root package name */
    public int f6441d;

    /* renamed from: e, reason: collision with root package name */
    public int f6442e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6443f;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f6444k;

    /* renamed from: l, reason: collision with root package name */
    public int f6445l;

    /* renamed from: m, reason: collision with root package name */
    public long f6446m;

    public final boolean a() {
        this.f6441d++;
        Iterator it = this.f6438a;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f6439b = byteBuffer;
        this.f6442e = byteBuffer.position();
        if (this.f6439b.hasArray()) {
            this.f6443f = true;
            this.f6444k = this.f6439b.array();
            this.f6445l = this.f6439b.arrayOffset();
        } else {
            this.f6443f = false;
            this.f6446m = M0.f6430b.j(this.f6439b, M0.f6434f);
            this.f6444k = null;
        }
        return true;
    }

    public final void e(int i) {
        int i5 = this.f6442e + i;
        this.f6442e = i5;
        if (i5 == this.f6439b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f6441d == this.f6440c) {
            return -1;
        }
        if (this.f6443f) {
            int i = this.f6444k[this.f6442e + this.f6445l] & 255;
            e(1);
            return i;
        }
        int iE = M0.f6430b.e(this.f6442e + this.f6446m) & 255;
        e(1);
        return iE;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) {
        if (this.f6441d == this.f6440c) {
            return -1;
        }
        int iLimit = this.f6439b.limit();
        int i6 = this.f6442e;
        int i7 = iLimit - i6;
        if (i5 > i7) {
            i5 = i7;
        }
        if (this.f6443f) {
            System.arraycopy(this.f6444k, i6 + this.f6445l, bArr, i, i5);
            e(i5);
        } else {
            int iPosition = this.f6439b.position();
            this.f6439b.position(this.f6442e);
            this.f6439b.get(bArr, i, i5);
            this.f6439b.position(iPosition);
            e(i5);
        }
        return i5;
    }
}
