package androidx.lifecycle;

import android.app.Activity;
import android.os.Handler;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\K.smali */
public final class K extends AbstractC0230h {
    final /* synthetic */ M this$0;

    public K(M m5) {
        this.this$0 = m5;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        M m5 = this.this$0;
        int i = m5.f4591b + 1;
        m5.f4591b = i;
        if (i == 1) {
            if (m5.f4592c) {
                m5.f4595f.d(n.ON_RESUME);
                m5.f4592c = false;
            } else {
                Handler handler = m5.f4594e;
                kotlin.jvm.internal.i.b(handler);
                handler.removeCallbacks(m5.f4596k);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        M m5 = this.this$0;
        int i = m5.f4590a + 1;
        m5.f4590a = i;
        if (i == 1 && m5.f4593d) {
            m5.f4595f.d(n.ON_START);
            m5.f4593d = false;
        }
    }
}
