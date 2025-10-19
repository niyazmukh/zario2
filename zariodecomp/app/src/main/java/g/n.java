package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import q.C0826c;
import q.C0830g;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\n.smali */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final T0.m f7208a = new T0.m(new T0.o(1));

    /* renamed from: b, reason: collision with root package name */
    public static final int f7209b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static I.k f7210c = null;

    /* renamed from: d, reason: collision with root package name */
    public static I.k f7211d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f7212e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f7213f = false;

    /* renamed from: k, reason: collision with root package name */
    public static final C0826c f7214k = new C0826c(0);

    /* renamed from: l, reason: collision with root package name */
    public static final Object f7215l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f7216m = new Object();

    public static boolean b(Context context) {
        if (f7212e == null) {
            try {
                int i = D.f7119a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) D.class), C.a() | 128).metaData;
                if (bundle != null) {
                    f7212e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f7212e = Boolean.FALSE;
            }
        }
        return f7212e.booleanValue();
    }

    public static void e(y yVar) {
        synchronized (f7215l) {
            try {
                Iterator it = f7214k.iterator();
                while (true) {
                    C0830g c0830g = (C0830g) it;
                    if (c0830g.hasNext()) {
                        n nVar = (n) ((WeakReference) c0830g.next()).get();
                        if (nVar == yVar || nVar == null) {
                            c0830g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean g(int i);

    public abstract void h(int i);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
