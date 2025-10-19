package q;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\b.smali */
public final class b extends C0834k implements Map {

    /* renamed from: l, reason: collision with root package name */
    public C0825a f9391l;

    public b(int i) {
        if (i == 0) {
            this.f9426a = AbstractC0827d.f9402a;
            this.f9427b = AbstractC0827d.f9404c;
        } else {
            a(i);
        }
        this.f9428c = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f9391l == null) {
            this.f9391l = new C0825a(this, 0);
        }
        C0825a c0825a = this.f9391l;
        if (((C0831h) c0825a.f2998a) == null) {
            c0825a.f2998a = new C0831h(c0825a, 0);
        }
        return (C0831h) c0825a.f2998a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f9391l == null) {
            this.f9391l = new C0825a(this, 0);
        }
        C0825a c0825a = this.f9391l;
        if (((C0831h) c0825a.f2999b) == null) {
            c0825a.f2999b = new C0831h(c0825a, 1);
        }
        return (C0831h) c0825a.f2999b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f9428c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f9391l == null) {
            this.f9391l = new C0825a(this, 0);
        }
        C0825a c0825a = this.f9391l;
        if (((C0833j) c0825a.f3000c) == null) {
            c0825a.f3000c = new C0833j(c0825a);
        }
        return (C0833j) c0825a.f3000c;
    }

    public b(C0834k c0834k) {
        int i = c0834k.f9428c;
        b(i);
        if (this.f9428c != 0) {
            for (int i5 = 0; i5 < i; i5++) {
                put(c0834k.h(i5), c0834k.j(i5));
            }
        } else if (i > 0) {
            System.arraycopy(c0834k.f9426a, 0, this.f9426a, 0, i);
            System.arraycopy(c0834k.f9427b, 0, this.f9427b, 0, i << 1);
            this.f9428c = i;
        }
    }
}
