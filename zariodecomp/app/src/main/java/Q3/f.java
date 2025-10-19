package Q3;

import a.AbstractC0183a;
import android.app.usage.UsageEvents;
import java.lang.reflect.Method;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q3\f.smali */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Method f2811a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2812b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f2813c;

    public f(Method method, Method method2, Method method3) {
        this.f2811a = method;
        this.f2812b = method2;
        this.f2813c = method3;
    }

    public f() {
        Object objV;
        Object objV2;
        Object objV3;
        try {
            objV = UsageEvents.Event.class.getMethod("getTaskRootPackageName", null);
        } catch (Throwable th) {
            objV = AbstractC0183a.v(th);
        }
        this.f2811a = (Method) (objV instanceof K3.f ? null : objV);
        try {
            objV2 = UsageEvents.Event.class.getMethod("getTaskRootClassName", null);
        } catch (Throwable th2) {
            objV2 = AbstractC0183a.v(th2);
        }
        this.f2812b = (Method) (objV2 instanceof K3.f ? null : objV2);
        try {
            objV3 = UsageEvents.Event.class.getMethod("getInstanceId", null);
        } catch (Throwable th3) {
            objV3 = AbstractC0183a.v(th3);
        }
        this.f2813c = (Method) (objV3 instanceof K3.f ? null : objV3);
    }
}
