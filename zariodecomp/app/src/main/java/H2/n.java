package h2;

import N2.AbstractC0156x;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\n.smali */
public final class n implements Map, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final n f7689k = new n(null, new Object[0], 0);

    /* renamed from: a, reason: collision with root package name */
    public transient k f7690a;

    /* renamed from: b, reason: collision with root package name */
    public transient l f7691b;

    /* renamed from: c, reason: collision with root package name */
    public transient m f7692c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f7693d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f7694e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f7695f;

    public n(Object obj, Object[] objArr, int i) {
        this.f7693d = obj;
        this.f7694e = objArr;
        this.f7695f = i;
    }

    public static n a(HashMap map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        C.d dVar = new C.d(setEntrySet != null ? setEntrySet.size() : 4, 5);
        if (setEntrySet != null) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) dVar.f1047c;
            if (size > objArr.length) {
                dVar.f1047c = Arrays.copyOf(objArr, C0593b.e(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            dVar.g(entry.getKey(), entry.getValue());
        }
        return dVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h2.n b(int r16, java.lang.Object[] r17, C.d r18) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.n.b(int, java.lang.Object[], C.d):h2.n");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        m mVar = this.f7692c;
        if (mVar == null) {
            mVar = new m(this.f7694e, 1, this.f7695f);
            this.f7692c = mVar;
        }
        return mVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        k kVar = this.f7690a;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, this.f7694e, this.f7695f);
        this.f7690a = kVar2;
        return kVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((g) entrySet()).equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0037->B:22:0x004d], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0062->B:32:0x0079], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0088->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L6
        L3:
            r7 = r0
            goto L9c
        L6:
            r1 = 1
            java.lang.Object[] r2 = r7.f7694e
            int r3 = r7.f7695f
            if (r3 != r1) goto L20
            r7 = 0
            r7 = r2[r7]
            java.util.Objects.requireNonNull(r7)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L3
            r7 = r2[r1]
            java.util.Objects.requireNonNull(r7)
            goto L9c
        L20:
            java.lang.Object r7 = r7.f7693d
            if (r7 != 0) goto L25
            goto L3
        L25:
            boolean r3 = r7 instanceof byte[]
            if (r3 == 0) goto L50
            r3 = r7
            byte[] r3 = (byte[]) r3
            int r7 = r3.length
            int r4 = r7 + (-1)
            int r7 = r8.hashCode()
            int r7 = S0.f.Z(r7)
        L37:
            r7 = r7 & r4
            r5 = r3[r7]
            r6 = 255(0xff, float:3.57E-43)
            r5 = r5 & r6
            if (r5 != r6) goto L40
            goto L3
        L40:
            r6 = r2[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L4d
            r7 = r5 ^ 1
            r7 = r2[r7]
            goto L9c
        L4d:
            int r7 = r7 + 1
            goto L37
        L50:
            boolean r3 = r7 instanceof short[]
            if (r3 == 0) goto L7c
            r3 = r7
            short[] r3 = (short[]) r3
            int r7 = r3.length
            int r4 = r7 + (-1)
            int r7 = r8.hashCode()
            int r7 = S0.f.Z(r7)
        L62:
            r7 = r7 & r4
            short r5 = r3[r7]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            if (r5 != r6) goto L6c
            goto L3
        L6c:
            r6 = r2[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L79
            r7 = r5 ^ 1
            r7 = r2[r7]
            goto L9c
        L79:
            int r7 = r7 + 1
            goto L62
        L7c:
            int[] r7 = (int[]) r7
            int r3 = r7.length
            int r3 = r3 - r1
            int r4 = r8.hashCode()
            int r4 = S0.f.Z(r4)
        L88:
            r4 = r4 & r3
            r5 = r7[r4]
            r6 = -1
            if (r5 != r6) goto L90
            goto L3
        L90:
            r6 = r2[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto La0
            r7 = r5 ^ 1
            r7 = r2[r7]
        L9c:
            if (r7 != 0) goto L9f
            return r0
        L9f:
            return r7
        La0:
            int r4 = r4 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.n.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        k kVar = this.f7690a;
        if (kVar == null) {
            kVar = new k(this, this.f7694e, this.f7695f);
            this.f7690a = kVar;
        }
        Iterator it = kVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        l lVar = this.f7691b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, new m(this.f7694e, 0, this.f7695f));
        this.f7691b = lVar2;
        return lVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7695f;
    }

    public final String toString() {
        int i = this.f7695f;
        AbstractC0156x.h(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((k) entrySet()).iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z4) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z4 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        m mVar = this.f7692c;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this.f7694e, 1, this.f7695f);
        this.f7692c = mVar2;
        return mVar2;
    }
}
