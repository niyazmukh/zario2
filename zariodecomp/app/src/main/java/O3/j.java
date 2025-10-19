package O3;

import X3.p;
import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O3\j.smali */
public final class j implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2661a = new j();

    @Override // O3.i
    public final Object fold(Object obj, p pVar) {
        return obj;
    }

    @Override // O3.i
    public final g get(h key) {
        kotlin.jvm.internal.i.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // O3.i
    public final i minusKey(h key) {
        kotlin.jvm.internal.i.e(key, "key");
        return this;
    }

    @Override // O3.i
    public final i plus(i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
