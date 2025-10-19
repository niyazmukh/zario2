package z3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: z3.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\d.1.smali */
public abstract class AbstractC1080d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1077a f11299a = new C1077a("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* renamed from: b, reason: collision with root package name */
    public static final C1077a f11300b = new C1077a("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");

    /* renamed from: c, reason: collision with root package name */
    public static final C1077a f11301c = new C1077a("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    public static List k(Class cls, List list, ClassLoader classLoader, i0 i0Var) throws ClassNotFoundException {
        ?? Load;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object objNewInstance = null;
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
            Load = !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            if (i0Var.f(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new G1.d(i0Var, 3)));
        return Collections.unmodifiableList(arrayList);
    }

    public abstract AbstractC1098w g(H h);

    public abstract AbstractC1080d h();

    public abstract ScheduledExecutorService i();

    public abstract p0 j();

    public abstract void l(int i, String str);

    public abstract void m(int i, String str, Object... objArr);

    public abstract AbstractC1081e n(com.google.android.gms.common.api.internal.F f2, C1079c c1079c);

    public abstract void o(k0 k0Var);

    public abstract void p(e0 e0Var);

    public abstract void q();

    public abstract void r(EnumC1087k enumC1087k, K k5);
}
