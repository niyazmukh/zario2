package P0;

import J0.t;
import S0.q;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\P0\g.smali */
public final class g extends e {

    /* renamed from: b, reason: collision with root package name */
    public final int f2675b;

    static {
        i.d(t.f("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Q0.f tracker) {
        super(tracker);
        i.e(tracker, "tracker");
        this.f2675b = 7;
    }

    @Override // P0.e
    public final int a() {
        return this.f2675b;
    }

    @Override // P0.e
    public final boolean b(q qVar) {
        return qVar.f2902j.f2036a == 4;
    }

    @Override // P0.e
    public final boolean c(Object obj) {
        O0.d value = (O0.d) obj;
        i.e(value, "value");
        return (value.f2614a && value.f2617d) ? false : true;
    }
}
