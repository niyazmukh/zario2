package com.google.protobuf;

import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\g.1.smali */
public final class C0399g extends AbstractC0401h {

    /* renamed from: a, reason: collision with root package name */
    public int f6499a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f6500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0409l f6501c;

    public C0399g(AbstractC0409l abstractC0409l) {
        this.f6501c = abstractC0409l;
        this.f6500b = abstractC0409l.size();
    }

    @Override // com.google.protobuf.AbstractC0401h
    public final byte a() {
        int i = this.f6499a;
        if (i >= this.f6500b) {
            throw new NoSuchElementException();
        }
        this.f6499a = i + 1;
        return this.f6501c.n(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6499a < this.f6500b;
    }
}
