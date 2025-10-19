package androidx.lifecycle;

import u0.C0957E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\E.smali */
public final class E implements H {

    /* renamed from: a, reason: collision with root package name */
    public final C0957E f4585a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.g f4586b;

    /* renamed from: c, reason: collision with root package name */
    public int f4587c = -1;

    public E(C0957E c0957e, T0.g gVar) {
        this.f4585a = c0957e;
        this.f4586b = gVar;
    }

    @Override // androidx.lifecycle.H
    public final void a(Object obj) {
        int i = this.f4587c;
        int i5 = this.f4585a.f4583g;
        if (i != i5) {
            this.f4587c = i5;
            this.f4586b.a(obj);
        }
    }
}
