package E2;

import com.google.protobuf.AbstractC0409l;
import s2.C0870e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\z.smali */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0409l f1515a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1516b;

    /* renamed from: c, reason: collision with root package name */
    public final C0870e f1517c;

    /* renamed from: d, reason: collision with root package name */
    public final C0870e f1518d;

    /* renamed from: e, reason: collision with root package name */
    public final C0870e f1519e;

    public z(AbstractC0409l abstractC0409l, boolean z4, C0870e c0870e, C0870e c0870e2, C0870e c0870e3) {
        this.f1515a = abstractC0409l;
        this.f1516b = z4;
        this.f1517c = c0870e;
        this.f1518d = c0870e2;
        this.f1519e = c0870e3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f1516b == zVar.f1516b && this.f1515a.equals(zVar.f1515a) && this.f1517c.equals(zVar.f1517c) && this.f1518d.equals(zVar.f1518d)) {
            return this.f1519e.equals(zVar.f1519e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1519e.f9681a.hashCode() + ((this.f1518d.f9681a.hashCode() + ((this.f1517c.f9681a.hashCode() + (((this.f1515a.hashCode() * 31) + (this.f1516b ? 1 : 0)) * 31)) * 31)) * 31);
    }
}
