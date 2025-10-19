package h0;

import android.util.Log;
import g0.AbstractComponentCallbacksC0567t;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h0.1\d.smali */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0587c f7618a = C0587c.f7617a;

    public static C0587c a(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        while (abstractComponentCallbacksC0567t != null) {
            if (abstractComponentCallbacksC0567t.w()) {
                abstractComponentCallbacksC0567t.p();
            }
            abstractComponentCallbacksC0567t = abstractComponentCallbacksC0567t.f7548z;
        }
        return f7618a;
    }

    public static void b(C0585a c0585a) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c0585a.f7611a.getClass().getName()), c0585a);
        }
    }

    public static final void c(AbstractComponentCallbacksC0567t fragment, String previousFragmentId) {
        i.e(fragment, "fragment");
        i.e(previousFragmentId, "previousFragmentId");
        b(new C0585a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).getClass();
    }
}
