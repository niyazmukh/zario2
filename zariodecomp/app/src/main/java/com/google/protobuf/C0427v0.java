package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.v0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\v0.1.smali */
public final class C0427v0 extends AbstractMap {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f6590k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f6591a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6594d;

    /* renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.a0 f6595e;

    /* renamed from: b, reason: collision with root package name */
    public List f6592b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public Map f6593c = Collections.emptyMap();

    /* renamed from: f, reason: collision with root package name */
    public Map f6596f = Collections.emptyMap();

    public C0427v0(int i) {
        this.f6591a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f6592b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f6592b
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.z0 r2 = (com.google.protobuf.z0) r2
            java.lang.Comparable r2 = r2.f6609a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r4 = -r0
            return r4
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f6592b
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.z0 r3 = (com.google.protobuf.z0) r3
            java.lang.Comparable r3 = r3.f6609a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0427v0.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f6594d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.f6592b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f6592b.isEmpty()) {
            this.f6592b.clear();
        }
        if (this.f6593c.isEmpty()) {
            return;
        }
        this.f6593c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f6593c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f6593c.isEmpty() ? y0.f6603b : this.f6593c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f6593c.isEmpty() && !(this.f6593c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6593c = treeMap;
            this.f6596f = treeMap.descendingMap();
        }
        return (SortedMap) this.f6593c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6595e == null) {
            this.f6595e = new androidx.datastore.preferences.protobuf.a0(this, 1);
        }
        return this.f6595e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0427v0)) {
            return super.equals(obj);
        }
        C0427v0 c0427v0 = (C0427v0) obj;
        int size = size();
        if (size != c0427v0.size()) {
            return false;
        }
        int size2 = this.f6592b.size();
        if (size2 != c0427v0.f6592b.size()) {
            return ((AbstractSet) entrySet()).equals(c0427v0.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!c(i).equals(c0427v0.c(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f6593c.equals(c0427v0.f6593c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((z0) this.f6592b.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f6592b.isEmpty();
        int i = this.f6591a;
        if (zIsEmpty && !(this.f6592b instanceof ArrayList)) {
            this.f6592b = new ArrayList(i);
        }
        int i5 = -(iA + 1);
        if (i5 >= i) {
            return e().put(comparable, obj);
        }
        if (this.f6592b.size() == i) {
            z0 z0Var = (z0) this.f6592b.remove(i - 1);
            e().put(z0Var.f6609a, z0Var.f6610b);
        }
        this.f6592b.add(i5, new z0(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        b();
        Object obj = ((z0) this.f6592b.remove(i)).f6610b;
        if (!this.f6593c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f6592b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new z0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((z0) this.f6592b.get(iA)).f6610b : this.f6593c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f6592b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((z0) this.f6592b.get(i)).hashCode();
        }
        return this.f6593c.size() > 0 ? iHashCode + this.f6593c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.f6593c.isEmpty()) {
            return null;
        }
        return this.f6593c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6593c.size() + this.f6592b.size();
    }
}
