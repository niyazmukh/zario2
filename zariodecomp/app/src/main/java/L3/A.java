package L3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\A.smali */
public final class A implements Iterator, Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2318a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2319b;

    /* renamed from: c, reason: collision with root package name */
    public int f2320c;

    /* renamed from: d, reason: collision with root package name */
    public int f2321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f2322e;

    public A(B b5) {
        this.f2322e = b5;
        this.f2320c = b5.f();
        this.f2321d = b5.f2325c;
    }

    public final boolean a() {
        this.f2318a = 3;
        int i = this.f2320c;
        if (i == 0) {
            this.f2318a = 2;
        } else {
            B b5 = this.f2322e;
            Object[] objArr = b5.f2323a;
            int i5 = this.f2321d;
            this.f2319b = objArr[i5];
            this.f2318a = 1;
            this.f2321d = (i5 + 1) % b5.f2324b;
            this.f2320c = i - 1;
        }
        return this.f2318a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f2318a;
        if (i == 0) {
            return a();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2318a;
        if (i == 1) {
            this.f2318a = 0;
            return this.f2319b;
        }
        if (i == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.f2318a = 0;
        return this.f2319b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
