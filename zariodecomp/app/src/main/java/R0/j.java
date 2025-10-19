package r0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r0.1\j.smali */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final r.i f9591a = new r.i();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f9592b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static G2.e f9593c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? h.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static G2.e b() {
        G2.e eVar = new G2.e();
        f9593c = eVar;
        r.i iVar = f9591a;
        iVar.getClass();
        if (r.h.f9559f.i(iVar, null, eVar)) {
            r.h.d(iVar);
        }
        return f9593c;
    }

    public static void c(Context context, boolean z4) {
        i iVarA;
        int i;
        if (z4 || f9593c == null) {
            synchronized (f9592b) {
                if (!z4) {
                    try {
                        if (f9593c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (Build.VERSION.SDK_INT == 30) {
                    b();
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                int i5 = 0;
                boolean z5 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z6 = file2.exists() && length2 > 0;
                try {
                    long jA = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            iVarA = i.a(file3);
                        } catch (IOException unused) {
                            b();
                            return;
                        }
                    } else {
                        iVarA = null;
                    }
                    if (iVarA != null && iVarA.f9589c == jA && (i = iVarA.f9588b) != 2) {
                        i5 = i;
                    } else if (z5) {
                        i5 = 1;
                    } else if (z6) {
                        i5 = 2;
                    }
                    if (z4 && z6 && i5 != 1) {
                        i5 = 2;
                    }
                    i iVar = new i(1, (iVarA == null || iVarA.f9588b != 2 || i5 != 1 || length >= iVarA.f9590d) ? i5 : 3, jA, length2);
                    if (iVarA == null || !iVarA.equals(iVar)) {
                        try {
                            iVar.b(file3);
                        } catch (IOException unused2) {
                        }
                    }
                    b();
                } catch (PackageManager.NameNotFoundException unused3) {
                    b();
                }
            }
        }
    }
}
