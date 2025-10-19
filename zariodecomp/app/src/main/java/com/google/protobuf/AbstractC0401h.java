package com.google.protobuf;

import java.util.Iterator;

/* renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\h.1.smali */
public abstract class AbstractC0401h implements Iterator {
    public abstract byte a();

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
