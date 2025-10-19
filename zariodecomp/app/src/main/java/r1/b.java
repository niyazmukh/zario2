package r1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.internal.C;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r1\b.smali */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f9598c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f9599d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f9600e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f9601f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f9602g;

    /* renamed from: k, reason: collision with root package name */
    public static f f9604k;

    /* renamed from: l, reason: collision with root package name */
    public static g f9605l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9606a;
    public static final ThreadLocal h = new ThreadLocal();
    public static final Z3.b i = new Z3.b(2);

    /* renamed from: j, reason: collision with root package name */
    public static final J3.c f9603j = new J3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final X1.e f9597b = new X1.e();

    public b(Context context) {
        this.f9606a = context;
    }

    public static int a(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (C.i(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e5) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e5.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9 A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #5 {all -> 0x00ce, blocks: (B:5:0x0038, B:7:0x0063, B:9:0x0072, B:17:0x007f, B:21:0x00c7, B:28:0x00d3, B:31:0x00d9, B:44:0x0105, B:122:0x027e, B:123:0x0285, B:126:0x0288, B:127:0x0289, B:128:0x0290, B:129:0x0291, B:131:0x02b9, B:133:0x02c2, B:135:0x02c7, B:141:0x02d2, B:143:0x02d8, B:134:0x02c5, B:153:0x0306, B:154:0x030d, B:155:0x030e, B:156:0x032e, B:157:0x032f, B:158:0x0371, B:8:0x006b), top: B:176:0x0038, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static r1.b b(android.content.Context r28, X1.e r29) throws r1.a {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.b.b(android.content.Context, X1.e):r1.b");
    }

    public static boolean c(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f9602g)) {
            return true;
        }
        boolean z4 = false;
        if (f9602g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
            if (h1.e.f7633b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z4 = true;
            }
            f9602g = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f9600e = true;
            }
        }
        if (!z4) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c A[PHI: r4
  0x013c: PHI (r4v2 boolean) = (r4v1 boolean), (r4v4 boolean) binds: [B:59:0x00f4, B:84:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r15, boolean r16, boolean r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.b.d(android.content.Context, boolean, boolean):int");
    }

    public static void e(ClassLoader classLoader) throws a {
        try {
            g gVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                gVar = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f9605l = gVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
            throw new a("Failed to instantiate dynamite loader", e5);
        }
    }

    public static f f(Context context) {
        f fVar;
        synchronized (b.class) {
            f fVar2 = f9604k;
            if (fVar2 != null) {
                return fVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    fVar = iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (fVar != null) {
                    f9604k = fVar;
                    return fVar;
                }
            } catch (Exception e5) {
                String message = e5.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }
}
