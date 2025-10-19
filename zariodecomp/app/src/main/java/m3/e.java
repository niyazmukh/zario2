package M3;

import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M3\e.smali */
public final class e implements Map.Entry, Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f2506a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2507b;

    public e(f map, int i) {
        kotlin.jvm.internal.i.e(map, "map");
        this.f2506a = map;
        this.f2507b = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (kotlin.jvm.internal.i.a(entry.getKey(), getKey()) && kotlin.jvm.internal.i.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2506a.f2509a[this.f2507b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f2506a.f2510b;
        kotlin.jvm.internal.i.b(objArr);
        return objArr[this.f2507b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        f fVar = this.f2506a;
        fVar.c();
        Object[] objArr = fVar.f2510b;
        if (objArr == null) {
            int length = fVar.f2509a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f2510b = objArr;
        }
        int i = this.f2507b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
