package b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\r.smali */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f4929a = new r();

    public final OnBackInvokedCallback a(X3.a onBackInvoked) {
        kotlin.jvm.internal.i.e(onBackInvoked, "onBackInvoked");
        return new q(onBackInvoked, 0);
    }

    public final void b(Object dispatcher, int i, Object callback) {
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) callback);
    }

    public final void c(Object dispatcher, Object callback) {
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
