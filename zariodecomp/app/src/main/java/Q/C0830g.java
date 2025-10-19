package q;

import S1.o;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: q.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\g.smali */
public final class C0830g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f9410a;

    /* renamed from: b, reason: collision with root package name */
    public int f9411b;

    /* renamed from: c, reason: collision with root package name */
    public int f9412c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9413d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f9414e;

    public C0830g(o oVar, int i) {
        this.f9414e = oVar;
        this.f9410a = i;
        this.f9411b = oVar.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9412c < this.f9411b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objD = this.f9414e.d(this.f9412c, this.f9410a);
        this.f9412c++;
        this.f9413d = true;
        return objD;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9413d) {
            throw new IllegalStateException();
        }
        int i = this.f9412c - 1;
        this.f9412c = i;
        this.f9411b--;
        this.f9413d = false;
        this.f9414e.j(i);
    }
}
