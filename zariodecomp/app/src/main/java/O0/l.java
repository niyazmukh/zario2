package O0;

import J0.t;
import S0.q;
import f4.A;
import f4.C0510i0;
import f4.E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O0\l.smali */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2633a;

    static {
        String strF = t.f("WorkConstraintsTracker");
        kotlin.jvm.internal.i.d(strF, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f2633a = strF;
    }

    public static final C0510i0 a(h1.i iVar, q qVar, A dispatcher, e listener) {
        kotlin.jvm.internal.i.e(iVar, "<this>");
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(listener, "listener");
        C0510i0 c0510i0C = E.c();
        E.t(E.b(S0.f.U(dispatcher, c0510i0C)), null, null, new k(iVar, qVar, listener, null), 3);
        return c0510i0C;
    }
}
