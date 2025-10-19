package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\H0.smali */
public final class H0 extends AbstractList implements S, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final Q f6423a;

    public H0(Q q5) {
        this.f6423a = q5;
    }

    @Override // com.google.protobuf.S
    public final S a() {
        return this;
    }

    @Override // com.google.protobuf.S
    public final Object b(int i) {
        return this.f6423a.f6459b.get(i);
    }

    @Override // com.google.protobuf.S
    public final void d(AbstractC0409l abstractC0409l) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.S
    public final List e() {
        return Collections.unmodifiableList(this.f6423a.f6459b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f6423a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new G0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new F0(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6423a.f6459b.size();
    }
}
