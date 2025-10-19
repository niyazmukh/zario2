package com.google.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\C.smali */
public abstract class C implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final E f6409a;

    /* renamed from: b, reason: collision with root package name */
    public E f6410b;

    public C(E e5) {
        this.f6409a = e5;
        if (e5.n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f6410b = e5.q();
    }

    public static void e(Object obj, Object obj2) {
        C0414n0 c0414n0 = C0414n0.f6548c;
        c0414n0.getClass();
        c0414n0.a(obj.getClass()).b(obj, obj2);
    }

    public final E b() {
        E eC = c();
        eC.getClass();
        if (E.m(eC, true)) {
            return eC;
        }
        throw new C0();
    }

    public final E c() {
        if (!this.f6410b.n()) {
            return this.f6410b;
        }
        E e5 = this.f6410b;
        e5.getClass();
        C0414n0 c0414n0 = C0414n0.f6548c;
        c0414n0.getClass();
        c0414n0.a(e5.getClass()).d(e5);
        e5.o();
        return this.f6410b;
    }

    public final Object clone() {
        C c5 = (C) this.f6409a.j(5);
        c5.f6410b = c();
        return c5;
    }

    public final void d() {
        if (this.f6410b.n()) {
            return;
        }
        E eQ = this.f6409a.q();
        e(eQ, this.f6410b);
        this.f6410b = eQ;
    }
}
