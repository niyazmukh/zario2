package L3;

import java.util.Collection;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\l.smali */
public abstract class l extends k {
    public static int a0(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
