package L3;

import java.util.RandomAccess;

/* renamed from: L3.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\c.1.smali */
public final class C0114c extends AbstractC0115d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0115d f2339a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2340b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2341c;

    public C0114c(AbstractC0115d list, int i, int i5) {
        kotlin.jvm.internal.i.e(list, "list");
        this.f2339a = list;
        this.f2340b = i;
        S0.f.o(i, i5, list.f());
        this.f2341c = i5 - i;
    }

    @Override // L3.AbstractC0115d
    public final int f() {
        return this.f2341c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i5 = this.f2341c;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, i5, ", size: "));
        }
        return this.f2339a.get(this.f2340b + i);
    }
}
