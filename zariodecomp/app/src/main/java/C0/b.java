package c0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\b.smali */
public abstract class b {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
