package L3;

import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\k.smali */
public abstract class k extends p1.b {
    public static int X(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List Y(Object... objArr) {
        return objArr.length > 0 ? i.q0(objArr) : s.f2351a;
    }

    public static void Z() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
