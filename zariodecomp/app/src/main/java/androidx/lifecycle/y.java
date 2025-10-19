package androidx.lifecycle;

import A2.C0009i;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\y.1.smali */
public abstract class y extends Service implements InterfaceC0241v {

    /* renamed from: a, reason: collision with root package name */
    public final C0009i f4677a = new C0009i(this);

    @Override // androidx.lifecycle.InterfaceC0241v
    public final C0242x g() {
        return (C0242x) this.f4677a.f204b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.i.e(intent, "intent");
        this.f4677a.a0(n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f4677a.a0(n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        n nVar = n.ON_STOP;
        C0009i c0009i = this.f4677a;
        c0009i.a0(nVar);
        c0009i.a0(n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f4677a.a0(n.ON_START);
        super.onStart(intent, i);
    }
}
