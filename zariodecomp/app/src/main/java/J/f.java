package J;

import C2.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q.C0829f;
import q.C0834k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J\f.smali */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0829f f2000a = new C0829f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f2001b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2002c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0834k f2003d;

    static {
        i iVar = new i();
        iVar.f2009a = "fonts-androidx";
        iVar.f2010b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), iVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2001b = threadPoolExecutor;
        f2002c = new Object();
        f2003d = new C0834k();
    }

    public static e a(String str, Context context, j jVar, int i) throws Resources.NotFoundException, IOException {
        C0829f c0829f = f2000a;
        Typeface typeface = (Typeface) c0829f.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            E2.j jVarA = b.a(context, jVar);
            int i5 = 1;
            g[] gVarArr = (g[]) jVarA.f1460c;
            int i6 = jVarA.f1459b;
            if (i6 != 0) {
                i5 = i6 != 1 ? -3 : -2;
            } else if (gVarArr != null && gVarArr.length != 0) {
                int length = gVarArr.length;
                i5 = 0;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    int i8 = gVarArr[i7].f2008e;
                    if (i8 == 0) {
                        i7++;
                    } else if (i8 >= 0) {
                        i5 = i8;
                    }
                }
            }
            if (i5 != 0) {
                return new e(i5);
            }
            Typeface typefaceA = D.g.a(context, gVarArr, i);
            if (typefaceA == null) {
                return new e(-3);
            }
            c0829f.put(str, typefaceA);
            return new e(typefaceA);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }
}
