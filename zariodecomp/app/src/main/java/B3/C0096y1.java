package B3;

import a.AbstractC0183a;
import java.util.Map;
import z3.AbstractC1080d;

/* renamed from: B3.y1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\y1.1.smali */
public final class C0096y1 extends z3.N {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1029a;

    static {
        f1029a = !AbstractC0183a.R(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // z3.N
    public String a() {
        return "pick_first";
    }

    @Override // z3.N
    public int b() {
        return 5;
    }

    @Override // z3.N
    public boolean c() {
        return true;
    }

    @Override // z3.N
    public final z3.M d(AbstractC1080d abstractC1080d) {
        return f1029a ? new C0081t1(abstractC1080d) : new C0093x1(abstractC1080d);
    }

    @Override // z3.N
    public z3.d0 e(Map map) {
        try {
            return new z3.d0(new C0087v1(D0.b(map, "shuffleAddressList")));
        } catch (RuntimeException e5) {
            return new z3.d0(z3.k0.f11355n.f(e5).g("Failed parsing configuration for " + a()));
        }
    }
}
