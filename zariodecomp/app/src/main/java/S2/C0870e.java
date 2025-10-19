package s2;

import A2.C0003c;
import S0.i;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: s2.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s2.1\e.smali */
public final class C0870e implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0869c f9681a;

    public C0870e(List list, Comparator comparator) {
        AbstractC0869c abstractC0869cJ;
        Map mapEmptyMap = Collections.emptyMap();
        if (list.size() < 25) {
            Collections.sort(list, comparator);
            int size = list.size();
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            int i = 0;
            for (Object obj : list) {
                objArr[i] = obj;
                objArr2[i] = mapEmptyMap.get(obj);
                i++;
            }
            abstractC0869cJ = new C0868b(comparator, objArr, objArr2);
        } else {
            abstractC0869cJ = i.j(list, mapEmptyMap, comparator);
        }
        this.f9681a = abstractC0869cJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0870e) {
            return this.f9681a.equals(((C0870e) obj).f9681a);
        }
        return false;
    }

    public final C0870e f(Object obj) {
        return new C0870e(this.f9681a.k(obj, null));
    }

    public final d g(C0003c c0003c) {
        return new d(this.f9681a.l(c0003c));
    }

    public final C0870e h(Object obj) {
        AbstractC0869c abstractC0869c = this.f9681a;
        AbstractC0869c abstractC0869cM = abstractC0869c.m(obj);
        return abstractC0869cM == abstractC0869c ? this : new C0870e(abstractC0869cM);
    }

    public final int hashCode() {
        return this.f9681a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f9681a.iterator());
    }

    public C0870e(AbstractC0869c abstractC0869c) {
        this.f9681a = abstractC0869c;
    }
}
