package Q0;

import J0.t;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q0\i.smali */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2722a;

    static {
        String strF = t.f("NetworkStateTracker");
        kotlin.jvm.internal.i.d(strF, "tagWithPrefix(\"NetworkStateTracker\")");
        f2722a = strF;
    }

    public static final O0.d a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilitiesA;
        kotlin.jvm.internal.i.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z4 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilitiesA = T0.h.a(connectivityManager, T0.i.a(connectivityManager));
        } catch (SecurityException e5) {
            t.d().c(f2722a, "Unable to validate active network", e5);
        }
        boolean zB = networkCapabilitiesA != null ? T0.h.b(networkCapabilitiesA, 16) : false;
        return new O0.d(z4, zB, H.a.a(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
