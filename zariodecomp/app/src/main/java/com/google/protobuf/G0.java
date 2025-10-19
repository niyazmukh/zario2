package com.google.protobuf;

import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\G0.smali */
public final class G0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f6419a;

    public G0(H0 h02) {
        this.f6419a = h02.f6423a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6419a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f6419a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
