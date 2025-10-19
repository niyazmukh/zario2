package z3;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: z3.s, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\s.1.smali */
public final class C1094s {

    /* renamed from: d, reason: collision with root package name */
    public static final C1077a f11398d = new C1077a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a, reason: collision with root package name */
    public final List f11399a;

    /* renamed from: b, reason: collision with root package name */
    public final C1078b f11400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11401c;

    public C1094s(SocketAddress socketAddress) {
        C1078b c1078b = C1078b.f11279b;
        List listSingletonList = Collections.singletonList(socketAddress);
        S0.f.g("addrs is empty", !listSingletonList.isEmpty());
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listSingletonList));
        this.f11399a = listUnmodifiableList;
        S0.f.l(c1078b, "attrs");
        this.f11400b = c1078b;
        this.f11401c = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1094s)) {
            return false;
        }
        C1094s c1094s = (C1094s) obj;
        List list = this.f11399a;
        if (list.size() != c1094s.f11399a.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((SocketAddress) list.get(i)).equals(c1094s.f11399a.get(i))) {
                return false;
            }
        }
        return this.f11400b.equals(c1094s.f11400b);
    }

    public final int hashCode() {
        return this.f11401c;
    }

    public final String toString() {
        return "[" + this.f11399a + "/" + this.f11400b + "]";
    }
}
