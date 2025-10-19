package s2;

import java.util.Comparator;
import java.util.Iterator;

/* renamed from: s2.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s2.1\l.smali */
public final class C0876l extends AbstractC0869c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0873h f9690a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f9691b;

    public C0876l(InterfaceC0873h interfaceC0873h, Comparator comparator) {
        this.f9690a = interfaceC0873h;
        this.f9691b = comparator;
    }

    @Override // s2.AbstractC0869c
    public final boolean f(Object obj) {
        return n(obj) != null;
    }

    @Override // s2.AbstractC0869c
    public final Object g(B2.h hVar) {
        InterfaceC0873h interfaceC0873hN = n(hVar);
        if (interfaceC0873hN != null) {
            return interfaceC0873hN.getValue();
        }
        return null;
    }

    @Override // s2.AbstractC0869c
    public final Comparator h() {
        return this.f9691b;
    }

    @Override // s2.AbstractC0869c
    public final Object i() {
        return this.f9690a.h().getKey();
    }

    @Override // s2.AbstractC0869c
    public final boolean isEmpty() {
        return this.f9690a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f9690a, null, this.f9691b);
    }

    @Override // s2.AbstractC0869c
    public final Object j() {
        return this.f9690a.e().getKey();
    }

    @Override // s2.AbstractC0869c
    public final AbstractC0869c k(Object obj, Object obj2) {
        InterfaceC0873h interfaceC0873h = this.f9690a;
        Comparator comparator = this.f9691b;
        return new C0876l(((AbstractC0874j) interfaceC0873h.c(obj, obj2, comparator)).g(2, null, null), comparator);
    }

    @Override // s2.AbstractC0869c
    public final Iterator l(Object obj) {
        return new d(this.f9690a, obj, this.f9691b);
    }

    @Override // s2.AbstractC0869c
    public final AbstractC0869c m(Object obj) {
        if (!f(obj)) {
            return this;
        }
        InterfaceC0873h interfaceC0873h = this.f9690a;
        Comparator comparator = this.f9691b;
        return new C0876l(interfaceC0873h.d(obj, comparator).g(2, null, null), comparator);
    }

    public final InterfaceC0873h n(Object obj) {
        InterfaceC0873h interfaceC0873hB = this.f9690a;
        while (!interfaceC0873hB.isEmpty()) {
            int iCompare = this.f9691b.compare(obj, interfaceC0873hB.getKey());
            if (iCompare < 0) {
                interfaceC0873hB = interfaceC0873hB.b();
            } else {
                if (iCompare == 0) {
                    return interfaceC0873hB;
                }
                interfaceC0873hB = interfaceC0873hB.a();
            }
        }
        return null;
    }

    @Override // s2.AbstractC0869c
    public final int size() {
        return this.f9690a.size();
    }
}
