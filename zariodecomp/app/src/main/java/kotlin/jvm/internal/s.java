package kotlin.jvm.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\kotlin\jvm\internal\s.smali */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final t f8432a;

    static {
        t tVar = null;
        try {
            tVar = (t) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (tVar == null) {
            tVar = new t();
        }
        f8432a = tVar;
    }

    public static d a(Class cls) {
        f8432a.getClass();
        return new d(cls);
    }
}
