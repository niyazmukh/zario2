package L3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: L3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\b.1.smali */
public final class C0113b extends C0112a implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0115d f2338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0113b(AbstractC0115d abstractC0115d, int i) {
        super(abstractC0115d, 0);
        this.f2338d = abstractC0115d;
        int iF = abstractC0115d.f();
        if (i < 0 || i > iF) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, iF, ", size: "));
        }
        this.f2336b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2336b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2336b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f2336b - 1;
        this.f2336b = i;
        return this.f2338d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2336b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
