package y2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: y2.A, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\A.smali */
public final class C1048A {

    /* renamed from: a, reason: collision with root package name */
    public String f11050a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11051b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11052c;

    /* renamed from: d, reason: collision with root package name */
    public final B2.n f11053d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11054e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11055f;

    /* renamed from: g, reason: collision with root package name */
    public final C1054c f11056g;
    public final C1054c h;

    public C1048A(B2.n nVar, String str, List list, List list2, long j5, C1054c c1054c, C1054c c1054c2) {
        this.f11053d = nVar;
        this.f11054e = str;
        this.f11051b = list2;
        this.f11052c = list;
        this.f11055f = j5;
        this.f11056g = c1054c;
        this.h = c1054c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x000e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair a(B2.d r11, y2.C1054c r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C1048A.a(B2.d, y2.c):android.util.Pair");
    }

    public final String b() {
        String str = this.f11050a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11053d.c());
        String str2 = this.f11054e;
        if (str2 != null) {
            sb.append("|cg:");
            sb.append(str2);
        }
        sb.append("|f:");
        Iterator it = this.f11052c.iterator();
        while (it.hasNext()) {
            sb.append(((k) it.next()).a());
        }
        sb.append("|ob:");
        for (u uVar : this.f11051b) {
            sb.append(uVar.f11143b.c());
            sb.append(t.h.a(uVar.f11142a, 1) ? "asc" : "desc");
        }
        if (e()) {
            sb.append("|l:");
            sb.append(this.f11055f);
        }
        C1054c c1054c = this.f11056g;
        if (c1054c != null) {
            sb.append("|lb:");
            sb.append(c1054c.f11081a ? "b:" : "a:");
            sb.append(c1054c.a());
        }
        C1054c c1054c2 = this.h;
        if (c1054c2 != null) {
            sb.append("|ub:");
            sb.append(c1054c2.f11081a ? "a:" : "b:");
            sb.append(c1054c2.a());
        }
        String string = sb.toString();
        this.f11050a = string;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x000e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair c(B2.d r11, y2.C1054c r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C1048A.c(B2.d, y2.c):android.util.Pair");
    }

    public final ArrayList d(B2.k kVar) {
        ArrayList arrayList = new ArrayList();
        for (k kVar2 : this.f11052c) {
            if (kVar2 instanceof j) {
                j jVar = (j) kVar2;
                if (jVar.f11112c.equals(kVar)) {
                    arrayList.add(jVar);
                }
            }
        }
        return arrayList;
    }

    public final boolean e() {
        return this.f11055f != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1048A.class != obj.getClass()) {
            return false;
        }
        C1048A c1048a = (C1048A) obj;
        String str = c1048a.f11054e;
        String str2 = this.f11054e;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (this.f11055f != c1048a.f11055f || !this.f11051b.equals(c1048a.f11051b) || !this.f11052c.equals(c1048a.f11052c) || !this.f11053d.equals(c1048a.f11053d)) {
            return false;
        }
        C1054c c1054c = c1048a.f11056g;
        C1054c c1054c2 = this.f11056g;
        if (c1054c2 == null ? c1054c != null : !c1054c2.equals(c1054c)) {
            return false;
        }
        C1054c c1054c3 = c1048a.h;
        C1054c c1054c4 = this.h;
        return c1054c4 != null ? c1054c4.equals(c1054c3) : c1054c3 == null;
    }

    public final boolean f() {
        return B2.h.e(this.f11053d) && this.f11054e == null && this.f11052c.isEmpty();
    }

    public final int hashCode() {
        int iHashCode = this.f11051b.hashCode() * 31;
        String str = this.f11054e;
        int iHashCode2 = (this.f11053d.hashCode() + ((this.f11052c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j5 = this.f11055f;
        int i = (iHashCode2 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        C1054c c1054c = this.f11056g;
        int iHashCode3 = (i + (c1054c != null ? c1054c.hashCode() : 0)) * 31;
        C1054c c1054c2 = this.h;
        return iHashCode3 + (c1054c2 != null ? c1054c2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Query(");
        sb.append(this.f11053d.c());
        String str = this.f11054e;
        if (str != null) {
            sb.append(" collectionGroup=");
            sb.append(str);
        }
        List list = this.f11052c;
        if (!list.isEmpty()) {
            sb.append(" where ");
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(" and ");
                }
                sb.append(list.get(i));
            }
        }
        List list2 = this.f11051b;
        if (!list2.isEmpty()) {
            sb.append(" order by ");
            for (int i5 = 0; i5 < list2.size(); i5++) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(list2.get(i5));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
