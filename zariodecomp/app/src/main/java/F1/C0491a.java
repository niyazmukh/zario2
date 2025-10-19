package f1;

import android.content.Context;
import com.google.android.gms.common.api.l;
import h1.C0591d;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f1.1\a.smali */
public final class C0491a extends l {

    /* renamed from: a, reason: collision with root package name */
    public static int f6988a = 1;

    public final synchronized int c() {
        int i;
        try {
            i = f6988a;
            if (i == 1) {
                Context applicationContext = getApplicationContext();
                C0591d c0591d = C0591d.f7631d;
                int iC = c0591d.c(applicationContext, 12451000);
                if (iC == 0) {
                    i = 4;
                    f6988a = 4;
                } else if (c0591d.a(applicationContext, iC, null) != null || r1.b.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    f6988a = 2;
                } else {
                    i = 3;
                    f6988a = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
