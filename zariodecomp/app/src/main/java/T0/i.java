package T0;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\i.smali */
public abstract class i {
    public static final Network a(ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.i.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
