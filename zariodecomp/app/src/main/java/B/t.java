package b;

import android.window.OnBackInvokedCallback;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\t.smali */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f4934a = new t();

    public final OnBackInvokedCallback a(X3.l onBackStarted, X3.l onBackProgressed, X3.a onBackInvoked, X3.a onBackCancelled) {
        kotlin.jvm.internal.i.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.i.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.i.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.i.e(onBackCancelled, "onBackCancelled");
        return new s(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
