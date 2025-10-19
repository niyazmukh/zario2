package dagger.hilt.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\internal\Preconditions.smali */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t4) {
        t4.getClass();
        return t4;
    }

    public static void checkState(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }
}
