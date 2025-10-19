package d4;

import Y3.a;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d4\l.smali */
public final class l implements Iterator, a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f6817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f6818b;

    public l(k kVar) {
        this.f6818b = kVar;
        this.f6817a = ((e) kVar.f6815b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6817a.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X3.l, kotlin.jvm.internal.j] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.f6818b.f6816c.invoke(this.f6817a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
