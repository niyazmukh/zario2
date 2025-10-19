package n1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.M;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import p1.c;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\n1.1\a.smali */
public final class C0763a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8969a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0763a f8970b;

    public final void a(Context context, M m5) {
        try {
            context.unbindService(m5);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public final boolean b(Context context, String str, Intent intent, M m5, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((((Context) c.a(context).b).getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (executor == null) {
            executor = null;
        }
        return executor != null ? context.bindService(intent, 4225, executor, m5) : context.bindService(intent, m5, 4225);
    }
}
