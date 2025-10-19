package D;

import android.graphics.Insets;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D\c.smali */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1264e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1265a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1266b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1267c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1268d;

    public c(int i, int i5, int i6, int i7) {
        this.f1265a = i;
        this.f1266b = i5;
        this.f1267c = i6;
        this.f1268d = i7;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f1265a, cVar2.f1265a), Math.max(cVar.f1266b, cVar2.f1266b), Math.max(cVar.f1267c, cVar2.f1267c), Math.max(cVar.f1268d, cVar2.f1268d));
    }

    public static c b(int i, int i5, int i6, int i7) {
        return (i == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f1264e : new c(i, i5, i6, i7);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f1265a, this.f1266b, this.f1267c, this.f1268d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1268d == cVar.f1268d && this.f1265a == cVar.f1265a && this.f1267c == cVar.f1267c && this.f1266b == cVar.f1266b;
    }

    public final int hashCode() {
        return (((((this.f1265a * 31) + this.f1266b) * 31) + this.f1267c) * 31) + this.f1268d;
    }

    public final String toString() {
        return "Insets{left=" + this.f1265a + ", top=" + this.f1266b + ", right=" + this.f1267c + ", bottom=" + this.f1268d + '}';
    }
}
