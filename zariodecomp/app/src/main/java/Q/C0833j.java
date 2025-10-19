package q;

import S1.o;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: q.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\j.smali */
public final class C0833j implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f9421a;

    public C0833j(o oVar) {
        this.f9421a = oVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f9421a.c();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9421a.h(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f9421a.f() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0830g(this.f9421a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        o oVar = this.f9421a;
        int iH = oVar.h(obj);
        if (iH < 0) {
            return false;
        }
        oVar.j(iH);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        o oVar = this.f9421a;
        int iF = oVar.f();
        int i = 0;
        boolean z4 = false;
        while (i < iF) {
            if (collection.contains(oVar.d(i, 1))) {
                oVar.j(i);
                i--;
                iF--;
                z4 = true;
            }
            i++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        o oVar = this.f9421a;
        int iF = oVar.f();
        int i = 0;
        boolean z4 = false;
        while (i < iF) {
            if (!collection.contains(oVar.d(i, 1))) {
                oVar.j(i);
                i--;
                iF--;
                z4 = true;
            }
            i++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f9421a.f();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        o oVar = this.f9421a;
        int iF = oVar.f();
        Object[] objArr = new Object[iF];
        for (int i = 0; i < iF; i++) {
            objArr[i] = oVar.d(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f9421a.t(1, objArr);
    }
}
