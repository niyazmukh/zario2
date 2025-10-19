package T0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\h.smali */
public abstract class h {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        kotlin.jvm.internal.i.e(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i) {
        kotlin.jvm.internal.i.e(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.i.e(connectivityManager, "<this>");
        kotlin.jvm.internal.i.e(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
