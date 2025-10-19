package h2;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\d.smali */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f7666c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f7667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f7668e;

    public d(e eVar, int i, int i5) {
        this.f7668e = eVar;
        this.f7666c = i;
        this.f7667d = i5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        S0.f.k(i, this.f7667d);
        return this.f7668e.get(i + this.f7666c);
    }

    @Override // h2.AbstractC0592a
    public final Object[] h() {
        return this.f7668e.h();
    }

    @Override // h2.AbstractC0592a
    public final int i() {
        return this.f7668e.j() + this.f7666c + this.f7667d;
    }

    @Override // h2.e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // h2.AbstractC0592a
    public final int j() {
        return this.f7668e.j() + this.f7666c;
    }

    @Override // h2.AbstractC0592a
    public final boolean k() {
        return true;
    }

    @Override // h2.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // h2.e, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final e subList(int i, int i5) {
        S0.f.n(i, i5, this.f7667d);
        int i6 = this.f7666c;
        return this.f7668e.subList(i + i6, i5 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7667d;
    }

    @Override // h2.e, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
