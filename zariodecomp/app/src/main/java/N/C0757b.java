package n;

import java.util.Iterator;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\n.1\b.smali */
public final class C0757b extends AbstractC0760e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C0758c f8949a;

    /* renamed from: b, reason: collision with root package name */
    public C0758c f8950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8951c;

    public C0757b(C0758c c0758c, C0758c c0758c2, int i) {
        this.f8951c = i;
        this.f8949a = c0758c2;
        this.f8950b = c0758c;
    }

    @Override // n.AbstractC0760e
    public final void a(C0758c c0758c) {
        C0758c c0758c2;
        C0758c c0758cB = null;
        if (this.f8949a == c0758c && c0758c == this.f8950b) {
            this.f8950b = null;
            this.f8949a = null;
        }
        C0758c c0758c3 = this.f8949a;
        if (c0758c3 == c0758c) {
            switch (this.f8951c) {
                case 0:
                    c0758c2 = c0758c3.f8955d;
                    break;
                default:
                    c0758c2 = c0758c3.f8954c;
                    break;
            }
            this.f8949a = c0758c2;
        }
        C0758c c0758c4 = this.f8950b;
        if (c0758c4 == c0758c) {
            C0758c c0758c5 = this.f8949a;
            if (c0758c4 != c0758c5 && c0758c5 != null) {
                c0758cB = b(c0758c4);
            }
            this.f8950b = c0758cB;
        }
    }

    public final C0758c b(C0758c c0758c) {
        switch (this.f8951c) {
            case 0:
                return c0758c.f8954c;
            default:
                return c0758c.f8955d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8950b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0758c c0758c = this.f8950b;
        C0758c c0758c2 = this.f8949a;
        this.f8950b = (c0758c == c0758c2 || c0758c2 == null) ? null : b(c0758c);
        return c0758c;
    }
}
