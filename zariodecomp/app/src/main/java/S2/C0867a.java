package s2;

import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s2.1\a.smali */
public final class C0867a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9673a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f9675c;

    public C0867a(C0868b c0868b, int i) {
        this.f9675c = c0868b;
        this.f9674b = i;
    }

    private final void a() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9673a) {
            case 0:
                if (this.f9674b < ((C0868b) this.f9675c).f9676a.length) {
                }
                break;
            default:
                if (this.f9674b >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9673a) {
            case 0:
                C0868b c0868b = (C0868b) this.f9675c;
                Object[] objArr = c0868b.f9676a;
                int i = this.f9674b;
                Object obj = objArr[i];
                Object obj2 = c0868b.f9677b[i];
                this.f9674b = i + 1;
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            default:
                long j5 = ((C0875k) this.f9675c).f9688a;
                int i5 = this.f9674b;
                C0872g c0872g = new C0872g();
                Math.pow(2.0d, i5);
                this.f9674b--;
                return c0872g;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9673a) {
            case 0:
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            default:
                return;
        }
    }

    public C0867a(C0875k c0875k) {
        this.f9675c = c0875k;
        this.f9674b = c0875k.f9689b - 1;
    }
}
