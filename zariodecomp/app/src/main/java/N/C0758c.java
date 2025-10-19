package n;

import java.util.Map;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\n.1\c.smali */
public final class C0758c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8952a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8953b;

    /* renamed from: c, reason: collision with root package name */
    public C0758c f8954c;

    /* renamed from: d, reason: collision with root package name */
    public C0758c f8955d;

    public C0758c(Object obj, Object obj2) {
        this.f8952a = obj;
        this.f8953b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0758c)) {
            return false;
        }
        C0758c c0758c = (C0758c) obj;
        return this.f8952a.equals(c0758c.f8952a) && this.f8953b.equals(c0758c.f8953b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8952a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8953b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f8953b.hashCode() ^ this.f8952a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f8952a + "=" + this.f8953b;
    }
}
