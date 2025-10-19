package n;

import java.util.Iterator;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\n.1\d.smali */
public final class C0759d extends AbstractC0760e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0758c f8956a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8957b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0761f f8958c;

    public C0759d(C0761f c0761f) {
        this.f8958c = c0761f;
    }

    @Override // n.AbstractC0760e
    public final void a(C0758c c0758c) {
        C0758c c0758c2 = this.f8956a;
        if (c0758c == c0758c2) {
            C0758c c0758c3 = c0758c2.f8955d;
            this.f8956a = c0758c3;
            this.f8957b = c0758c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8957b) {
            return this.f8958c.f8959a != null;
        }
        C0758c c0758c = this.f8956a;
        return (c0758c == null || c0758c.f8954c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8957b) {
            this.f8957b = false;
            this.f8956a = this.f8958c.f8959a;
        } else {
            C0758c c0758c = this.f8956a;
            this.f8956a = c0758c != null ? c0758c.f8954c : null;
        }
        return this.f8956a;
    }
}
