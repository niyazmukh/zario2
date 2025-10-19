package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\s.smali */
public abstract class s {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, y yVar) {
        Objects.requireNonNull(yVar);
        b.q qVar = new b.q(yVar, 1);
        N.g.i(obj).registerOnBackInvokedCallback(1000000, qVar);
        return qVar;
    }

    public static void c(Object obj, Object obj2) {
        N.g.i(obj).unregisterOnBackInvokedCallback(N.g.f(obj2));
    }
}
