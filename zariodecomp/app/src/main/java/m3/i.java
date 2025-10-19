package M3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M3\i.smali */
public final class i extends L3.f implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final i f2525b;

    /* renamed from: a, reason: collision with root package name */
    public final f f2526a;

    static {
        f fVar = f.f2508r;
        f2525b = new i(f.f2508r);
    }

    public i(f backing) {
        kotlin.jvm.internal.i.e(backing, "backing");
        this.f2526a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f2526a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f2526a.c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2526a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2526a.containsKey(obj);
    }

    @Override // L3.f
    public final int f() {
        return this.f2526a.f2517m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2526a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f2526a;
        fVar.getClass();
        return new d(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f2526a;
        fVar.c();
        int iH = fVar.h(obj);
        if (iH < 0) {
            return false;
        }
        fVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f2526a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f2526a.c();
        return super.retainAll(elements);
    }

    public i() {
        this(new f());
    }
}
