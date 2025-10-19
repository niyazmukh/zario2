package I3;

import java.util.Map;
import z3.AbstractC1080d;
import z3.M;
import z3.N;
import z3.d0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\x.smali */
public final class x extends N {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1989a = 0;

    @Override // z3.N
    public String a() {
        return "round_robin";
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
    public final M d(AbstractC1080d abstractC1080d) {
        return new w(abstractC1080d);
    }

    @Override // z3.N
    public d0 e(Map map) {
        return new d0("no service config");
    }
}
