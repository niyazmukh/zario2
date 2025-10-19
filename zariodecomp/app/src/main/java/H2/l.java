package h2;

import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\l.smali */
public final class l extends g {

    /* renamed from: d, reason: collision with root package name */
    public final transient n f7684d;

    /* renamed from: e, reason: collision with root package name */
    public final transient m f7685e;

    public l(n nVar, m mVar) {
        this.f7684d = nVar;
        this.f7685e = mVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7684d.get(obj) != null;
    }

    @Override // h2.g, h2.AbstractC0592a
    public final e f() {
        return this.f7685e;
    }

    @Override // h2.AbstractC0592a
    public final int g(int i, Object[] objArr) {
        return this.f7685e.g(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f7685e.listIterator(0);
    }

    @Override // h2.AbstractC0592a
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7684d.f7695f;
    }
}
