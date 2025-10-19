package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\d.1.smali */
public final class C0201d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f4486a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f4487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0204g f4488c;

    public C0201d(C0204g c0204g) {
        this.f4488c = c0204g;
        this.f4487b = c0204g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4486a < this.f4487b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4486a;
        if (i >= this.f4487b) {
            throw new NoSuchElementException();
        }
        this.f4486a = i + 1;
        return Byte.valueOf(this.f4488c.k(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
