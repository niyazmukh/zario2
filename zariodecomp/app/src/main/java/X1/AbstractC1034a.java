package x1;

import android.content.Context;
import android.util.Log;
import h1.e;
import h1.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\x1.1\a.smali */
public abstract class AbstractC1034a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f11014a = e.f7633b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f11015b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Method f11016c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f11017d;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[Catch: all -> 0x0066, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:12:0x0056, B:15:0x005d, B:22:0x007e, B:23:0x0083, B:20:0x006a, B:25:0x0085, B:26:0x0089, B:31:0x0094, B:33:0x0098, B:36:0x00c1, B:39:0x00d1, B:40:0x00d6, B:42:0x00d8, B:43:0x00e4), top: B:50:0x0056, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1 A[Catch: all -> 0x0066, TryCatch #2 {, blocks: (B:12:0x0056, B:15:0x005d, B:22:0x007e, B:23:0x0083, B:20:0x006a, B:25:0x0085, B:26:0x0089, B:31:0x0094, B:33:0x0098, B:36:0x00c1, B:39:0x00d1, B:40:0x00d6, B:42:0x00d8, B:43:0x00e4), top: B:50:0x0056, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[Catch: all -> 0x0066, TryCatch #2 {, blocks: (B:12:0x0056, B:15:0x005d, B:22:0x007e, B:23:0x0083, B:20:0x006a, B:25:0x0085, B:26:0x0089, B:31:0x0094, B:33:0x0098, B:36:0x00c1, B:39:0x00d1, B:40:0x00d6, B:42:0x00d8, B:43:0x00e4), top: B:50:0x0056, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.AbstractC1034a.a(android.content.Context):void");
    }

    public static void b(Context context, String str) throws f, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f11016c == null) {
                f11016c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f11016c.invoke(null, context);
        } catch (Exception e5) {
            Throwable cause = e5.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e5.toString() : cause.toString())));
            }
            throw new f();
        }
    }
}
