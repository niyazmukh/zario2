package K0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\o.smali */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2165a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2166b;

    static {
        String strF = J0.t.f("WrkDbPathHelper");
        kotlin.jvm.internal.i.d(strF, "tagWithPrefix(\"WrkDbPathHelper\")");
        f2165a = strF;
        f2166b = new String[]{"-journal", "-shm", "-wal"};
    }
}
