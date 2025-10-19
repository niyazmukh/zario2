package L3;

import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\w.smali */
public abstract class w implements Iterator, Y3.a {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
