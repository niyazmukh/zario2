package A3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A3\c.smali */
public final class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f270b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f271c;

    public /* synthetic */ c(Object obj, int i) {
        this.f269a = i;
        this.f271c = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f269a) {
            case 0:
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z4 = this.f270b;
                boolean z5 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f270b = z5;
                if (z5 && !z4) {
                    ((d) this.f271c).f272d.s();
                    break;
                }
                break;
            default:
                S0.e eVar = (S0.e) this.f271c;
                boolean zV = eVar.v();
                if (eVar.v() && !this.f270b) {
                    eVar.x(true);
                } else if (!zV && this.f270b) {
                    eVar.x(false);
                }
                this.f270b = zV;
                break;
        }
    }
}
