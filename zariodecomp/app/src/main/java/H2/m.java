package h2;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\m.smali */
public final class m extends e {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f7686c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f7687d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f7688e;

    public m(Object[] objArr, int i, int i5) {
        this.f7686c = objArr;
        this.f7687d = i;
        this.f7688e = i5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        S0.f.k(i, this.f7688e);
        Object obj = this.f7686c[(i * 2) + this.f7687d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // h2.AbstractC0592a
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7688e;
    }
}
