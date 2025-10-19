package h2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\c.smali */
public final class c extends q implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f7663a;

    /* renamed from: b, reason: collision with root package name */
    public int f7664b;

    /* renamed from: c, reason: collision with root package name */
    public final e f7665c;

    public c(e eVar, int i) {
        int size = eVar.size();
        S0.f.m(i, size);
        this.f7663a = size;
        this.f7664b = i;
        this.f7665c = eVar;
    }

    public final Object a(int i) {
        return this.f7665c.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7664b < this.f7663a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7664b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f7664b;
        this.f7664b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7664b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f7664b - 1;
        this.f7664b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7664b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
