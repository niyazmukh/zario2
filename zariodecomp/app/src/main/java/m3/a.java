package M3;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M3\a.smali */
public final class a implements ListIterator, Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2491a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2492b;

    /* renamed from: c, reason: collision with root package name */
    public int f2493c;

    /* renamed from: d, reason: collision with root package name */
    public int f2494d;

    /* renamed from: e, reason: collision with root package name */
    public final L3.e f2495e;

    public a(c list, int i) {
        kotlin.jvm.internal.i.e(list, "list");
        this.f2495e = list;
        this.f2492b = i;
        this.f2493c = -1;
        this.f2494d = ((AbstractList) list).modCount;
    }

    public void a() {
        if (((AbstractList) ((b) this.f2495e).f2500e).modCount != this.f2494d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f2491a) {
            case 0:
                a();
                int i = this.f2492b;
                this.f2492b = i + 1;
                b bVar = (b) this.f2495e;
                bVar.add(i, obj);
                this.f2493c = -1;
                this.f2494d = ((AbstractList) bVar).modCount;
                break;
            default:
                b();
                int i5 = this.f2492b;
                this.f2492b = i5 + 1;
                c cVar = (c) this.f2495e;
                cVar.add(i5, obj);
                this.f2493c = -1;
                this.f2494d = ((AbstractList) cVar).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((c) this.f2495e)).modCount != this.f2494d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2491a) {
            case 0:
                if (this.f2492b < ((b) this.f2495e).f2498c) {
                }
                break;
            default:
                if (this.f2492b < ((c) this.f2495e).f2503b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f2491a) {
            case 0:
                if (this.f2492b > 0) {
                }
                break;
            default:
                if (this.f2492b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f2491a) {
            case 0:
                a();
                int i = this.f2492b;
                b bVar = (b) this.f2495e;
                if (i >= bVar.f2498c) {
                    throw new NoSuchElementException();
                }
                this.f2492b = i + 1;
                this.f2493c = i;
                return bVar.f2496a[bVar.f2497b + i];
            default:
                b();
                int i5 = this.f2492b;
                c cVar = (c) this.f2495e;
                if (i5 >= cVar.f2503b) {
                    throw new NoSuchElementException();
                }
                this.f2492b = i5 + 1;
                this.f2493c = i5;
                return cVar.f2502a[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f2491a) {
        }
        return this.f2492b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f2491a) {
            case 0:
                a();
                int i = this.f2492b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i - 1;
                this.f2492b = i5;
                this.f2493c = i5;
                b bVar = (b) this.f2495e;
                return bVar.f2496a[bVar.f2497b + i5];
            default:
                b();
                int i6 = this.f2492b;
                if (i6 <= 0) {
                    throw new NoSuchElementException();
                }
                int i7 = i6 - 1;
                this.f2492b = i7;
                this.f2493c = i7;
                return ((c) this.f2495e).f2502a[i7];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f2491a) {
        }
        return this.f2492b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f2491a) {
            case 0:
                a();
                int i = this.f2493c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                b bVar = (b) this.f2495e;
                bVar.g(i);
                this.f2492b = this.f2493c;
                this.f2493c = -1;
                this.f2494d = ((AbstractList) bVar).modCount;
                return;
            default:
                b();
                int i5 = this.f2493c;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f2495e;
                cVar.g(i5);
                this.f2492b = this.f2493c;
                this.f2493c = -1;
                this.f2494d = ((AbstractList) cVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f2491a) {
            case 0:
                a();
                int i = this.f2493c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f2495e).set(i, obj);
                return;
            default:
                b();
                int i5 = this.f2493c;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f2495e).set(i5, obj);
                return;
        }
    }

    public a(b list, int i) {
        kotlin.jvm.internal.i.e(list, "list");
        this.f2495e = list;
        this.f2492b = i;
        this.f2493c = -1;
        this.f2494d = ((AbstractList) list).modCount;
    }
}
