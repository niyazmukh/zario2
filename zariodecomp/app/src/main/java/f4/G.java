package f4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\G.smali */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final J f7020a;

    static {
        String property;
        J j5;
        int i = k4.u.f8410a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            m4.e eVar = N.f7027a;
            A a5 = k4.n.f8401a;
            g4.d dVar = ((g4.d) a5).f7610f;
            j5 = !(a5 instanceof J) ? F.f7017n : (J) a5;
        } else {
            j5 = F.f7017n;
        }
        f7020a = j5;
    }
}
