package h2;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\j.smali */
public final class j extends e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f7680c;

    public j(k kVar) {
        this.f7680c = kVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k kVar = this.f7680c;
        S0.f.k(i, kVar.f7683f);
        int i5 = i * 2;
        Object[] objArr = kVar.f7682e;
        Object obj = objArr[i5];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // h2.AbstractC0592a
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7680c.f7683f;
    }
}
