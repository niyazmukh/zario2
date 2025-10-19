package M3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M3\g.smali */
public final class g extends L3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2522a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2523b;

    public g(f backing, int i) {
        this.f2522a = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.i.e(backing, "backing");
                this.f2523b = backing;
                break;
            default:
                kotlin.jvm.internal.i.e(backing, "backing");
                this.f2523b = backing;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2522a) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.i.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f2522a) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                kotlin.jvm.internal.i.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2522a) {
            case 0:
                this.f2523b.clear();
                break;
            default:
                this.f2523b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2522a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.i.e(element, "element");
                return this.f2523b.f(element);
            default:
                return this.f2523b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f2522a) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                return this.f2523b.e(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // L3.f
    public final int f() {
        switch (this.f2522a) {
        }
        return this.f2523b.f2517m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f2522a) {
        }
        return this.f2523b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2522a) {
            case 0:
                f fVar = this.f2523b;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f2523b;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2522a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry element = (Map.Entry) obj;
                    kotlin.jvm.internal.i.e(element, "element");
                    f fVar = this.f2523b;
                    fVar.getClass();
                    fVar.c();
                    int iH = fVar.h(element.getKey());
                    if (iH >= 0) {
                        Object[] objArr = fVar.f2510b;
                        kotlin.jvm.internal.i.b(objArr);
                        if (kotlin.jvm.internal.i.a(objArr[iH], element.getValue())) {
                            fVar.l(iH);
                            break;
                        }
                    }
                }
                break;
            default:
                f fVar2 = this.f2523b;
                fVar2.c();
                int iH2 = fVar2.h(obj);
                if (iH2 >= 0) {
                    fVar2.l(iH2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f2522a) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f2523b.c();
                break;
            default:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f2523b.c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f2522a) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f2523b.c();
                break;
            default:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f2523b.c();
                break;
        }
        return super.retainAll(elements);
    }
}
