package o0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q.C0835l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\y.smali */
public final class y implements Iterator, Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public int f9149a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f9151c;

    public y(z zVar) {
        this.f9151c = zVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9149a + 1 < this.f9151c.f9153o.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9150b = true;
        C0835l c0835l = this.f9151c.f9153o;
        int i = this.f9149a + 1;
        this.f9149a = i;
        Object objG = c0835l.g(i);
        kotlin.jvm.internal.i.d(objG, "nodes.valueAt(++index)");
        return (x) objG;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9150b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        C0835l c0835l = this.f9151c.f9153o;
        ((x) c0835l.g(this.f9149a)).f9141b = null;
        int i = this.f9149a;
        Object[] objArr = c0835l.f9432c;
        Object obj = objArr[i];
        Object obj2 = C0835l.f9429e;
        if (obj != obj2) {
            objArr[i] = obj2;
            c0835l.f9430a = true;
        }
        this.f9149a = i - 1;
        this.f9150b = false;
    }
}
