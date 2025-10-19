package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\n.1\f.smali */
public class C0761f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C0758c f8959a;

    /* renamed from: b, reason: collision with root package name */
    public C0758c f8960b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f8961c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f8962d = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((n.C0757b) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof n.C0761f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n.f r6 = (n.C0761f) r6
            int r1 = r5.f8962d
            int r3 = r6.f8962d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            n.b r1 = (n.C0757b) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            n.b r3 = (n.C0757b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            n.b r6 = (n.C0757b) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0761f.equals(java.lang.Object):boolean");
    }

    public C0758c f(Object obj) {
        C0758c c0758c = this.f8959a;
        while (c0758c != null && !c0758c.f8952a.equals(obj)) {
            c0758c = c0758c.f8954c;
        }
        return c0758c;
    }

    public Object g(Object obj, Object obj2) {
        C0758c c0758cF = f(obj);
        if (c0758cF != null) {
            return c0758cF.f8953b;
        }
        C0758c c0758c = new C0758c(obj, obj2);
        this.f8962d++;
        C0758c c0758c2 = this.f8960b;
        if (c0758c2 == null) {
            this.f8959a = c0758c;
            this.f8960b = c0758c;
            return null;
        }
        c0758c2.f8954c = c0758c;
        c0758c.f8955d = c0758c2;
        this.f8960b = c0758c;
        return null;
    }

    public Object h(Object obj) {
        C0758c c0758cF = f(obj);
        if (c0758cF == null) {
            return null;
        }
        this.f8962d--;
        WeakHashMap weakHashMap = this.f8961c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0760e) it.next()).a(c0758cF);
            }
        }
        C0758c c0758c = c0758cF.f8955d;
        if (c0758c != null) {
            c0758c.f8954c = c0758cF.f8954c;
        } else {
            this.f8959a = c0758cF.f8954c;
        }
        C0758c c0758c2 = c0758cF.f8954c;
        if (c0758c2 != null) {
            c0758c2.f8955d = c0758c;
        } else {
            this.f8960b = c0758c;
        }
        c0758cF.f8954c = null;
        c0758cF.f8955d = null;
        return c0758cF.f8953b;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C0757b c0757b = (C0757b) it;
            if (!c0757b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c0757b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0757b c0757b = new C0757b(this.f8959a, this.f8960b, 0);
        this.f8961c.put(c0757b, Boolean.FALSE);
        return c0757b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0757b c0757b = (C0757b) it;
            if (!c0757b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0757b.next()).toString());
            if (c0757b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
