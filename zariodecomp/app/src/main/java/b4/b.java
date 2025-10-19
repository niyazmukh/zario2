package b4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b4\b.smali */
public final class b implements Iterator, Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5341a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5342b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5343c;

    /* renamed from: d, reason: collision with root package name */
    public int f5344d;

    public b(char c5, char c6, int i) {
        this.f5341a = i;
        this.f5342b = c6;
        boolean z4 = false;
        if (i <= 0 ? i.f(c5, c6) >= 0 : i.f(c5, c6) <= 0) {
            z4 = true;
        }
        this.f5343c = z4;
        this.f5344d = z4 ? c5 : c6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5343c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f5344d;
        if (i != this.f5342b) {
            this.f5344d = this.f5341a + i;
        } else {
            if (!this.f5343c) {
                throw new NoSuchElementException();
            }
            this.f5343c = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
