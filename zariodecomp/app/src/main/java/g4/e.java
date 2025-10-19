package g4;

import K3.f;
import a.AbstractC0183a;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g4\e.smali */
public abstract class e {
    private static volatile Choreographer choreographer;

    static {
        Object objV;
        try {
            objV = new d(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objV = AbstractC0183a.v(th);
        }
        if (objV instanceof f) {
            objV = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        i.c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
