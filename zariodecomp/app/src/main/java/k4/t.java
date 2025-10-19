package k4;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\t.smali */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8409a = 0;

    static {
        Object objV;
        Object objV2;
        Exception exc = new Exception();
        String simpleName = AbstractC0183a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objV = Q3.a.class.getCanonicalName();
        } catch (Throwable th) {
            objV = AbstractC0183a.v(th);
        }
        if (K3.g.a(objV) != null) {
            objV = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objV2 = t.class.getCanonicalName();
        } catch (Throwable th2) {
            objV2 = AbstractC0183a.v(th2);
        }
        if (K3.g.a(objV2) != null) {
            objV2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
