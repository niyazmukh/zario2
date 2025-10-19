package f4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\C0.smali */
public abstract class C0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f7001a = new ThreadLocal();

    public static Y a() {
        ThreadLocal threadLocal = f7001a;
        Y y4 = (Y) threadLocal.get();
        if (y4 != null) {
            return y4;
        }
        C0509i c0509i = new C0509i(Thread.currentThread());
        threadLocal.set(c0509i);
        return c0509i;
    }
}
