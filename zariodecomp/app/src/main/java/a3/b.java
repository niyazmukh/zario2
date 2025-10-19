package A3;

import J0.t;
import Q0.h;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A3\b.smali */
public final class b extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f268b;

    public /* synthetic */ b(Object obj, int i) {
        this.f267a = i;
        this.f268b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f267a) {
            case 0:
                ((d) this.f268b).f272d.s();
                break;
            case 1:
                ((S0.e) this.f268b).x(true);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z4) {
        switch (this.f267a) {
            case 0:
                if (!z4) {
                    ((d) this.f268b).f272d.s();
                    break;
                }
                break;
            default:
                super.onBlockedStatusChanged(network, z4);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        switch (this.f267a) {
            case 2:
                i.e(network, "network");
                i.e(capabilities, "capabilities");
                t.d().a(Q0.i.f2722a, "Network capabilities changed: " + capabilities);
                h hVar = (h) this.f268b;
                hVar.b(Q0.i.a(hVar.f2720f));
                break;
            default:
                super.onCapabilitiesChanged(network, capabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        switch (this.f267a) {
            case 1:
                ((S0.e) this.f268b).x(false);
                break;
            case 2:
                i.e(network, "network");
                t.d().a(Q0.i.f2722a, "Network connection lost");
                h hVar = (h) this.f268b;
                hVar.b(Q0.i.a(hVar.f2720f));
                break;
            default:
                super.onLost(network);
                break;
        }
    }
}
