package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\c.1.smali */
public final class C0225c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4635a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4636b;

    public C0225c(int i, Method method) throws SecurityException {
        this.f4635a = i;
        this.f4636b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0225c)) {
            return false;
        }
        C0225c c0225c = (C0225c) obj;
        return this.f4635a == c0225c.f4635a && this.f4636b.getName().equals(c0225c.f4636b.getName());
    }

    public final int hashCode() {
        return this.f4636b.getName().hashCode() + (this.f4635a * 31);
    }
}
