package w3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import u3.EnumC0971a;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w3.1\a.smali */
public final class C1030a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final l f10977a;

    public C1030a(l recorder) {
        kotlin.jvm.internal.i.e(recorder, "recorder");
        this.f10977a = recorder;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        long jCurrentTimeMillis = System.currentTimeMillis();
        u3.b bVar = u3.b.f10484a;
        String packageName = activity.getPackageName();
        kotlin.jvm.internal.i.d(packageName, "getPackageName(...)");
        this.f10977a.c(new u3.e(jCurrentTimeMillis, bVar, packageName, activity.getClass().getName(), EnumC0971a.f10481b));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        long jCurrentTimeMillis = System.currentTimeMillis();
        u3.b bVar = u3.b.f10484a;
        String packageName = activity.getPackageName();
        kotlin.jvm.internal.i.d(packageName, "getPackageName(...)");
        this.f10977a.c(new u3.e(jCurrentTimeMillis, bVar, packageName, activity.getClass().getName(), EnumC0971a.f10480a));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        long jCurrentTimeMillis = System.currentTimeMillis();
        u3.b bVar = u3.b.f10484a;
        String packageName = activity.getPackageName();
        kotlin.jvm.internal.i.d(packageName, "getPackageName(...)");
        this.f10977a.c(new u3.e(jCurrentTimeMillis, bVar, packageName, activity.getClass().getName(), EnumC0971a.f10482c));
    }
}
