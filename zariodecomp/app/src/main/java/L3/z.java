package L3;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\z.smali */
public final class z extends AbstractC0115d {

    /* renamed from: a, reason: collision with root package name */
    public final List f2358a;

    public z(List list) {
        this.f2358a = list;
    }

    @Override // L3.AbstractC0115d
    public final int f() {
        return this.f2358a.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= k.X(this)) {
            return this.f2358a.get(k.X(this) - i);
        }
        StringBuilder sbN = B.a.n("Element index ", i, " must be in range [");
        sbN.append(new b4.f(0, k.X(this), 1));
        sbN.append("].");
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    @Override // L3.AbstractC0115d, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new y(this, 0);
    }

    @Override // L3.AbstractC0115d, java.util.List
    public final ListIterator listIterator() {
        return new y(this, 0);
    }

    @Override // L3.AbstractC0115d, java.util.List
    public final ListIterator listIterator(int i) {
        return new y(this, i);
    }
}
