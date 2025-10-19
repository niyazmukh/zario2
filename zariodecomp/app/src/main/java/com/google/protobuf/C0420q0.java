package com.google.protobuf;

import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.q0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\q0.1.smali */
public final class C0420q0 extends AbstractC0401h {

    /* renamed from: a, reason: collision with root package name */
    public final C0421r0 f6571a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0401h f6572b = b();

    public C0420q0(C0423s0 c0423s0) {
        this.f6571a = new C0421r0(c0423s0);
    }

    @Override // com.google.protobuf.AbstractC0401h
    public final byte a() {
        AbstractC0401h abstractC0401h = this.f6572b;
        if (abstractC0401h == null) {
            throw new NoSuchElementException();
        }
        byte bA = abstractC0401h.a();
        if (!this.f6572b.hasNext()) {
            this.f6572b = b();
        }
        return bA;
    }

    public final C0399g b() {
        C0421r0 c0421r0 = this.f6571a;
        if (c0421r0.hasNext()) {
            return new C0399g(c0421r0.a());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6572b != null;
    }
}
