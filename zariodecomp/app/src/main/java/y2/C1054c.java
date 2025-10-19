package y2;

import N2.n0;
import java.util.List;

/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\c.1.smali */
public final class C1054c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11081a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11082b;

    public C1054c(List list, boolean z4) {
        this.f11082b = list;
        this.f11081a = z4;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final String a() {
        StringBuilder sb = new StringBuilder();
        boolean z4 = true;
        for (n0 n0Var : this.f11082b) {
            if (!z4) {
                sb.append(",");
            }
            n0 n0Var2 = B2.p.f335a;
            StringBuilder sb2 = new StringBuilder();
            B2.p.a(sb2, n0Var);
            sb.append(sb2.toString());
            z4 = false;
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1054c.class != obj.getClass()) {
            return false;
        }
        C1054c c1054c = (C1054c) obj;
        return this.f11081a == c1054c.f11081a && this.f11082b.equals(c1054c.f11082b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final int hashCode() {
        return this.f11082b.hashCode() + ((this.f11081a ? 1 : 0) * 31);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Bound(inclusive=");
        sb.append(this.f11081a);
        sb.append(", position=");
        int i = 0;
        while (true) {
            ?? r22 = this.f11082b;
            if (i >= r22.size()) {
                sb.append(")");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(" and ");
            }
            n0 n0Var = (n0) r22.get(i);
            n0 n0Var2 = B2.p.f335a;
            StringBuilder sb2 = new StringBuilder();
            B2.p.a(sb2, n0Var);
            sb.append(sb2.toString());
            i++;
        }
    }
}
