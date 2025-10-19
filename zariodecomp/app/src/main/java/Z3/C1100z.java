package z3;

import A2.C0020u;
import B3.A0;
import N2.AbstractC0156x;
import java.util.Arrays;

/* renamed from: z3.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\z.1.smali */
public final class C1100z {

    /* renamed from: a, reason: collision with root package name */
    public final String f11407a;

    /* renamed from: b, reason: collision with root package name */
    public final y f11408b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11409c;

    /* renamed from: d, reason: collision with root package name */
    public final A0 f11410d;

    public C1100z(String str, y yVar, long j5, A0 a02) {
        this.f11407a = str;
        this.f11408b = yVar;
        this.f11409c = j5;
        this.f11410d = a02;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1100z)) {
            return false;
        }
        C1100z c1100z = (C1100z) obj;
        return AbstractC0156x.F(this.f11407a, c1100z.f11407a) && AbstractC0156x.F(this.f11408b, c1100z.f11408b) && this.f11409c == c1100z.f11409c && AbstractC0156x.F(null, null) && AbstractC0156x.F(this.f11410d, c1100z.f11410d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11407a, this.f11408b, Long.valueOf(this.f11409c), null, this.f11410d});
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f11407a, "description");
        c0020uX.a(this.f11408b, "severity");
        c0020uX.b("timestampNanos", this.f11409c);
        c0020uX.a(null, "channelRef");
        c0020uX.a(this.f11410d, "subchannelRef");
        return c0020uX.toString();
    }
}
