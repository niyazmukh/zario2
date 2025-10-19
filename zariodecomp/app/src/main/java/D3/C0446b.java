package d3;

import B.l;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import i4.C;
import i4.I;
import kotlin.jvm.internal.i;

/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d3.1\b.smali */
public final class C0446b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6800a;

    /* renamed from: b, reason: collision with root package name */
    public final I f6801b;

    public C0446b(Context context) {
        i.e(context, "context");
        this.f6800a = context;
        this.f6801b = C.b(a());
    }

    public final C0445a a() {
        Context context = this.f6800a;
        Object systemService = context.getSystemService("appops");
        i.c(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        return new C0445a(((AppOpsManager) systemService).unsafeCheckOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName()) == 0, Build.VERSION.SDK_INT < 33 || l.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0);
    }

    public final C0445a b() {
        C0445a c0445aA = a();
        I i = this.f6801b;
        i.getClass();
        i.M(null, c0445aA);
        return c0445aA;
    }
}
