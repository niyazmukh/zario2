package A2;

import com.google.protobuf.AbstractC0409l;
import java.util.Objects;
import y2.C1048A;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\g0.smali */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1048A f193a;

    /* renamed from: b, reason: collision with root package name */
    public final int f194b;

    /* renamed from: c, reason: collision with root package name */
    public final long f195c;

    /* renamed from: d, reason: collision with root package name */
    public final H f196d;

    /* renamed from: e, reason: collision with root package name */
    public final B2.o f197e;

    /* renamed from: f, reason: collision with root package name */
    public final B2.o f198f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0409l f199g;
    public final Integer h;

    public g0(C1048A c1048a, int i, long j5, H h, B2.o oVar, B2.o oVar2, AbstractC0409l abstractC0409l, Integer num) {
        c1048a.getClass();
        this.f193a = c1048a;
        this.f194b = i;
        this.f195c = j5;
        this.f198f = oVar2;
        this.f196d = h;
        oVar.getClass();
        this.f197e = oVar;
        abstractC0409l.getClass();
        this.f199g = abstractC0409l;
        this.h = num;
    }

    public final g0 a(AbstractC0409l abstractC0409l, B2.o oVar) {
        return new g0(this.f193a, this.f194b, this.f195c, this.f196d, oVar, this.f198f, abstractC0409l, null);
    }

    public final g0 b(long j5) {
        return new g0(this.f193a, this.f194b, j5, this.f196d, this.f197e, this.f198f, this.f199g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f193a.equals(g0Var.f193a) && this.f194b == g0Var.f194b && this.f195c == g0Var.f195c && this.f196d.equals(g0Var.f196d) && this.f197e.equals(g0Var.f197e) && this.f198f.equals(g0Var.f198f) && this.f199g.equals(g0Var.f199g) && Objects.equals(this.h, g0Var.h);
    }

    public final int hashCode() {
        return Objects.hashCode(this.h) + ((this.f199g.hashCode() + ((this.f198f.f334a.hashCode() + ((this.f197e.f334a.hashCode() + ((this.f196d.hashCode() + (((((this.f193a.hashCode() * 31) + this.f194b) * 31) + ((int) this.f195c)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TargetData{target=" + this.f193a + ", targetId=" + this.f194b + ", sequenceNumber=" + this.f195c + ", purpose=" + this.f196d + ", snapshotVersion=" + this.f197e + ", lastLimboFreeSnapshotVersion=" + this.f198f + ", resumeToken=" + this.f199g + ", expectedCount=" + this.h + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g0(C1048A c1048a, int i, long j5, H h) {
        B2.o oVar = B2.o.f333b;
        this(c1048a, i, j5, h, oVar, oVar, E2.H.f1418s, null);
    }
}
