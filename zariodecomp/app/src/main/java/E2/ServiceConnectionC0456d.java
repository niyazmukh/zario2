package e2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\d.1.smali */
public final class ServiceConnectionC0456d implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0457e f6864a;

    public /* synthetic */ ServiceConnectionC0456d(C0457e c0457e) {
        this.f6864a = c0457e;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0457e c0457e = this.f6864a;
        c0457e.f6867b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c0457e.a().post(new C0454b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0457e c0457e = this.f6864a;
        c0457e.f6867b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c0457e.a().post(new C0455c(this, 0));
    }
}
