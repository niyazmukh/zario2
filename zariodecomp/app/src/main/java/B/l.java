package B;

import A.w;
import A.x;
import a.AbstractC0183a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B\l.smali */
public abstract class l {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : w.a(new x(context).f25a) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return g.a(context);
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return j.a(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return e.a(context);
    }

    public static int getColor(Context context, int i) {
        return f.a(context, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f1057c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList getColorStateList(android.content.Context r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            C.m r1 = new C.m
            r1.<init>(r0, r8)
            java.lang.Object r2 = C.o.f1062c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = C.o.f1061b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            C.l r5 = (C.l) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f1056b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f1057c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb9
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f1057c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f1055a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            goto Lb8
        L55:
            java.lang.ThreadLocal r2 = C.o.f1060a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = C.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb4
            java.lang.Object r2 = C.o.f1062c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = C.o.f1061b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb2
        La1:
            C.l r0 = new C.l     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f1058a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            r3 = r4
            goto Lb8
        Lb2:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb4:
            android.content.res.ColorStateList r3 = C.k.b(r0, r9, r8)
        Lb8:
            return r3
        Lb9:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B.l.getColorStateList(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Context getContextForLanguage(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L22
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r8.getSystemService(r0)
            if (r0 == 0) goto L1e
            android.os.LocaleList r0 = A.f.a(r0)
            I.k r1 = new I.k
            I.l r2 = new I.l
            r2.<init>(r0)
            r1.<init>(r2)
            goto L91
        L1e:
            I.k r1 = I.k.f1917b
            goto L91
        L22:
            java.lang.Object r0 = A.c.f2a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L8c
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L4b java.lang.Throwable -> L6e
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L4b java.lang.Throwable -> L6e
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L4b java.lang.Throwable -> L6e
        L3a:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L4b java.lang.Throwable -> L6e
            r6 = 1
            if (r5 == r6) goto L66
            r6 = 3
            if (r5 != r6) goto L4d
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L4b java.lang.Throwable -> L6e
            if (r7 <= r4) goto L66
            goto L4d
        L4b:
            r8 = move-exception
            goto L86
        L4d:
            if (r5 == r6) goto L3a
            r6 = 4
            if (r5 != r6) goto L53
            goto L3a
        L53:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L4b java.lang.Throwable -> L6e
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L4b java.lang.Throwable -> L6e
            if (r5 == 0) goto L3a
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L4b java.lang.Throwable -> L6e
        L66:
            if (r2 == 0) goto L78
        L68:
            r2.close()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L78
            goto L78
        L6c:
            r8 = move-exception
            goto Lb2
        L6e:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L78
            goto L68
        L78:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L7f
            goto L84
        L7f:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L6c
        L84:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            goto L8d
        L86:
            if (r2 == 0) goto L8b
            r2.close()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L8b
        L8b:
            throw r8     // Catch: java.lang.Throwable -> L6c
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
        L8d:
            I.k r1 = I.k.a(r1)
        L91:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 32
            if (r0 > r2) goto Lb1
            boolean r0 = r1.b()
            if (r0 != 0) goto Lb1
            android.content.res.Configuration r0 = new android.content.res.Configuration
            android.content.res.Resources r2 = r8.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            r0.<init>(r2)
            I.h.b(r0, r1)
            android.content.Context r8 = B.c.a(r8, r0)
        Lb1:
            return r8
        Lb2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B.l.getContextForLanguage(android.content.Context):android.content.Context");
    }

    public static File getDataDir(Context context) {
        return g.b(context);
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? j.b(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i) {
        return e.b(context, i);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return d.a(context);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return d.b(context, str);
    }

    public static Executor getMainExecutor(Context context) {
        return i.a(context);
    }

    public static File getNoBackupFilesDir(Context context) {
        return e.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return d.c(context);
    }

    public static String getString(Context context, int i) {
        return getContextForLanguage(context).getString(i);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) f.b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return f.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return g.c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (AbstractC0183a.r(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(a.l("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        b.b(context, intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        h.b(context, intent);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i5 = i & 1;
        if (i5 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i5 != 0) {
            i |= 2;
        }
        int i6 = i;
        int i7 = i6 & 2;
        if (i7 == 0 && (i6 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i7 == 0 || (i6 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? k.a(context, broadcastReceiver, intentFilter, str, handler, i6) : h.a(context, broadcastReceiver, intentFilter, str, handler, i6);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        b.a(context, intentArr, bundle);
        return true;
    }
}
