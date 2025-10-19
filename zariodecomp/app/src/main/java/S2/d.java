package s2;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s2.1\d.smali */
public final class d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9679a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9680b;

    public d(Iterator it) {
        this.f9679a = 1;
        this.f9680b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9679a) {
            case 0:
                return ((ArrayDeque) this.f9680b).size() > 0;
            default:
                return ((Iterator) this.f9680b).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9679a) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) this.f9680b;
                try {
                    AbstractC0874j abstractC0874j = (AbstractC0874j) arrayDeque.pop();
                    AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(abstractC0874j.f9684a, abstractC0874j.f9685b);
                    for (InterfaceC0873h interfaceC0873hB = abstractC0874j.f9687d; !interfaceC0873hB.isEmpty(); interfaceC0873hB = interfaceC0873hB.b()) {
                        arrayDeque.push((AbstractC0874j) interfaceC0873hB);
                    }
                    return simpleEntry;
                } catch (EmptyStackException unused) {
                    throw new NoSuchElementException();
                }
            default:
                return ((Map.Entry) ((Iterator) this.f9680b).next()).getKey();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9679a) {
            case 0:
                throw new UnsupportedOperationException("remove called on immutable collection");
            default:
                ((Iterator) this.f9680b).remove();
                return;
        }
    }

    public d(InterfaceC0873h interfaceC0873h, Object obj, Comparator comparator) {
        this.f9679a = 0;
        this.f9680b = new ArrayDeque();
        while (!interfaceC0873h.isEmpty()) {
            int iCompare = obj != null ? comparator.compare(interfaceC0873h.getKey(), obj) : 1;
            if (iCompare < 0) {
                interfaceC0873h = interfaceC0873h.a();
            } else if (iCompare == 0) {
                ((ArrayDeque) this.f9680b).push((AbstractC0874j) interfaceC0873h);
                return;
            } else {
                ((ArrayDeque) this.f9680b).push((AbstractC0874j) interfaceC0873h);
                interfaceC0873h = interfaceC0873h.b();
            }
        }
    }
}
