package com.google.protobuf;

import java.util.ListIterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\F0.smali */
public final class F0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f6418a;

    public F0(H0 h02, int i) {
        this.f6418a = h02.f6423a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f6418a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6418a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f6418a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6418a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f6418a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6418a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
