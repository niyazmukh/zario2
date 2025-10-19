package androidx.lifecycle;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\l.1.smali */
public final class C0234l {
    public static n a(EnumC0236o state) {
        kotlin.jvm.internal.i.e(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 2) {
            return n.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return n.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return n.ON_PAUSE;
    }

    public static n b(EnumC0236o state) {
        kotlin.jvm.internal.i.e(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 1) {
            return n.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return n.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return n.ON_RESUME;
    }
}
