package a0;

import L3.j;
import L3.l;
import L3.x;
import g1.i;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a0.1\b.smali */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4017a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4018b;

    public b(Map preferencesMap, boolean z4) {
        kotlin.jvm.internal.i.e(preferencesMap, "preferencesMap");
        this.f4017a = preferencesMap;
        this.f4018b = new i(z4);
    }

    public final Map a() {
        K3.e eVar;
        Set<Map.Entry> setEntrySet = this.f4017a.entrySet();
        int iA0 = x.a0(l.a0(setEntrySet));
        if (iA0 < 16) {
            iA0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA0);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.i.d(bArrCopyOf, "copyOf(this, size)");
                eVar = new K3.e(key, bArrCopyOf);
            } else {
                eVar = new K3.e(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(eVar.f2277a, eVar.f2278b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.i.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f4018b.f7594b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d key) {
        kotlin.jvm.internal.i.e(key, "key");
        Object obj = this.f4017a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.i.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void d(d key) {
        kotlin.jvm.internal.i.e(key, "key");
        b();
        this.f4017a.remove(key);
    }

    public final void e(d key, Object obj) {
        kotlin.jvm.internal.i.e(key, "key");
        f(key, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a0.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            a0.b r6 = (a0.b) r6
            java.util.Map r0 = r6.f4017a
            java.util.Map r5 = r5.f4017a
            r2 = 1
            if (r0 != r5) goto L10
            return r2
        L10:
            int r0 = r0.size()
            int r3 = r5.size()
            if (r0 == r3) goto L1b
            return r1
        L1b:
            java.util.Map r6 = r6.f4017a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L25
        L23:
            r1 = r2
            goto L63
        L25:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r3 = r5.get(r3)
            if (r3 == 0) goto L60
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L5b
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L60
            byte[] r0 = (byte[]) r0
            byte[] r3 = (byte[]) r3
            boolean r0 = java.util.Arrays.equals(r0, r3)
            if (r0 == 0) goto L60
            r0 = r2
            goto L61
        L5b:
            boolean r0 = kotlin.jvm.internal.i.a(r0, r3)
            goto L61
        L60:
            r0 = r1
        L61:
            if (r0 != 0) goto L2d
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.b.equals(java.lang.Object):boolean");
    }

    public final void f(d key, Object obj) {
        kotlin.jvm.internal.i.e(key, "key");
        b();
        if (obj == null) {
            d(key);
            return;
        }
        boolean z4 = obj instanceof Set;
        Map map = this.f4017a;
        if (z4) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(j.z0((Set) obj));
            kotlin.jvm.internal.i.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(key, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            kotlin.jvm.internal.i.d(bArrCopyOf, "copyOf(this, size)");
            map.put(key, bArrCopyOf);
        }
    }

    public final int hashCode() {
        Iterator it = this.f4017a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return j.h0(this.f4017a.entrySet(), ",\n", "{\n", "\n}", C0184a.f4016a, 24);
    }

    public /* synthetic */ b(boolean z4) {
        this(new LinkedHashMap(), z4);
    }
}
