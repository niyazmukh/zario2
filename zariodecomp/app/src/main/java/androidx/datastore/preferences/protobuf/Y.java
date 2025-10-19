package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\Y.smali */
public final class Y implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f4467a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f4469c;

    public Y(X x3, Comparable comparable, Object obj) {
        this.f4469c = x3;
        this.f4467a = comparable;
        this.f4468b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4467a.compareTo(((Y) obj).f4467a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f4467a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f4468b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4467a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4468b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f4467a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4468b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f4469c.b();
        Object obj2 = this.f4468b;
        this.f4468b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f4467a + "=" + this.f4468b;
    }
}
