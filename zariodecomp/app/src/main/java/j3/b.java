package J3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J3\b.smali */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2098a;

    static {
        Object obj;
        Class<?> cls;
        a aVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                aVar = (a) cls.asSubclass(a.class).getConstructor(c.class).newInstance(a.f2096a);
            } catch (Throwable th2) {
                obj = th2;
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            f2098a = aVar;
        } else {
            f2098a = new a();
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, b.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a() {
        f2098a.getClass();
    }

    public static void b() {
        f2098a.getClass();
    }

    public static void c() {
        f2098a.getClass();
    }
}
