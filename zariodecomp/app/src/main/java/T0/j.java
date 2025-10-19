package T0;

import android.net.ConnectivityManager;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\j.smali */
public abstract class j {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.i.e(connectivityManager, "<this>");
        kotlin.jvm.internal.i.e(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
