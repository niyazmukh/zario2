package h2;

import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\h.smali */
public final class h extends q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7676b;

    public h(Object obj) {
        this.f7676b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f7675a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7675a) {
            throw new NoSuchElementException();
        }
        this.f7675a = true;
        return this.f7676b;
    }
}
