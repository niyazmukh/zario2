package r0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r0.1\g.smali */
public abstract class g {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
