package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\L.smali */
public final class L extends AbstractC0230h {
    final /* synthetic */ M this$0;

    public L(M m5) {
        this.this$0 = m5;
    }

    @Override // androidx.lifecycle.AbstractC0230h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // androidx.lifecycle.AbstractC0230h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        M m5 = this.this$0;
        int i = m5.f4591b - 1;
        m5.f4591b = i;
        if (i == 0) {
            Handler handler = m5.f4594e;
            kotlin.jvm.internal.i.b(handler);
            handler.postDelayed(m5.f4596k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        J.a(activity, new K(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0230h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        M m5 = this.this$0;
        int i = m5.f4590a - 1;
        m5.f4590a = i;
        if (i == 0 && m5.f4592c) {
            m5.f4595f.d(n.ON_STOP);
            m5.f4593d = true;
        }
    }
}
