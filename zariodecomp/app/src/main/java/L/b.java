package L;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L\b.smali */
public abstract class b {
    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(Object... objArr) {
        return Objects.hash(objArr);
    }
}
