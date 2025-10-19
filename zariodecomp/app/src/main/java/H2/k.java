package h2;

import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\k.smali */
public final class k extends g {

    /* renamed from: d, reason: collision with root package name */
    public final transient n f7681d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f7682e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f7683f;

    public k(n nVar, Object[] objArr, int i) {
        this.f7681d = nVar;
        this.f7682e = objArr;
        this.f7683f = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f7681d.get(key));
    }

    @Override // h2.AbstractC0592a
    public final int g(int i, Object[] objArr) {
        return f().g(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // h2.AbstractC0592a
    public final boolean k() {
        return true;
    }

    @Override // h2.g
    public final e n() {
        return new j(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7683f;
    }
}
