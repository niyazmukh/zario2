package h1;

import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h1.1\h.smali */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f7635b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f7636c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7638e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f7634a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f7637d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
