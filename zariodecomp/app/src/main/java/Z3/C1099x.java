package z3;

import A2.C0020u;
import N2.AbstractC0156x;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* renamed from: z3.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\x.1.smali */
public final class C1099x extends SocketAddress {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f11402e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f11403a;

    /* renamed from: b, reason: collision with root package name */
    public final InetSocketAddress f11404b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11405c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11406d;

    public C1099x(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        S0.f.l(inetSocketAddress, "proxyAddress");
        S0.f.l(inetSocketAddress2, "targetAddress");
        S0.f.p(inetSocketAddress, "The proxy address %s is not resolved", !inetSocketAddress.isUnresolved());
        this.f11403a = inetSocketAddress;
        this.f11404b = inetSocketAddress2;
        this.f11405c = str;
        this.f11406d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1099x)) {
            return false;
        }
        C1099x c1099x = (C1099x) obj;
        return AbstractC0156x.F(this.f11403a, c1099x.f11403a) && AbstractC0156x.F(this.f11404b, c1099x.f11404b) && AbstractC0156x.F(this.f11405c, c1099x.f11405c) && AbstractC0156x.F(this.f11406d, c1099x.f11406d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11403a, this.f11404b, this.f11405c, this.f11406d});
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f11403a, "proxyAddr");
        c0020uX.a(this.f11404b, "targetAddr");
        c0020uX.a(this.f11405c, "username");
        c0020uX.c("hasPassword", this.f11406d != null);
        return c0020uX.toString();
    }
}
