package b;

import android.window.OnBackInvokedCallback;
import g.y;
import java.lang.reflect.InvocationTargetException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\q.smali */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4928b;

    public /* synthetic */ q(Object obj, int i) {
        this.f4927a = i;
        this.f4928b = obj;
    }

    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i = this.f4927a;
        Object obj = this.f4928b;
        switch (i) {
            case 0:
                X3.a onBackInvoked = (X3.a) obj;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                ((y) obj).C();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
