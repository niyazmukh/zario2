package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\J.smali */
public abstract class J {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
