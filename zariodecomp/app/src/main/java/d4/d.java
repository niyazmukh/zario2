package d4;

import Y3.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d4\d.smali */
public final class d implements Iterator, a {

    /* renamed from: a, reason: collision with root package name */
    public Object f6808a;

    /* renamed from: b, reason: collision with root package name */
    public int f6809b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f6810c;

    public d(k kVar) {
        this.f6810c = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X3.l, kotlin.jvm.internal.j] */
    public final void a() {
        Object objInvoke;
        int i = this.f6809b;
        k kVar = this.f6810c;
        if (i == -2) {
            objInvoke = ((i) kVar.f6815b).f6812b;
        } else {
            ?? r02 = kVar.f6816c;
            Object obj = this.f6808a;
            kotlin.jvm.internal.i.b(obj);
            objInvoke = r02.invoke(obj);
        }
        this.f6808a = objInvoke;
        this.f6809b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6809b < 0) {
            a();
        }
        return this.f6809b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6809b < 0) {
            a();
        }
        if (this.f6809b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f6808a;
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f6809b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
