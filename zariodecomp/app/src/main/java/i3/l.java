package I3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\l.smali */
public final class l implements Map {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1956a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1957b;

    public l(h2.n nVar) {
        this.f1956a = 1;
        this.f1957b = nVar;
    }

    public double a() {
        HashMap map = (HashMap) this.f1957b;
        if (map.isEmpty()) {
            return 0.0d;
        }
        Iterator it = map.values().iterator();
        int i = 0;
        int i5 = 0;
        while (it.hasNext()) {
            i5++;
            if (((k) it.next()).d()) {
                i++;
            }
        }
        return (i / i5) * 100.0d;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f1956a) {
            case 0:
                ((HashMap) this.f1957b).clear();
                return;
            default:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).containsKey(obj);
            default:
                if (!(obj instanceof Class)) {
                    throw new IllegalArgumentException("Key must be a class");
                }
                return ((h2.n) this.f1957b).containsKey(((Class) obj).getName());
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).containsValue(obj);
            default:
                return ((h2.n) this.f1957b).containsValue(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).entrySet();
            default:
                throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        switch (this.f1956a) {
            case 0:
                return obj == this || ((HashMap) this.f1957b).equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).get(obj);
            default:
                if (!(obj instanceof Class)) {
                    throw new IllegalArgumentException("Key must be a class");
                }
                return ((h2.n) this.f1957b).get(((Class) obj).getName());
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).isEmpty();
            default:
                return ((h2.n) this.f1957b).isEmpty();
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).keySet();
            default:
                throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).put(obj, obj2);
            default:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f1956a) {
            case 0:
                ((HashMap) this.f1957b).putAll(map);
                return;
            default:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).remove(obj);
            default:
                throw new UnsupportedOperationException("Dagger map bindings are immutable");
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).size();
            default:
                return ((h2.n) this.f1957b).f7695f;
        }
    }

    public String toString() {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).toString();
            default:
                return super.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f1956a) {
            case 0:
                return ((HashMap) this.f1957b).values();
            default:
                h2.n nVar = (h2.n) this.f1957b;
                h2.m mVar = nVar.f7692c;
                if (mVar != null) {
                    return mVar;
                }
                h2.m mVar2 = new h2.m(nVar.f7694e, 1, nVar.f7695f);
                nVar.f7692c = mVar2;
                return mVar2;
        }
    }

    public l() {
        this.f1956a = 0;
        this.f1957b = new HashMap();
    }
}
