package androidx.datastore.preferences.protobuf;

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

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\X.smali */
public final class X extends AbstractMap {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4461f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f4462a;

    /* renamed from: b, reason: collision with root package name */
    public Map f4463b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4464c;

    /* renamed from: d, reason: collision with root package name */
    public volatile a0 f4465d;

    /* renamed from: e, reason: collision with root package name */
    public Map f4466e;

    public static X f() {
        X x3 = new X();
        x3.f4462a = Collections.emptyList();
        x3.f4463b = Collections.emptyMap();
        x3.f4466e = Collections.emptyMap();
        return x3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f4462a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f4462a
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.Y r2 = (androidx.datastore.preferences.protobuf.Y) r2
            java.lang.Comparable r2 = r2.f4467a
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
            java.util.List r3 = r4.f4462a
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.Y r3 = (androidx.datastore.preferences.protobuf.Y) r3
            java.lang.Comparable r3 = r3.f4467a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.X.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f4464c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.f4462a.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f4462a.isEmpty()) {
            this.f4462a.clear();
        }
        if (this.f4463b.isEmpty()) {
            return;
        }
        this.f4463b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f4463b.containsKey(comparable);
    }

    public final Set d() {
        return this.f4463b.isEmpty() ? Collections.emptySet() : this.f4463b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f4463b.isEmpty() && !(this.f4463b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4463b = treeMap;
            this.f4466e = treeMap.descendingMap();
        }
        return (SortedMap) this.f4463b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4465d == null) {
            this.f4465d = new a0(this, 0);
        }
        return this.f4465d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return super.equals(obj);
        }
        X x3 = (X) obj;
        int size = size();
        if (size != x3.size()) {
            return false;
        }
        int size2 = this.f4462a.size();
        if (size2 != x3.f4462a.size()) {
            return ((AbstractSet) entrySet()).equals(x3.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!c(i).equals(x3.c(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f4463b.equals(x3.f4463b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Y) this.f4462a.get(iA)).setValue(obj);
        }
        b();
        if (this.f4462a.isEmpty() && !(this.f4462a instanceof ArrayList)) {
            this.f4462a = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f4462a.size() == 16) {
            Y y4 = (Y) this.f4462a.remove(15);
            e().put(y4.f4467a, y4.f4468b);
        }
        this.f4462a.add(i, new Y(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Y) this.f4462a.get(iA)).f4468b : this.f4463b.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((Y) this.f4462a.remove(i)).f4468b;
        if (!this.f4463b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f4462a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Y(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f4462a.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((Y) this.f4462a.get(i)).hashCode();
        }
        return this.f4463b.size() > 0 ? iHashCode + this.f4463b.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f4463b.isEmpty()) {
            return null;
        }
        return this.f4463b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4463b.size() + this.f4462a.size();
    }
}
