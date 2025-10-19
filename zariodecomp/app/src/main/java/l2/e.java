package l2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import q.C0833j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l2\e.smali */
public final class e extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f8767b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f8768a;

    public e(Context context) {
        this.f8768a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f.f8769j) {
            try {
                Iterator it = ((C0833j) f.f8770k.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8768a.unregisterReceiver(this);
    }
}
