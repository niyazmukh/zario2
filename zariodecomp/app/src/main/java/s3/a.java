package S3;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S3\a.smali */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f3121a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        i.b(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (i.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                i.d(parameterTypes, "getParameterTypes(...)");
                if (i.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f3121a = method;
        int length2 = methods.length;
        for (int i5 = 0; i5 < length2 && !i.a(methods[i5].getName(), "getSuppressed"); i5++) {
        }
    }
}
