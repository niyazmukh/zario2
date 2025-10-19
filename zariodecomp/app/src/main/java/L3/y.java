package L3;

import java.util.List;
import java.util.ListIterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\y.smali */
public final class y implements ListIterator, Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f2356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f2357b;

    public y(z zVar, int i) {
        this.f2357b = zVar;
        List list = zVar.f2358a;
        if (i >= 0 && i <= zVar.size()) {
            this.f2356a = list.listIterator(zVar.size() - i);
            return;
        }
        StringBuilder sbN = B.a.n("Position index ", i, " must be in range [");
        sbN.append(new b4.f(0, zVar.size(), 1));
        sbN.append("].");
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2356a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2356a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f2356a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return k.X(this.f2357b) - this.f2356a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f2356a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return k.X(this.f2357b) - this.f2356a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
