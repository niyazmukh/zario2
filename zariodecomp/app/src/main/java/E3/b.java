package E3;

import N2.AbstractC0156x;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E3\b.smali */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final q4.f f1534d;

    /* renamed from: e, reason: collision with root package name */
    public static final q4.f f1535e;

    /* renamed from: f, reason: collision with root package name */
    public static final q4.f f1536f;

    /* renamed from: g, reason: collision with root package name */
    public static final q4.f f1537g;
    public static final q4.f h;

    /* renamed from: a, reason: collision with root package name */
    public final q4.f f1538a;

    /* renamed from: b, reason: collision with root package name */
    public final q4.f f1539b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1540c;

    static {
        q4.f fVar = q4.f.f9516d;
        f1534d = AbstractC0156x.D(":status");
        f1535e = AbstractC0156x.D(":method");
        f1536f = AbstractC0156x.D(":path");
        f1537g = AbstractC0156x.D(":scheme");
        h = AbstractC0156x.D(":authority");
        AbstractC0156x.D(":host");
        AbstractC0156x.D(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(AbstractC0156x.D(str), AbstractC0156x.D(str2));
        q4.f fVar = q4.f.f9516d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1538a.equals(bVar.f1538a) && this.f1539b.equals(bVar.f1539b);
    }

    public final int hashCode() {
        return this.f1539b.hashCode() + ((this.f1538a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return AbstractC0854a.c(this.f1538a.k(), ": ", this.f1539b.k());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(q4.f fVar, String str) {
        this(fVar, AbstractC0156x.D(str));
        q4.f fVar2 = q4.f.f9516d;
    }

    public b(q4.f fVar, q4.f fVar2) {
        this.f1538a = fVar;
        this.f1539b = fVar2;
        this.f1540c = fVar2.b() + fVar.b() + 32;
    }
}
