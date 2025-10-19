package J0;

import android.util.Log;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\t.smali */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2062b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile t f2063c;

    /* renamed from: a, reason: collision with root package name */
    public final int f2064a;

    public t(int i) {
        this.f2064a = i;
    }

    public static t d() {
        t tVar;
        synchronized (f2062b) {
            try {
                if (f2063c == null) {
                    f2063c = new t(3);
                }
                tVar = f2063c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void a(String str, String str2) {
        if (this.f2064a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f2064a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (this.f2064a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.f2064a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f2064a <= 5) {
            Log.w(str, str2);
        }
    }
}
